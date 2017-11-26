package com.anakiou.mt.repository;

import com.anakiou.mt.domain.Referencia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReferenciaRepository extends CrudRepository<Referencia, Integer>{
    
}
