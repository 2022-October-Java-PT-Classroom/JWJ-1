import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ShelterTest {

    Shelter AllPets = new Shelter();

    @Test
    public void playWithAllPets() {
        Shelter shelter = new Shelter();
        VirtualPet petOne = new VirtualPet("petOne", "lame");
        VirtualPet petTwo = new VirtualPet("petTwo", "whatisks'dkvs/v");
        VirtualPet petThree = new VirtualPet("petThree", "him");
        shelter.addToShelter(petOne);
        shelter.addToShelter(petTwo);
        shelter.addToShelter(petThree);
        shelter.playWithAllPets();
    }

    @Test
    public void tickAllPets() {
        Shelter shelter = new Shelter();
        VirtualPet petOne = new VirtualPet("petOne", "lame");
        VirtualPet petTwo = new VirtualPet("petTwo", "whatisks'dkvs/v");
        VirtualPet petThree = new VirtualPet("petThree", "him");
        shelter.addToShelter(petOne);
        shelter.addToShelter(petTwo);
        shelter.addToShelter(petThree);
        assertEquals(petOne.getHealth(), 9);
        assertEquals(petOne.getHealth(), 9);
        assertEquals(petOne.getHealth(), 9);
        for (VirtualPet pet : shelter.shelter.values()) {
            pet.tick();
            System.out.println("Ran tick on " + pet.getName());
        }
        assertEquals(petOne.getHealth(), 8);
        assertEquals(petTwo.getHealth(), 8);
        assertEquals(petThree.getHealth(), 8);
    }
}
