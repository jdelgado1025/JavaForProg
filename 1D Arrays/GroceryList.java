import java.util.Arrays;

public class GroceryList {
  public static double getMostExpensiveItemCost(double[] groceryPrices) {
    // We can set the maxCost initially to the first item without an IndexOutOfBounds error because we can assume there is at least one item in the array.
    double maxCost = groceryPrices[0];
    
    for(double price : groceryPrices){
      if(price > maxCost){
        maxCost = price;
      }
    }

    return maxCost;
  }

  public static double getLeastExpensiveItemCost(double[] groceryPrices) {
      // We can set the minCost initially to the first item without an IndexOutOfBounds error because we can assume there is at least one item in the array.
      double minCost = groceryPrices[0];
      
      for(double price : groceryPrices){
        if(price < minCost){
          minCost = price;
        }
      }
  
      return minCost;
  }

  public static double getClosestToBudgetItemCost(double[] groceryPrices) {
      // We can set the maxCost initially to the first item without an IndexOutOfBounds error because we can assume there is at least one item in the array.
      double cost = groceryPrices[0];
      // double[] totals = new double[groceryPrices.length];
      double budget = 31.89;
      double total = 0.0;
      double smallestDiff = total - (total - cost);
      
      //Find the total cost of our grocery list
      for(double price : groceryPrices){
          total += price;
      }

      for (int i = 0; i < groceryPrices.length; i++) {
          double newTotal = total - groceryPrices[i];
          double diff = Math.abs(total - newTotal);
          if(newTotal <= budget && diff < smallestDiff){
              smallestDiff = diff;
              cost = groceryPrices[i];
          }
      }
  
      return cost;
  }

  public static boolean isAlphabetized(String[] groceryList) {
    if(groceryList.length < 2){
      return true;
    }
    
    for(int i=0; i < groceryList.length - 1; i++)
    {
      if(groceryList[i].compareTo(groceryList[i + 1]) > 0){
        return false;
      }
    }

    return true;
  }

  public static String[] alphabetizedAsc(String[] groceryList) {
    if(groceryList.length >= 2){
      for(int i = 0; i < groceryList.length - 1; i++){
        for(int j = i + 1; j < groceryList.length; j++){
          if(groceryList[i].compareTo(groceryList[j]) > 0){
            String temp = groceryList[i];
            groceryList[i] = groceryList[j];
            groceryList[j] = temp;
          }
        }
      }
    }
      
    return groceryList;
  }

  public static boolean hasDuplicates(String[] groceryList) {
    for(int i=0; i<groceryList.length; i++){
      for(int j=i+1; j < groceryList.length; j++){
        if(groceryList[i].compareTo(groceryList[j]) == 0){
          return true;
        }
      }
    }
    return false;
  }

  public static boolean hasPantryDuplicates(String[] groceryList, String[] pantryList) {

    String pantry = Arrays.toString(pantryList);
    for(String item : groceryList){
      if(pantry.contains(item)){
        return true;
      }
    }
    return false;
  }

  public static String[] reverseGroceries(String[] groceryList) {
    int counter = 0, counter2 = groceryList.length - 1;
    int half = groceryList.length / 2;

    while(counter != half){
      String temp = groceryList[counter];
      groceryList[counter] = groceryList[counter2];
      groceryList[counter2] = temp;
      counter++;
      counter2--;
    }
    return groceryList;
  }

  public static void rotateGroceries(String[] groceryList) {
    if(groceryList.length > 1){
      int previousIndex;
      for(int i = groceryList.length - 1; i > 0 ; i--){
        previousIndex = i - 1;
        String temp = groceryList[i];
        groceryList[i] = groceryList[previousIndex];
        groceryList[previousIndex] = temp;
      }
    }
  }
  
  public static void main(String[] args) {
    // Below is a sample test case you can use to run your code.
    // Try playing around with different values in the array to test edge cases
    //  double[] groceryPrices = {10.0, 12.3, 8.45, 2.34, 5.25};
    //  System.out.println("Most expensive: " + getMostExpensiveItemCost(groceryPrices));
    //  System.out.println("Least expensive: " + getLeastExpensiveItemCost(groceryPrices));
    //  System.out.println("Item that lets you spend closest to budget: " +getClosestToBudgetItemCost(groceryPrices));

    String[] groceryList = {"apples", "chocolate", "banana", "apple", "bananas", "Apples"};
    //  String[] pantryList = {"flour", "almonds", "rice", "cookies"};
    //  System.out.println("Alphabetized? " + isAlphabetized(groceryList));

    //  String[] alphabetized = alphabetizedAsc(groceryList);
    //  System.out.print("Alphabetized list: ");
    //  for(String word : alphabetized){
    //   System.out.print(word + ", ");
    //  }

    //  System.out.println("\nHas dups: " + hasDuplicates(groceryList));
    //  System.out.println("Has pantry dups: " + hasPantryDuplicates(groceryList, pantryList));

    for (String string : groceryList) {
      System.out.print(string + ", ");
    }

    System.out.println();

    String[] reverseList = reverseGroceries(groceryList);
    System.out.println("\nReverse: ");
    for (String word : reverseList) {
       System.out.print(word + ", ");
    }

    String[] GroceryList = {"apples", "banana", "Apples", "chocolate"};
    System.out.println(); System.out.println();

    rotateGroceries(GroceryList);
    for (String item : GroceryList) {
      System.out.println(item);
    }
  }
}