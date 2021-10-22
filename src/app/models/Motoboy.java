package app.models;

import java.util.List;

public class Motoboy {

	private String name;
	private List<PedidoRetirado> pedidoRetirados;
	private int codigoLoja;
	private Double taxaEntrega;
	private Boolean exclusividade;
	private Double valorGanho;
	private Double valorEntrega = 0.0;

	public Motoboy(String name) {
		super();
		this.name = name;
	}

	public Motoboy(String name, List<PedidoRetirado> pedidoRetirados, int codigoLoja, Double taxaEntrega,
			Boolean exclusividade, Double valorGanho) {
		super();
		this.name = name;
		this.pedidoRetirados = pedidoRetirados;
		this.codigoLoja = codigoLoja;
		this.taxaEntrega = taxaEntrega;
		this.exclusividade = exclusividade;
		this.valorGanho = valorGanho;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCodigoLoja() {
		return codigoLoja;
	}

	public void setCodigoLoja(int codigoLoja) {
		this.codigoLoja = codigoLoja;
	}

	public Double getTaxaEntrega() {
		return taxaEntrega;
	}

	public void setTaxaEntrega(Double taxaEntrega) {
		this.taxaEntrega = taxaEntrega;
	}

	public Boolean getExclusividade() {
		return exclusividade;
	}

	public void setExclusividade(Boolean exclusividade) {
		this.exclusividade = exclusividade;
	}

	public Double getValorGanho() {
		return valorGanho;
	}

	public void setValorGanho(Double valorGanho) {
		this.valorGanho = valorGanho;
	}

	public List<PedidoRetirado> getPedidoRetirados() {
		return pedidoRetirados;
	}

	public void setPedidoRetirados(List<PedidoRetirado> pedidoRetirados) {
		this.pedidoRetirados = pedidoRetirados;
	}

	public Double getValorEntrega() {
		return valorEntrega;
	}

	public void setValorEntrega(Double valorEntrega) {
		this.valorEntrega = valorEntrega;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motoboy other = (Motoboy) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public void retiradaPedido(Loja loja, Pedido pedido) {
		valorGanho += taxaEntrega;
		valorEntrega += pedido.getValor() + (loja.getBonusEntrega() * pedido.getValor());
		pedidoRetirados.add(new PedidoRetirado(loja, pedido));
	}

	public void print() {

		String lojaNome = "";

		switch (codigoLoja) {
		case 1: {
			lojaNome = "Loja 1";
			break;
		}
		default:
			lojaNome = "Todas";
		}

		System.out.println(
				String.format("Nome do Motoboy: %s - Atende Loja: %s - Valor ganho: R$ %,.2f - Pedido atendidos: %s\n",
						name, lojaNome, valorGanho, pedidoRetirados.size()));
		System.out.println("--- Pedidos Retirados ---\n");
		for(PedidoRetirado pedidoRetirado : pedidoRetirados) {
			
			System.out.println(String.format("---- Loja: %s, Codigo Pedido: %s", pedidoRetirado.getLoja().getNome(), pedidoRetirado.getPedido().getCodigo()));
		}
		System.out.println("\n");

	}

}
