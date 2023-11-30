/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yahtzee;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ajaym
 */
public class YahtzeeGame {
    int i;
    private int myArray[];
    
    private final int SIZE = 5;
    
    private double yahtzee;
    private double fullHouse;
    private double straight;
    private double fourOfAKind;
    private double threeOfAKind;
    private double nothing;
    private double rolls;
    
    private double percentage;
    
    
    public void yahtzeeGame(){
     
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the amount of times you want to roll the dice.");
        rolls = scan.nextInt();
        
        for(int j = 0; j < rolls; j++){
        Random rand = new Random();
        myArray = new int[SIZE];
        
        for(i = 0; i < SIZE; i++){
            myArray[i] = rand.nextInt(6) + 1;
        }
        
        Arrays.sort(myArray);
       
     
        
        if(myArray[0] == myArray[1] && myArray[0] == myArray[2] && myArray[0] == myArray[3] && myArray[0] == myArray[4]){
            yahtzee += 1;
        }
        
        else if(myArray[0] == myArray[1] && myArray[0] == myArray[2] && myArray[3] == myArray[4]){
            fullHouse += 1;
        }
        else if(myArray[0] == myArray[1] && myArray[2] == myArray[3] && myArray[2] == myArray[4]){
            fullHouse += 1;
        }
      
        else if(myArray[0] == 1 && myArray[1] == 2 && myArray[2] == 3 && myArray[2] < myArray[3] && myArray[3] < myArray[4]){
            straight += 1;
        }
        else if(myArray[0] < 2 && myArray[0] < myArray[1] && myArray[1] < myArray[2] && myArray[2] < myArray[3] && myArray[3] < myArray[4]){
            straight += 1;
        }
        
        else if(myArray[0] == myArray[1] && myArray[0] == myArray[2] && myArray[0] == myArray[3]){
            fourOfAKind += 1;
        }
        else if(myArray[1] == myArray[2] && myArray[1] == myArray[3] && myArray[1] == myArray[4]){
            fourOfAKind += 1;
        }
        
        else if(myArray[0] == myArray[1] && myArray[0] == myArray[2]){
            threeOfAKind += 1;
        }
        else if(myArray[1] == myArray[2] && myArray[1] == myArray[3]){
            threeOfAKind += 1;
        }
        else if(myArray[2] == myArray[3] && myArray[2] == myArray[4]){
            threeOfAKind += 1;
        }
        else{
            nothing += 1;
        }
        
    }
        
        
        percentage = (yahtzee/rolls) * 100;
        System.out.println("Yahtzees rolled: " + yahtzee);
        System.out.println("Yahtzee percentage: " + percentage + "%");
        System.out.println("*************************");
        
        percentage = (fullHouse / rolls) * 100;
        System.out.println("Full houses rolled: " + fullHouse);
        System.out.println("Full house Percentage: " + percentage + "%");
        System.out.println("*************************");
        
        percentage = (straight/rolls) * 100;
        System.out.println("Large straights rolled: " + straight);
        System.out.println("Large straights percentage: " + percentage + "%");
        System.out.println("*************************");
        
        percentage = (fourOfAKind / rolls) * 100;
        System.out.println("Four of a kinds rolled: " + fourOfAKind);
        System.out.println("Four of a kinds percentage: " + percentage + "%");
        System.out.println("*************************");
        
        percentage = (threeOfAKind / rolls) * 100;
        System.out.println("Three of a kinds rolled: " + threeOfAKind);
        System.out.println("Three of a kinds percentage: " + percentage + "%");
        System.out.println("*************************");
        
        percentage = (nothing / rolls) * 100;
        System.out.println("Number of losers rolled: " + nothing);
        System.out.println("Losers percentage: " + percentage + "%");
        
    }
    
    


}
        
