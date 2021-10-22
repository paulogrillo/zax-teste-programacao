package app.models;

import java.util.ArrayList;
import java.util.List;

public class DAO {

	public static List<Loja> lojas;
	private static List<Motoboy> listMotoboys;

	static {
		System.out.println("Carregar as informações....");
		listMotoboys = new ArrayList<Motoboy>();

		// Motoboys
		listMotoboys.add(new Motoboy("Moto 1", new ArrayList<PedidoRetirado>(), 0, 2.0, false, 0.0));
		listMotoboys.add(new Motoboy("Moto 2", new ArrayList<PedidoRetirado>(), 0, 2.0, false, 0.0));
		listMotoboys.add(new Motoboy("Moto 3", new ArrayList<PedidoRetirado>(), 0, 2.0, false, 0.0));
		listMotoboys.add(new Motoboy("Moto 4", new ArrayList<PedidoRetirado>(), 1, 2.0, true, 0.0));
		listMotoboys.add(new Motoboy("Moto 5", new ArrayList<PedidoRetirado>(), 0, 2.0, false, 0.0));

		// Lojas
		lojas = new ArrayList<Loja>();

		// Loja 1
		List<Pedido> pedidos1 = new ArrayList<Pedido>();
		pedidos1.add(new Pedido(1, 50.0));
		pedidos1.add(new Pedido(2, 50.0));
		pedidos1.add(new Pedido(3, 50.0));
		lojas.add(new Loja(1, "Loja 1", 5.0, pedidos1));

		// Loja 2
		List<Pedido> pedidos2 = new ArrayList<Pedido>();
		pedidos2.add(new Pedido(1, 50.0));
		pedidos2.add(new Pedido(2, 50.0));
		pedidos2.add(new Pedido(3, 50.0));
		pedidos2.add(new Pedido(4, 50.0));
		lojas.add(new Loja(2, "Loja 2", 5.0, pedidos2));

		// Loja 3
		List<Pedido> pedidos3 = new ArrayList<Pedido>();
		pedidos3.add(new Pedido(1, 50.0));
		pedidos3.add(new Pedido(2, 50.0));
		pedidos3.add(new Pedido(3, 100.0));
		lojas.add(new Loja(3, "Loja 3", 15.0, pedidos3));

	}

	public void teste() {
		System.out.println("Inicio de Teste....");
		
		Motoboy moto1 = listMotoboys.get(listMotoboys.indexOf(new Motoboy("Moto 1")));
		Motoboy moto2 = listMotoboys.get(listMotoboys.indexOf(new Motoboy("Moto 2")));
		Motoboy moto3 = listMotoboys.get(listMotoboys.indexOf(new Motoboy("Moto 3")));
		Motoboy moto4 = listMotoboys.get(listMotoboys.indexOf(new Motoboy("Moto 4")));
		Motoboy moto5 = listMotoboys.get(listMotoboys.indexOf(new Motoboy("Moto 5")));

		// Retirados Pedidos da Loja 1
		Loja loja1 = lojas.get(lojas.indexOf(new Loja(1)));
		moto4.retiradaPedido(loja1, loja1.getPedidos().get(0));// Pedido 1 da Loja 1
		moto1.retiradaPedido(loja1, loja1.getPedidos().get(1));// Pedido 2 da Loja 1
		moto2.retiradaPedido(loja1, loja1.getPedidos().get(2));// Pedido 3 da Loja 1

		// Retirados Pedidos da Loja 2
		Loja loja2 = lojas.get(lojas.indexOf(new Loja(2)));
		moto3.retiradaPedido(loja2, loja2.getPedidos().get(0));// Pedido 1 da Loja 2
		moto5.retiradaPedido(loja2, loja2.getPedidos().get(1));// Pedido 2 da Loja 2
		moto1.retiradaPedido(loja2, loja2.getPedidos().get(2));// Pedido 3 da Loja 2
		moto2.retiradaPedido(loja2, loja2.getPedidos().get(3));// Pedido 4 da Loja 2

		// Retirados Pedidos da Loja 3
		Loja loja3 = lojas.get(lojas.indexOf(new Loja(3)));
		moto3.retiradaPedido(loja3, loja3.getPedidos().get(0));// Pedido 1 da Loja 3
		moto5.retiradaPedido(loja3, loja3.getPedidos().get(1));// Pedido 2 da Loja 3
		moto1.retiradaPedido(loja3, loja3.getPedidos().get(2));// Pedido 3 da Loja 3

		moto1.print();
		moto2.print();
		moto3.print();
		moto4.print();
		moto5.print();
	}

}