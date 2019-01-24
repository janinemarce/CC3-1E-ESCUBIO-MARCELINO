/* ESCUBIO, Mayumi
 MARCELINO, Fillian
 NABOYE, Sheena
 CITCS 1-E CC3 MTH 9:30 - 11:30 AM
 */
package arrmean;

import java.util.Scanner;

public class ArrMean {

    public static void main(String[] args) {
        
        Scanner sc;
        float arrayholder[];
        while (true){
            try {
                sc = new Scanner(System.in);
                System.out.println("How many elements are in the array?");
                int number = sc.nextInt();
                arrayholder = new float[number];
                
                for(int i = 0; i<arrayholder.length; i++){
                    System.out.print("[" + i + "]" + "Enter a number: ");
                    while (!sc.hasNextFloat()){
                        sc.next();
                        System.out.println("Invalid Input! Please try again...");
                        System.out.println("[" + i + "]" + "Enter a number: ");
                    }
                    arrayholder[i] = sc.nextFloat();
                }
                
                System.out.println("The mean is " + getMean(arrayholder));
                break;
            } catch (Exception e){
                System.out.println("Invalid Input! Please try again...");
            }
        }
    } // main
    
    public static float getMean(float[]nani){
        float sum = 0;
        for (int i = 0; i < nani.length; i++){
            sum += nani[i];
        }
        return sum / nani.length;
    }      
}
        
        
        
        
  /* 
        Scanner input = new Scanner(System.in);
     while (true) {
            try {
                System.out.println("Enter the number of array elements:");
                input = new Scanner(System.in);
                int n = input.nextInt();

                double total = 0;
                double array[] = new double[n];

                
                    
                for (int i = 0; i < array.length; i++) {
                        System.out.println("[" + i + "] " + "Enter a number: ");
                        array[i] = input.nextDouble();

                    }
                  
               
                    System.out.println("Invalid Input! Please Try Again...");
           
                

                getMean(array);
                System.out.print("The mean is " + getMean(array));
                break;
                }
            } catch (Exception e) {
                System.out.println("Invalid Input! Please Try Again...");
            }
            break;
        }
    }//end of main

    public static double getMean(double[] array) {
        double total = 0;
        double mean = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
            mean = total / array.length;
        }
        return mean;
    }//end of getMean
            */
}
}
