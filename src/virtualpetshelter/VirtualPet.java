package virtualpetshelter;

public class VirtualPet {
	String name;
	String description;

	int hungerLevel;
	int thirstLevel;
	int boredLevel;

	public VirtualPet(String newName, String newDiscription, int newHungerLevel, int newThirstLevel,
			int newBoredLevel) {
		name = newName;
		description = newDiscription;
		hungerLevel = newHungerLevel;
		thirstLevel = newThirstLevel;
		boredLevel = newBoredLevel;
	}

	public VirtualPet(String newName, String newDiscription) {
		this.name = newName;
		this.description = newDiscription;
		this.hungerLevel = 5;
		this.thirstLevel = 10;
		this.boredLevel = 5;
	}

	void tick() {
		hungerLevel = hungerLevel + 5;
		thirstLevel = thirstLevel + 5;
		boredLevel = boredLevel + 5;
	}

	void comandFeed() {
		hungerLevel = hungerLevel - 15;
		thirstLevel = thirstLevel + 10;
		boredLevel = boredLevel - 5;
	}

	void comandWater() {
		hungerLevel = hungerLevel + 10;
		thirstLevel = thirstLevel - 15;
		boredLevel = boredLevel + 5;
	}

	void comandPlay() {
		hungerLevel = hungerLevel + 15;
		thirstLevel = thirstLevel + 20;
		boredLevel = boredLevel - 25;
	}

}