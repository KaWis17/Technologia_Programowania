package CalculateStrategy;

import DiscountStrategy.Discount;
import java.util.ArrayList;

public interface Calculate {
  double calculate(double totalPrice, ArrayList<Discount> discountsApplied);
}
