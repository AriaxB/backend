package com.sportan.nicolas.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sportan.nicolas.repositories.SportanRepositorio;

//importacion clases
import com.sportan.nicolas.models.Usuarios;
import com.sportan.nicolas.models.Ordenes;
import com.sportan.nicolas.models.Producto;
import com.sportan.nicolas.models.Catalogo;
import com.sportan.nicolas.models.Solicitudes;
import com.sportan.nicolas.models.Mensaje;
//importacion repositorio
import com.sportan.nicolas.repositories.SportanRepositorio;

@RestController
public class SportanController {
        private final SportanRepositorio repositorio;

        @Autowired
    public SportanController(SportanRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @GetMapping("/")
    public List<Catalogo> ListCatalogos(){
        return repositorio.getCatalogo() ;
    }

    @GetMapping("/{id}")
    public Catalogo SpecificCat(@PathVariable(value="idCat") int idCat){
        return repositorio.getCatProd(idCat);
    }



    }
    
