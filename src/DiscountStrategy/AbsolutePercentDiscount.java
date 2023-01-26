package DiscountStrategy;

public class AbsolutePercentDiscount implements Discount{
  int percentToDiscount;
  public AbsolutePercentDiscount(int percentToDiscount){
    this.percentToDiscount = percentToDiscount;
  }
  @Override
  public double applyDiscount(double originalPrice) {
    return originalPrice * (100 - percentToDiscount) / 100;
  }
}
