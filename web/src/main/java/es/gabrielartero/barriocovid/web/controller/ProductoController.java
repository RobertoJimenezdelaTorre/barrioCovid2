package es.gabrielartero.barriocovid.web2.controller;


//import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import es.gabrielartero.barriocovid.web2.model.Producto;
import es.gabrielartero.barriocovid.web2.repository.ProductoRepository;

@RequestMapping("/usuario/")
@Controller
public class ProductoController {

    private final ProductoRepository productoRepository;

    public ProductoController(ProductoRepository t) {

        this.productoRepository = t;

    }

    @GetMapping("/productos/{tienda}")
    public String showProductos(@PathVariable("tienda") String tienda, Model model) {
        model.addAttribute("productos", productoRepository.findByTienda(tienda));
        return "Usuario/paginaUsuario";
    }

    // PARA CONTROLAR EL CARRITO
    @GetMapping("/añadirAlCarrito/{id}")
    public String añadirAlCarrito(@PathVariable("id") long id, Model model) {
        Producto producto = productoRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Producto inválido Id:" + id));
        if(producto.isElegido() == true) {
            producto.setElegido(false);
        } else {
            producto.setElegido(true);
        }
        productoRepository.save(producto);
        model.addAttribute("productos", productoRepository.findAll());
        return "Usuario/paginaUsuario";
    }

    @GetMapping("/quitarDelCarrito/{id}")
    public String quitarDelCarrito(@PathVariable("id") long id, Model model) {
        Producto producto = productoRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Producto inválido Id:" + id));
        producto.setElegido(false);
        productoRepository.save(producto);
        model.addAttribute("carrito", productoRepository.findByElegido(true));
        return "Usuario/carritoUsuario";
    }

    @GetMapping("/carritoUsuario")
    public String showCarrito(Model model) {
        model.addAttribute("carrito", productoRepository.findByElegido(true));
        return "Usuario/carritoUsuario";
    }
/* 
    public double totalCompra() {
        List<Producto> productosCarrito = productoRepository.findByElegido(true);
        double totalCompra;
        for (int i=0; i<productosCarrito.size(); i++) {
            totalCompra += productosCarrito.
        }
    } */

}
