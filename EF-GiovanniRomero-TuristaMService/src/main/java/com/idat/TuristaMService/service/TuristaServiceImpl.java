package com.idat.TuristaMService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.idat.TuristaMService.dto.TuristaDTO;
import com.idat.TuristaMService.model.Turista;
import com.idat.TuristaMService.repository.TuristaRepository;

@Service
public class TuristaServiceImpl implements TuristaService{
	@Autowired
	private TuristaRepository repository;
	
	@Override
	public List<TuristaDTO> listar() {
		List<TuristaDTO> listado = new ArrayList<>();
		TuristaDTO dto = null;
				
		for (Turista turista : repository.findAll()) {
			dto = new TuristaDTO();
			dto.setCod(turista.getIdTurista());
			dto.setNom(turista.getNombreTurista());
			dto.setCel(turista.getNroCelular());
			dto.setDir(turista.getDireccion());
			
			
			listado.add(dto);
		}
		
		return listado;
	}
	
	@Override
	public void guardar(TuristaDTO turista) {
		
		Turista t = new Turista();
		t.setIdTurista(turista.getCod());
		t.setNombreTurista(turista.getNom());
		t.setNroCelular(turista.getCel());
		t.setDireccion(turista.getDir());
		
		repository.save(t);
	}

}
