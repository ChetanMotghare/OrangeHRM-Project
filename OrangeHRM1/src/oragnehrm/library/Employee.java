package oragnehrm.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.AppUtils;

public class Employee extends AppUtils

{
	public String id;
	
	public boolean  empReg(String firstname,String lastname)
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(firstname);
		driver.findElement(By.id("lastName")).sendKeys(lastname);
		 id =driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(id);
		driver.findElement(By.id("searchBtn")).click();
		WebElement restable = driver.findElement(By.id("resultTable"));
		List<WebElement> rows = restable.findElements(By.tagName("tr"));
		List<WebElement> colm = rows.get(1).findElements(By.tagName("td"));
	    String tableid =	colm.get(1).getText();
		if(tableid.equals(id))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
