import java.util.*;
class EmployeeInfo
{
public int emp_id;
public String emp_name;
public String emp_address;
public int emp_salary;

public void setdata(int emp_id,String emp_name, String emp_address, int emp_salary)
{
	this.emp_id=emp_id;
	this.emp_name=emp_name;
	this.emp_address=emp_address;
	this.emp_salary=emp_salary;

}
public void getdata()
{
	System.out.println("Employee ID :"+emp_id);
	System.out.println("Employee name :"+emp_name);
	System.out.println("Employee address : "+emp_address);
	System.out.println("Employee salary :"+emp_salary);

}

}

class Experiment3 
{
	public static void main(String[] args)
{
	EmployeeInfo ab =new EmployeeInfo();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter employee ID : ");
	int a = sc.nextInt();
	switch(a)
{
	case 101 :
		ab.setdata(101,"Sakshi","Ichalkaranji",10000);
		ab.getdata();
		break;
	case 102 :
		ab.setdata(102,"Anu","Kolhapur",8000);
		ab.getdata();
		break;
	case 103 :
		ab.setdata(103,"Aradhya","Mumbai",7000);
		ab.getdata();
		break;
	case 104 :
		ab.setdata(104,"vamika","Noida",6000);
		ab.getdata();
		break;
	case 105 :
		ab.setdata(105,"Sami","Pune",9000);
		ab.getdata();
		break;
	default :
		System.out.print("Inavalid Choice");


    }
}
}

