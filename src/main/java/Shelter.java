import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Shelter {
    Map<String, VirtualPet> shelter = new HashMap<>();
    Random rand = new Random();


    public Shelter() {

    }

    public void populateShelter() {
        VirtualPet petOne = new VirtualPet("petOne", "lame");
        VirtualPet petTwo = new VirtualPet("petTwo", "whatisks'dkvs/v");
        VirtualPet petThree = new VirtualPet("petThree", "him");

        shelter.put(petOne.getName(), petOne);
        shelter.put(petTwo.getName(), petTwo);
        shelter.put(petThree.getName(), petThree);
    }

    public void showAllPets() {
        for (String petName : shelter.keySet()) {
            System.out.println(petName);
        }
    }

    //Method that feeds all pets
    public void feedPet() {
        for (VirtualPet pet : shelter.values()) {
            pet.feedPet();
            System.out.println(pet.getName() + "'s hunger is " + pet.getHunger());
        }
    }


    //Method that waters all pets
    public void waterPet() {
        for (VirtualPet pet : shelter.values()) {
            pet.waterPet();
            System.out.println(pet.getName() + "'s thirst is " + pet.getThirst());
        }
    }


    //Method that plays with a single pet (NOT ALL)
    public void playWithPet(VirtualPet pet) {
        pet.playWithPet();
        System.out.println(pet.getName() + " Has been played with and his boredom level is" + pet.getBoredom());

    }


    //Method that shows all pets and their stats (description, hunger, boredom, thirst)
    public void AllPetStats() {
        for (VirtualPet pet : shelter.values()) {
            System.out.println(pet.getName() + " hunger level: " + pet.getHunger() + " boredom level: " + pet.getBoredom() + " thirst level: " + pet.getThirst());
        }
    }


    //Method that runs tick for all pets
    public void TickAllPets() {
        for (VirtualPet pet : shelter.values()) {
            pet.tick();
            System.out.println("Ran tick on " + pet.getName());
        }

    }


    //Method that adopts a pet from the shelter
    public void adoptFromShelter() {
        String key = "";
        if(!shelter.isEmpty()) {
            for (String petName : shelter.keySet()) {
                key = petName;
                break;
            }
            VirtualPet adopted = shelter.remove(key);
            System.out.println("You adopted " + adopted.getName()+ "!");
        }
        else {
            System.out.println("No pets to adopt!");
        }

    }


    //Method that adds a pet to the shelter
    public void  addToShelter(VirtualPet pet) {
        shelter.put(pet.getName(), pet );
    }


    //Method that shows the stats of 1 pet (description, hunger, boredom, thirst)
    public void onePetStats(VirtualPet pet) {

        System.out.println(pet.getName() + " description: " + pet.getDescription());
        System.out.println(pet.getName() + " hunger: " + pet.getHunger());
        System.out.println(pet.getName() + " thirst: " + pet.getThirst());
        System.out.println(pet.getName() + " boredom: " + pet.getBoredom());
    }

    //Method that makes 2 pets fight (winner is determined by whichever pet has a longer name.
    // If names are same length, then pick one at random)

    public void fight(VirtualPet one, VirtualPet two) {
        int oneNameLength = one.getName().length();
        int twoNameLength = two.getName().length();

        if(oneNameLength == twoNameLength) {
            int randomInt = rand.nextInt(2);
            if(randomInt == 0) {
                System.out.println(one.getName() + " wins!");
            }
            else { // else pet 2 wins
                System.out.println(two.getName() + " wins!");
            }
        }
        else if(oneNameLength > twoNameLength) {
            System.out.println(one.getName() + " wins!");

        }
        else {
            System.out.println(two.getName() + " wins!");

        }
    }


    //Method that informs the user if any pet's health is greater than 8
    public void PetsHealth() {
        for (VirtualPet pet : shelter.values()) {
            if (pet.getHealth() > 8) {
                System.out.println(pet.getName() + " Health is greater than 8 ");
            }
        }
    }
    //Method that plays with all pets
    public void playWithAllPets(){

            for (VirtualPet pet : shelter.values()) {
                pet.playWithPet();
                System.out.println("Played with " + pet.getName());
            }




    }
}
