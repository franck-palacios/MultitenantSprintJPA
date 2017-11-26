package com.anakiou.mt.repository;

import com.anakiou.mt.domain.Consultorio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultorioRepository extends CrudRepository<Consultorio, Integer>{
    
}
