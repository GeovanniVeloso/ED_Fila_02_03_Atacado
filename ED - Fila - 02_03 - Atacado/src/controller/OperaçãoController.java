package controller;

import model.Fila;
import model.Cliente;

public class OperaçãoController {

	Cliente c2;

	public OperaçãoController() {
		super();
	}

	public void Caixa(Fila<Cliente> fila) {
		float total;
		while (!fila.isEmpty()) {
			try {
				c2 = fila.remove();
			} catch (Exception e) {
				System.err.println(e);
			}
			total = c2.getQndPeças() * c2.getValPeças();
			System.out.println("O total da compra do cliente " + c2.getNome() + " é igual a R$" + total);
		}
	}

}
