import java.util.Random;


public class Clubs{

	Random rng = new Random();
	
	protected double swingDist;
	protected int power;
	protected int clubNum;
	int mean;
	int sd;
	
	
	public Clubs(){
		
	}
	
	public int getMean(){
		return this.mean;
		
	}
	
	public int getSd(){
		return this.sd;
	}
	
	
	public void setClubNum(int clubNum){
		switch(clubNum){
		case 1:
			mean = 230;
			sd = 30;
			break;
		case 2:
			mean = 215;
			sd = 20;
			break;
		case 3:
			mean = 180;
			sd = 20;
			break;
		case 4:
			mean = 170;
			sd = 17;
			break;
		case 5:
			mean = 155;
			sd = 15;
			break;
		case 6:
			mean = 145;
			sd = 15;
			break;
		case 7:
			mean = 135;
			sd = 15;
		case 8:
			mean = 125;
			sd = 15;
			break;
		case 9:
			mean = 110;
			sd = 10;
			break;
		case 10:
			mean = 50;
			sd = 10;
			break;
		
		}
		
		this.clubNum = clubNum;
	}
	
	public int getSwingDist() {
		double meanAdjusted = mean * power / 10.0;
		double sdAdjusted = sd * power / 10.0;
		swingDist = Math.abs(rng.nextGaussian() * sdAdjusted + meanAdjusted);
		
		
		return (int)swingDist;
	}
	
	
	public void setPower(int power){
		this.power = power;
	}
	
	
	
	
	
	
	
		
		
		
	
	

	
	
	
	
}
