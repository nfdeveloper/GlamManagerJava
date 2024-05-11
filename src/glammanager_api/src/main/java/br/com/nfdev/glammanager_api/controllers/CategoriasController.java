package br.com.nfdev.glammanager_api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nfdev.glammanager_api.entities.Categoria;
import br.com.nfdev.glammanager_api.services.CategoriaService;

@RestController
@RequestMapping("api/v1/categorias")
public class CategoriasController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<Categoria> create(@RequestBody Categoria categoria){
        Categoria categoriaCreated = categoriaService.salvar(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaCreated);
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> list(){
        List<Categoria> categorias = categoriaService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(categorias);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> getById(@PathVariable Long id){
        Categoria categoria = categoriaService.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(categoria);
    }
}
