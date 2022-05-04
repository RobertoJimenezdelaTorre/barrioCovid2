package es.grupop15.barriocovid.webfinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import es.grupop15.barriocovid.webfinal.repository.TiendaRepository;


@Controller
public class TiendaController {

    private final TiendaRepository tiendaRepository;

    @Autowired
    public TiendaController(TiendaRepository tiendaRepository) {
        this.tiendaRepository = tiendaRepository;
    }

    @GetMapping("/usuario/paginaPrincipal")
    public String showUpdateForm(Model model) {
        model.addAttribute("tiendas", tiendaRepository.findAll());
        return "Usuario/paginaTiendas";
    }
/* 
    @GetMapping("/productos/{id}")
    public String mostrarProductosPorTienda(@PathVariable("id") long id, Model model) {
        Tienda tienda = tiendaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Tienda inválida: " + id));
        model.addAttribute("tienda", tienda);
        return "Usuario/paginaUsuario";
    }
 */
}