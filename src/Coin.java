/**

 * @author Sai Rahul Reddy Kondlapudi

 * 

 * @Description This is the Coin.java class

 * 

 * @version 1.0

 */

public class Coin {



  private String name;

  private int value;

  

/*

 * This method is used to assign the name and value

 */

  public Coin(String name, int value) {

      

    this.name = name;

    this.value = value;



  }

  

  

/*

 * This method is used to return the Name of the specific coin

 * 

 * @return - name of the coin

 */

  public String getName() {

    return name;

  }

  

  

  /*

   *  This method is used to return the value of the specific coin

   *  

   *  @return - value of the coin

   */

  public int getValue() {

    return value;

      }



}

