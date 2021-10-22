package app.models;

public class Pedido {

	@Override
	public String toString() {
		return "Pedido [codigo=" + codigo + ", valor=" + valor + "]";
	}

	private int codigo;
	private double valor;

	public Pedido(int codigo, double valor) {
		super();
		this.codigo = codigo;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
