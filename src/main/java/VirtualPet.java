public class VirtualPet {
    private String name;
    private String description;
    private int hunger;
    private int thirst;
    private int boredom;
    private int health;

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

    public void drinkPet() {
        thirst--;
    }

    public void playPet() {
        boredom--;
    }

    public void tick() {
        hunger++;
        boredom++;
        thirst++;
    }

    public void beHealthy() {
        this.health++;
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

    public int  getHealth() { return health;}
}
