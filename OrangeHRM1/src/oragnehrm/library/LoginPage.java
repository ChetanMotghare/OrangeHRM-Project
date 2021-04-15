package oragnehrm.library;

import org.openqa.selenium.By;

import utils.AppUtils;

public class LoginPage extends AppUtils  
{
	
                        public boolean adminLogin(String uid,String pwd) 
	                     {
		                         driver.findElement(By.id("txtUsername")).sendKeys(uid);
		                         driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		                        driver.findElement(By.id("btnLogin")).click();
	
	               	if (driver.findElement(By.id("menu_admin_viewAdminModule")).isDisplayed()) 
	                    	{
		                         	return true;
		                     }
		                   else 
		                    {
                                      return false;
		                     }
		
	                    } 
                     public void logOut()
                        {
            	            driver.findElement(By.partialLinkText("Welcome")).click();
            	           driver.findElement(By.linkText("Logout")).click();
	
	                }

	}
