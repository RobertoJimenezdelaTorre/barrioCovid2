package es.gabrielartero.barriocovid.web2.controller;

//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import es.gabrielartero.barriocovid.web2.repository.CarritoRepository;



@RequestMapping("/usuario/")
public class CarritoController {

/* 
    private final CarritoRepository carritoRepository;

    public CarritoController(CarritoRepository t) {

        this.carritoRepository = t;

    } */



 /*    @GetMapping("/carritoUsuario")
    public String showCarrito(Model model) {
        model.addAttribute("carrito", carritoRepository.findAll());
        return "Usuario/carritoUsuario";
    } */
/* 
    private final CarritoRepository carritoRepository;

    public CarritoController(CarritoRepository t) {

        this.carritoRepository = t;

    }



    @GetMapping("carritoUsuario")
    public String paginaCarrito(Model model) {
        model.addAttribute("productos", carritoRepository.findAll());
        return "Usuario/carritoUsuario";
    } */

}
