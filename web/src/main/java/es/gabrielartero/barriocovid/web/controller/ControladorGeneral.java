package es.gabrielartero.barriocovid.web2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/usuario/")
@Controller
public class ControladorGeneral {
    


    @GetMapping("entregaSolidaria")
    public String paginaEntrega() {
        return "Usuario/entregaSolidaria";
    }

    @GetMapping("misComprasUsuario")
    public String paginaMisCompras() {
        return "Usuario/misComprasUsuario";
    }


    @GetMapping("perfilUsuario")
    public String paginaPerfil() {
        return "Usuario/perfilUsuario";
    }

    @GetMapping("ayuda")
    public String paginaAyuda() {
        return "ayuda";
    }
}
