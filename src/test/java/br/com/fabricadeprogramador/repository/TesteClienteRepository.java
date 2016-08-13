package br.com.fabricadeprogramador.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.fabricadeprogramador.model.Cliente;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TesteClienteRepository {
	
	@Autowired
	ClienteRepository repository;
		
	
	
	@Test
	public void testeSalvar(){
		Cliente cliente = new Cliente();
		cliente.setNome("jao");
		cliente.setEmail("jao@gmail.com");
		cliente.setCpf("999999999");
		repository.save(cliente);
	}
	

}
