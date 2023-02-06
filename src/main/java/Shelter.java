import java.util.HashMap;
import java.util.Map;

public class Shelter {
    Map<String, VirtualPet> shelter = new HashMap<>();

    public Shelter() {

    }

    public void populateShelter() {
        VirtualPet petOne = new VirtualPet("petOne","lame");
        VirtualPet petTwo = new VirtualPet("petTwo","whatisks'dkvs/v");
        VirtualPet petThree = new VirtualPet("petThree", "him");

        shelter.put(petOne.getName(),petOne);
        shelter.put(petTwo.getName(),petTwo);
        shelter.put(petThree.getName(),petThree);
    }

    public void showAllPets() {
        for(String petName:shelter.keySet()) {
            System.out.println(petName);
        }
    }

    //Method that feeds all pets
    public void feedPet(){
        for(VirtualPet pet:shelter.values()) {
            pet.feedPet();
            System.out.println(pet.getName() + "'s hunger is "+pet.getHunger());
        }
    }



    //Method that waters all pets



    //Method that plays with a single pet (NOT ALL)



    //Method that shows all pets and their stats (description, hunger, boredom, thirst)




    //Method that runs tick for all pets



    //Method that adopts a pet from the shelter



    //Method that adds a pet to the shelter


    //Method that shows the stats of 1 pet (description, hunger, boredom, thirst)

    //Method that makes 2 pets fight (winner is determined by whichever pet has a longer name.
    // If names are same length, then pick one at random)


    //Method that informs the user if any pet's health is greater than 8



}
