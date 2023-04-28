package Classes;
import Interfaces.*;

public abstract class Product implements IQuantity
{
	protected String pid;
	protected String name;
	protected int availableQuantity;
	protected double price;
	
	public void setPid(String pid)
	{
		this.pid = pid;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity = availableQuantity;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	
	public String getPid()
	{
		return pid;
	}
	public String getName()
	{
		return name;
	}
	public int getAvailableQuantity()
	{
		return availableQuantity;
	}
	public double getPrice()
	{
		return price;
	}
	
	
	public abstract void showInfo();
	
	public void addQuantity(int amount)
	{
		if(amount>0)
		{
			System.out.println("Previous Quantity: "+ availableQuantity);
			System.out.println("Added            : "+ amount);
			availableQuantity += amount;
			System.out.println("\nCurrent Quantity : "+ availableQuantity);
		}
		else
		{
			System.out.println("Could not be added");
		}
	}
	public void sellQuantity(int amount)
	{
		if(amount>0 && amount<=availableQuantity)
		{
			System.out.println("Previous Quantity: "+ availableQuantity);
			System.out.println("Sold             : "+ amount);
			availableQuantity -= amount;
			System.out.println("Current Quantity : "+ availableQuantity);
		}
		else
		{
			System.out.println("Could not be sold");
		}
	}

	
}