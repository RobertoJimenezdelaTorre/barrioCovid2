package es.gabrielartero.barriocovid.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//import es.gabrielartero.barriocovid.web.model.Tienda;
import es.gabrielartero.barriocovid.web.repository.TiendaRepository;

@Controller
@RequestMapping("/usuario")
public class TiendaController {

    private final TiendaRepository tiendaRepository;

    @Autowired
    public TiendaController(TiendaRepository tiendaRepository) {
        this.tiendaRepository = tiendaRepository;
    }

    @GetMapping("paginaPrincipal")
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
