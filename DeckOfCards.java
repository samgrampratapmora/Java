





package com.cards;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeckOfCards
   {
      public static final int NCARDS = 52;
    
      private Card[] deckOfCards;         // Contains all 52 cards
      private int currentCard;            // deal THIS card in deck           
    
      public DeckOfCards( ) // Constructor
      {
              deckOfCards = new Card[ NCARDS ];
    
              int i = 0;
    
              for ( int suit = Card.DIAMOND; suit <= Card.SPADE; suit++ ){
                      for ( int rank = 1; rank <= 13; rank++ ){
                             deckOfCards[i++] = new Card(suit, rank);
                       }
                       currentCard = 0;

                }
     }




     public Card[] getCards(){

        return deckOfCards ;

     }
    
      /* ---------------------------------
   shuffle(n): shuffle the deck
   --------------------------------- */
      public void shuffle(int n)
      {
            int i, j, k;
    
             for ( k = 0; k < n; k++ )
             {
                     i = (int) ( NCARDS * Math.random() );  // Pick 2 random cards
                     j = (int) ( NCARDS * Math.random() );  // in the deck
    
                     /* ---------------------------------
                     swap these randomly picked cards
                         --------------------------------- */
                      Card tmp = deckOfCards[i];
                      deckOfCards[i] = deckOfCards[j];
                      deckOfCards[j] = tmp;;
              }
    
               currentCard = 0;   // Reset current card to deal
       }
   




   /* -------------------------------------------
   deal(): deal deckOfCards[currentCard] out
   ------------------------------------------- */
      public Card deal()
      {
           if ( currentCard < NCARDS )
           {
                  return ( deckOfCards[ currentCard++ ] );
            }
           else
            {
                   System.out.println("Out of cards error");
                    return ( null );  // Error;
             }
       }
    
      public String toString()
      {
               StringBuilder s = new StringBuilder();
                int k;
    
                k = 0;
               for ( int i = 0; i < 4; i++ )
               {
                     for ( int j = 1; j <= 13; j++ )
                     { 	

                            s.append(deckOfCards[k++] + " ");
    
                         
                      }

                      s.append("\n");

                }
                return ( s );
           }




      public static void main(String args[]){

       

        DeckOfCards cards = new DeckOfCards();

		System.out.println("Cards are : "+cards.toString());
	
        cards.shuffle(52);

        System.out.println("Shuffled Cards are : "+cards.toString());

        BufferedReader myReader  = new BufferedReader(new InputStreamReader(System.in));

         System.out.Println("Please Enter number of Players ");
         int numberOfPlayers;
		 
		 try{
			 numberOfPlayers = Integer.parseInt(myReader.readLine());
			 
			 Card[][] players = new Card[numberOfPlayers][NCARDS/numberOfPlayers];
			 for(int i=0;i< NCARDS/numberOfPlayers;i++){
				 for(int j=0;j<numberOfPlayers;j++){
					 players[j][i]=cards.deal();
				 }
			 }
			 
			 for(int j=0;j<numberOfPlayers;j++){
				 System.out.print("\nplayer "+j+" ");
				 for(int i=0;i<NCARDS/numberOfPlayers;i++){
					 System.out.print(players[j][i]+" ");
				 }
			 }
		 }
		 catch(IOException e){
			 System.err.println("e.getMessage());
		 }
	  }
   }
		 