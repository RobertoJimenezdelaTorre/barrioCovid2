package es.grupop15.barriocovid.webfinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorGeneral {

    @GetMapping("/")
    public String paginaInicial() {
        return "index";
    }

    @GetMapping("/vendedor/perfilVendedor")
    public String paginaPerfilVendedor() {
        return "Vendedor/perfilVendedor";
    }

    @GetMapping("/vendedor/ayuda")
    public String paginaAyudaVendedor() {
        return "ayuda";
    }

    @GetMapping("/usuario/entregaSolidaria")
    public String paginaEntrega() {
        return "Usuario/entregaSolidaria";
    }

    @GetMapping("/usuario/misComprasUsuario")
    public String paginaMisCompras() {
        return "Usuario/misComprasUsuario";
    }

    @GetMapping("/usuario/perfilUsuario")
    public String paginaPerfilUsuario() {
        return "Usuario/perfilUsuario";
    }

    @GetMapping("/usuario/ayuda")
    public String paginaAyudaUsuario() {
        return "ayuda";
    }
}
