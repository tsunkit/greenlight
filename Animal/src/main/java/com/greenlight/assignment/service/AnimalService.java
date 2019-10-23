package com.greenlight.assignment.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.greenlight.assignment.model.animal.Animal;
import com.greenlight.assignment.model.animal.AnimalStats;
import com.greenlight.assignment.model.animal.Bird;
import com.greenlight.assignment.model.animal.Butterfly;
import com.greenlight.assignment.model.animal.Cat;
import com.greenlight.assignment.model.animal.Chicken;
import com.greenlight.assignment.model.animal.ClownFish;
import com.greenlight.assignment.model.animal.Dog;
import com.greenlight.assignment.model.animal.Dolphin;
import com.greenlight.assignment.model.animal.Duck;
import com.greenlight.assignment.model.animal.Fish;
import com.greenlight.assignment.model.animal.Frog;
import com.greenlight.assignment.model.animal.Parrot;
import com.greenlight.assignment.model.animal.Rooster;
import com.greenlight.assignment.model.animal.RoosterDelegator;
import com.greenlight.assignment.model.animal.Shark;
import com.greenlight.assignment.model.animal.AnimalBehaviour.Flyable;
import com.greenlight.assignment.model.animal.AnimalBehaviour.Singable;
import com.greenlight.assignment.model.animal.AnimalBehaviour.Swimmable;
import com.greenlight.assignment.model.animal.AnimalBehaviour.Walkable;

@Service
public class AnimalService 
{
	private List<Animal> animalList = new ArrayList<>(
										Arrays.asList(
											new Bird(),
											new Duck(),
											new Chicken(),
											new Rooster(),
											new RoosterDelegator(new Chicken()),
											new Dog(),
											new Cat(),
											new Parrot(),
											new Fish(),
											new Shark(),
											new ClownFish(),
											new Dolphin(),
											new Butterfly(),
											new Frog()
											)
										);

	public List<Animal> getAnimalList() {
		return animalList;
	}
	
	public Animal getAnimalByID(String id)
	{
		return animalList.stream()
					.filter(animal -> animal.getID().equals(id)  )
					.findFirst()
					.get();
	}

	public List<Animal>  getAnimalByName(String name)
	{
		return animalList.stream()
					.filter(animal -> animal.getName().equals(name)  )
					.collect(Collectors.toList());
	}
	
	public void addAnimal(String name)
	{
		animalList.add(getAnimalTypeByName(name)); 
		
		
	}
	
	public void updateAnimal(String id, String update_animal_name)
	{

		for(int i=0; i<animalList.size(); i++)
		{
			Animal animal = animalList.get(i);
			if(animal.getID().contentEquals(id) )
			{
				animalList.set(i, getAnimalTypeByName(update_animal_name));
			}
		}
	}
	
	public void deleteAnimalByID(String id)
	{
		animalList.removeIf(animal -> animal.getID().equals(id));
	}
	
	public void deleteAnimalsBYName(String name)
	{
		animalList.removeIf(animal -> animal.getName().equals(name));
	}
	
	
	public AnimalStats getAnimalStats()
	{
		AnimalStats animalStas=AnimalStats.getInstance();
		long totalOfFlyableAnimal=animalList.stream()
				.filter( animal-> animal instanceof Flyable )
				.peek(System.out::println)
				.count();
		
		animalStas.setTotalOfFlyableAnimal(totalOfFlyableAnimal);
		

		long totalOfWalkableAnimal=animalList.stream()
									.filter( animal-> animal instanceof Walkable )
									.peek(System.out::println)
									.count();
		animalStas.setTotalOfWalkableAnimal(totalOfWalkableAnimal);
		
		long totalOfSingableAnimal=animalList.stream()
									.filter( animal-> animal instanceof Singable )
									.peek(System.out::println)
									.count();
		
		animalStas.setTotalOfSingableAnimal(totalOfSingableAnimal);
		
	
		long totalOfSwimmableAnimal=animalList.stream()
									.filter( animal-> animal instanceof Swimmable )
									.peek(System.out::println)
									.count();
		
		animalStas.setTotalOfSwimmableAnimal(totalOfSwimmableAnimal);
		
		return animalStas;
	}
	
	
	private Animal getAnimalTypeByName(String name)
	{
		Animal animal=null;
		switch(name)
		{
			case "Bird": animal=new Bird(); break;
			case "Duck": animal=new Duck(); break;
			case "Chicken": animal=new Chicken(); break;
			case "Rooster": animal=new Rooster(); break;
			case "RoosterDelegator": animal=new RoosterDelegator(new Chicken() ) ; break;
			case "Dog": animal=new Dog(); break;
			case "Cat": animal=new Cat(); break;
			case "Parrot": animal=new Parrot(); break;
			case "Fish": animal=new Fish(); break;
			case "Shark": animal=new Shark(); break;
			case "ClownFish":animal=new ClownFish(); break;
			case "Dolphin": animal=new Dolphin(); break;
			case "Butterfly": animal=new Butterfly(); break;
			case "Frog": animal=new Frog(); break;
			default: assert false : "Entering animal name that not predefined" ; break;
		}
		
		return animal;
	}
}
