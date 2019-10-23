package com.greenlight.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greenlight.assignment.model.animal.Animal;
import com.greenlight.assignment.model.animal.AnimalStats;
import com.greenlight.assignment.service.AnimalService;

@RestController
public class AnimalController {
	
	@Autowired
	private AnimalService animalService;
	

	@RequestMapping(method = RequestMethod.GET, value="/animals/")
	public List<Animal> getAllAnimals()
	{
		return animalService.getAnimalList();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/animals/stats/")
	public AnimalStats getAnimalStats()
	{
		return animalService.getAnimalStats();
	}	
	
	@RequestMapping(method = RequestMethod.GET, value="/animals/search/{id}")
	public Animal getAnimalByID(@PathVariable("id") String id)
	{
		return animalService.getAnimalByID(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/animals/search/")
	public List<Animal> getAnimalByName(@RequestParam(value="name" , required = false ) String name)
	{
		return animalService.getAnimalByName(name);
	}	
	
	@RequestMapping(method = RequestMethod.POST, value="/animals/create/")
	public List<Animal> addAnimal(@RequestParam(value="name") String name)
	{
		animalService.addAnimal(name);
		return animalService.getAnimalList();
	}
	
	
	@RequestMapping(method=RequestMethod.PUT, value="/animals/update/{id}")
	public List<Animal> updateAnimal(@PathVariable("id") String id, @RequestParam(value="name" , required = false ) String name)
	{
		 animalService.updateAnimal(id, name);
		 return animalService.getAnimalList();
	}

	
	@RequestMapping(method=RequestMethod.DELETE, value="/animals/delete/{id}")
	public List<Animal> deleteAnimalByID(@PathVariable("id") String id)
	{
		animalService.deleteAnimalByID(id);
		 return animalService.getAnimalList();
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/animals/delete/")
	public List<Animal> deleteAnimalsByName(@RequestParam(value="name")  String name)
	{
		 animalService.deleteAnimalsBYName(name);
		 return animalService.getAnimalList();
	}	 
}
