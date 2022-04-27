public class GameCharactersDemo {
    private String name;
    private int currentHealth;
    private int maxHealth;

    public GameCharactersDemo(String name, int currentHealth, int maxHealth){
        this.name = name; //this keyword
        this.currentHealth = currentHealth;
        this.maxHealth = maxHealth;
    }


    public String getName() {
        return name;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

}
