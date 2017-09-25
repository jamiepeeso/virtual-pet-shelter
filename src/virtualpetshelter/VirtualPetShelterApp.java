package virtualpetshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter newShelter = new VirtualPetShelter();
		VirtualPet drogon = new VirtualPet("drogon", "dragon", 2, 6, 3);
		VirtualPet mercy = new VirtualPet("mercy", "werecoyote", 2, 5, 2);
		VirtualPet lorilia = new VirtualPet("lorilia", "hippogriff", 7, 3, 4);
		VirtualPet bran = new VirtualPet("bran", "werewolf", 2, 4, 7);
		newShelter.addPeculiarPet(drogon);
		newShelter.addPeculiarPet(mercy);
		newShelter.addPeculiarPet(lorilia);
		newShelter.addPeculiarPet(bran);
		System.out.println("Ms. Peeso's Shelter for Peculair Pets");
		System.out.println("Our current collective of peculair pet's vitals:");
		System.out.println();
		System.out.println("Name\t\tHunger\tThirst\tBoredom");
		System.out.println("______________________________________");
		for (VirtualPet currentPeculairPet : newShelter.allPeculiarPets()) {
			System.out.println(currentPeculairPet.name + "\t\t" + currentPeculairPet.hungerLevel + "\t"
					+ currentPeculairPet.thirstLevel + "\t" + currentPeculairPet.boredLevel);
			System.out.println("______________________________________");
		}
		boolean goToShelter = false;
		while (!goToShelter) {
			System.out.println();
			System.out.println("Select a number to continue");
			System.out.println(" ___________________________");
			System.out.println("|                           |");
			System.out.println("| 1. Give food              |");
			System.out.println("| 2. Give Water             |");
			System.out.println("| 3. Play With Pet          |");
			System.out.println("| 4. Adopt a Pet            |");
			System.out.println("| 5. Drop off a Pet         |");
			System.out.println("| 6. Quit                   |");
			System.out.println("|___________________________|");
			String userResponse = input.next();
			switch (userResponse) {
			case "1":
				newShelter.feedAllPeculiarPets();
				System.out.println("You fed the collective.");
				System.out.println("Everyone enjoyed their meals.");
				break;
			case "2":
				newShelter.waterAllPeculiarPets();
				System.out.println("The collective is now hydrated.");
				break;
			case "3":
				System.out.println("What peculair pet would you like to play with?");
				System.out.println("Enter their name to continue.");
				for (VirtualPet currentPeculairPet : newShelter.allPeculiarPets()) {
					System.out.println(currentPeculairPet.name + ", the " + currentPeculairPet.description);
				}
				String petToPlayWith = input.next();
				newShelter.getName(petToPlayWith.toLowerCase()).comandPlay();
				System.out.println("You played with " + petToPlayWith);
				break;
			case "4":
				System.out.println("Which pet do you want to adopt? Enter their name below.");
				for (VirtualPet currentPet : newShelter.allPeculiarPets()) {
					System.out.println(currentPet.name + ", " + currentPet.description);
				}
				String petNameToAdopt = input.next();
				newShelter.adoptPeculiarPet(petNameToAdopt);
				System.out.println("You adopted " + petNameToAdopt);
				System.out.println("");
				break;
			case "5":
				System.out.println("Oh look, you have found another homeless creature.");
				System.out.println("What is this creature's name?");
				String newPetName = input.next().toLowerCase();
				System.out.println("What kind of creature is this pet?");
				String newPetDescription = input.next();
				VirtualPet strayPet = new VirtualPet(newPetName, newPetDescription);
				newShelter.addPeculiarPet(strayPet);
				System.out
						.println("We will take great care of " + newPetName + " and find them a safe and happy home.");
				break;
			case "6":
				System.out.println(
						"Thank you for visiting Ms. Peeso's Shelter for Peculair Pets, please come back again soon.");
				System.exit(0);
			}
			System.out.println("\nCurrent Status of Ms. Peeso's peculair pets");
			System.out.println("Name\t\tHunger\tThirst\tBoredom");
			System.out.println("_______________________________________");
			for (VirtualPet current : newShelter.allPeculiarPets()) {
				System.out.println(current.name + "\t\t" + current.hungerLevel + "\t" + current.thirstLevel + "\t"
						+ current.boredLevel);
				System.out.println("____________________________________");
			}

			newShelter.tickAllPeculiarPets();
		}
		input.close();
	}
}
