package com.anakiou.mt.repository;

import com.anakiou.mt.domain.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Integer>{
    
}
