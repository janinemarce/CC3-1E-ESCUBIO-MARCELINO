package rpg;
import java.util.Scanner;
public class CharacterDuel {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Dice DiceClass;
        DiceClass = new Dice();
/*Calls and Makes to objects from the Character.java class*/   
        Wizard gguk = new Wizard("Gguk", 5,4,5); 
        Wizard min = new Wizard("Min", 4,5,4); 
/*For loop to make the game generate only 2 rounds*/
    for(int i = 1; true; i++){ 
         if (gguk.getCurrentLife()== 0){ // so that if gguk life reaches 0 the game will end
           System.out.println(gguk.getName() + "  has fainted");
           break;
       } else if ( min.getCurrentLife() == 0){  // so that if gguk life reaches 0 the game will end
           System.out.println(min.getName() + " has fainted");
           break;}
        System.out.println("============================================================================");
        System.out.println("ROUND " +i);
        System.out.println(gguk.getName() + "'s Current Health:" + gguk.getCurrentLife());
        System.out.println(min.getName() + "'s Current Health:" + min.getCurrentLife()); 
        System.out.println(gguk.getName() + "'s Current Magic: " + gguk.getCurrentMagic());
        System.out.println(min.getName() + "'s Current Magic: " + min.getCurrentMagic());
            System.out.println("--------------------------------------");
           System.out.println(gguk.getName() + ": \nWould you like to use :\n[1] Attack  \n[2] Lightning Bolt \n[3] Heal \n[4] Weapon \n[5] Armor ");
           int choice = sc.nextInt();
          switch(choice){
              case 1:
              int attack1= gguk.attack();
              System.out.println(gguk.getName() + " attacks " + min.getName() + " for " + attack1);
              min.wound(attack1);
              if (min.getCurrentLife() == 0){
                  continue; }
              break;
              case 2:
                int bolt1 = gguk.castLightningBolt();
                System.out.println(gguk.getName() + " casted the Lightning Bolt and reduces " + min.getName()+ "'s life by " + bolt1);
                min.wound(bolt1);
                 if (min.getCurrentLife() == 0){
                  continue; }
                 break;
              case 3:
                int heal1 = gguk.castHeal();
                System.out.println(gguk.getName() + " casted heal and increases his life by " + heal1);
                gguk.heal(heal1);
                break;
              case 4:
                  int dmg1 = gguk.useWeapon();
                  System.out.println(gguk.getName() + " uses sword and attacks " + min.getName() + " for " + dmg1);
                  min.wound(dmg1);
                  break;
              case 5:
                  int arm1 = gguk.useArmor();
                  System.out.println(gguk.getName() + " use a shield and increases his life by " + arm1);
                  gguk.heal(arm1);;
                  break;
              default: System.out.println("Incorrect Input! "); }
            System.out.println("--------------------------------------");
           System.out.println(min.getName() + ": \n Would you like to use: \n[1] Attack  \n[2] Lightning Bolt \n[3] Heal \n[4] Weapon \n[5] Armor");
           int choice1 = sc.nextInt();
          switch (choice1){
              case 1:
              int attack2 = min.attack();
               System.out.println(min.getName() + " attacks " + gguk.getName() + " for " + attack2); //normal attack without using magic
               gguk.wound(attack2);
               break;
              case 2:
                int bolt2 = min.castLightningBolt();
                System.out.println(min.getName() + " casted the Lightning Bolt and reduces " + gguk.getName()+ "'s life by " + bolt2);
                gguk.wound(bolt2);
                break;
              case 3:
                   int heal2 = min.castHeal();
                   System.out.println(min.getName() + " casted heal and increases his life by " + heal2);
                   min.heal(heal2);
                   break;
              case 4: 
                  int dmg2 = min.useWeapon();
                  System.out.println(min.getName() + " used a weapon and attacks " + gguk.getName() + " for " + dmg2);
                  gguk.wound(dmg2);
                  break;
              case 5:
                  int arm2 = min.useArmor();
                  System.out.println(min.getName() + " used an armor and increases his life by " + arm2);
                  min.heal(arm2);
                  break;
              default: System.out.println("Incorrect Input! "); }
    } //end of for loop 
        if(gguk.getCurrentLife() == min.getCurrentLife()){ //If statement for when both Players reaches zero health in the same round  
            System.out.println(" ============================================================================");
            System.out.println(gguk.getName() + "'s Final Health: " + gguk.getCurrentLife());
            System.out.println(min.getName() + "'s Final Health: " + min.getCurrentLife());
            System.out.println(gguk.getName() + "'s Final Magic: " + gguk.getCurrentMagic());
            System.out.println(min.getName() + "'s Final Magic: " + min.getCurrentMagic());
            System.out.println("============================================================================");
            System.out.println("Draw");
        }else if(gguk.getCurrentLife() < min.getCurrentLife()){ //If statement when Min Wins
            System.out.println("============================================================================");
            System.out.println(gguk.getName() + "'s Final Health: " + gguk.getCurrentLife());
            System.out.println(min.getName() + "'s Final Health: " + min.getCurrentLife());
            System.out.println(gguk.getName() + "'s Final Magic: " + gguk.getCurrentMagic());
            System.out.println(min.getName() + "'s Final Magic: " + min.getCurrentMagic());
            System.out.println("============================================================================");
            System.out.println(min.getName() + " Wins!");
        }else if(min.getCurrentLife() < gguk.getCurrentLife()){ //If statement when Gguk Wins
            System.out.println("============================================================================");
            System.out.println(gguk.getName() + "'s Final Health: " + gguk.getCurrentLife());
            System.out.println(min.getName() + "'s Final Health: " + min.getCurrentLife()); 
            System.out.println(gguk.getName() + "'s Final Magic: " + gguk.getCurrentMagic());
            System.out.println(min.getName() + "'s Final Magic: " + min.getCurrentMagic());
            System.out.println("============================================================================");
            System.out.println(gguk.getName() + " Wins!");
    }   // End of else if
    } //End of Main Method
  } //End of Public
