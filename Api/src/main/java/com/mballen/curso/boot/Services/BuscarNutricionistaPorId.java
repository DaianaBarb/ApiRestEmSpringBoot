package com.mballen.curso.boot.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mballen.curso.boot.DataSourceModel.NutricionistaEntity;
import com.mballen.curso.boot.Exceptions.NutricionistaNotFoundException;
import com.mballen.curso.boot.Repositories.NutricionistaRepository;

@Service
public class BuscarNutricionistaPorId {
	@Autowired
	private NutricionistaRepository    nutricionistaRepository;
	
	public NutricionistaEntity BuscarPorId(Long id) throws NutricionistaNotFoundException {
		Optional<NutricionistaEntity> optional=
		
		nutricionistaRepository.findById(id);
		NutricionistaEntity nutri=null;
		if(!optional.isPresent()) {
			throw new NutricionistaNotFoundException(" n encontrado ");
		} 
		else {nutri = optional.get();}
		return nutri;
	}
	
	
	public void DeletarPorID(Long id) throws NutricionistaNotFoundException {
		Optional<NutricionistaEntity> optional=
				
				nutricionistaRepository.findById(id);
				NutricionistaEntity nutri=null;
				if(!optional.isPresent()) {
					throw new NutricionistaNotFoundException(" n encontrado ");
				} 
				else { nutricionistaRepository.delete(optional.get());}
			
		
	}

}
