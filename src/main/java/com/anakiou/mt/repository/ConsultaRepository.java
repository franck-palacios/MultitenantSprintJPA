package com.anakiou.mt.repository;

import com.anakiou.mt.domain.Consulta;
import com.anakiou.mt.domain.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends CrudRepository<Consulta, Integer>{
    //Buscar por Consultas por pacientes
    Consulta findByPaciente(Paciente paciente);
    
    
}
