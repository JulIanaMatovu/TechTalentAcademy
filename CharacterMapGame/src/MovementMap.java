import java.util.Scanner;

public abstract class MovementMap {
   private int mapX;
   private int mapY;
   protected int currentX;
   protected int currentY;

    public int getMapX() {
        return mapX;
    }


    public void setMapX(int mapX) {
        this.mapX = mapX;
    }

    public int getMapY() {
        return mapY;
    }

    public void setMapY(int mapY) {
        this.mapY = mapY;
    }

    public void move(Scanner scanner){
        System.out.println("\nPlease enter a new direction: 'N', 'E', 'S' or 'W'");
        String direction = scanner.nextLine();

        if(direction.equalsIgnoreCase("N")){
            if(this.currentY == this.mapY){
                this.currentY = 0; //if Y reaches max, loop back to 0
            }else{
                this.currentY++;
            }
        }else if(direction.equalsIgnoreCase("S")){
            if(this.currentY == this.mapY){
                this.currentY = 0;
            }else{
                this.currentY--;
                this.currentY = maintainMapConstriction(this.currentY, this.mapY);
            }
        }else if(direction.equalsIgnoreCase("W")){
            if(this.currentX == this.mapX){
                this.currentX = 0; //if X reaches max, loop back to 0
            }else{
                this.currentX--;
                this.currentX = maintainMapConstriction(this.currentX, this.mapX);
            }
        } else if(direction.equalsIgnoreCase("E")){ //player moves east
            if(this.currentX == this.mapX){
                this.currentX = 0;
            }else{
                this.currentX++;
            }
        }else{ //if incorrect direction entered, recursive call
            move(scanner);
        }
    }


//    If the direction moves the currentX or currentY lower than 0, the value should loop round
//    to X or Y
    public int maintainMapConstriction(int current, int mapMax){
        if(current < 0){
            current = mapMax;
        }
        return current;
    }


}
