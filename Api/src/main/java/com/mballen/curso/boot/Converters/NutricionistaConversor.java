package com.mballen.curso.boot.Converters;

import org.springframework.stereotype.Component;

import com.mballen.curso.boot.DataSourceModel.NutricionistaEntity;
import com.mballen.curso.boot.Resources.NutricionistaResource;
// tranforma o json em uma entidade do banco de dados convertendo com a classe conversor
@Component
public class NutricionistaConversor {
	
	public NutricionistaEntity Conversor(NutricionistaResource nutricionista)
	{
		
		try {
			NutricionistaEntity nutri= new NutricionistaEntity();
			
			
			Long id_paciente=	chekid(nutricionista.getIdPaciente());	
			int idade =chekidade(nutricionista.getIdade());
			nutri.setId_paciente(id_paciente);
			nutri.setIdade(idade);
			nutri.setCoigoRegistro( nutricionista.getCodigoRegistro());
			nutri.setNome( nutricionista.getNome());
			
			return nutri;
			
			
		} catch (Exception e) {
			
		}
		return null;
	
			
			
		
	}
	
	public Long chekid(String idpaciente) {
		return Long.parseLong(idpaciente);
		
	}
	
	
	public int chekidade(String idade) {
		return Integer.parseInt(idade);
		
	}

}
