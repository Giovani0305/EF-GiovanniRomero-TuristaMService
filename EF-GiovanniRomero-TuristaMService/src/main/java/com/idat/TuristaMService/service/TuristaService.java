package com.idat.TuristaMService.service;

import java.util.List;
 
import com.idat.TuristaMService.dto.TuristaDTO;

public interface TuristaService {
	List<TuristaDTO> listar();
	void guardar(TuristaDTO alumno);
}
