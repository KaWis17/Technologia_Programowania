import CalculateStrategy.CalculateForClient;
import CalculateStrategy.CalculateForCompany;
import DiscountStrategy.AbsoluteNominalDiscount;
import DiscountStrategy.AbsolutePercentDiscount;
import DiscountStrategy.ConditionalNominalDiscount;
import DiscountStrategy.ConditionalPercentDiscount;

public class Main {
  public static void main(String[] args){
    Cart cart = new Cart();
    Product p1 = new Product("Butter", 5.50);
    Product p2 = new Product("Bread", 3.20);

    cart.addProduct(p1, 2);
    cart.addProduct(p2, 3);

    cart.addDiscount(new AbsolutePercentDiscount(15));
    cart.addDiscount(new ConditionalPercentDiscount(50, 5));
    cart.addDiscount(new AbsoluteNominalDiscount(3.80));
    cart.addDiscount(new ConditionalNominalDiscount(250, 1000));

    cart.setStrategy(new CalculateForClient());
    cart.setStrategy(new CalculateForCompany());
    System.out.println(cart.getTotalPrice());
  }
}
