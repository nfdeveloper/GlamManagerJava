package br.com.nfdev.glammanager_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.nfdev.glammanager_api.entities.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
