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