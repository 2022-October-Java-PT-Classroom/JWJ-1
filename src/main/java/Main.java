public class Main {
            public static void main (String[] args) {
                VirtualPet pet1 = new VirtualPet("harun", "good pet");
                VirtualPet pet2 = new VirtualPet("Kobe", "loyal pet");
                Shelter totalPets = new Shelter();
                totalPets.populateShelter();
                totalPets.feedPet();
                totalPets.drinkPet();
                totalPets.playPet(pet1);
                totalPets.AllPetS();
                totalPets.admitPet(pet1);
                pet2.beHealthy();
                totalPets.TickPets();
                totalPets.petHealth();
                totalPets.removePet();
                totalPets.AllPetS();
                totalPets.singlePetsStat(pet1);
                totalPets.fight(pet1,pet2);
            }
        }
        


