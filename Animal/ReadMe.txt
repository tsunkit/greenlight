Section A
1. Please refer to com.greenlight.assignment.model.animal.Bird;
a. Please refer to com.greenlight.assignment.Animal.BirdTester
b. By using Singable interface, it's so that we can know which animal is singable
You can check their actions using testAnimalDetails method from com.greenlight.assignment.test.AnimalTester

2. Please refer to :
com.greenlight.assignment.model.animal.Duck
com.greenlight.assignment.model.animal.Chicken
You can check their actions using testAnimalDetails method from com.greenlight.assignment.test.AnimalTester

 
3. We can use inheritance and delegate design pattern to model Rooster
a. Please refer to com.greenlight.assignment.model.animal.Rooster and com.greenlight.assignment.model.animal.RoosterDelegator, 
you can test their actions using testAnimalDetails method from com.greenlight.assignment.test.AnimalTester

b. Rooster is a male type of Chicken, we can use inheritance by making Rooster inherits Chicken, please refer to com.greenlight.assignment.model.animal.Rooster
c. We can use Delegate design pattern to model Rooster without using inheritance to Chicken ( still need to inherit Animal and Soundable interface for collection and parrot mimic usage),
Please refer to com.greenlight.assignment.model.animal.RoosterDelegator
you can test their actions using testAnimalDetails method from com.greenlight.assignment.test.AnimalTester

4. Please refer to  com.greenlight.assignment.model.animal.Parrot
you can test their actions using testAnimalDetails method from com.greenlight.assignment.test.AnimalTester
you can test the parrot mimic sound using com.greenlight.assignment.test.ParrotTester

Section B
1.  Please refer to  com.greenlight.assignment.model.animal.Fish
you can test their actions using testAnimalDetails method from com.greenlight.assignment.test.AnimalTester

2. Please refer to  com.greenlight.assignment.model.animal.Shark and com.greenlight.assignment.model.animal.ClownFish 
you can test their actions using testAnimalDetails method from com.greenlight.assignment.test.AnimalTester
you can test the shark eat method using com.greenlight.assignment.test.SharkTester

3. Please refer to  com.greenlight.assignment.model.animal.Dolphin
you can test their actions using testAnimalDetails method from com.greenlight.assignment.test.AnimalTester
we can avoid duplicating code or overhead by using Swimmable interface and create another animal family com.greenlight.assignment.model.animal.AquaticMammalFamily, 
so that Dolphin needs not to inherit Fish but still can implement swim method from Swimmable interface

Section D
1. Please refer to  com.greenlight.assignment.model.animal.Butterfly
you can test their actions using testAnimalDetails method from com.greenlight.assignment.test.AnimalTester

2. We can use state design pattern for different behavior change over time for Butterfly
Please refer to com.greenlight.assignment.model.animal.Butterfly.ButterflyState
you can test the butterfly state change and corresponding behaviour using com.greenlight.assignment.test.ButterflyTester

Section E
1. Please refer to testCountAnimal() method from com.greenlight.assignment.test.AnimalTester

Bonus
1. Please refer to testRoosterSay() method from com.greenlight.assignment.test.RoosterTester
2. Please start up the spring boot web application and use following urls for Restful API:
GET /animals --show list of animals
GET /animals/search/[id] --find the animal of the id
GET /animals/search/?name=[animal name] --find all the animal of the name, e.g. name=Dog
POST /animals/create/?name=[animal name] --add a new animal by putting animal name, e.g. name=Dog
PUT /animals/update/[id]?name=[animal name] --replace the animal by id with new animal name, e.g. name=Dog
DELETE /animals/delete/[id] --delete the animal by id
DELETE /animals/delete/?name=[animal name] --delete all animals of the name, e.g. name=Dog
 
