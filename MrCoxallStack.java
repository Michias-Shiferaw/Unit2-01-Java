//Scan all primitive data types
import java.util.ArrayList;

/**
* Stack of numbers class.
* @author Michias Shiferaw
* @Version 2.0
* @since 2020-04-01.
*/


public class MrCoxallStack<S> {
  
  private static final ArrayList<Integer> stacke = new ArrayList<Integer>();

  // Adds integers onto stack
  public void push(int numbero) {
    stacke.add(numbero);
  }
  
  /**
  * Stack of numbers class.
  * @author Michias Shiferaw
  * @Version 2.0
  * @since 2020-04-01.
  */

  public String toString() {
    String ending = "";

    for (Integer element : stacke) {
      ending += element + "\n";
    }

    return ending.toString();
  }

}
