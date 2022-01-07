package assignment1.utils;

import assignment1.constants.Constants;
import assignment1.models.Item;

public class Printer {

  public static void display(Item it) {
    System.out.println("Item name: " + it.getName());
    System.out.println("Item price: " + it.getPrice());
    System.out.println("Item quantity: " + it.getQuantity());
    System.out.println("Item type: " + it.getType().toString().toLowerCase());
    System.out.println("Item sales tax: " + it.getSalesTax());
    System.out.println("Item final price: " + it.getFinalPrice() + Constants.DOUBLE_NEW_LINE);
  }
}
