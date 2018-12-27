package br.com.teste.minhaconta;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import br.com.teste.minhaconta.model.Cliente;
import br.com.teste.minhaconta.model.Pedido;
import br.com.teste.minhaconta.model.Produto;
import br.com.teste.minhaconta.service.PedidoServiceImpl;
import br.com.teste.minhaconta.service.ProdutoServiceImpl;

@Controller
public class PedidoController {

	@Autowired
	private PedidoServiceImpl pedidoService;

	@Autowired
	private ProdutoServiceImpl produtoService;

	/*
	 * Retorna dados de um determinado pedido através do id do Pedido enviado
	 */
	public String listarPedidos(Long idPedido, Model model) {

		Pedido pedidos = pedidoService.retornarPedidosAndamento(idPedido);

		model.addAttribute("pedidos", pedidos);

		return "listapedidoandamento";
	}

	/*
	 * Retorna uma lista de produtos
	 */
	public String listarProdutos(Model model) {

		Iterable<Produto> produtos = produtoService.listarProdutos();

		model.addAttribute("produtos", produtos);

		return "listaprodutos";
	}

	/*
	 * Retorna uma lista de historico de pedidos com realizadas até 90 dias.
	 */
	public String listarHistoricoPedidos(Model model, Cliente idCliente) {
		
		Date dataHistorico = retornaData();
		
		Iterable<Pedido> pedidos = pedidoService.listarHistoricoPedidos(dataHistorico, idCliente);

		model.addAttribute("pedidos", pedidos);

		return "listahistoricopedidos";

	}
	
	
	/*
	 * Retorna data com menos de 90 dias
	 */
	public Date retornaData(){
		
		Date data;
		
		GregorianCalendar c = new GregorianCalendar();

		c.add(Calendar.DAY_OF_MONTH, -90);
		
		data = c.getTime();
		
		return data;
		
	}
	

	public PedidoServiceImpl getPedidoService() {
		return pedidoService;
	}

	public void setPedidoService(PedidoServiceImpl pedidoService) {
		this.pedidoService = pedidoService;
	}

	public ProdutoServiceImpl getProdutoService() {
		return produtoService;
	}

	public void setProdutoService(ProdutoServiceImpl produtoService) {
		this.produtoService = produtoService;
	}

}
