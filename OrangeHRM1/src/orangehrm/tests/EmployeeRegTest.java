package orangehrm.tests;

import oragnehrm.library.Employee;
import oragnehrm.library.LoginPage;
import utils.AppUtils;

public class EmployeeRegTest {

	public static void main(String[] args) 
	{
		 AppUtils.lauchApp("http://orangehrm.qedgetech.com");
         LoginPage lp = new LoginPage();
         lp.adminLogin("Admin", "Qedge123!@#");
         Employee emplogin = new Employee();
	boolean	empidmatch = emplogin.empReg("Mahesh", "Babu");
		 if(empidmatch)
		 {
			 System.out.println("Employee registration test case Passed");
		 }
		 else
		 {
			 System.out.println("Employee Registration case failed ");
		 }
		 lp.logOut();
		 AppUtils.closeApp();
	}

}
