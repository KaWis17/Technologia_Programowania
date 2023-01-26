package DiscountStrategy;

public class AbsoluteNominalDiscount implements Discount{
  double valueToDiscount;
  public AbsoluteNominalDiscount(double valueToDiscount){
    this.valueToDiscount = valueToDiscount;
  }
  @Override
  public double applyDiscount(double originalPrice) {
    double currentPrice = originalPrice - valueToDiscount;

    if(currentPrice < 0)
      return 0;
    else
      return originalPrice - valueToDiscount;
  }
}
