package cse360assignment02;

public class AddingMachine {
  private int total;
  private String str = "0";		//initial value is always 0 and built off of
  
  public AddingMachine () {
    total = 0;  	//not needed - included for clarity
  }
  
  //returns the sum at any given point
  public int getTotal () {
    return total;
  }
  //adds an integer to the total
  public void add (int value) {
	  total = total + value;
	  String aT = (" + " + value);
	  str = str + aT;
  }
  //subtracts an integer from the total
  public void subtract (int value) {
	  total = total - value;
	  String sT = (" - " + value); 
	  str = str + sT;
  }
  //shows the operations that have been performed in a single string
  public String toString () {
    return str;
  }
  //clears operations performed and resets total to 0
  public void clear() {
	  total = 0;
	  str = "0";
  }
}