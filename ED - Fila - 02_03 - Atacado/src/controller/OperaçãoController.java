package controller;

import model.Fila;
import model.Cliente;

public class Opera��oController {

	Cliente c2;

	public Opera��oController() {
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
			total = c2.getQndPe�as() * c2.getValPe�as();
			System.out.println("O total da compra do cliente " + c2.getNome() + " � igual a R$" + total);
		}
	}

}
