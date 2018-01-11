/*
 * Matthew Lee
 * NetID: 29493210
 * Project 2
 * date: 10/27/16
 * Tues Thurs 11:05
 * "I did not collaborate with anyone on this assignment"
 */
import java.util.Scanner;


public class Game extends Player{
	
	
	public void startUpGame(String response){
	
		if(response.equalsIgnoreCase("yes")){
			
			
			Clubs value = new Clubs();
			Putting puttTime = new Putting();
			Scanner scan = new Scanner(System.in);
			Scanner second = new Scanner(System.in);
		
			System.out.println();
			System.out.println("What course would you like to play at? Type 1 for Genesee Valley Park North Course"
				+ "\nor type 2 for Old Course at St. Andrews.");
			int courseNum = scan.nextInt();
		
			Course location = new GeneseeValleyParkNorthCourse();
		
			//if else statement which will generate the a new object of the specific course to be played on
			if(courseNum == 1){
				GeneseeValleyParkNorthCourse course = new GeneseeValleyParkNorthCourse();
				location = course;
			
			}else{
				TheOldCourse course = new TheOldCourse();
				location = course;
			}
		
		

		
		
		
		
			//for each time they wish to continue playing, this loop will keep track and pull out the necessary information that pertains to the hole number
			for(int i=0; i<location.holeArray.length;i++){
				location.holeArray[i].getHoleNum();
				location.holeArray[i].getHolePar();
				location.holeArray[i].getYards();
			
		
				//have the strokes set to 0 so that each time the loop will reset their stroke counter
				strokes=0;
				remainingDist = location.holeArray[i].getYards();
				System.out.println();
				System.out.println("You are playing on "+location.holeArray[i].getName()+"("+location.holeArray[i].getHoleNum()+")"
						+", par: "+location.holeArray[i].getHolePar()+", distance (yards): "+location.holeArray[i].getYards());

		
		
				//if else statement for determining whether to putt or swing
				while(remainingDist!=0){
			
			
					//if the distance is greater than 20 the player will still have to swing with a club
					if(remainingDist >20){
						System.out.println();
						System.out.println("You have "+remainingDist+" yards left, stroke: "+strokes);
						System.out.println("Select a club you would like to use [1:driver - 10:wedge]...");
						int nextClub = scan.nextInt();
						value.setClubNum(nextClub);
				
						System.out.println();
				
						System.out.println("Now choose a value [1:softest-10:strongest] for the power at which you would like to hit the ball...");
						int nextPower = scan.nextInt();
						value.setPower(nextPower);
						int nextStroke = value.getSwingDist();
						strokes++;
						remainingDist -= nextStroke;
				
						
						//in the case the remaining distance is negative (meaning they hit beyond the course) I will have them start back at the point prior to having
						//hit the ball off course and add an additional stroke
						if(remainingDist<0){
							System.out.println();
							System.out.println("Sorry you hit the ball off the course...try again");
							strokes++;
							remainingDist += nextStroke;
							
							
						}else{
							System.out.println();
							System.out.println("You hit the ball "+nextStroke+" yards! You have "+remainingDist+" yards left.");
						}
					
	
				
				
				
				
						// in the case that the remaining distance is not greater than 20, they will putt
					}else if (remainingDist<=20 && remainingDist>0){
						System.out.println();
				
						System.out.println("You have "+remainingDist+" yards left, stroke: "+strokes);
						System.out.println("Select the power [1:softest-10:strongest] at which you would like to putt...");
						int nextPuttPower = scan.nextInt();
						puttTime.setPuttPower(nextPuttPower);
						int nextPuttHole = puttTime.getPuttDist();
						strokes++;
						remainingDist -= nextPuttHole;
				
						
						//in the case the remaining distance is negative (meaning they hit beyond the course) I will have them start back at the point prior to having
						//hit the ball off course and add an additional stroke
						if(remainingDist<0){
							System.out.println();
							System.out.println("Sorry you hit the ball off the course...try again");
							strokes++;
							remainingDist += nextPuttHole;
							
		
						}else{
							System.out.println();
							System.out.println("You hit the ball "+nextPuttHole+" yards. You have "+remainingDist+" yards left.");
						}	
				
				
			
		
			}
		}
		
		//this is the compound of the player's score which will constantly be accumulating as they continue to each round
		
		score = (strokes - location.holeArray[i].getHolePar()) + score; 
		
		
		

		//assuming the hole is at the very end of the course
		if(remainingDist==0){
			System.out.println();
			
			System.out.println("Congrats!!! You made it into the hole! You scored in "+strokes+" strokes. You scored "+(strokes - location.holeArray[i].getHolePar())+" this round."
					+" Your total score is "+score+". Would you like to play again (yes: to continue, no: to stop)");
			String reply = second.nextLine();
			
			
			//a yes response will have the loop start again 
			if(reply.equalsIgnoreCase("yes")){
				
			}else{//saying anything other than yes will stop the loop 
				System.out.println();
				System.out.println("Thank you for playing!");
				break;
			}
				
				
			}
		
		}//end of for loop
		
		

		
	}else if(response.equalsIgnoreCase("no")){
		System.out.println();
		System.out.println("Ok then maybe next time, bye!");
	}
	
	
	}	

}

