package com.cards;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class DeckOfCardsTest{
	public static final int NCARDS = 52;
	
	public DeckOfCards deckOfCards;
	
	@Test
	void testShuffle(){
		Card[] testDeck = new card[NCARDS];
		deckOfCards = new DeckOfCards();
		
		testDeck = Array.copyOf(deckOfCards.getCards(), NCARDS);
		
		deckOfCards.shuffle(NCARDS);
		
		StringBuilder s = new StringBuilder();
                int k;
    
                k = 0;
               for ( int i = 0; i < 4; i++ )
               {
                     for ( int j = 1; j <= 13; j++ )
                     { 	

                            s.append(testDeck[k++] + " ");
    
                         
                      }

                      s.append("\n");

                }
				
				assetNotEquals(Array.toString(testDeck), Array.toString(deckOfCards.getCards()));
				
				
	}
	
	@Test
	void testDeal(){
		DeckOfCards cards = new Cards();
		
		asserNotNull(cards.deal());
	
	
	
	}
		
	}


}