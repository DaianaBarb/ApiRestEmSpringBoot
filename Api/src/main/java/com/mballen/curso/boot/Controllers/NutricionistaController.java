package com.mballen.curso.boot.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mballen.curso.boot.DataSourceModel.NutricionistaEntity;
import com.mballen.curso.boot.Exceptions.NutricionistaNotFoundException;
import com.mballen.curso.boot.Repositories.NutricionistaRepository;
import com.mballen.curso.boot.Resources.NutricionistaResource;
import com.mballen.curso.boot.Services.BuscarNutricionistaPorId;
import com.mballen.curso.boot.Services.BuscarNutricionistasServiceImpl;
import com.mballen.curso.boot.Services.CadastroNutricionista;

@RestController
@RequestMapping(value="/api")
public class NutricionistaController {
	
	@Autowired
	private NutricionistaRepository nutricionistaRepository ;
	
	@Autowired
	private BuscarNutricionistasServiceImpl nutricionistaBuscar ;
	@Autowired
	private CadastroNutricionista cadastro ;
	@Autowired
	private BuscarNutricionistaPorId buscar;
	
	@GetMapping(path = "/nutricionista/id/{id}")
	public Optional<NutricionistaEntity> buscarNutricionistaPorId(@PathVariable(name="id",required=true) Long idnutricionista) {
		
	return	nutricionistaRepository.findById( idnutricionista) ;
		
	}
	
	@GetMapping(path = "/nutricionista/id2/{id}")
	public NutricionistaEntity buscarNutricionistaPorId2(@PathVariable(name="id",required=true) Long idnutricionista) throws NutricionistaNotFoundException {
		
	return	buscar.BuscarPorId(idnutricionista) ;
		
	}
	
	
	
	
	@GetMapping(path = "/Buscarnutricionistas")
	public List<NutricionistaEntity> buscarTodosNutricionistas() {
		
	return	nutricionistaBuscar.BuscarTodos() ;
		
	}
	
	
	@GetMapping(path = "/nutricionistas")
	public List<NutricionistaEntity> buscarNutricionistas() {
		
	return	nutricionistaRepository.findAll();	
	}
	@PostMapping(path = "/nutricionista/save2")
	public void salvarNutricionista2(@RequestBody NutricionistaResource nutricionista) {
		
		cadastro.cadastro(nutricionista);
	}
@PostMapping(path = "/nutricionista/save")
public void salvarNutricionista(@RequestBody NutricionistaEntity nutricionistaEntity) {
	
	nutricionistaRepository.save(nutricionistaEntity);	
}
// ou @DeleteMapping
@GetMapping(path= "/nutricionista/del/{id}")
public void deletarNutricionista(@PathVariable(name="id",required=true) Long idnutricionista) {
	nutricionistaRepository.deleteById(idnutricionista);
}

}
