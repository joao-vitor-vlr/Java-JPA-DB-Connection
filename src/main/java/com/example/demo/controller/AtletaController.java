package com.example.demo.controller;

import com.example.demo.dominio.Atleta;
import com.example.demo.repositorio.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping("/atletas") // This means URL's start with /demo (after Application path)
public class AtletaController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private AtletaRepository atletaRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestBody Atleta u) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        atletaRepository.save(u);
        return "Saved";
    }

    @GetMapping(path="")
    public @ResponseBody Iterable<Atleta> getAllAtletas() {
        // This returns a JSON or XML with the users
        return atletaRepository.findAll();
    }
}
