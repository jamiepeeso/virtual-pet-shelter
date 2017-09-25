package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> msPeesosHumainSocietyForPeculiarPets = new HashMap<String, VirtualPet>();

	public VirtualPet getName(String name) {
		return msPeesosHumainSocietyForPeculiarPets.get(name);
	}

	public Collection<VirtualPet> allPeculiarPets() {
		return msPeesosHumainSocietyForPeculiarPets.values();
	}

	public void feedAllPeculiarPets() {
		for (VirtualPet p : msPeesosHumainSocietyForPeculiarPets.values()) {
			p.comandFeed();
		}
	}

	public void waterAllPeculiarPets() {
		for (VirtualPet p : msPeesosHumainSocietyForPeculiarPets.values()) {
			p.comandWater();
		}
	}

	public void cleanAllPeculiarPets() {
		for (VirtualPet p : msPeesosHumainSocietyForPeculiarPets.values()) {
			p.comandClean();
		}
	}

	public void addPeculiarPet(VirtualPet newPeculiarPet) {
		msPeesosHumainSocietyForPeculiarPets.put(newPeculiarPet.name.toLowerCase(), newPeculiarPet);
	}

	public void adoptPeculiarPet(String removedPeculiarPet) {
		msPeesosHumainSocietyForPeculiarPets.remove(removedPeculiarPet.toLowerCase());
	}

	public void tickAllPeculiarPets() {
		for (VirtualPet p : msPeesosHumainSocietyForPeculiarPets.values()) {
			p.tick();
		}
	}
}