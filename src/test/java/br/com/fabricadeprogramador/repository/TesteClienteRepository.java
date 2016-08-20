package br.com.fabricadeprogramador.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.fabricadeprogramador.model.Cliente;
import junit.framework.Assert;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class TesteClienteRepository {
	
	@Autowired
	ClienteRepository repository;
		
	
	
	@Test
	public void deveTesteSalvar(){
		Cliente cliente = new Cliente();
		cliente.setNome("jao");
		cliente.setEmail("jao@gmail.com");
		cliente.setCpf("999999999");
		Cliente clienteSalvo = repository.save(cliente);
		Assert.assertNotNull("Provavelmente o cliente nao foi salvo",clienteSalvo.getId());
     }
	@Test
	public void deveBuscarTodos(){
		
		Cliente jao = new Cliente("jao da silva","jao@hotmail.com","99999999999");
		Cliente ze = new Cliente("ze da silva","ze@hotmail.com","88888888888");
		Cliente pafuncio = new Cliente("pafuncio da silva","pafuncio@hotmail.com","77777777777");
		
		repository.save(jao);
		repository.save(ze);
		repository.save(pafuncio);


	    List clientes = repository.findAll();
		Assert.assertTrue("O tamanho da lista nao e grande o suficiente",clientes.size()>=3);
		
	}
	@Test(expected=DataIntegrityViolationException.class)//asserçao
	public void naoDeveSalvarSemNome(){
		//cenario
		Cliente jao = new Cliente();
		jao.setEmail("jao@hotmail.com");
		jao.setCpf("99999999999");
		
		//execucao
		repository.save(jao);
		
		
		
		
		
	}
	@Test//assercao
	public void naodeveSalvarComCPFMaiorQueOnzeDigitos(){
		//cenario
		Cliente jao = new Cliente ("jao da silva","jao@hotmail.com","9999999999999");
		//execucao
		repository.save(jao);
	}
	
}
