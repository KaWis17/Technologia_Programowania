import CalculateStrategy.Calculate;
import DiscountStrategy.Discount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart {

  private double totalPrice = 0;
  private final Map<Product, Integer> records = new HashMap<>();
  private Calculate strategy;
  private final ArrayList<Discount> discountsApplied = new ArrayList<>();

  public void addProduct(Product product, Integer quantity){
    records.put(product, quantity);
    totalPrice = totalPrice + product.getValue() * quantity;
  }

  public void addDiscount(Discount discount){
    discountsApplied.add(discount);
  }

  public String getTotalPrice(){
    totalPrice = strategy.calculate(totalPrice, discountsApplied);
    return String.format("Total price is: %.2fPLN", totalPrice);
  }

  public void setStrategy(Calculate strategy){
    this.strategy = strategy;
  }
}
