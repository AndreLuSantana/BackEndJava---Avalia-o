package br.com.backEndAvaliacao.gui;


import java.util.Scanner;

import br.com.backEndAvaliacao.controller.UserController;
import br.com.backEndAvaliacao.entities.User;

public class InterfacePrincipal {

	Scanner sc = new Scanner(System.in);

	private Boolean system;
	private UserController controller;

	public InterfacePrincipal(UserController controller) {
		this.controller = controller;
	}

	public void inicial() {
		system = true;

		while (system) {

			System.out.println("!!!!!!!BackEnd Avaliação!!!!!!!");
			System.out.println("Digite 1 - Para Cadastrar um Usuário.");
			System.out.println("Digite 2 - Para Deletar um usuário.");
			System.out.println("Digite 3 - Para listar todos os usuários.");
			System.out.println("Digite 0 - Para sair.");

			int opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("<< Cadastrando um usuário >>");
				System.out.println("Informe o id do usuário: ");
				Integer id = sc.nextInt();
				System.out.println("Informe o nome do usuário: ");
				String nome = sc.next();
				System.out.println("Informe o login do usuário: ");
				String login = sc.next();
				System.out.println("Informe a senha do usuário: ");
				Integer senha = sc.nextInt();
				
				User user = new User(id, nome, login, senha);
				
				controller.insertUser(user);
				System.out.println("USUÁRIO ID:" + user.getId() + ", NOME:"+ user.getNome() + " CADASTRADO.");
				break;
			case 2:
				controller.findAll();
				System.out.println("Informe a posição do usuário que você deseja deletar: ");
				int posicaoUsuario = sc.nextInt();
				controller.deleteUser(posicaoUsuario);
				break;
			case 3:
				controller.findAll();
				break;

			default:
				system = false;
				System.out.println("Sistema finalizado.");
				break;
			}
		}
	}
}
