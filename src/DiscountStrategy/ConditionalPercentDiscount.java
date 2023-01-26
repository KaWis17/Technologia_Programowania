package DiscountStrategy;

public class ConditionalPercentDiscount implements Discount{
  int percentToDiscount;
  double minimumValue;
  public ConditionalPercentDiscount(int percentToDiscount, double minimumValue){
    this.percentToDiscount = percentToDiscount;
    this.minimumValue = minimumValue;
  }
  @Override
  public double applyDiscount(double originalPrice) {
    if(originalPrice < minimumValue)
      return originalPrice;
    else
      return originalPrice * (100 - percentToDiscount) / 100;
  }
}
