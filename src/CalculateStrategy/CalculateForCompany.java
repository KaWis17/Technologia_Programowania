package CalculateStrategy;

import DiscountStrategy.Discount;
import java.util.ArrayList;

public class CalculateForCompany implements Calculate{
  @Override
  public double calculate(double totalPrice, ArrayList<Discount> discountsApplied) {
    //Here should be an algorithm to find the best deal for Company
    //Currently just an example of calculating price,
    //as writing algorithms was not a part of the task.

    for(Discount d : discountsApplied)
      totalPrice = d.applyDiscount(totalPrice);
    return totalPrice;
  }
}
