package Interfaces;
import Classes.*;

public interface EmployeeOperations
{
	void insertEmployee(Employee e);
	void removeEmployee(Employee e);
	Employee getEmployee(String empId);
	void showAllEmployees();
}