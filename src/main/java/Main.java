public class Main {
    public static void main (String[] args) {
        VirtualPet pet1 = new VirtualPet("khalid223", "Fun");
        VirtualPet pet2 = new VirtualPet("khalid112", "Fun");
        Shelter AllPets = new Shelter();
        AllPets.populateShelter();
        AllPets.feedPet();
        AllPets.waterPet();
        AllPets.playWithPet(pet1);
        AllPets.AllPetStats();
        AllPets.addToShelter(pet1);
        pet1.increaseHealth();
        AllPets.TickAllPets();
        AllPets.PetsHealth();
        AllPets.adoptFromShelter();
        AllPets.AllPetStats();
        AllPets.onePetStats(pet1);
        AllPets.fight(pet1,pet2);
    }
}
