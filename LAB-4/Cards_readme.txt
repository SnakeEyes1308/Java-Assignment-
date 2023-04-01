Card Dealer
This is a Java program that simulates a deck of cards, and allows users to perform various operations on it such as shuffling, drawing cards, sorting, comparing, and more. It includes a Card class that represents a standard playing card, a Deck class that creates and manages the deck of cards, and a CardDealer class that acts as a user interface to interact with the deck of cards.

Code Overview
Card Class
This class represents a standard playing card, and includes the following fields and methods:

suits - a static array of strings representing the four suits in a deck of cards.
ranks - a static array of strings representing the 13 ranks in a deck of cards.
rank - an integer representing the rank of the card.
suit - a string representing the suit of the card.
Card(int rank, String suit) - a parameterized constructor that initializes the rank and suit of the card.
getRank() - a getter method that returns the rank of the card.
getSuit() - a getter method that returns the suit of the card.
toString() - a method that returns a string representation of the card.
Deck Class
This class creates and manages the deck of cards, and includes the following methods:

createDeck() - a method that creates a new deck of 52 cards, by iterating through each rank and suit and adding a new Card object to the deck.
displayDeck(Vector<Card> deck) - a method that displays the current state of the deck.
shuffleDeck(Vector<Card> deck) - a method that shuffles the cards in the deck.
drawCard(Vector<Card> deck) - a method that draws a card from the top of the deck.
emptyDeck(Vector<Card> deck) - a method that removes all cards from the deck.
printCard(Vector<Card> deck) - a method that prompts the user for a card position in the deck and prints the card at that position.
sameCard(Vector<Card> deck) - a method that draws two random cards and compares their ranks to check if they are the same.
findCard(Vector<Card> deck) - a method that prompts the user for a card rank and suit, and searches the deck for a matching card.
dealCard(Vector<Card> deck) - a method that deals a hand of cards to the user.
CardDealer Class
This class acts as a user interface to interact with the deck of cards, and includes the main method that initializes the deck and prompts the user for input. The available options are:

Create a deck of cards
Display the deck of cards
Shuffle the deck of cards
Draw a card from the deck
Sorts the deck of cards
Print a card from the deck
Compare two cards
Check if two cards are same
Find card by rank and suit
Deal a hand of cards
Empty the deck
Quit
The user is prompted to enter their choice, and the corresponding method in the Deck class is called to perform the operation. If an invalid choice is entered, an error message is displayed.