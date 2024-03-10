package SampleProgram;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;

import base.Basesetup;
import io.github.bonigarcia.wdm.WebDriverManager;  
  
public class SampleProgram extends Basesetup  {  
  
    public static void main(String[] args) {  
        
    // declaration and instantiation of objects/variables  
    	WebDriverManager.chromedriver().setup();
    //System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");  
     driver=new ChromeDriver();  
      
// Launch website  
    driver.navigate().to("http://www.google.com/");  
    driver.findElement(By.id("lst-ib")).sendKeys("jenkins");  
          
    // Click on the search button  
    driver.findElement(By.name("btnK")).click();  
      
    }  
  
}  