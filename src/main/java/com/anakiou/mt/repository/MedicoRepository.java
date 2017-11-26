package com.anakiou.mt.repository;

import com.anakiou.mt.domain.Medico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends CrudRepository<Medico, Integer>{
    
}
