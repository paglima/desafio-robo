package main;

import model.Robo;

//Sem State

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Robo robo = new Robo(1,2,'N');
		Robo robo2 = new Robo(3,3,'E');
		
		robo.turnLeft();
		robo.move();
		robo.turnLeft();
		robo.move();
		robo.turnLeft();
		robo.move();
		robo.turnLeft();
		robo.move();
		robo.move();
		// 1 2 N: LMLMLMLMM -> 1 3 N
		
		robo2.move();
		robo2.move();
		robo2.turnRight();
		robo2.move();
		robo2.move();
		robo2.turnRight();
		robo2.move();
		robo2.turnRight();
		robo2.turnRight();
		robo2.move();
		// 3 3 E: MMRMMRMRRM -> 5 1 E
		System.out.println(robo);
		System.out.println(robo2);
	}

}
