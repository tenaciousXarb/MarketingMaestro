import java.lang.*;
import java.util.*;
import Classes.*;
import Interfaces.*;
import fileio.*;


public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	    Market m = new Market();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		boolean choice = true;
		
		System.out.println("\n\n\n\n\n(o)->  |*|Market Management Application|*|  <-(o)");
		
		while (choice)
		{
			System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
			System.out.println("\nChoose from the following options: \n");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Shop Management");
			System.out.println("\t3. Shop Product Management");
			System.out.println("\t4. Product Quantity Add-Sell");
			System.out.println("\t5. Exit");
			System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
			
			
			
			try
			{
				System.out.print("You have chosen: ");
				int option = sc.nextInt();
				
				switch(option)
				{
					case 1:
						
						System.out.println("-------------------------------------");
						System.out.println("***Employee Management***\n");
						System.out.println("What do you want to do?\n");
						System.out.println("-------------------------------------");
						System.out.println("\t1. Insert New Employee");
						System.out.println("\t2. Remove Existing Employee");
						System.out.println("\t3. Show All Employees");
						System.out.println("\t4. Search an Employee");
						System.out.println("\t5. Go Back");
						System.out.println("-------------------------------------");
						
						
						try
						{
							System.out.print("Enter your option: ");
							int input1 = sc.nextInt();
							
							switch(input1)
							{
								case 1:
								
									System.out.println("-------------------------------------");
									System.out.println("***Inserting New Employee***");
									System.out.println("#####################################\n");
									
									System.out.print("Enter Employee ID: ");
									String empId1 = sc.next();
									
									System.out.print("Enter Employee Name: ");
									String name1 = sc.next();
									
									System.out.print("Enter Employee Salary: ");
									double salary = sc.nextDouble();
									
									System.out.println("\n#####################################");
									
									Employee e1 = new Employee();
									e1.setEmpId(empId1);
									e1.setName(name1);
									e1.setSalary(salary);
									
									m.insertEmployee(e1);
									
									System.out.println("-------------------------------------");
									
									break;
									
								case 2:
								
									System.out.println("-------------------------------------");
									System.out.println("***Removing Existing Employee***");
									System.out.println("#####################################\n");
									
									System.out.print("Enter Employee ID: ");
									String empId2 = sc.next();
									
									System.out.println("\n-------------------------------------");
									
									
									if(m.getEmployee(empId2) != null)
									{
										m.removeEmployee(m.getEmployee(empId2));
									}
									else
									{
										System.out.println("Employee not found");
									}
									
									
									System.out.println("#####################################");
									
									break;
									
								case 3:
								
									System.out.println("-------------------------------------");
									System.out.println("***Showing All Employees***");
									System.out.println("#####################################\n");
									
									m.showAllEmployees();
									System.out.println("\n#####################################");
									break;
									
								case 4:
								
									System.out.println("-------------------------------------");
									System.out.println("***Searching an Employee***");
									System.out.println("#####################################\n");
									
									System.out.print("Enter Employee ID: ");
									String empId4 = sc.next();
									
									System.out.println("\n-------------------------------------\n");
									
									try
									{
										Employee e4 = m.getEmployee(empId4);
										
										if(e4!=null)
										{
											System.out.println("Employee ID: "+e4.getEmpId());
											System.out.println("Employee Name: "+e4.getName());
											System.out.println("Employee Salary: "+e4.getSalary());
										}
										else
										{
											System.out.println("Employee not found");	
										}
									}
									catch(NullPointerException npe)
									{
										System.out.println("Null Pointer Exception Occured");
									}
									
									System.out.println("\n#####################################");
									break;
									
								case 5:

									System.out.println("-------------------------------------");
									System.out.println("Going Back...");
									System.out.println("#####################################");
									break;
									
								default:

									System.out.println("-------------------------------------");
									System.out.println("Invalid option!!");
									System.out.println("#####################################");
									break;
									
							}
						
						}
						catch(InputMismatchException ime)
						{
							System.out.println("\n#####################################");
							System.out.println("You were supposed to enter a numeric value");
							System.out.println("Try again!!");
							choice= false;
							System.out.println("-------------------------------------");
						}
						catch(Exception e)
						{
							System.out.println("\n#####################################");
							System.out.println("Exception occured");
							choice= false;
							System.out.println("-------------------------------------");
						}
						break;
						
					case 2:
						
						System.out.println("-------------------------------------");
						System.out.println("***Shop Management***\n");
						
						System.out.println("What do you want to do?\n");
						System.out.println("-------------------------------------");
						System.out.println("\t1. Insert New Shop");
						System.out.println("\t2. Remove Existing Shop");
						System.out.println("\t3. Show All Shops");
						System.out.println("\t4. Search a Shop");
						System.out.println("\t5. Go Back");
						System.out.println("-------------------------------------");
						
						
						try
						{
							System.out.print("Enter your option: ");
							int input2 = sc.nextInt();
							
							switch(input2)
							{
								case 1:
								
									System.out.println("-------------------------------------");
									System.out.println("***Inserting New Shop***");
									System.out.println("#####################################\n");
									
									System.out.print("Enter Shop ID: ");
									String sid1 = sc.next();
									
									System.out.print("Enter Shop Name: ");
									String name1 = sc.next();
									
									Shop s1 = new Shop();
									s1.setSid(sid1);
									s1.setName(name1);;
									
									System.out.println("\n-------------------------------------");
									
									m.insertShop(s1);
								
									
									System.out.println("#####################################\n");
									break;
									
								case 2:
								
									System.out.println("-------------------------------------");
									System.out.println("***Removing Existing Shop***");
									System.out.println("#####################################\n");
									
									System.out.print("Enter Shop ID: ");
									String sid2 = sc.next();
									
									System.out.println();
									
									if(m.getShop(sid2) != null)
									{
										try
										{
											m.removeShop(m.getShop(sid2));
										}
										catch(NullPointerException npe)
										{	
											System.out.println("Null Pointer Exception Occured");
										}
									}
									else
									{
										System.out.println("Shop has not been added");
									}
									System.out.println("#####################################");
									break;
									
								case 3:
								
									System.out.println("-------------------------------------");
									System.out.println("***Showing All Shops***");
									System.out.println("#####################################\n");
									
									m.showAllShops();
									
									System.out.println("#####################################");
									break;
									
								case 4:
								
									System.out.println("-------------------------------------");
									System.out.println("***Searching a Shop***");
									System.out.println("#####################################\n");
									
									System.out.print("Enter Shop ID: ");
									String sid4 = sc.next();
									
									System.out.println("\n-------------------------------------");
									
									try
									{
										Shop s4 = m.getShop(sid4);
										
										if(s4!=null)
										{
											System.out.print("Shop ID: "+s4.getSid());
											System.out.println("Shop Name: "+s4.getName());
											s4.showAllProducts();
										}
										else
										{
											System.out.println("Shop has not been added");
										}
									}
									catch(NullPointerException npe)
									{
										System.out.println("Null Pointer Exception Occured");
									}
									
									System.out.println("#####################################");
									break;
									
								case 5:

									System.out.println("-------------------------------------");
									System.out.println("Going Back...");
									System.out.println("#####################################\n");
									break;
									
								default:

									System.out.println("-------------------------------------");
									System.out.println("Invalid option!!");
									System.out.println("#####################################\n");
									break;
									
							}
						}
						catch(InputMismatchException ime)
						{
							System.out.println("\n#####################################");
							System.out.println("You were supposed to enter a numeric value");
							System.out.println("Try again!!");
							choice= false;
							System.out.println("-------------------------------------");
						}
						catch(Exception e)
						{
							System.out.println("\n#####################################");
							System.out.println("Exception occured");
							choice= false;
							System.out.println("-------------------------------------");
						}
						break;
						
						
					case 3:
						
						System.out.println("-------------------------------------");
						System.out.println("***Shop Product Management***\n");
						
						System.out.println("What do you want to do?\n");
						System.out.println("-------------------------------------");
						System.out.println("\t1. Insert New Product to a Shop");
						System.out.println("\t2. Remove Existing Product of a Shop");
						System.out.println("\t3. Show All Products of a Shop");
						System.out.println("\t4. Search a Product of a Shop");
						System.out.println("\t5. Go Back");
						System.out.println("-------------------------------------");
						
						
						try
						{
							System.out.print("Enter your option: ");
							int input3 = sc.nextInt();
							
							switch(input3)
							{
								case 1:
								
									System.out.println("-------------------------------------");
									System.out.println("***Inserting New Product***");
									System.out.println("#####################################\n");
									
									System.out.println("Type of product?");
									System.out.println("\t1. Local Product");
									System.out.println("\t2. Imported Product");
									System.out.println("\t3. Go Back\n");
									System.out.println("-------------------------------------");
									
									System.out.print("You choosed: ");
									int type = sc.nextInt();
									System.out.println("-------------------------------------\n");
									
									Product p = null;
									
									if(type == 1)
									{
										System.out.print("Enter Product ID: ");
										String pd1 = sc.next();
										System.out.print("Enter Product Name: ");
										String nm1 = sc.next();
										System.out.print("Enter Available Quantity: ");
										int aq1 = sc.nextInt();
										System.out.print("Enter Price: ");
										double price1 = sc.nextDouble();
										System.out.print("Enter Discount Rate: ");
										double dr1 = sc.nextDouble();
										
										
										LocalProduct lp = new LocalProduct();
										
										lp.setPid(pd1);
										lp.setName(nm1);
										lp.setAvailableQuantity(aq1);
										lp.setPrice(price1);
										lp.setDiscountRate(dr1);
										
										p = lp;
									}
									else if(type == 2)
									{
										System.out.print("Enter Product ID: ");
										String pd1 = sc.next();
										System.out.print("Enter Product Name: ");
										String nm1 = sc.next();
										System.out.print("Enter Available Quantity: ");
										int aq1 = sc.nextInt();
										System.out.print("Enter Price: ");
										double price1 = sc.nextDouble();
										System.out.print("Enter Country Name: ");
										String cn1 = sc.next();
										
										ImportedProduct ip = new ImportedProduct();
										
										ip.setPid(pd1);
										ip.setName(nm1);
										ip.setAvailableQuantity(aq1);
										ip.setPrice(price1);
										ip.setCountryName(cn1);
										
										p = ip;
									}
									else if(type == 3)
									{
										System.out.println("Going Back...\n");
									}
									else
									{
										System.out.println("Invalid Type!!");
									}
									System.out.println("\n-------------------------------------\n");
									
									
									if(p != null)
									{
										System.out.print("Enter Shop ID: ");
										String sid1 = sc.next();
										
										System.out.println("\n-------------------------------------\n");
										
										try
										{
											m.getShop(sid1).insertProduct(p);
										}
										catch(NullPointerException npe)
										{
											System.out.println("\nShop does not exist");
											System.out.println("Try Again!");
										}
										
									}
									
									System.out.println("\n#####################################");
									break;
									
								case 2:
								
									System.out.println("-------------------------------------");
									System.out.println("***Removing Existing Product***");
									System.out.println("#####################################\n");
									
									System.out.print("Enter Shop ID: ");
									String sid2 = sc.next();
									System.out.print("Enter Product ID: ");
									String pd2 = sc.next();
									
									System.out.println("\n-------------------------------------");
									
									
									if(m.getShop(sid2) != null && m.getShop(sid2).getProduct(pd2) != null)
									{
										try
										{
											m.getShop(sid2).removeProduct(m.getShop(sid2).getProduct(pd2));
										}
										catch(NullPointerException npe)
										{
											System.out.println("Null Pointer Exception Occured");
										}
									}
									else
									{
										System.out.println("Shop or Product does not exist");
									}
								
									System.out.println("\n#####################################");
									break;
									
								case 3:
								
									System.out.println("-------------------------------------");
									System.out.println("***Showing All Products of a Shop***");
									System.out.println("#####################################\n");
									
									System.out.print("Enter Shop ID: ");
									String sid3 = sc.next();
									
									System.out.println("\n-------------------------------------\n");
									
									try
									{
										m.getShop(sid3).showAllProducts();
									}
									catch(NullPointerException npe)
									{
										System.out.println("Shop does not exist");
									}
									
									System.out.println("\n#####################################");
									break;
									
								case 4:
								
									System.out.println("-------------------------------------");
									System.out.println("***Searching a Product of a Shop***");
									System.out.println("#####################################\n");
									
									System.out.print("Enter Shop ID: ");
									String sid4 = sc.next();
									System.out.print("Enter Product ID: ");
									String pd4 = sc.next();
									
									System.out.println("\n-------------------------------------\n");
									
									
									if(m.getShop(sid4) != null && m.getShop(sid4).getProduct(pd4) != null)
									{
										try
										{
											Product pp = m.getShop(sid4).getProduct(pd4);
										
											if(pp != null)
											{
												pp.showInfo();
											}
										}
										catch(NullPointerException npe)
										{
											System.out.println("Shop or Product does not exist");
										}	
									}
									else
									{
										System.out.println("Shop or Product does not exist");
									}
									
									
									
									
									
									System.out.println("#####################################");
									break;
								
								case 5:
								
									System.out.println("-------------------------------------");
									System.out.println("Going Back...");
									System.out.println("#####################################\n");
									break;
									
								default:

									System.out.println("-------------------------------------");
									System.out.println("Invalid Option!!");
									System.out.println("#####################################\n");
									break;
								
							}
						}
						catch(InputMismatchException ime)
						{
							System.out.println("\n#####################################");
							System.out.println("You were supposed to enter a numeric value");
							System.out.println("Try again!!");
							choice= false;
							System.out.println("-------------------------------------");
						}
						catch(Exception e)
						{
							System.out.println("\n#####################################");
							System.out.println("Exception occured");
							choice= false;
							System.out.println("-------------------------------------");
						}
						
						
						break;
						
					case 4:
						
						System.out.println("-------------------------------------");
						System.out.println("***Product Quantity Add-Sell***\n");
						
						
						System.out.println("What do you want to do?\n");
						System.out.println("--------------------------------------");
						System.out.println("\t1. Add Product");
						System.out.println("\t2. Sell Product");
						System.out.println("\t3. Show Add Sell history");
						System.out.println("\t4. Go Back");
						
						System.out.println("--------------------------------------");
						
						
						try
						{
							System.out.print("Enter your option: ");
							int input4 = sc.nextInt();
							
							
							switch(input4)
							{
								case 1:
								
									System.out.println("-------------------------------------");
									System.out.println("***Adding Product***");
									System.out.println("#####################################\n");
									
									System.out.print("Enter Shop ID: ");
									String sid1 = sc.next();
									System.out.print("Enter Product ID: ");
									String pd1 = sc.next();
									System.out.print("Enter Number of Products to be added: ");
									int amount1 = sc.nextInt();
									
									System.out.println("\n-------------------------------------\n");
									
									if(m.getShop(sid1) != null && m.getShop(sid1).getProduct(pd1) != null)
									{
										if(amount1>0)
										{
											try
											{
												m.getShop(sid1).getProduct(pd1).addQuantity(amount1);
											}
											catch(NullPointerException npe)
											{
												System.out.println("Null Pointer Exception Occured");
											}
											frwd.writeInFile(amount1+" number of products has been added to Product-ID: "+ pd1);
										}
										else
										{
											System.out.println("You have entered an invalid amount");
										}			
									}
									else
									{
										System.out.println("Shop or Product does not exist");
									}
									
									System.out.println("\n#####################################");
									break;
									
								case 2:
								
									System.out.println("-------------------------------------");
									System.out.println("***Selling Product***");
									System.out.println("#####################################\n");
									
									System.out.print("Enter Shop ID: ");
									String sid2 = sc.next();
									System.out.print("Enter Product ID: ");
									String pd2 = sc.next();
									System.out.print("Enter Number of Products to be sold: ");
									int amount2 = sc.nextInt();
									
									System.out.println("\n-------------------------------------\n");
									
									if(m.getShop(sid2) != null && m.getShop(sid2).getProduct(pd2) != null)
									{
										if(amount2>0 && amount2 <= m.getShop(sid2).getProduct(pd2).getAvailableQuantity())
										{
											
											try
											{
												m.getShop(sid2).getProduct(pd2).sellQuantity(amount2);
											}
											catch(NullPointerException npe)
											{
												System.out.println("Shop or Product does not exist");
											}
											
											frwd.writeInFile(amount2+" number of products has been sold from Product-ID: "+ pd2);
										}
										else
										{
											System.out.println("Amount that you entered is not valid for this product");
										}
									}
									else
									{
										System.out.println("Shop or Product does not exist");
									}
									
									System.out.println("\n#####################################");
									break;
									
								case 3:
								
									System.out.println("-------------------------------------");
									System.out.println("***Showing Add Sell History***");
									System.out.println("#####################################\n");
									
									try
									{
										frwd.readFromFile();
									}
									catch(NullPointerException npe)
									{
										System.out.println("Nothing to be shown");
									}
									
									System.out.println("\n#####################################");
									break;
									
								case 4:
								
									System.out.println("-------------------------------------");
									System.out.println("Going Back...");
									System.out.println("#####################################\n");
									break;
									
								default:
								
									System.out.println("-------------------------------------");
									System.out.println("Invalid Option!!");
									System.out.println("#####################################\n");
									break;
							}
						}
						catch(InputMismatchException ime)
						{
							System.out.println("\n#####################################");
							System.out.println("You were supposed to enter a numeric value");
							System.out.println("Try again!!");
							choice= false;
							System.out.println("-------------------------------------");
						}
						catch(Exception e)
						{
							System.out.println("\n#####################################");
							System.out.println("Exception occured");
							choice= false;
							System.out.println("-------------------------------------");
						}
							
							break;
							
						case 5:
							
							System.out.println("-------------------------------------");
							System.out.println("Have a good day sir!");
							choice = false;
							System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
							break;
							
						default:
							
							System.out.println("-------------------------------------");
							System.out.println("Invalid option!!");
							System.out.println("#####################################\n");
							break;
							
				}
			}
			catch(InputMismatchException ime)
			{
				System.out.println("\n#####################################");
				System.out.println("You were supposed to enter a numeric value");
				System.out.println("Try again!!");
				choice= false;
				System.out.println("-------------------------------------");
			}
			catch(Exception e)
			{
				System.out.println("\n#####################################");
				System.out.println("Exception occured");
				choice= false;
				System.out.println("-------------------------------------");
			}
			
			
					
		}
	}
}