package es.grupop15.barriocovid.webfinal.security;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    DataSource ds;
    @Override   //JDBC Authentication
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(ds)
            .usersByUsernameQuery("select username, password, enabled from usuarios where username=?")
            .authoritiesByUsernameQuery("select u.username, u.rol from usuarios u where u.username=?");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()                //Define who can access the resources
            .antMatchers("/").permitAll()
            .antMatchers("/vendedor/**").hasAnyAuthority("VENDEDOR")
            .antMatchers("/usuario/**").hasAnyAuthority("USUARIO")
            // .antMatchers("/todos").hasAnyRole("PROF", "ALUM")
            .anyRequest().authenticated()   //Authenticated users can perform any other request not included above
        .and().formLogin().permitAll().failureForwardUrl("/login")  
        .and().logout().permitAll().logoutSuccessUrl("/");
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
            .ignoring()
            .antMatchers("/h2/**", "/static/**", "/css/**", "/images/**"); //To check h2 through its web interface
    }
}
