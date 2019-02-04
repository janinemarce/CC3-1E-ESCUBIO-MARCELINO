package rpg;

public class TestCharacter {
    public static void main(String [] args){
        Dice DiceClass;
        DiceClass = new Dice();
/*Calls and Makes to objects from the Character.java class*/     
    Character gguk = new Character("Gguk", 5,3,5); 
    Character min = new Character("Min", 4,4,5); 
/*For loop to make the game generate rounds as long as the two players are still alive*/
    for(int i = 1; gguk.getCurrentLife() >= 0 && min.getCurrentLife() >= 0; i++){ 
        System.out.println("==============================");
        System.out.println("ROUND " +i);
        System.out.println(gguk.getName() + "'s Current Health:" + min.getCurrentLife());
        System.out.println(gguk.getName() + "'s Current Health:" + min.getCurrentLife());  
/*Calls the method 'wound' from Character Class*/        
        int attack1 = gguk.attack();
        min.wound(attack1);
        int attack2 = min.attack();
        gguk.wound(attack2);
/*Prints the current round's result*/    
        System.out.println(gguk.getName() + " attacks " + min.getName() + " for " + attack1);
        System.out.println(min.getName() + " attacks " + gguk.getName() + " for " + attack2);
/*Conditional If Statements to end the game*/
        if(gguk.getCurrentLife() <= 0 && min.getCurrentLife() <= 0){ //If statement for when both Players reaches zero health in the same round  
            System.out.println(min.getName() + "'s Final Health: " + min.getCurrentLife());
            System.out.println(gguk.getName() + "'s Final Health: " + gguk.getCurrentLife());
            System.out.println("");
            System.out.println("Draw");
            break; //Ends the program
        }else if(gguk.getCurrentLife() <= 0){ //If statement when Min Wins
            System.out.println(min.getName() + "'s Final Health: " + min.getCurrentLife());
            System.out.println(gguk.getName() + "'s Final Health: " + gguk.getCurrentLife());
            System.out.println("");
            System.out.println(min.getName() + " Wins!");
            break; //Ends the program
        }else if(min.getCurrentLife() <= 0){ //If statement when Gguk Wins
            System.out.println(min.getName() + "'s Final Health: " + min.getCurrentLife());
            System.out.println(gguk.getName() + "'s Final Health: " + gguk.getCurrentLife()); 
            System.out.println("==============================");
            System.out.println(gguk.getName() + " Wins!");
            break; //Ends the program
        } //End of recent else-if statement
      } //End of For-loop
    } //End of Main Method
  } //End of Public Class