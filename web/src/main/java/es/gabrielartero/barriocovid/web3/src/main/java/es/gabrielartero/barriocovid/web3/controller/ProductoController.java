package es.gabrielartero.barriocovid.web3.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import es.gabrielartero.barriocovid.web3.model.Producto;
import es.gabrielartero.barriocovid.web3.repository.ProductoRepository;


@Controller
@RequestMapping("/vendedor/productos/")
public class ProductoController {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoController(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }



    @GetMapping("paginaPrincipal")
    public String showUpdateForm(Model model) {
        model.addAttribute("productos", productoRepository.findAll());
        return "Vendedor/paginaPrincipal";
    }

    @GetMapping("nuevoProducto")
    public String showAddProductForm(Producto producto) {
        return "Vendedor/añadirProducto";
    }

    @PostMapping("añadir")
    public String addProduct(@Valid Producto producto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Vendedor/añadirProducto";
        }

        productoRepository.save(producto);
        return "redirect:paginaPrincipal";
    }

    @GetMapping("editarProducto/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Producto producto = productoRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Producto inválido Id:" + id));
        model.addAttribute("producto", producto);
        return "Vendedor/actualizarProducto";
    }

    @PostMapping("actualizar/{id}")
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

    @GetMapping("borrar/{id}")
    public String deleteProduct(@PathVariable("id") long id, Model model) {
        Producto producto = productoRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Producto inválido Id:" + id));
            productoRepository.delete(producto);
        model.addAttribute("productos", productoRepository.findAll());
        return "Vendedor/paginaPrincipal";
    }
}