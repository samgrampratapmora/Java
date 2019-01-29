package com.cards;
public class Card
   {
      public static final int SPADE   = 4;
      public static final int HEART   = 3;
      public static final int CLUB    = 2;
      public static final int DIAMOND = 1;
    
      private static final String[] Suit = { "*", "d", "c", "h", "s"};
      private static final String[] Rank = { "*", "*", "2", "3", "4",
      "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    
      private byte cardSuit;
      private byte cardRank;
    
      public Card( int suit, int rank )
      {
   if ( rank == 1 )
       cardRank = 14;     // Give Ace the rank 14
   else
       cardRank = (byte) rank;
    
   cardSuit = (byte) suit;
      }
    
      public int suit()
      {
   return ( cardSuit );         // This is a shorthand for:
         //   this.cardSuit
      }
    
      public String suitStr()
      {
   return( Suit[ cardSuit ] );  // This is a shorthand for:
         //   this.Suit[ this.cardSuit ]
      }
    
      public int rank()
      {
   return ( cardRank );
      }
    
      public String rankStr()
      {
   return ( Rank[ cardRank ] );
      }
    
    
      public String toString()
      {
   return ( Rank[ cardRank ] + Suit[ cardSuit ] );
      }
   }
