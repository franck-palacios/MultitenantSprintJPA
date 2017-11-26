package com.anakiou.mt.web;

import com.anakiou.mt.domain.Consultorio;
import com.anakiou.mt.repository.ConsultorioRepository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/{tenantid}")
public class ConsultorioController {
    @Autowired
	private ConsultorioRepository consultorioRepository;

	@PersistenceContext
	private EntityManager entityManager;

	@RequestMapping(value = "/consultorio")
	public String consultorios(@PathVariable String tenantid, Model model) {
		model.addAttribute("tenantid", tenantid);
		model.addAttribute("consultorio", new Consultorio());
		model.addAttribute("consultorios", consultorioRepository.findAll());
                return "consultorios";
	}

	@RequestMapping(value = "consultorio/add", method = RequestMethod.POST)
	@Transactional
	public String addConsultorio(@ModelAttribute Consultorio consultorio, Model model) {
		consultorioRepository.save(consultorio);
		return "redirect:{/tenant_id}/consultorio";
	}     
}
