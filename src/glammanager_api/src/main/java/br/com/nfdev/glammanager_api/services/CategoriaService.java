package br.com.nfdev.glammanager_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.nfdev.glammanager_api.entities.Categoria;
import br.com.nfdev.glammanager_api.exception.EntityNotFoundException;
import br.com.nfdev.glammanager_api.repositories.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;


    @Transactional(readOnly = true)
    public List<Categoria> getAll(){
        return categoriaRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Categoria getById(long id){
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(String.format("Usuário de id=%s não encontrado", id)));
    }

    @Transactional
    public Categoria salvar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}
