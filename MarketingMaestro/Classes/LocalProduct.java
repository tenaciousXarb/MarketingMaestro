package Classes;
import Interfaces.*;

public class LocalProduct extends Product
{
	private double discountRate;
	
	public void setDiscountRate(double discountRate)
	{
		this.discountRate = discountRate;
	}
	public double getDiscountRate()
	{
		return discountRate;
	}
	public void showInfo()
	{
		System.out.println("Product ID: "+pid);
		System.out.println("Product name: "+name);
		System.out.println("Available quantity: "+availableQuantity);
		System.out.println("Price: "+price);
		System.out.println("Discount rate: "+discountRate);
		System.out.println();
	}
}