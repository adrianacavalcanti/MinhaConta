package br.com.teste.minhaconta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import br.com.teste.minhaconta.model.Cliente;
import br.com.teste.minhaconta.service.ClienteServiceImpl;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteServiceImpl service;
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	/*
	 * Salvar  Informações cadastrais contendo dados do cliente
	 */
	@RequestMapping("listaclientes")
	public String listaClientes(Model model){
		
		Iterable<Cliente> clientes = service.obterTodos();
		
		model.addAttribute("clientes", clientes);
		
		return "listaclientes";
	}
	
	/*
	 * Salvar  Informações cadastrais 
	 */
	@RequestMapping(value = "salvar", method = RequestMethod.POST )
	public String salvar(@RequestParam("nome") String nome, @RequestParam("email")String email, 
			@RequestParam("telefone") String telefone, Model model, @RequestParam("users") List<String> list){
		
		Cliente novoCliente = new Cliente(nome, email, telefone);
		
		service.salvar(novoCliente);
		
		Iterable<Cliente> clientes = service.obterTodos();
		
		model.addAttribute("clientes", clientes);
		
		return "listaclientes";
		
	}

	public ClienteServiceImpl getService() {
		return service;
	}

	public void setService(ClienteServiceImpl service) {
		this.service = service;
	}
	
	

}
