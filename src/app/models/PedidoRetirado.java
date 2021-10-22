package app.models;

public class PedidoRetirado {

	private Loja loja;
	private Pedido pedido;

	public PedidoRetirado(Loja loja, Pedido pedido) {
		super();
		this.loja = loja;
		this.pedido = pedido;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
