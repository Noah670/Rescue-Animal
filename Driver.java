package Grazioso;

import java.util.Scanner;

// Noah Pohl


public class Driver {

    public static void main(String[] args) {

        // Create an array of Rescue Animals
        RescueAnimal[] animals = new RescueAnimal[3];

        // for loop to call which calls the addAnimal method inside and adds them to the array
        for (int j = 0; j < animals.length; j++) {
            animals[j] = addAnimal();
        }


        // Method to add animals below


    }

    // Method to add animals

    public static RescueAnimal addAnimal() {

        Scanner input = new Scanner(System.in);

        // Determine if the rescue animal is a dog or monkey
        System.out.println("Hello, would you like to add a 'dog' or 'monkey' ?");

        String dogOrMonkey = input.nextLine();

        if (dogOrMonkey.equals("monkey")) {
            System.out.println("Great you will be adding a monkey today.");
            System.out.println("Now we will be collecting some information about your monkey:");
            System.out.println("What is the tail length of your monkey?");

            int tailLength = input.nextInt();

            // Create new monkey object
            Monkey myMonkey = new Monkey();

            //assign myMonkey object to the user  provided tail length
            myMonkey.setTailLength(tailLength);

            System.out.println("What is the height of your monkey?");
            float monkeyHeight = input.nextFloat();
            // assign myMonkey object to the user provided monkey Height
            myMonkey.setHeight(monkeyHeight);

            System.out.println("What is the body length of your monkey?");
            int monkeyLength = input.nextInt();
            // assign myMonkey object to the user provided monkey length
            myMonkey.setBodyLength(monkeyLength);

            System.out.println("What is the species of your monkey?");
            String monkeySpecies = input.next();
            // assign myMonkey object to the user provided monkey species
            myMonkey.setSpecies(monkeySpecies);

            System.out.println("What is the torso measurement of your monkey?");
            int torsoMeasure = input.nextInt();
            // assign myMonkey object to the user provided monkey torso measurement
            myMonkey.setTorsoMeasurement(torsoMeasure);

            System.out.println("What is the skull measurement of your monkey?");
            int skullMeasure = input.nextInt();
            // assign myMonkey object to the user provided monkey skull measurement
            myMonkey.setSkullMeasurement(skullMeasure);

            System.out.println("What is the neck measurement of your monkey?");
            int neckMeasure = input.nextInt();
            // assign myMonkey object to the user provided monkey neck measurement
            myMonkey.setNeckMeasurement(neckMeasure);

            // verify all the monkey information collected from the user
            System.out.println("Monkey information collected:");
            System.out.println("Monkey tail length: " + myMonkey.getTailLength());
            System.out.println("Monkey height: " + myMonkey.getHeight());
            System.out.println("Monkey body length: " + myMonkey.getBodyLength());
            System.out.println("Monkey species: " + myMonkey.getSpecies());
            System.out.println("Monkey torso measured: " + myMonkey.getTorsoMeasurement());
            System.out.println("Monkey skull measured: " + myMonkey.getSkullMeasurement());
            System.out.println("Monkey neck measured: " + myMonkey.getNeckMeasurement());
            System.out.println("Thank you for using our rescue animal service!");


        } else if (dogOrMonkey.equals("dog")) {
            System.out.println("Great you will be adding a dog today.");
            System.out.println("What is the breed of your dog?");
            String userBreed = input.nextLine();

            //Create new dog object
            Dog myDog = new Dog();

            //assign myDog object to the user provided breed
            myDog.setBreed(userBreed);

            // check what the users dog breed is.
            System.out.println("Your dogs breed is " + myDog.getBreed() + " very cool.");
            System.out.println("Thank you for using our rescue animal service!");

        } else {
            System.out.println("I cant find that animal, Please add a 'monkey' or 'dog' to continue.");
            addAnimal();
        }

        return null;
    }
}
