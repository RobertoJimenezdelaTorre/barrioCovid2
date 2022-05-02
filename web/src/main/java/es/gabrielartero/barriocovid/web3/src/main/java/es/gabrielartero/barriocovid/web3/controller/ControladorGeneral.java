package es.gabrielartero.barriocovid.web3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vendedor")
@Controller
public class ControladorGeneral {
    

 /*    @GetMapping("/productos/paginaPrincipal")
    public String paginaPrincipalVendedor() {
        return "Vendedor/paginaPrincipal";
    }
 */

    @GetMapping("perfilVendedor")
    public String paginaPerfilVendedor() {
        return "Vendedor/perfilVendedor";
    }

    @GetMapping("ayuda")
    public String paginaAyuda() {
        return "ayuda";
    }

}
