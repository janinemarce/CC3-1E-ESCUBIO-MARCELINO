package rpg;
public class Wizard extends Character {
    static Dice dice = new Dice();
    private final int maxmagic;
    private int currentmagic;
    private int strength;
    public Wizard (String n, int s, int d, int i){
       super( n, s, d, i); // calling the Character class and its parameters
        this.maxmagic = (dice.Roll()+3) + intelligence; // dice roll is less than or equal to 10, the maxmagic is modified by intelligence
        this.currentmagic = maxmagic;
        this.strength = s;
    }
    public int attack(){
        return dice.Roll()+strength;
    }
    public int useArmor(){
        return dice.Roll()+strength;
    }
    public int useWeapon(){
        return dice.Roll()+strength;
    }
    public int castLightningBolt(){
        if (currentmagic >= 5){ // lightning bolt cannot be cast if the current magic is less than 5
            currentmagic = currentmagic - 5 ;
            return (dice.Roll()+5) + intelligence; //the lightning bolt attack is random but modified by intelligence
        } else {
            return 0;
        }
    }
    public int castHeal(){
        if (currentmagic >= 8){ // heal cannot be cast if current magic is less than 8
                currentmagic = currentmagic - 8;
            super.heal(dice.Roll()); // calling the heal method from Character class
            return heal;
    } else {
          return 0;
        }
    }
    public int getMaxMagic(){
        return maxmagic;
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
