package com.mballen.curso.boot.Services;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mballen.curso.boot.Converters.NutricionistaConversor;
import com.mballen.curso.boot.DataSourceModel.NutricionistaEntity;
import com.mballen.curso.boot.Repositories.NutricionistaRepository;
import com.mballen.curso.boot.Resources.NutricionistaResource;

@Service
public class CadastroNutricionista {
@Autowired
private NutricionistaRepository    nutricionistaRepository;
@Autowired
private NutricionistaConversor conversor;

private static final Logger LOG = Logger.getLogger( CadastroNutricionista.class);
public void cadastro(NutricionistaResource nutricionista) {
	LOG.info("serviço de save sendo executado");
	NutricionistaEntity nutri=conversor.Conversor(nutricionista);
	
	
	nutricionistaRepository.saveAndFlush(nutri);
}




}
