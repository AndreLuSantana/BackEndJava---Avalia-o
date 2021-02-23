package br.com.backEndAvaliacao;

import br.com.backEndAvaliacao.controller.UserController;
import br.com.backEndAvaliacao.gui.InterfacePrincipal;

public class Program {

	
	public static void main(String[] args) {
		
		UserController controller = new UserController();
		
		InterfacePrincipal intergaceInterfacePrincipal = new InterfacePrincipal(controller);
		
		intergaceInterfacePrincipal.inicial();
		

	}

}
