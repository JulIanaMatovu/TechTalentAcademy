import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.HashMap;
import java.util.Scanner;

public class Character extends MovementMap{
    private int numEyes;
    private String skinColour;

    public String getCharacterStatus() {
        return characterStatus;
    }

    public void setCharacterStatus(String characterStatus) {
        this.characterStatus = characterStatus;
    }

    private String characterStatus;
    private int numLives;
    private String name;
    private Multimap<String, String> headGear = ArrayListMultimap.create();

    public Multimap<String, String> getHeadGear() {
        return headGear;
    }

    public void setHeadGear(Multimap<String, String> headGear) { //options for head gear
        this.headGear = headGear;
        headGear.put("Head-Gear", "Crown");
        headGear.put("Head-Gear", "Horns");
        headGear.put("Head-Gear", "Mask");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character greenSnake = new Character("Slither");
        Multimap<String, String> testHeadGear = ArrayListMultimap.create();
        HashMap<Integer, Integer> exit = new HashMap<Integer, Integer>();
        exit.put(5,5);

        greenSnake.setMapX(10);
        greenSnake.setMapY(10);
        greenSnake.chooseAttributes(greenSnake,scanner);
        greenSnake.determineCharacterStatus(greenSnake);
        greenSnake.setHeadGear(testHeadGear);
        System.out.println(greenSnake.selectHeadGear(testHeadGear,scanner,greenSnake));
        greenSnake.displayAttributes(greenSnake);

        int range = (10 - 0) + 1;
        greenSnake.currentX = (int)(Math.random() * range) + 0;
        greenSnake.currentY = (int)(Math.random() * range) + 0;

        System.out.println("\nMap Size: " + greenSnake.getMapX() + "," + greenSnake.getMapY());
        System.out.println("Random Starting Position: " + greenSnake.currentX + "," + greenSnake.currentY);

//        d. Create a loop that will ask the user for a direction and then use the map’s move method to move the player.
//        e. When the player reaches a destination of your choice (maybe 5, 5) end the loop – they have found the exit!

        int numberOfLives = 0; //5
        boolean wonGame = false;

        do {
            greenSnake.move(scanner);

            HashMap<Integer,Integer> newPosition = new HashMap<Integer,Integer>();
            newPosition.put(greenSnake.currentX,greenSnake.currentY);

            System.out.println("New Position: " + newPosition.keySet().toString().replaceAll("[\\[\\],]","")
            + "," +newPosition.values().toString().replaceAll("[\\[\\],]",""));

            numberOfLives++; //+1 each time until it is equal to user's entered numLives

            if(newPosition.equals(exit)){
                System.out.println("\nYOU SUCCESSFULLY REACHED THE EXIT!");
                wonGame = true;
                break;
            }

        }while(numberOfLives < greenSnake.getNumLives()); //user can only guess according to the number of lives they have

        if(numberOfLives == greenSnake.getNumLives() && !wonGame){
            System.out.println("\nYOU WERE DEFEATED - Death isn't a good look on you!");
        }
    }

    public Character(String name){

        this.name = name;
    }

    public int getNumEyes() {
        return numEyes;
    }

    public void setNumEyes(int numEyes) {
        this.numEyes = numEyes;
    }

    public String getSkinColour() {
        return skinColour;
    }

    public void setSkinColour(String skinColour) {
        this.skinColour = skinColour;
    }

    public int getNumLives() {
        return numLives;
    }

    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String selectHeadGear(Multimap<String, String> testHeadGearMap, Scanner scanner, Character character ){
        System.out.println("Please choose headgear for your character from the following options. \n" + character.getHeadGear().values());
        String headgear = scanner.nextLine();

        if(headgear.equalsIgnoreCase("crown")){
            //if crown is selected for headGear, clear all other options
            testHeadGearMap.clear();
            testHeadGearMap.put("Head-Gear", "Crown");
        }else if(headgear.equalsIgnoreCase("horns")){
            testHeadGearMap.clear();
            testHeadGearMap.put("Head-Gear", "Horns");
        }else if(headgear.equalsIgnoreCase("mask")){
            testHeadGearMap.clear();
            testHeadGearMap.put("Head-Gear", "Mask");
        }else{
            //recursive call: used if headGear has been entered incorrectly
            selectHeadGear(testHeadGearMap,scanner,character);
        }

        return "\nCharacter Description: \n"+ testHeadGearMap.keys().toString().replaceAll("[\\[\\],]","") + ": " + testHeadGearMap.values().toString().replaceAll("[\\[\\],]","");
    }

    public void chooseAttributes(Character character, Scanner scanner){ //allows user to choose numEyes, skin and lives
        System.out.println("How many eyes will your character have?");
        int numEyes = scanner.nextInt();
        character.setNumEyes(numEyes);
        scanner.nextLine();

        System.out.println("What is your character's skin colour?");
        String skinColour = scanner.nextLine();
        character.setSkinColour(skinColour);

        System.out.println("How many lives will your character have?");
        int numLives = scanner.nextInt();
        scanner.nextLine();
        character.setNumLives(numLives);


    }

    public void displayAttributes(Character character){
        System.out.println("Eyes: " + character.getNumEyes() + "\nSkin Colour: "+character.getSkinColour()
                + "\nNumber of Lives: " + character.getNumLives() + "\nCharacter Status: " + character.getCharacterStatus());
    }

    public void determineCharacterStatus(Character character){ //determines character status based on skin colour
        String skin = character.getSkinColour().toLowerCase();
        switch (skin){
            case "black":
            case "red":
            case "green":
                character.setCharacterStatus("Villain");
                break;
            case "white":
            case "yellow":
                character.setCharacterStatus("Good Guy");
                break;
            default:
                character.setCharacterStatus("Civilian");
                break;
        }
    }

}
