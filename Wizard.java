package rpg;
public class Wizard extends Character {
    static Dice dice = new Dice(); // call the dice
    private final int maxmagic; // int maxmagic
    private int currentmagic;  // int currentmagic
    public Wizard (String n, int s, int d, int i){ //this is a constructor
       super(n, s, d, i); // calling the Character class and its parameters (should be the same) because super is a keyword 
        this.maxmagic = (dice.Roll()+9) + intelligence; // dice roll is less than or equal to 10, the maxmagic is modified by intelligence
        this.currentmagic = maxmagic;
    }
    public int castLightningBolt(){ //this is for lightningbolt
        if (currentmagic >= 5){ // lightning bolt cannot be cast if the current magic is less than 5
            currentmagic = currentmagic - 5 ; // this will minus mana because u used lightbolt thus u minus
            return dice.Roll() + intelligence; //the lightning bolt attack is random but modified by intelligence
        } else {
            return 0;
        }
    }
    public int castHeal(){ //this is for heal
        if (currentmagic >= 8){ // heal cannot be cast if current magic is less than 8
                currentmagic = currentmagic - 8; // this will minus mana because u used heal thus u minus
            super.heal(dice.Roll()+intelligence); // calling the heal method from Character class
            return heal;
    } else {
          return 0;
        }
    }
  
    public int getCurrentMagic(){
        if(currentmagic <= 0){
         return 0; //This is zero. [Players can't have negative magic
         //if Player's current magic gets lower than zero, it won't return a negative value, instead, it will return a zero value.
        } else {
        return currentmagic;
    }
}
}