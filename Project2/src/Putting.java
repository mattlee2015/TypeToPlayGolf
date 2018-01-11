/*
 * Matthew Lee
 * NetID: 29493210
 * Project 2
 * date: 10/27/16
 * Tues Thurs 11:05
 * "I did not collaborate with anyone on this assignment"
 */
import java.util.Random;


public class Putting{
	
	Random ran = new Random();
	
	//initialize instance variables
	protected int puttPower;
	protected double puttDist;
	int mean;
	int sd;

	//constructor
	public Putting(){
		
	}
	

	// for this setter method depending on the user's input it will that value assigned to its respective mean distance, and standard deviation
	public void setPuttPower(int puttPower) {
		switch(puttPower){
			case 10:
				mean = 40;
				sd = 5;
				break;
			case 9:
				mean = 30;
				sd = 5;
				break;
			case 8:
				mean = 25;
				sd = 4;
				break;
			case 7:
				mean = 20;
				sd = 4;
				break;
			case 6:
				mean = 16;
				sd = 3;
				break;
			case 5:
				mean = 12;
				sd = 3;
				break;
			case 4:
				mean = 8;
				sd = 2;
				break;
			case 3:
				mean = 4;
				sd = 2;
				break;
			case 2:
				mean = 2;
				sd = 1;
				break;
			case 1:
				mean = 1;
				sd = 1;
				break;		
		}		
		this.puttPower = puttPower;
	}
	
	//this getter is formatted with adjustments to the distance by considering the values of the mean, standard deviation and then using the random gaussian 
	public int getPuttDist() {
		double meanAdjusted = mean * puttPower / 10.0;
		double sdAdjusted = sd * puttPower / 10.0;
		puttDist = Math.abs(ran.nextGaussian() * sdAdjusted + meanAdjusted);
		
		
		return (int)puttDist;
	}



}
