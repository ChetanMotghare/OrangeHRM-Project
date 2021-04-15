package orangehrm.tests;

import oragnehrm.library.Employee;
import oragnehrm.library.LoginPage;
import utils.AppUtils;

public class AdminLoginTest {
      
	public static void main(String[] args) 
	{
		AppUtils.lauchApp("http://orangehrm.qedgetech.com/"); 
		LoginPage login = new LoginPage();
		
	       boolean  check =	login.adminLogin("Admin", "Qedge123!@#");
		   if (check)
		   {
			   System.out.println("Admin login page test passed");
		   }
		   else
		   {
			   System.out.println("Admin login page test failed ");
		   }
		   
		   
		   
		   login.logOut();
		  AppUtils.closeApp();
		
 }
	
	

}
