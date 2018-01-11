/*
 * Matthew Lee
 * NetID: 29493210
 * Project 2
 * date: 10/27/16
 * Tues Thurs 11:05
 * "I did not collaborate with anyone on this assignment"
 */

public class Hole{

	//instance variables
	protected String name;
	protected int holeNum;
	protected int yards;
	protected int holePar;
	
	
	//constructor 1 which will have the information about each hole
	public Hole(String name, int holeNum, int yards, int holePar){
		this.name = name;
		this.holeNum = holeNum;
		this.yards = yards;
		this.holePar = holePar;
	}
		

	
	//constructor 2
	public Hole(){
		
	}
	
	
	
	
	


	//getters and setters
	public String getName(){
		return this.name;
	}
	
	public int getHoleNum() {
		return holeNum;
	}
	public void setHoleNum(int holeNum) {
		this.holeNum = holeNum;
	}
	public int getYards() {
		return yards;
	}
	public void setYards(int yards) {
		this.yards = yards;
	}
	public int getHolePar() {
		return holePar;
	}
	public void setHolePar(int holePar) {
		this.holePar = holePar;
	}
	
	
	
	
	
	
}
