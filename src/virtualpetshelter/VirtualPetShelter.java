package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> msPeesosHumainSocietyForPeculiarPets = new HashMap<String, VirtualPet>();

	public VirtualPet getName(String name) {
		return msPeesosHumainSocietyForPeculiarPets.get(name);
	}

	public Collection<VirtualPet> allPeculairPets() {
		return msPeesosHumainSocietyForPeculiarPets.values();
	}

	public void feedAllPeculairPets() {
		for (VirtualPet p : msPeesosHumainSocietyForPeculiarPets.values()) {
			p.comandFeed();
		}
	}

	public void waterAllPeculairPets() {
		for (VirtualPet p : msPeesosHumainSocietyForPeculiarPets.values()) {
			p.comandWater();
		}
	}

	public void addPeculairPet(VirtualPet newPeculiarPet) {
		msPeesosHumainSocietyForPeculiarPets.put(newPeculiarPet.name.toLowerCase(), newPeculiarPet);
	}

	public void adoptPeculairPet(String removedPeculairPet) {
		msPeesosHumainSocietyForPeculiarPets.remove(removedPeculairPet);
	}

	
	public void tickAllPeculiarPets() {
		for (VirtualPet p : msPeesosHumainSocietyForPeculiarPets.values()) {
			p.tick();
		}
	}
}

// include appropriate instance variable(s) to store the pets who reside at the
// shelter
// include methods that:
// return a Collection of all of the pets in the shelter
// return a specific VirtualPet given its name
// allow intake of a homeless pet
// allow adoption of a homeless pet
// feed all of the pets in the shelter
// water all of the pets in the shelter
// plays (or performs some other interaction(s)) with an individual pet in the
// shelter
// include a tick method that calls the tick method for each of the pets in the
// shelter, updating their needs