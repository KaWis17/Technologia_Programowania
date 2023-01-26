package DiscountStrategy;

public class ConditionalNominalDiscount implements Discount{
  double valueToDiscount;
  double minimumValue;
  public ConditionalNominalDiscount(double valueToDiscount, double minimumValue){
    this.valueToDiscount = valueToDiscount;
    this.minimumValue = minimumValue;
  }
  @Override
  public double applyDiscount(double originalPrice) {
    double currentPrice = originalPrice - valueToDiscount;

    if(originalPrice < minimumValue)
      return originalPrice;
    else if(currentPrice < 0)
      return 0;
    else
      return originalPrice - valueToDiscount;
  }
}
