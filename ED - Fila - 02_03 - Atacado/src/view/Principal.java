package view;

import model.Fila;
import controller.OperaçãoController;
import model.Cliente;

public class Principal {

	public static void main(String[] args) {

		OperaçãoController oc = new OperaçãoController();
		Fila<Cliente> fila = new Fila<Cliente>();
		Cliente c1;
		String[] nome = { "Alice", "Bob", "Carlos", "Diana", "Eduardo", "Fernanda", "Gabriel", "Helena", "Igor",
				"Julia", "Kaique", "Larissa", "Marcelo", "Natalia", "Otavio", "Paula", "Quiteria", "Rafael", "Sofia",
				"Thiago" };

		for (int i = 0; i < 20; i++) {
			c1 = new Cliente(nome[i], (int) (Math.random() * 1001), (int) (Math.random() * 1001));
			fila.insert(c1);
		}

		oc.Caixa(fila);

	}

}
