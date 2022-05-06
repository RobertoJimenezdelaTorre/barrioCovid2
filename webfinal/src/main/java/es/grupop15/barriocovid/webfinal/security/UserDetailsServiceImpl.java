/* package es.grupop15.barriocovid.webfinal.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import es.grupop15.barriocovid.webfinal.model.Usuario;
import es.grupop15.barriocovid.webfinal.repository.UsuarioRepository;


public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.getUserByUsername(username);
		if(usuario==null) {
			throw new UsernameNotFoundException("Could not find User");
		}
		return new MyUserDetails(usuario);
	}

} */