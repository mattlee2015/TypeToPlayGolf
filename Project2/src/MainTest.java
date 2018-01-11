/*
 * Matthew Lee
 * NetID: 29493210
 * Project 2
 * date: 10/27/16
 * Tues Thurs 11:05
 * "I did not collaborate with anyone on this assignment"
 */
import java.util.Scanner;


public class MainTest{

	

	public static void main(String[] args) {
		
		
		
		
		Scanner second = new Scanner(System.in);
		
		System.out.println("RULES: You are playing a linear version of golf. In other words you dont have to worry about"
				+ "\nthe terrain such as uneven ground, sand, or etc. To hit the ball, you will be asked to type in a "
				+ "\nnumber for the 'type' of golf club you would like to use. From there you will then be asked a "
				+ "\nto enter in a number which will represent how hard you wish to hit the ball. The hole is"
				+ "\nlocated at the end of the course and in any instance you were to hit beyond the hole you will "
				+ "\nstart back at the place prior to having hit the ball off course and have a stroke added. Remember the"
				+ "\nscoring in golf is different from most traditional scoring system. So you want to get the least amount"
				+ "\nof points possible.");
		
		System.out.println();
		System.out.println("Welcome challenger! Would you like to play TTY Golf?");
		String response = second.nextLine();
		
	
		Game user = new Game();
		user.startUpGame(response);
		

	
	
	

	
		


	}

}

