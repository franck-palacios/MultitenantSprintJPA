package com.anakiou.mt.repository;

import com.anakiou.mt.domain.Diagnostico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosticoRepository extends CrudRepository<Diagnostico, Integer>{
    Diagnostico findBySeveridad(Short grado);    
}
