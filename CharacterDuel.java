package rpg;
import java.util.Scanner;
public class CharacterDuel {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //This calls the dice
        Dice DiceClass;
        DiceClass = new Dice();
/*Calls and Makes to objects from the Character.java class*/     
    Wizard gguk = new Wizard("Gguk", 5,3,5); 
    Wizard min = new Wizard("Min", 4,4,5); 
//For loop til death 
    for(int i = 1; gguk.getCurrentLife() >= 0 && min.getCurrentLife() >= 0; i++){ 
        if (gguk.getCurrentLife()== 0){ // so that if gguk life reaches 0 the game will end
           System.out.println(gguk.getName() + "  has fainted");
           break;
       } else if ( min.getCurrentLife() == 0) { // so that if gguk life reaches 0 the game will end
           System.out.println(min.getName() + " has fainted");
           break;
       }
        System.out.println("==============================");
        System.out.println("ROUND " +i);
        System.out.println(gguk.getName() + "'s Current Health:" + gguk.getCurrentLife());
        System.out.println(min.getName() + "'s Current Health:" + min.getCurrentLife()); 
        System.out.println(gguk.getName() + "'s Current Magic: " + gguk.getCurrentMagic());
        System.out.println(min.getName() + "'s Current Magic: " + min.getCurrentMagic());
           System.out.println(gguk.getName() + ", What would you like to use? Enter \n[1] Attack  \n[2] Lightning Bolt \n[3] Heal ");
           int choice1 = sc.nextInt();
           
          if (choice1 == 1){
              int attack1= gguk.attack();
              System.out.println(gguk.getName() + " attacks " + min.getName() + " for " + attack1);
              min.wound(attack1); 
              if (min.getCurrentLife()== 0) { 
                  continue;
              }
                //normal attack of gguk without using magic that will lessen min health
          } else if (choice1 == 2){
                int bolt1 = gguk.castLightningBolt();
                System.out.println(gguk.getName() + " casted the Lightning Bolt and reduces " + min.getName()+ "'s life by " + bolt1);
                min.wound(bolt1);
                if (min.getCurrentLife()== 0) { 
                  continue;
              }
                // casting the lightning bolt spell which lessens healt of min and lessens magic of gguk
          }else if (choice1 == 3){
                int heal1 = gguk.castHeal();
                System.out.println(gguk.getName() + " casted heal and increases his life by " + heal1);
                gguk.heal(heal1);
                // casting heal that increase life of gguk
          } else {
              System.out.println("Incorrect Input!");
          }
          
           System.out.println(min.getName() + ", What would you like to use? Enter \n[1] Attack \n[2] Lightning Bolt \n[3] Heal");
          int choice2 = sc.nextInt();
    
          if (choice2 == 1){
              int attack2 = min.attack();
               System.out.println(min.getName() + " attacks " + gguk.getName() + " for " + attack2); //normal attack without using magic
               gguk.wound(attack2);
               if (gguk.getCurrentLife() == 0){
              continue;
               }
          } else if (choice2 == 2){
                int bolt2 = min.castLightningBolt();
                System.out.println(min.getName() + " casted the Lightning Bolt and reduces " + gguk.getName()+ "'s life by " + bolt2);
                gguk.wound(bolt2);
                 if (gguk.getCurrentLife() == 0){
                continue;
               }//so that the loop will run again if the rounds reaches 3 it will exit the loop
          } else if (choice2 == 3){
                   int heal2 = min.castHeal();
                   System.out.println(min.getName() + " casted heal and increases his life by " + heal2);
                   min.heal(heal2);
        } else {
              System.out.println("Invalid Input");}
    }//end of for loop
       
       
        if(gguk.getCurrentLife() == min.getCurrentLife()){ //If statement for when both Players reaches zero health in the same round  
            System.out.println("==============================");
            System.out.println(min.getName() + "'s Final Health: " + min.getCurrentLife());
            System.out.println(gguk.getName() + "'s Final Health: " + gguk.getCurrentLife());
            System.out.println(min.getName() + "'s Final Magic: " + min.getCurrentMagic());
            System.out.println(gguk.getName() + "'s Final Magic: " + gguk.getCurrentMagic());
            System.out.println("==============================");
            System.out.println("Draw");
        }else if(gguk.getCurrentLife() < min.getCurrentLife()){ //If statement when Min Wins
            System.out.println("==============================");
            System.out.println(min.getName() + "'s Final Health: " + min.getCurrentLife());
            System.out.println(gguk.getName() + "'s Final Health: " + gguk.getCurrentLife());
            System.out.println(min.getName() + "'s Final Magic: " + min.getCurrentMagic());
            System.out.println(gguk.getName() + "'s Final Magic: " + gguk.getCurrentMagic());
            System.out.println("==============================");
            System.out.println(min.getName() + " Wins!");
        }else if(min.getCurrentLife() < gguk.getCurrentLife()){ //If statement when Gguk Wins
            System.out.println("==============================");
            System.out.println(min.getName() + "'s Final Health: " + min.getCurrentLife());
            System.out.println(gguk.getName() + "'s Final Health: " + gguk.getCurrentLife()); 
            System.out.println(min.getName() + "'s Final Magic: " + min.getCurrentMagic());
            System.out.println(gguk.getName() + "'s Final Magic: " + gguk.getCurrentMagic());
            System.out.println("==============================");
            System.out.println(gguk.getName() + " Wins!");
      } //End of else if
    } //End of Main Method
  } //End of Public Class