package SampleProgram;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Elements.Thank_You_Page_Script_Elements;
import base.Basesetup;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import utils.CommonUtils;

//commented by sasikanth now
public class SampleMavenclass extends Basesetup {
	public Thank_You_Page_Script_Elements Elements;
	public Sheet sheet;
	public Sheet sheet1;
	public Sheet sheet2;
	public static File fi;
	public static Workbook wb;
	public static Sheet s;
	public String ValidPincode = "500016";
	public String ValidPincode2 = "500032";
	public String Fullname = "Sasikanth";
	public String Address = "Hyderabad";
	public String State = "TELANGANA";
	public String Mobile = "9963132874";
	public String Payment = "payu";
	public String omsurl = "https://wsiuatadmin.watchstationindia.com/ViewOrders";
	public String pdpurl = "https://www.watchstationindia.com/emporio-armani-silver-watch-ar11529";
	public String Ordernumber;
	public String Quanity;
	public String Color;
	public String Split_Subtotal;

	
	@Parameters("Browser")
	// open browser
	@BeforeTest
	public void setUp() throws BiffException, AWTException, Exception {
		
		driver = getDriver3("Chrome");
		driver.manage().window().maximize();
		driver.get(baseUrlUI);
		//CommonUtils.Authonitication_Login();
		CommonUtils.Thread_Sleep(6);
		Elements = PageFactory.initElements(driver, Thank_You_Page_Script_Elements.class);
		driver.findElement(By.xpath("(//*[@class='user_icon'])[1]")).click();
		Thread.sleep(3000);
		// WSI Login
		CommonUtils.WSILiveLogin();

		CommonUtils.Reports("Thank You Page.html", "Reports");

	}

	
	
	@Test(priority =0)
	public void TC51() throws Exception {

		//Elements.Watches.click();
		CommonUtils.Thread_Sleep(5);
		//Elements.Home_Mens_First_Product.click();
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		//js6.executeScript("arguments[0].click();", Elements.Home_Mens_First_Product);
		driver.navigate().to(pdpurl);
		CommonUtils.Thread_Sleep(5);

		JavascriptExecutor je1 = (JavascriptExecutor) driver; 
		//je1.executeScript("arguments[0].scrollIntoView(true);",Elements.Viewmore);
		CommonUtils.Thread_Sleep(3);
		
		JavascriptExecutor je2 = (JavascriptExecutor) driver; 
		je2.executeScript("arguments[0].scrollIntoView(true);",Elements.Add_To_Bag);
		//click on add to bag
		js6.executeScript("arguments[0].click();", Elements.Add_To_Bag);
		CommonUtils.Thread_Sleep(5);
		js6.executeScript("arguments[0].click();", Elements.Go_To_Bag);
		CommonUtils.Thread_Sleep(5);
		Select count=new Select(Elements.Quantity);	
		count.selectByVisibleText("1");
		Thread.sleep(2000);
		//click on checkout
		js6.executeScript("arguments[0].click();", Elements.Proceed_To_check_Out);
		Thread.sleep(2000);
//		String SubTotal_In_UICART =driver.findElement(By.xpath("(//*[@class='sup d-inline'])[1]")).getText();
//		System.out.println(SubTotal_In_UICART);
//		String Split_SubtotalCART =SubTotal_In_UICART.replace("₹", "");
//		System.out.println(Split_SubtotalCART);
//
//
//		String GrandTotal_In_UICART =driver.findElement(By.xpath("(//*[@class='sup d-inline'])[2]")).getText();
//		System.out.println(GrandTotal_In_UICART);
//		String Split_GrandTotal_In_UICART =GrandTotal_In_UICART.replace("₹.", "");
//		System.out.println(Split_GrandTotal_In_UICART);
		CommonUtils.Thread_Sleep(5);
		Elements.Add_New_Address.click();
		CommonUtils.Thread_Sleep(3);
		//add shipping address
		Elements.Add_New_Address_Receivers_Name.sendKeys(Fullname);
		CommonUtils.Thread_Sleep(3);
		Elements.Add_New_Address_Full_address.sendKeys(Address);
		CommonUtils.Thread_Sleep(3);
		Elements.Add_New_Address_Pincode.sendKeys(ValidPincode);
		CommonUtils.Thread_Sleep(3);
		Elements.Add_New_Address_Phone_No.sendKeys(Mobile);
		CommonUtils.Thread_Sleep(3);
		// CommonUtils.scroll_down(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//save address
		js.executeScript("arguments[0].click();", Elements.Add_New_Address_Save);
		CommonUtils.Thread_Sleep(3);
		// Elements.Add_New_Address_Save.click();
		CommonUtils.scroll_up(driver);
		CommonUtils.Thread_Sleep(3);
		//select address
		Elements.Choose_Address.click();
		CommonUtils.Thread_Sleep(3);
		//click on continue to payment
		Elements.Continue_To_Payment.click();
		CommonUtils.Thread_Sleep(3);
		//click on netbankng oayment
		/*Elements.Wallet.click();
		CommonUtils.Thread_Sleep(3);
		//click on make payment button
		Elements.Make_Payment.click();
		CommonUtils.Thread_Sleep(5);
		Elements.Net_Banking_Andra_Bank.click();
		CommonUtils.Thread_Sleep(5);
		Elements.Net_Banking_Andra_Bank_Submit.click();
		CommonUtils.Thread_Sleep(4);
		Elements.EntetOTP.sendKeys("123456");
		CommonUtils.Thread_Sleep(4);
		Elements.Net_Banking_Andra_Bank_login_Btn.click();
		CommonUtils.Thread_Sleep(4);
		//click on success button in payment gateway page
		Elements.Simulate_Success_Btn.click();
		CommonUtils.Thread_Sleep(4);
		Elements.CloseReviewpopup.click();
		scrolldown(300);
		Ordernumber =driver.findElement(By.xpath("(//*[@class='col-6 col-lg-6 d-flex mb-2'])[2]/label")).getText();
		System.out.println(Ordernumber);
		Quanity =driver.findElement(By.xpath("(//*[@class='col-3 font-600'])[2]//following::span[2]")).getText(); //get Quantity
		System.out.println(Quanity);
		String SubTotal_In_UI =driver.findElement(By.xpath("(//*[@class='sub-total font-600'])[1]")).getText();
		System.out.println(SubTotal_In_UI);
		Split_Subtotal =SubTotal_In_UI.replace("₹", "");
		System.out.println(Split_Subtotal);

		String GrandTotal_In_UI =driver.findElement(By.xpath("(//*[@class='grand-total text-end w-100 font-600'])[1]")).getText();
		System.out.println(GrandTotal_In_UI);
		String Split_GrandTotal_In_UI =GrandTotal_In_UI.replace("₹.", "");
		System.out.println(Split_GrandTotal_In_UI);
		if(Split_Subtotal.contains(Split_SubtotalCART)) {
			CommonUtils.captureScreenshot_pass(driver,"Scenario1", "TC_1","subtotal is displaying as per Checkout");
			System.out.println("Pass");
		}
		else {
			CommonUtils.captureScreenshot_fail(driver,"Scenario1", "TC_1","subtotal is not displaying as per Checkout");
			System.out.println("Fail");
		}
		if(Split_GrandTotal_In_UI.contains(Split_GrandTotal_In_UICART)) {
			CommonUtils.captureScreenshot_pass(driver,"Scenario1", "TC_2","grandtotal is displaying as per Checkout");
			System.out.println("Pass");
		}
		else {
			CommonUtils.captureScreenshot_fail(driver,"Scenario1", "TC_2","grandtotal is not displaying as per Checkout");
			System.out.println("Fail");
		}
		CommonUtils.Thread_Sleep(10);
		CommonUtils.CaptureScreenshot_for_IsDisplayed(driver, Elements.Thank_You_msg, "TC51", "Thank you for your order success message is displaying", "Thank you for your order success message is not displaying");*/
	}


	//@Test(priority = 1)
	public  void Ordernumber_SystemVerified() throws Exception{
		//checking status is updated to system verified form verified status
		Thread.sleep(4000);
		driver.navigate().refresh();
		CommonUtils.AdminLogin(driver);
		//CommonUtils.selectdropdown(driver.findElement(By.xpath("//*[@id='ctl00_ddlSiteChange']")), "visibleText", "WSI UAT");//select wsi  child site

		driver.navigate().to(omsurl);
		fi=new File("elementlocators.xls");wb = Workbook.getWorkbook(fi); s = wb.getSheet("Ordermanagement");

		WebElement ordernumberfield=driver.findElement(By.id(s.getCell(2,3).getContents()));

		fi=new File("testdata.xls");wb = Workbook.getWorkbook(fi); s = wb.getSheet("OMS");
		ordernumberfield.clear();
		ordernumberfield.sendKeys(Ordernumber);
		fi=new File("elementlocators.xls");wb = Workbook.getWorkbook(fi); s = wb.getSheet("Ordermanagement");
		driver.findElement(By.id(s.getCell(2,4).getContents())).click(); Thread.sleep(30000);//click on search buttonThread.sleep(10000);
		fi=new File("elementlocators.xls");
		wb = Workbook.getWorkbook(fi);
		s = wb.getSheet("Ordermanagement");
		fi=new File("elementlocators.xls");wb = Workbook.getWorkbook(fi); s = wb.getSheet("Ordermanagement");
		Thread.sleep(3000);
		CommonUtils.scroll_down(driver);
		driver.findElement(By.id(s.getCell(2,12).getContents())).click(); //click on edit
		Thread.sleep(4000);
		fi=new File("elementlocators.xls");wb = Workbook.getWorkbook(fi); s = wb.getSheet("Ordermanagement");
		String AddProduct=s.getCell(2,56).getContents();Thread.sleep(500); //wait untill close appears		 
		WebElement Scroll=driver.findElement(By.id(s.getCell(2,30).getContents()));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Scroll);Thread.sleep(1500); //scroll
		Actions a=new Actions(driver);
		Thread.sleep(10000);
		driver.navigate().refresh();
		String ColorBE=driver.findElement(By.xpath("(//*[@id='ctl00_ContentPlaceHolder1_repStoreOrderDetails_ctl00_lblColorName'])")).getText();//get color in BE 
		System.out.println(ColorBE);
		String QuanityBE =driver.findElement(By.xpath("(//*[@id='ctl00_ContentPlaceHolder1_repStoreOrderDetails_ctl00_lblQuantity'])")).getText();//get Quantity in BE 
		System.out.println(QuanityBE);
		String ITEMPRICEBE =driver.findElement(By.xpath("(//*[@id='ctl00_ContentPlaceHolder1_repStoreOrderDetails_ctl00_lblStoreProductPrice'])")).getText();//get item price in BE
		System.out.println(ITEMPRICEBE);
		String Split_ITEMPRICEBE =ITEMPRICEBE.replace("₹.", "");
		System.out.println(Split_ITEMPRICEBE);


		//Running loop until file order status changed to system verified
		try {
			if (ColorBE.equals(Color) && QuanityBE.equals(Quanity) && Split_ITEMPRICEBE.equals(Split_Subtotal) )
				CommonUtils.captureScreenshot_pass(driver,"Ordernumber_SystemVerified", "TC_2","Color, price, and qty is matching in be as per UI");
			System.out.println("Pass");

		}catch (Exception e) {
			CommonUtils.captureScreenshot_pass(driver,"Ordernumber_SystemVerified", "TC_2","Color, price, and qty is not matching in be as per UI");
			System.out.println("Fail");
		}
	}
	
	
	//@Test(priority = 2)
	public void CheckFooterMenu() throws IOException, InterruptedException {
		CommonUtils.Thread_Sleep(4);
		
		try {
			if (!driver.findElement(By.xpath("(//*[text()='POPULAR SEARCHES IN MENS'])")).isDisplayed()) {
				CommonUtils.captureScreenshot_pass(driver, "CheckFooterMenu", "CheckFooterMenu ",
						"Footer menu should not display");
				System.out.println("Pass");
			}
		} catch (Exception e) {
			CommonUtils.captureScreenshot_fail(driver, "CheckFooterMenu", "CheckFooterMenu",
					"Footer menu should display");
			System.out.println("Fail");
		}
		driver.close();
	}
}

