package com.revature.thederelict;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheDerelictApplication {

	public static void main(String[] args) {
		MainGameLoop.startGameLoop();
	}

}
