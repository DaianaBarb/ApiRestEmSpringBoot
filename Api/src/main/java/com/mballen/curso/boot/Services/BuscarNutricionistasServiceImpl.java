package com.mballen.curso.boot.Services;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mballen.curso.boot.DataSourceModel.NutricionistaEntity;
import com.mballen.curso.boot.Repositories.NutricionistaRepository;
@Service
public class BuscarNutricionistasServiceImpl {
	private static final Logger LOG = Logger.getLogger( BuscarNutricionistasServiceImpl.class);
	@Autowired
	private NutricionistaRepository nutricionistaRepository ;
	
	public List<NutricionistaEntity> BuscarTodos(){
	LOG.info("serviço de busca todos os nutricionistas sendo executado");
		List<NutricionistaEntity> list = nutricionistaRepository.findAll();
		
		return list;
		
		
		
	}

}
