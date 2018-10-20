/*
ArrayListFun.java
Author: David Brungardt

Just a practice program to learn about ArrayLists.
*/

// Import java ArrayList utility
import java.util.ArrayList;

public class ArrayListFun
{
  public static void main(String[] args)
  {
    // Create new instance of ArrayList
    ArrayList<String> bands = new ArrayList<String>();

    // Add bands to array list
    bands.add("Animals As Leaders");
    bands.add("Veil of Maya");
    bands.add("Periphery");
    bands.add("Meshuggah");
    bands.add("Thank You Scientist");
    bands.add("Chon");

    // Array lists can be printed, unlike arrays
    System.out.println(bands);

    // Replace element 5 (Chon) with Behemoth
    bands.set(5, "Behemoth");

    // Remove item 4 (Thank You Scientist) from ArrayList
    bands.remove(4);

    // Print ArrayList again.
    System.out.println(bands);

    // Add The Contortionist to element zero of ArrayList
    bands.add(0, "The Contortionist");
    // Note that elements will shift down

    // Print ArrayList again.
    System.out.println(bands);

    // Check to see if Chon is in the list.
    if (!bands.contains("Chon"))
    {
      // If Chon is missing, print message.
      System.out.println("You're Crazy!!!");
    }

    // Check to see if Meshuggah is the first item on the list.
    if  (bands.indexOf("Meshuggah") != 0)
    {
      // If Meshuggah isn't in index 0 of list, print message.
      System.out.println("Meshuggah should be number 1!!!");
    }

    // A for-loop is necessary if we are to print each
    // band on their own line.
    for (int i = 0; i < bands.size(); i++)
    {
      System.out.println(bands.get(i));
    }

  } // End of main method
} // End of ArrayListFun class
