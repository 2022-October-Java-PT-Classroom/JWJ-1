public class VirtualPet {
    private String name;
    private String description;

    private int health;
    private int hunger;
    private int thirst;
    private int boredom;

    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
        this.hunger = 5;
        this.thirst = 5;
        this.boredom = 5;
        this.health = 9;
    }

    public void feedPet() {
        hunger--;
    }

    public void waterPet() {
        thirst--;
    }

    public void playWithPet() {
        boredom--;
    }

    public void increaseHealth() {
        this.health++;
    }

    public void tick() {
        hunger++;
        boredom++;
        thirst++;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getHealth() {
            return health;
    }
}
