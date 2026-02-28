package Git_Package_cicd;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsite {
	
public static void main(String args[]) throws InterruptedException
{
    WebDriver driver=new ChromeDriver();	
     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
     Thread.sleep(3000);
     driver.findElement(By.xpath("//label[@for='radio1']")).click();
     System.out.println("Test case has been passed");	
     Thread.sleep(3000);
     driver.close();	
     
     

}


}
