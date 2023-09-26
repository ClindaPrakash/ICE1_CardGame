/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner scanner = new Scanner(System.in);
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            if(i<6) {
                Card c = new Card();
                Random rand = new Random();
                c.setValue(rand.nextInt(12));
                c.setSuit(Card.SUITS[rand.nextInt(3)]);
                magicHand[i] = c;
            } else {
                // add one luckcard hard code 2,clubs
                Card c = new Card();
                c.setValue(2);
                c.setSuit("Clubs");
                magicHand[i] = c;
            }
        }
        
        //e to ask the user for Card value and suit, create their card
        System.out.print("Enter Card Suit: ");
        String cardSuit = scanner.nextLine();
        System.out.print("Enter Card Value: ");
        Integer cardValue = scanner.nextInt();
        Card selectedCard = new Card();
        selectedCard.setValue(cardValue);
        selectedCard.setSuit(cardSuit);
        // and search magicHand here
        Boolean found = false;
        for (int i=0; i<magicHand.length; i++) {
            if(selectedCard.getSuit().equals(magicHand[i].getSuit()) && selectedCard.getValue()== magicHand[i].getValue()) {
             //Then report the result here 
             System.out.print("Lucky Winner! Your card was found");
             found = true;
            }
        }
        if(!found) {
            System.out.println("Your card was not found");
        }
        
    }
    
}
