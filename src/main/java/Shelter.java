import java.util.HashMap;
import java.util.Map;

public class Shelter {
    Map<String, VirtualPet> shelter = new HashMap<>();



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
    public void drinkPet() {
        for (VirtualPet pet : shelter.values()) {
            pet.drinkPet();
            System.out.println(pet.getName() + "'s thirst is " + pet.getThirst());
        }
    }


    //Method that plays with a single pet (NOT ALL)
    public void playPet(VirtualPet pet) {
        pet.playPet();
        System.out.println(pet.getName() + " played with and new boredom lvl is" + pet.getBoredom());


    }


    //Method that shows all pets and their stats (description, hunger, boredom, thirst)

    public void AllPetS() {
        for (VirtualPet pet : shelter.values()) {
            System.out.println(pet.getName() + " hunger lvl: " + pet.getHunger() + " boredom lvl: " + pet.getBoredom()
                    + " thirst lvl: " + pet.getThirst());
        }
    }


    //Method that runs tick for all pets

    public void TickPets() {
        for (VirtualPet pet : shelter.values()) {
            pet.tick();
            System.out.println("tick incriminates ran on " + pet.getName());
        }

    }


    //Method that adopts a pet from the shelter



    public void removePet() {
        if (!shelter.isEmpty()) {
            VirtualPet removePet = shelter.remove(shelter.keySet().iterator().next());
            System.out.println("You have adopted " + removePet.getName());
        } else {
            System.out.println("No pets left in shelter");
        }
    }


    //Method that adds a pet to the shelter

    public void admitPet(VirtualPet pet) {
        shelter.put(pet.getName(), pet);
    }


    //Method that shows the stats of 1 pet (description, hunger, boredom, thirst)

    public void singlePetsStat(VirtualPet pet) {
        System.out.println(pet.getName() + "description: " + pet.getDescription());
        System.out.println(pet.getName() + "hunger: " + pet.getHunger());
        System.out.println(pet.getName() + "boredom: " + pet.getBoredom());
        System.out.println(pet.getName() + "thirst: " + pet.getThirst());

    }

    //Method that makes 2 pets fight (winner is determined by whichever pet has a longer name.
    // If names are same length, then pick one at random)
    public void fight(VirtualPet one, VirtualPet two) {
        int oneNameLength = one.getName().length();
        int twoNameLength = two.getName().length();

        if (oneNameLength >= twoNameLength) {
            System.out.println(one.getName() + " wins!");
        } else {
            System.out.println(two.getName() + " wins!");
        }
    }


    //Method that informs the user if any pet's health is greater than 8
    public void petHealth() {
        for (VirtualPet pet : shelter.values()) {
            if (pet.getHealth() > 8) {
                System.out.println(pet.getName() + " Health is greater than 8 ");

            }


        }

    }
}