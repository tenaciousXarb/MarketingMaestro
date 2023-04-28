package Classes;
import Interfaces.*;

public class ImportedProduct extends Product
{
	private String countryName;
	
	public void setCountryName(String countryName)
	{
		this.countryName = countryName;
	}
	public String getCountryName()
	{
		return countryName;
	}
	public void showInfo()
	{
		System.out.println("Product ID: "+pid);
		System.out.println("Product name: "+name);
		System.out.println("Available quantity: "+availableQuantity);
		System.out.println("Price: "+price);
		System.out.println("Country name: "+countryName);
		System.out.println();
	}
}