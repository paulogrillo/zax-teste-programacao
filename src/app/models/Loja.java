package app.models;

import java.util.List;

public class Loja {

	private int codigo;
	private String nome;
	private Double bonusEntrega;
	private List<Pedido> pedidos;

	public Loja(int codigo) {
		super();
		this.codigo = codigo;
	}

	public Loja(int codigo, String nome, Double bonusEntrega, List<Pedido> pedidos) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.bonusEntrega = bonusEntrega;
		this.pedidos = pedidos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Double getBonusEntrega() {
		return bonusEntrega;
	}

	public void setBonusEntrega(Double bonusEntrega) {
		this.bonusEntrega = bonusEntrega;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Loja [codigo=" + codigo + ", nome=" + nome + ", bonusEntrega=" + bonusEntrega + ", pedidos=" + pedidos
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
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
		Loja other = (Loja) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

}
