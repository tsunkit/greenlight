package com.greenlight.assignment.model.animal;

public class AnimalStats 
{
	
	private long totalOfFlyableAnimal;
	private long totalOfWalkableAnimal;
	private long totalOfSingableAnimal;
	private long totalOfSwimmableAnimal;
	
	private static AnimalStats animalStats = new AnimalStats();
	
	public static AnimalStats getInstance()
	{
		return animalStats;
	}
	
	public long getTotalOfFlyableAnimal() {
		return totalOfFlyableAnimal;
	}
	public void setTotalOfFlyableAnimal(long totalOfFlyableAnimal) {
		this.totalOfFlyableAnimal = totalOfFlyableAnimal;
	}
	public long getTotalOfWalkableAnimal() {
		return totalOfWalkableAnimal;
	}
	public void setTotalOfWalkableAnimal(long totalOfWalkableAnimal) {
		this.totalOfWalkableAnimal = totalOfWalkableAnimal;
	}
	public long getTotalOfSingableAnimal() {
		return totalOfSingableAnimal;
	}
	public void setTotalOfSingableAnimal(long totalOfSingableAnimal) {
		this.totalOfSingableAnimal = totalOfSingableAnimal;
	}
	public long getTotalOfSwimmableAnimal() {
		return totalOfSwimmableAnimal;
	}
	public void setTotalOfSwimmableAnimal(long totalOfSwimmableAnimal) {
		this.totalOfSwimmableAnimal = totalOfSwimmableAnimal;
	}			

}
