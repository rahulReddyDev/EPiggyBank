/////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////

//

// Title: ElasticBank

// Files: ElasticBank.java,Coin.java,ElasticTester.java

// Course: (CS 300, Spring, and 2020)

//

// Author: Sai Rahul Reddy Kondlapudi

// Email: kondlapudi@wisc.edu

// Lecturer's Name: Gary Dahl

//

//////////// PAIR PROGRAMMING (MAY SKIP WHEN WORKING INDIVIDUALLY) ////////////

//

// Partner Name:

// Partner Email:

// Partner Lecturer's Name:

//

// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:

// __ Write-up states that pair programming is allowed for this assignment.

// __ We have both read and understood the course Pair Programming Policy.

// __ We have registered our team prior to the team registration deadline.

//

///////////////////////// ALWAYS CREDIT OUTSIDE HELP //////////////////////////

//

// Students who get help from sources other than their partner and the course

// staff must fully acknowledge and credit those sources here. If you did not

// receive any help of any kind from outside sources, explicitly indicate NONE

// next to each of the labels below.

//

// Persons: NONE

// Online Sources: NONE

//

///////////////////////////////////////////////////////////////////////////////



/**
 * 
 * @author Sai Rahul Reddy Kondlapudi
 * 
 * 
 * 
 * @Description This is the ElasticTester Class
 * 
 * 
 * 
 * @version 1.0
 * 
 */

public class ElasticTester {



  /**
   * 
   * a testing method that tests the Coin instantiable class created and member methods.
   * 
   * 
   * 
   * @return true when this test verifies a correct functionality, and false otherwise
   * 
   */

  public static boolean testCoinInstantiableClass() {

    Coin penny = new Coin("PENNY", 1);

    Coin quarter = new Coin("QUARTER", 25);

    if (!penny.getName().equals("PENNY"))

      return false;

    if (penny.getValue() != 1)

      return false;

    if (!quarter.getName().equals("QUARTER"))

      return false;

    if (quarter.getValue() != 25)

      return false;

    return true;

  }



  /**
   * 
   * tests the Accessor methods of ElasticBank class.
   * 
   * 
   * 
   * @return true when this test verifies a correct functionality, and false otherwise
   * 
   */

  public static boolean testBalanceAccessors() {

    ElasticBank one = new ElasticBank(5);

    ElasticBank two = new ElasticBank(7);

    one.addCoin(new Coin("PENNY", 1));

    two.addCoin(new Coin("NICKEL", 5));

    if (one.getBalance() != 1)

      return false;

    if (two.getBalance() != 5)

      return false;

    return true;

  }



  /**
   * 
   * tests Mutator Methods from ElasticBank class.
   * 
   * 
   * 
   * @return true when this test verifies a correct functionality, and false otherwise
   * 
   */

  public static boolean testMutatorMethods() {

    ElasticBank three = new ElasticBank(9);

    ElasticBank four = new ElasticBank(4);

    three.addCoin(new Coin("Quarter", 25));

    four.addCoin(new Coin("Dime", 10));

    four.addCoin(new Coin("Penny", 1));

    four.addCoin(new Coin("Nickel", 5));

    three.empty();

    if (three.getSize() != 0) {

      return false;

    }

    if (!four.getCoins().equals("(Dime, 10) (Penny, 1) (Nickel, 5)")) {

      return false;

    }

    return true;

  }



  /**
   * 
   * tests the expansion part of addCoin Method from ElasticBank class.
   * 
   * 
   * 
   * @return true when this test verifies a correct functionality, and false otherwise
   * 
   */

  public static boolean testExpansionOfBank() {

    ElasticBank five = new ElasticBank(2);

    ElasticBank six = new ElasticBank(1);

    five.addCoin(new Coin("Quarter", 25));

    five.addCoin(new Coin("Dime", 10));

    five.addCoin(new Coin("Nickel", 5));

    six.addCoin(new Coin("Penny", 1));

    six.addCoin(new Coin("Dime", 10));

    if (five.getExpansions() != 1) {

      return false;

    }

    if (six.getExpansions() != 1) {

      return false;

    }

    return true;

  }



  public static void main(String[] args) {



    System.out.println("testCoinInstantiableClass: " + testCoinInstantiableClass());

    System.out.println("testBalanceAccessors: " + testBalanceAccessors());

    System.out.println("testMutatorMethods: " + testMutatorMethods());

    System.out.println("testExpansionOfBank: " + testExpansionOfBank());



  }

}

