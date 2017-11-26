package com.anakiou.mt.repository;

import com.anakiou.mt.domain.Receta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecetaRepository extends CrudRepository<Receta, Integer>{
    
}
