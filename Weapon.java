
package rpg;
import java.util.Random;
    public class Dice {
        private Random r;
        public Dice(){
            r = new Random(); //Calls the imported Random util, just like how you import Scanner;
        }
        public int Roll(){
            return r.nextInt(6)+1; //+1 is used so that Dice won't generate the number 0
        }
    }
