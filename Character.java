package rpg;
public class Character {
       static Dice dice = new Dice();
    private final String Name;
    private final int strength;
    private final int dexterity;
    public final int intelligence;
    private final int maxLife;
    private int currentLife;
    public int heal;

    public Character(String n, int s, int d, int i){
      this.Name = n;
      this.strength = s;
      this.dexterity = d;
      this.intelligence = i;
      this.maxLife = dice.Roll() * 8 ; //Player's MaxLife is dice.Roll times any value you want
      this.currentLife = maxLife;
    }
     public int attack(){ //INSTUCTIONS:  Some of the implementation (such as the attack()method) can be done in many different ways and is open to your interpretation.
     return dice.Roll()+strength; //Dice Value + Strength = Damage Dealt
     } 
     public void wound(int damage){ //Wound subtracts the damage dealt to Player's currentLife
     currentLife = currentLife - damage;
     if(currentLife <= 0){
         currentLife = 0; //This is zero. [Players can't have negative health] if Player's current life gets lower than zero, it won't return a negative value, instead, it will return a zero value.
            }
        }
     public void heal(int heal){ // this is the heal
         this.heal = heal; //gets the variable of heal
         currentLife = currentLife + heal;
     } 
/* default values from the given Laboratory Exercise #4 */     
     public String getName()
     {return Name;}
     public int getStrength()
     {return strength;} 
     public int getDexterity()
     {return dexterity;}
     public int getIntelligence()
     {return intelligence;}
     public int getMaxLife()
     {return maxLife;}
     public int getCurrentLife()
     {return currentLife;}

}
