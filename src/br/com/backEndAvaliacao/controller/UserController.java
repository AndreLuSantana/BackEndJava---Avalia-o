package br.com.backEndAvaliacao.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.backEndAvaliacao.entities.User;

public class UserController {

	public UserController() {

	}

	List<User> listUser = new ArrayList<User>();

	public void insertUser(User user) {
		listUser.add(user);
	}

	public void deleteUser(int posicao) {
		listUser.remove(listUser.get(0));
	}

	public void findAll(){
		if(listUser != null) {
			
			for(int i = 0; i <= listUser.size()-1; i++)
				System.out.println("Posição "+ i + " "+ listUser.get(i));
		}
	}
}
