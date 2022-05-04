package es.grupop15.barriocovid.webfinal.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import es.grupop15.barriocovid.webfinal.model.Producto;
import es.grupop15.barriocovid.webfinal.repository.ProductoRepository;

@Controller
public class ProductoController {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoController(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }


    // PÁGINAS DE VENDEDOR

    @GetMapping("/vendedor/productos/paginaPrincipal")
    public String showUpdateForm(Model model) {
        model.addAttribute("productos", productoRepository.findAll());
        return "Vendedor/paginaPrincipal";
    }

    @GetMapping("/vendedor/productos/nuevoProducto")
    public String showAddProductForm(Producto producto) {
        return "Vendedor/añadirProducto";
    }

    @PostMapping("/vendedor/productos/añadir")
    public String addProduct(@Valid Producto producto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Vendedor/añadirProducto";
        }

        productoRepository.save(producto);
        return "redirect:paginaPrincipal";
    }

    @GetMapping("/vendedor/productos/editarProducto/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Producto producto = productoRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Producto inválido Id:" + id));
        model.addAttribute("producto", producto);
        return "Vendedor/actualizarProducto";
    }

    @PostMapping("/vendedor/productos/actualizar/{id}")
    public String updateProduct(@PathVariable("id") long id, @Valid Producto producto, BindingResult result,
        Model model) {
        if (result.hasErrors()) {
            producto.setId(id);
            return "Vendedor/actualizarProducto";
        }

        productoRepository.save(producto);
        model.addAttribute("productos", productoRepository.findAll());
        return "Vendedor/paginaPrincipal";
    }

    @GetMapping("/vendedor/productos/borrar/{id}")
    public String deleteProduct(@PathVariable("id") long id, Model model) {
        Producto producto = productoRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Producto inválido Id:" + id));
            productoRepository.delete(producto);
        model.addAttribute("productos", productoRepository.findAll());
        return "Vendedor/paginaPrincipal";
    }

    /*********************************************************************************/


    //PÁGINAS DE USUARIO

    @GetMapping("/usuario/productos/{tienda}")
    public String showProductos(@PathVariable("tienda") String tienda, Model model) {
        model.addAttribute("productos", productoRepository.findByTienda(tienda));
        return "Usuario/paginaUsuario";
    }

    @GetMapping("/usuario/añadirAlCarrito/{id}")
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

    @GetMapping("/usuario/quitarDelCarrito/{id}")
    public String quitarDelCarrito(@PathVariable("id") long id, Model model) {
        Producto producto = productoRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Producto inválido Id:" + id));
        producto.setElegido(false);
        productoRepository.save(producto);
        model.addAttribute("carrito", productoRepository.findByElegido(true));
        return "Usuario/carritoUsuario";
    }

    @GetMapping("/usuario/carritoUsuario")
    public String showCarrito(Model model) {
        model.addAttribute("carrito", productoRepository.findByElegido(true));
        return "Usuario/carritoUsuario";
    }
/* 
    public double totalCompra() {
        List<Producto> productosCarrito = productoRepository.findByElegido(true);
        double totalCompra;
        for (int i=0; i<productosCarrito.size(); i++) {
            totalCompra += productosCarrito.precio;
        }
    } */
}
