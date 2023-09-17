package com.sportan.nicolas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sportan.nicolas.models.Catalogo;
import com.sportan.nicolas.models.Mensaje;
import com.sportan.nicolas.models.Ordenes;
import com.sportan.nicolas.models.Producto;
import com.sportan.nicolas.models.Usuarios;
import com.sportan.nicolas.repositories.SportanRepositorio;

@RestController
public class SportanController {
        private final SportanRepositorio repositorio;

        @Autowired
    public SportanController(SportanRepositorio repositorio) {
        this.repositorio = repositorio;
    }
    //metodos http del modelo catalogo

    // try catch para manejar errores hecho por kevin 
    @GetMapping("/catalogo")
    public ResponseEntity ListCatalogos(){
    //mira arriba ☝️        ese tipo de funcion sirve para manejar errores, usalo en todos los metodos
        try {
        // mira abajo 👇️        este return sirve para mandar al cualquier cosa al fronted, en este caso el catalogo
            return ResponseEntity.ok(repositorio.getCatalogo());
        } catch (Exception e) {
        // mira abajo 👇️        este return sirve para mandar al cualquier cosa al fronted, en este caso un mensaje de error
            return ResponseEntity.status(500).body(new Mensaje(e.getMessage()));
        }
    }

    @GetMapping("/catalogo/{idCat}")
    public Catalogo SpecificCat(@PathVariable(value="idCat") int idCat){
        return repositorio.getCatProd(idCat);
    }
    //metodos de http del modelo usuarios
    @GetMapping("/users")
    public List<Usuarios> ListUsuarios(){
        return repositorio.getUsuarios();
    }
    @GetMapping("/users/{idUsuario}")
    public Usuarios SpecificUser(@PathVariable(value="idUsuario") int idUsuario){
        return repositorio.onlyUser(idUsuario);
    }
    @PostMapping
    public Mensaje newUsuario(@RequestBody Usuarios us){
        boolean a=repositorio.newUser(us);
        return new Mensaje("usuario registrado");
    }
     @PutMapping("/users/{idUsuario}")
    public Mensaje updateUsuario(@PathVariable(value="idUsuario") int idUsuario,@RequestBody Usuarios u){
        boolean a=repositorio.updateUser(u, idUsuario);
        return new Mensaje("usuario actualizado");
    }
    @DeleteMapping ("users/{idUsuario}")
    public Mensaje deleteUsuario(@PathVariable(value="idUsuario") int idUsuario){
        boolean a=repositorio.deleteUser(idUsuario);
        return new Mensaje("usuario eliminado exitosamente");
    }
    //metodos http del modelo de productos
        @GetMapping("/producto")
    public List<Producto> ListProductos(){
        return repositorio.getProductos();
    }
        @GetMapping("/producto/{idProd}")
        public Producto SpecificProd(@PathVariable(value="idProd") int idProd){
            return repositorio.onlyProd(idProd);
        }
        @PostMapping("/producto/{idProd}")
        public Mensaje newProducto(@RequestBody Producto p){
            boolean a=repositorio.newProducto(p);
            return new Mensaje("producto agregado exitosamente ");
        }
        @PutMapping("/producto/{idProd}")
            public Mensaje updateProd(@PathVariable(value="idProd") int idProd,@RequestBody Producto p){
                boolean a=repositorio.updateProd(p, idProd);
                return new Mensaje("producto actualizado");
            }
        @DeleteMapping("/producto/{idProd}")
            public Mensaje deleteProd(@PathVariable(value="idProd") int idProd){
                boolean a=repositorio.deleteProd(idProd);
                return new Mensaje("prodcuto eliminado exitosamente");
            }
        //metodos http del modelo de ordenes
        @GetMapping("/orden")
        public List<Ordenes> Listordenes(){
            return repositorio.getorden();
        }
    }
    
