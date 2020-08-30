import java.util.Random;



/**
 * 
 * @author Sai Rahul Reddy Kondlapudi
 * 
 * 
 * 
 * @description This is the ElasticBank.java class
 * 
 * 
 * 
 * @version 1.0
 * 
 */



public class ElasticBank {



  private Coin[] coins;

  private int size;

  private int expansionsLeft;

  private static Random random = new Random(10);



  /*
   * 
   * This Constructor is used to create and initialize the array to a value of 10.
   * 
   */

  public ElasticBank() {

    coins = new Coin[10];

    expansionsLeft = 2;

  }



  /*
   * 
   * This is another constructor where we give the input of the array size. And initializes the
   * 
   * array with the value entered
   * 
   * 
   * 
   * @param initialCapacity - the initial capacity assigned to coins array by the constructor.
   * 
   */

  public ElasticBank(int initialCapacity) {

    coins = new Coin[initialCapacity];

    expansionsLeft = 2;

  }



  /*
   * 
   * This method is used to return the capacity of the array which is used.
   * 
   * 
   * 
   * @return - current capacity of the array
   * 
   */

  public int capacity() {

    return coins.length;

  }



  /*
   * 
   * This method is used to return the Expansion left for the PiggyBank.
   * 
   * 
   * 
   * @return - returns the expansionsLeft
   * 
   */

  public int getExpansions() {

    return expansionsLeft;

  }



  /*
   * 
   * This method is used to return the number of coins in the array
   * 
   * 
   * 
   * @return size of the array
   * 
   */

  public int getSize() {

    return size;

  }



  /*
   * 
   * This method is used to return the balance of the Piggy Bank
   * 
   * 
   * 
   * @param balance balance of the piggy bank
   * 
   */

  public int getBalance() {

    int balance = 0;

    for (int i = 0; i < size; i++) {

      balance += coins[i].getValue();

    }

    return balance;

  }



  /*
   * 
   * This method gets the specific coin name with value of the coin in string representation.
   * 
   * 
   * 
   * @return coinInBank - a string representation of the coin Name and Value
   * 
   */

  public String getCoins() {

    String coinInBank = "";

    for (int i = 0; i < size; i++) {

      if (coins[i] != null && coins[i] != coins[size - 1]) {

        coinInBank = coinInBank + "(" + coins[i].getName() + ", " + coins[i].getValue() + ") ";

      } else if (coins[i] != null && coins[i] == coins[size - 1]) {

        coinInBank = coinInBank + "(" + coins[i].getName() + ", " + coins[i].getValue() + ")";

      }

    }

    return coinInBank;

  }



  /*
   * 
   * This method removes a coin at random from the piggy bank
   * 
   * 
   * 
   * @removedCoin - the coin which has been removed from the piggybank
   * 
   * 
   * 
   */

  public Coin removeCoin() {

    if (size == 0) {

      return null;

    } else {

      int removeCoin = random.nextInt(size);

      Coin removedCoin = null;

      removedCoin = new Coin(coins[removeCoin].getName(), coins[removeCoin].getValue());

      coins[removeCoin] = null;

      for (int i = removeCoin; i < size + 1; i++) {

        coins[i] = coins[i + 1];

      }

      size = size - 1;

      return removedCoin;

    }



  }



  /*
   * 
   * This method completely empties the piggy bank
   * 
   */

  public void empty() {



    for (int i = 0; i < size; i++) {

      coins[i] = null;

    }

    size = 0;



  }



  /*
   * 
   * This method is used to add a coin to the piggybank. This method also uses the concept of
   * 
   * piggy bank expansions
   * 
   * 
   * 
   * @ param c - a new coin object
   * 
   */

  public void addCoin(Coin c) {

    if (coins[coins.length - 1] != null && expansionsLeft > 0) {

      Coin[] coinsExtension = new Coin[coins.length + 10];

      for (int i = 0; i < size; i++) {

        coinsExtension[i] = coins[i];

      }

      coinsExtension[size] = c;

      expansionsLeft--;

      size++;

      coins = new Coin[coinsExtension.length];

      for (int i = 0; i < size; i++) {

        coins[i] = coinsExtension[i];

      }

    } else if (coins[coins.length - 1] != null && expansionsLeft == 0) {

      empty();

      coins[size] = c;

      size++;

    } else if (coins[capacity() - 1] == null) {

      coins[size] = c;

      size++;

    }

  }



  public static void main(String[] args) {



  }

}

