package Classes;
import Interfaces.*;
import java.lang.*;


public class Market implements ShopOperations, EmployeeOperations
{
	private Shop shops[] = new Shop[500];
	private Employee employees[] = new Employee[100];
	
	public void insertShop(Shop s)
	{
		boolean flag = false;
		
		for(int i=0; i<shops.length; i++)
		{
			if(shops[i] == null)
			{
				shops[i] = s;
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("New shop has been added");
		}
		else
		{
			System.out.println("Shop could not be added");
		}
	}
	
	public void removeShop(Shop s)
	{
		boolean flag = false;
		for(int i=0; i<shops.length; i++)
		{
			if(shops[i] == s)
			{
				shops[i] = null;
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Shop has been removed");
		}
		else
		{
			System.out.println("Shop could not be removed");
		}
	}
	
	public Shop getShop(String sid)
	{
		Shop s = null;
		
		for(int i=0; i<shops.length; i++)
		{
			if(shops[i] != null)
			{
				if(shops[i].getSid().equals (sid))
				{
					s = shops[i];
					break;
				}
			}
		}
		return s;
	}
	
	public void showAllShops()
	{
		for(Shop s : shops)
		{
			if(s!= null)
			{
				System.out.println("**********************************");
				System.out.println("Shop name: "+ s.getName());
				System.out.println("Shop ID: "+ s.getSid());
				System.out.println("----------------------------------");
				s.showAllProducts();
				System.out.println("----------------------------------");
				System.out.println();
			}
		}
	}
	public void insertEmployee(Employee e)
	{
		boolean flag = false;;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Employee has been added");
		}
		else
		{
			System.out.println("Employee could not be added");
		}
	}
	
	public void removeEmployee(Employee e)
	{
		boolean flag = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Employee has been removed");
		}
		else
		{
			System.out.println("Employee could not be removed");
		}
	}
	public void showAllEmployees()
	{
		System.out.println("//////////////////////////////////////");
		for(Employee e : employees)
		{
			if(e!= null)
			{
				System.out.println("Employee Name: "+ e.getName());
				System.out.println("Employee Id: "+ e.getEmpId());
				System.out.println("Salary: "+ e.getSalary());
				System.out.println();
			}
		}
		System.out.println("//////////////////////////////////////");
	}
	
	public Employee getEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}
	
}