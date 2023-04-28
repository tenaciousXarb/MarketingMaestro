package Classes;
import Interfaces.*;
import java.lang.*;

public class Shop implements ProductOperations
{
	private String sid;
	private String name;
	private Product products[] = new Product[10];
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSid(String sid)
	{
		this.sid = sid;
	}
	
	
	public String getName()
	{
		return name;
	}
	public String getSid()
	{
		return sid;
	}
	
	
	public void insertProduct(Product p)
	{
		boolean flag = false;
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == null)
			{
				products[i] = p;
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Product has been added");
		}
		else
		{
			System.out.println("Product could not be added");
		}
	}
	
	public void removeProduct(Product p)
	{
		boolean flag = false;
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == p)
			{
				products[i] = null;
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Product has been removed");
		}
		else
		{
			System.out.println("Product could not be removed");
		}
	}
	public void showAllProducts()
	{
		for(Product p : products)
		{
			if(p != null)
			{
				p.showInfo();
			}
		}
	}
	public Product getProduct(String pid)
	{
		Product p = null;
		
		for(int i=0; i<products.length; i++)
		{
			if(products[i] != null)
			{
				if(products[i].getPid().equals(pid))
				{
					p = products[i];
					break;
				}
			}
		}
		return p;
	}
	
}