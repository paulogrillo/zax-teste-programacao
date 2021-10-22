package app;

import app.models.DAO;

/*
 * 
Problema:

Existem 5 motoboys, cada motoboy ganha uma comiss�o diferente por pedido coletado, 
e alguns motoboys possuem exclusividade com algumas lojas na qual fazem coletas.

- Os motoboys n�o podem reclamar que ficaram sem pedidos.

- Os motoboys que possuem exclusividade com as lojas, possuem prioridade.

- Os motoboys podem ter exclusividade com as lojas, mas as lojas n�o possuem exclusividade com os motoboys.

- Hoje existem 10 pedidos para serem retirados em 3 lojas.

Quando eu executar o script passando apenas o motoboy ou n�o passando nenhum motoboy, preciso ver:
* Quem � o motoboy e quantos pedidos ter�?
* De qual loja �?
* Quanto vai ganhar?

Dados do teste:

Motoboys
Moto 1 - cobra R$2 reais por entrega e atende todas as lojas
Moto 2 - cobra R$2 reais por entrega e atende todas as lojas
Moto 3 - cobra R$2 reais por entrega e atende todas as lojas
Moto 4 - cobra R$2 reais por entrega e atende apenas a loja 1
Moto 5 - cobra R$3 reais por entrega e atende todas as lojas

Lojas
Loja 1 - 3 pedidos (PEDIDO 1 R$50, PEDIDO 2 R$50, PEDIDO 3 R$50) e paga 5% do valor pedido por entrega fora o valor fixo.
Loja 2 - 4 pedidos (PEDIDO 1 R$50, PEDIDO 2 R$50, PEDIDO 3 R$50, PEDIDO 4 R$50) e paga 5% do valor pedido por entrega fora o valor fixo.
Loja 3 - 3 pedidos (PEDIDO 1 R$50, PEDIDO 2 R$50, PEDIDO 3 R$100) e paga 15% do valor pedido por entrega fora o valor fixo.

O Moto 1 atende todas as lojas
O Moto 2 atende todas as lojas
O Moto 3 atende todas as lojas
O Moto 4 atende apenas a loja 1
O Moto 5 atende todas as lojas
 */

public class Application {

	private static DAO dao = new DAO();
	
	public static void main(String[] args) {
		// Inicial da aplica��o de Teste Logica de Programa��o
		dao.teste();
	}
	

}
