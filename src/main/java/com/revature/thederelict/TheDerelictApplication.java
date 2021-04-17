package com.revature.thederelict;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.revature.thederelict.services.MainGameLoop;

@SpringBootApplication
public class TheDerelictApplication {

	public static void main(String[] args) {
		MainGameLoop.startGameLoop();
	}

}
