package utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Excels.Excels;
import base.Basesetup;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class CommonUtils extends Basesetup {

	public static String userName = "support";
	public static String password ="$upport321";
	public static String crmuserName = "sasikanth.v@revalsys.in";
	public static String crmpassword ="PASSWORD";
	public static String userName2 = "TestUser";
	public static String password2 ="password";
	public static String UIfirstname = "sasikanth.v@revalsys.in";
	public static String UIEmail = "SK172@revalsys.in";
	public static String UIuserName = "sasikanth.v@revalsys.in";
	public static String UIpassword = "Password1*";
	public static String UIMobile = "9898760606";
	public static String Accesscode = "K2UK4R";
	//public static WebDriverWait wait;

	//For Live

	public static String ExistingEmail = "sasikanth.v@revalsys.in";
	public static String ExistingPassword = "Password1*";
	public static String AccessCode = "H43B8U";
	static String PresentDate;


	//For UAT

	public static String ExistingEmailUAT = "ipsita.m@revalsys.in";
	public static String ExistingPasswordUAT = "Password1*";
	public static String AccessCodeUAT = "QG54BY";
	public static String BrownTape_UN="shashankjayakumar@fossil.com";
	public static String BrownTape_Pwd="browntape";
	//public static String Accesscode = "WMDJ9F";
	public static String Password= "Password1*";
	public static String Auth_Username ="wsiprod";
	public static String Auth_Password ="F@ss!l4432";
	public static String newDateC;
	public static String newDateF;
	public static   Workbook wbb;
	public static  Sheet rsh;
	//static int time;
	public static DateFormat df=new SimpleDateFormat("dd MMM YYYY");
	public static Date d=new Date();
	public static String time=df.format(d); 
	public static String ModuleName;
	public static String TomorrowDate;
	public static String CurrentHour;
	public static String CurrentMin;
	public static WebDriverWait Wait;
	public static String SerchWordTotal="Sasikanth";
	public static String PartialSerchWord="sas";
	public static Workbook wb;
	//public static ReturnOrder_Elements Elements;
	public static File file;
	public static  DateFormat DateReport=new SimpleDateFormat("yyyy_MMM_dd hh_mm_ss a");
	public static  Date daterep=new Date();
	public static   String timereport=DateReport.format(daterep);
	public String ui_Url="https://bk.revalweb.com";
	public static String Producturl = "https://www.watchstationindia.com/diesel-master-chief-white-watch-dz1405-dz1405"; // product urk
	public static String BrownTapeUrl="https://app.browntape.com/users/login";
	public static ExtentReports report=new ExtentReports(Excels.filepath3);

	public static ExtentTest logger=report.startTest("Report");





	public static void Reports(String ReportName, String ScriptName) {

		report = new ExtentReports(Excels.filepath3+ReportName);
		logger = report.startTest(ScriptName);

	}

	public static void implicit_Wait(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public  void passscreenshot(WebDriver driver,String screenshotname,String data) throws IOException
	{
		File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File(userDirectory +"/screenshots/"+ModuleName+"/pass/"+ screenshotname +".png"));
		logger.log(LogStatus.PASS, data,logger.addScreenCapture(userDirectory +"/screenshots/"+ModuleName+"/pass/"+ screenshotname +".png"));
		logger.log(LogStatus.PASS, data);
		report.endTest(logger);
		report.flush();

	}

	public  static  String genText() {
		String randomText = "1234569874";
		int length = 10;
		String temp = RandomStringUtils.random(length, randomText);
		return temp;
	}

	public  void failscreenshot(WebDriver driver,String screenshotname,String data) throws IOException
	{
		File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File(userDirectory +"/screenshots/"+ModuleName+"/Fail/"+ screenshotname +".png"));
		logger.log(LogStatus.FAIL, data,logger.addScreenCapture(userDirectory +"/screenshots/"+ModuleName+"/Fail/"+ screenshotname +".png"));
		logger.log(LogStatus.FAIL,data );
		report.endTest(logger);
		report.flush();

	}



	public static void  captureScreenshot_pass(WebDriver driver, String ModuleName,String screenshotname,String data) throws IOException
	{           
		File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File(Excels.filepath4 + "/" + ModuleName +"/" +"/pass/" + screenshotname + "_"+time +".png"));

		logger.log(LogStatus.PASS, "snapshot below:"+screenshotname+" ",logger.addScreenCapture(Excels.filepath4 + "/" + ModuleName +"/"  +"/pass/" + screenshotname + "_"+time +".png"));     
		logger.log(LogStatus.PASS, data);      
		report.endTest(logger);
		report.flush();     
	}
	public static void captureScreenshot_fail(WebDriver driver,String ModuleName,String screenshotname,String data) throws IOException
	{     
		File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File(Excels.filepath4 + "/" + ModuleName +"/" +"/fail/" + screenshotname +"_"+ time +".png"));

		logger.log(LogStatus.FAIL, "snapshot below:"+screenshotname+" ",logger.addScreenCapture(Excels.filepath4 + "/" + ModuleName +"/" +"/fail/" + screenshotname +"_"+ time +".png"));   
		logger.log(LogStatus.FAIL, data);             
		report.endTest(logger);
		report.flush();      
	}       

	public static void FGEMPLogin() throws InterruptedException {
		driver.get("https://fgempuat.fnfsale.in/user-access");
		//JavascriptExecutor js1 = (JavascriptExecutor) driver;
		//js1.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//*[@name='selectType'])[2]")));
		CommonUtils.Thread_Sleep(3);
		driver.findElement(By.xpath("//*[@formcontrolname='email']")).sendKeys(ExistingEmail);
		CommonUtils.Thread_Sleep(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Continue']")).click();
		CommonUtils.Thread_Sleep(5);
		Thread_Sleep(2);
		JFrame f = new JFrame();
		f.setAlwaysOnTop(true);
		String captcha = JOptionPane.showInputDialog(f, "Enter Captcha");
		//ENTER COD CAPTACHA
		driver.findElement(By.xpath("(//*[@class='ng-otp-input-wrapper wrapper'])/input[1]")).sendKeys(captcha);
		Thread_Sleep(2);
		driver.findElement(By.xpath("//*[text()='Continue']")).click();
		Thread_Sleep(2);


	}

	public static void FossilLiveLogin() throws InterruptedException {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//*[@name='selectType'])[2]")));
		CommonUtils.Thread_Sleep(3);
		driver.findElement(By.xpath("//*[@formcontrolname='email']")).sendKeys(ExistingEmail);
		CommonUtils.Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(ExistingPassword);
		CommonUtils.Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@formcontrolname='accessCode']")).sendKeys(AccessCode);
		
		Thread.sleep(2000);
		scrolldown(450);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='consent-tracking-button'])")).click();
		Thread_Sleep(2);
	}


	public static void WSILiveLogin() throws InterruptedException {
		CommonUtils.Thread_Sleep(3);
		driver.findElement(By.xpath("//*[@formcontrolname='email']")).sendKeys(UIuserName);
		CommonUtils.Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(UIpassword);
		CommonUtils.Thread_Sleep(2);
		driver.findElement(By.xpath("(//*[text()='Login'])[2]")).click();
		CommonUtils.Thread_Sleep(5);
		driver.findElement(By.xpath("(//*[@id='consent-tracking-button'])")).click();
		Thread_Sleep(2);




	}

	public static void Browntape_Login() {
		driver.get(BrownTapeUrl);
		CommonUtils.Thread_Sleep(4);
		driver.findElement(By.xpath("//*[@placeholder='Email address']")).sendKeys(BrownTape_UN);
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys(BrownTape_Pwd);
		Thread_Sleep(4);
		driver.findElement(By.xpath("//*[text()='Sign in']")).click();
	}



	public static void FossilUATLogin() {
		CommonUtils.Thread_Sleep(3);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//*[@name='selectType'])[2]")));
		CommonUtils.Thread_Sleep(3);
		driver.findElement(By.xpath("//*[@formcontrolname='email']")).sendKeys(ExistingEmailUAT);
		CommonUtils.Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(ExistingPasswordUAT);
		CommonUtils.Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@formcontrolname='accessCode']")).sendKeys(AccessCodeUAT);
		CommonUtils.Thread_Sleep(2);
		CommonUtils.scroll_down(driver);
		CommonUtils.Thread_Sleep(3);
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
		CommonUtils.Thread_Sleep(5);


	}
	public static void Actionsclass(String Action)
	{
		if(Action.equals("Accept"))
		{
			driver.switchTo().alert().accept();
		}
		else if(Action.equals("Dissmiss"))
		{
			driver.switchTo().alert().dismiss();
		}

	}
	public static void captureScreenshot_pass(WebDriver driver, String screenshotname,String data) throws IOException
	{            
		File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File(Excels.filepath4 +ModuleName+"/pass/" + screenshotname + "_"+time +".png"));
		logger.log(LogStatus.PASS, "snapshot below:"+screenshotname+" ",logger.addScreenCapture(Excels.filepath4 +ModuleName+"/pass/" + screenshotname + "_"+time +".png"));      
		logger.log(LogStatus.PASS, data);       
		report.endTest(logger);
		report.flush();      
	}

	public static void captureScreenshot_fail(WebDriver driver,String screenshotname,String data) throws IOException
	{      
		File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File(Excels.filepath4 +ModuleName+"/fail/" + screenshotname +"_"+ time +".png"));
		logger.log(LogStatus.FAIL, "snapshot below:"+screenshotname+" ",logger.addScreenCapture(Excels.filepath4 +ModuleName+"/fail/" + screenshotname +"_"+ time +".png"));    
		logger.log(LogStatus.FAIL, data);              
		report.endTest(logger);
		report.flush();       
	}

	public static void Thread_Sleep(long seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// APP_LOGS.error("Interrupted! " + e);
			// Restore interrupted state...
			Thread.currentThread().interrupt();
		}
	}

	/**
	 * Hack to avoid unnecessary marketing popup
	 * 
	 * @param driver
	 */
	public static void set_flag_checkTimeStamp(WebDriver driver) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			long dt = new Date().getTime();
			// APP_LOGS.debug("Set timestamp field to: " + dt);
			jse.executeScript("return localStorage.setItem('checkTimeStamp'," + dt + ")");
			String checkTimeStamp = (String) jse.executeScript("return localStorage.checkTimeStamp");
			// APP_LOGS.debug("Get timestamp field: " + checkTimeStamp);
		} catch (Throwable t) {
			// APP_LOGS.fatal("set_flag_checkTimeStamp method failed: " + t.getMessage());
		}
	}

	public static void scrollTOElement(By by, WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(by));
	}

	public static void scrollTOElement(WebElement el, WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
	}

	public static void scroll_down(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,8000);");
	}

	public static void scroll_up(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500);");
	}
	public static void scrollTo(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView();", element);
	}
	
	
	public static String insertAsterisks(String original, int position1, int position2, int position3, int position4, int position5) {
        StringBuilder modified = new StringBuilder(original);

        // Insert asterisks at the specified positions
        modified.setCharAt(position1 - 1, '*');
        modified.setCharAt(position2 - 1, '*');
        modified.setCharAt(position3 - 1, '*');
        modified.setCharAt(position4 - 1, '*');
        modified.setCharAt(position5 - 1, '*');

        return modified.toString();
    }

	public static void login(WebDriver driver) { 

		OpenBaseUrl(driver);
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUserName")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@id='lnkbtnLogin']")).click();
		Thread_Sleep(2);
		//CommonUtils.selectdropdown(driver.findElement(By.id("ctl00_ddlSiteChange")), "visibleText", "fgempuat");
		Thread_Sleep(4);
	}

	public static void login2(WebDriver driver) throws InterruptedException { 

		driver.get("https://wsiuatadmin.revalsys.com/AdminLogin");
		Thread_Sleep(2);

		Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@id='txtUserName']")).sendKeys(userName2);
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password2);
		driver.findElement(By.xpath("//*[@id='lnkbtnLogin']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@title='REVALPLATFORM']")).click();
		Thread_Sleep(2);
	}

	public static void UIlogin(WebDriver driver) { 

		driver.get("https://master.watchstationindia.com/users/sign_in");
		Thread_Sleep(2);
		driver.findElement(By.name("email")).sendKeys(UIuserName);
		driver.findElement(By.name("password")).sendKeys(UIpassword);
		driver.findElement(By.xpath("(//*[@id='consent-tracking-button'])")).click();
		Thread_Sleep(2);
		driver.findElement(By.xpath("(//*[text()='Login'])[2]")).click();
		Thread_Sleep(4);

	}




	public static void uilogin(WebDriver driver) {  
		OpenBaseUrl(driver);
		driver.findElement(By.xpath("//*[@formcontrolname='email']")).sendKeys(UIfirstname);
		Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(UIEmail);
		Thread_Sleep(2);
		JFrame f=new JFrame();
		f.setAlwaysOnTop(true);
		String captcha=JOptionPane.showInputDialog(f,"Enter Captcha");
		driver.findElement(By.xpath("(//*[@id='captchaID'])")).sendKeys(captcha);
		Thread_Sleep(2);
		driver.findElement(By.xpath("(//*[text()='Go'])")).click();
		Thread_Sleep(4);
	}

	public static void WelcomewsiUIlogin() {  
		Thread_Sleep(6);
		//JavascriptExecutor js1 = (JavascriptExecutor) driver;
		//js1.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//*[@name='selectType'])[2]")));
		driver.get("https://welcomeuat.watchstationindia.com/");
		
		CommonUtils.Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@formcontrolname='email']")).sendKeys(UIEmail);
		Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@formcontrolname='mobile']")).sendKeys(UIMobile);
		Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread_Sleep(2);
		// To open a input box
		JFrame f = new JFrame();
		f.setAlwaysOnTop(true);
		String captcha = JOptionPane.showInputDialog(f, "Enter Captcha");
		//ENTER COD CAPTACHA
		driver.findElement(By.xpath("(//*[@class='ng-otp-input-wrapper wrapper'])/input[1]")).sendKeys(captcha);
		Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread_Sleep(2);
		driver.findElement(By.xpath("(//*[@id='consent-tracking-button'])")).click();
	}
	
	
	

	public static void UIForgotMail(WebDriver driver) {

		driver.get("https://fossiluat.fnfsale.in/users/sign_in");
		Thread_Sleep(10);
		//driver.findElement(By.xpath("//*[text()='Continue with Password']")).click();
		Thread_Sleep(6);
		driver.findElement(By.xpath("//*[text()='Forgot password?']")).click();
		driver.findElement(By.xpath("(//*[@id='form1Example1'])[2]")).sendKeys(UIuserName);
		Thread_Sleep(2);
		driver.findElement(By.xpath("//*[text()='Send']")).click();
		Thread_Sleep(4);
	}

	public static void AdminLogin(WebDriver driver) throws InterruptedException, BiffException, IOException, AWTException, Exception
	{	 driver.get("https://admin.watchstationindia.com/AdminLogin");
		Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@id='txtUserName']")).sendKeys(userName);
		Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='lnkbtnLogin']")).click();
		Thread_Sleep(2);
	}

	public static void RMP_AdminLogin(WebDriver driver) throws InterruptedException, BiffException, IOException, AWTException, Exception
	{	 
		driver.get("https://rmpuatadmin.watchstationindia.com");
		Thread_Sleep(2);

		Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@id='txtUserName']")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='lnkbtnLogin']")).click();
		Thread_Sleep(2);
	}

	public static void WSI_AdminLogin(WebDriver driver) throws InterruptedException, BiffException, IOException, AWTException, Exception
	{	 
		driver.get("https://wsiuatadmin.watchstationindia.com/AdminLogin");
		Thread_Sleep(2);

		Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@id='txtUserName']")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='lnkbtnLogin']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@title='REVALPLATFORM']")).click();
		Thread_Sleep(2);
	}
	
	
	public static void WSI_Admin(WebDriver driver) throws InterruptedException, BiffException, IOException, AWTException, Exception
	{	 
		driver.get("https://wsiuatadmin.revalsys.com/AdminLogin");
		Thread_Sleep(2);

		Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@id='txtUserName']")).sendKeys(userName2);
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password2);
		driver.findElement(By.xpath("//*[@id='lnkbtnLogin']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@title='REVALPLATFORM']")).click();
		Thread_Sleep(2);
	}


	public static void CRM_Login(WebDriver driver) throws InterruptedException, BiffException, IOException, AWTException, Exception
	{	 
		driver.get("https://wsiuatcrm.watchstationindia.com/RevalCRMLogin.aspx");
		Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@id='txtUserName']")).sendKeys(crmuserName);
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(crmpassword);
		// To open a input box
		JFrame f = new JFrame();
		f.setAlwaysOnTop(true);
		String captcha = JOptionPane.showInputDialog(f, "Enter Captcha");
		//ENTER COD CAPTACHA
		driver.findElement(By.xpath("//*[@id='txtCaptcha']")).sendKeys(captcha);
		Thread_Sleep(2);
		Thread_Sleep(2);

		driver.findElement(By.xpath("//*[@id='imgBtnSubmit']")).click();
		Thread_Sleep(2);
	}

	public static void Authonitication_Login(WebDriver driver) throws InterruptedException, BiffException, IOException, AWTException, Exception
	{	 
		StringSelection stringSelection = new StringSelection(Auth_Username);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		Robot robot = new Robot();



		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		// robot.keyPress(KeyEvent.VK_ENTER);
		// robot.keyRelease(KeyEvent.VK_ENTER);Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);



		StringSelection stringSelection1 = new StringSelection(Auth_Password);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);Thread.sleep(3000);
	}

	public static String get_random_string() {
		return RandomStringUtils.random(15, true, false);
	}

	public static String get_random_alphaNumericString() {
		return RandomStringUtils.randomAlphanumeric(10);
	}

	public static long get_randomNumber() {
		Random rand = new Random();
		return (long) (rand.nextDouble() * 10000000000L);
	}
	
	
	
	public static void selectDropDownValue(WebElement locator, String type, String value) {
		Select select = new Select(locator);
		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			select.selectByValue(value);
			break;
		case "visibleText":
			select.selectByVisibleText(value);
			break;
		default:
			System.out.println("Please pass the correct selection criteria");
			break;
		}
	}

	private static WebElement getElement(By locator) {
		// TODO Auto-generated method stub
		return driver.findElement(locator);
	}




	public static int generateRandomDigits(int n) {
		int m = (int) Math.pow(10, n - 1);
		
		return m + new Random().nextInt(9 * m);
	}

	public static Sheet readExcelSheet(String fileLocation, int sheetNumber) {
		file = new File(fileLocation);
		try {
			wb = Workbook.getWorkbook(file);
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return wb.getSheet(sheetNumber);
	}


	public void CalenderTom()
    {
          DateFormat dff=new SimpleDateFormat("dd/MMM/yyyy");
          Calendar cal = Calendar.getInstance();
          cal.setTime(new Date());
          cal.add(Calendar.DATE,1);
          newDateF = dff.format(cal.getTime());
          System.out.println(newDateF);        
    }
	

	public static String getDate(int day, String dateFormat) {
		DateFormat dff = new SimpleDateFormat(dateFormat);
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, day);
		newDateF = dff.format(cal.getTime());
		return (newDateF);
	}

	public static String getExcelData(int postion1,int postion2,Sheet sheet) {
		return sheet.getCell(postion1, postion2).getContents();
	}
	public static void navigate(String URL)
	{
		driver.navigate().to(URL);
	}
	public static void selectdropdown(WebElement Locator,String type, String value) {
		Select select = new Select((Locator));
		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			select.selectByValue(value);
			break;
		case "visibleText":
			select.selectByVisibleText(value);
			break;
		default:
			System.out.println("Please pass the correct selection criteria");
			break;
		}

	}
	public static void scrolldown(int n)
	{
		//page scroll down
		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript("window.scrollBy(0,"+n+")", "");
	}

	public static void scrollup(int n)
	{
		//page scroll down
		JavascriptExecutor jsx = (JavascriptExecutor) driver;

		jsx.executeScript("window.scrollBy("+n+",0)", "");
	}
	public static String captcha() {
		String CaptchaCode= JOptionPane.showInputDialog("Enter CODE Here");
		return CaptchaCode;
	}

	public void Homepage() throws InterruptedException, BiffException, IOException, AWTException, Exception
	{

		//click on site activity
		driver.findElement(By.xpath("//*[@class='header-menuicon-siteactivity']")).click();

		//search for module
		driver.findElement(By.xpath("//*[@id='AiteActivityManageInput']")).sendKeys("abandoned carts");
		//check Abandoned cart module is available or not

		driver.findElement(By.xpath("//*[text()='Abandoned Carts']")).click();
		Thread_Sleep(2);

	}

	public static void CaptureScreenshot_for_Element(WebDriver driver,WebElement element,String Url, String TestcaseID,String PositiveData,String NegativeData) throws IOException
	{  
		Wait=new WebDriverWait(driver,10);
		try {
			Wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
			if (Url!="") {
				if (Wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed() && driver.getCurrentUrl().equals(Url)) {
					captureScreenshot_pass(driver,"Roles", TestcaseID, PositiveData);
					System.out.println("pass - "+PositiveData);
				}else {
					captureScreenshot_fail(driver,"Roles", TestcaseID, NegativeData);
					System.out.println("fail - "+NegativeData);
				}
			}else {
				if (Wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed()) {
					captureScreenshot_pass(driver,"Roles", TestcaseID, PositiveData);
					System.out.println("pass - "+PositiveData);
				}else {
					captureScreenshot_fail(driver,"Roles", TestcaseID, NegativeData);
					System.out.println("fail - "+NegativeData);
				}
			}
		} catch (Exception e) {
			captureScreenshot_fail(driver,"Roles", TestcaseID, NegativeData);
			System.out.println("fail - "+NegativeData);
		}
	}
	public static void logger_pass(WebDriver driver, String data) throws IOException
	{      
		logger.log(LogStatus.PASS, data);              
		report.endTest(logger);
		report.flush();       
	}	

	public static void logger_fail(WebDriver driver, String data) throws IOException
	{      
		logger.log(LogStatus.FAIL, data);              
		report.endTest(logger);
		report.flush();       
	}



	public static void CaptureScreenshot_for_EqualIgnoreCase(WebDriver driver,String String1, String String2,String screenshotname,String PositiveData,String NegativeData) throws IOException
	{ 
		try {   
			if(String1.equalsIgnoreCase(String2)) {
				File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(f1, new File(Excels.filepath4 + "/" + ModuleName +"/" +"/pass/" + screenshotname + "_"+time +".png"));

				logger.log(LogStatus.PASS, "snapshot below:"+screenshotname+" ",logger.addScreenCapture(Excels.filepath4 + "/" + ModuleName +"/"  +"/pass/" + screenshotname + "_"+time +".png"));     
				logger.log(LogStatus.PASS, PositiveData);      
				report.endTest(logger);
				report.flush();     
				System.out.println("pass - "+PositiveData);
			}
		} catch (Exception e) {
			File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File(Excels.filepath4 + "/" + ModuleName +"/" +"/pass/" + screenshotname + "_"+time +".png"));

			logger.log(LogStatus.PASS, "snapshot below:"+screenshotname+" ",logger.addScreenCapture(Excels.filepath4 + "/" + ModuleName +"/"  +"/pass/" + screenshotname + "_"+time +".png"));     
			logger.log(LogStatus.PASS, NegativeData);      
			report.endTest(logger);
			report.flush();     
			System.out.println("fail - "+NegativeData);
		}
	}

	public static void CaptureScreenshot_for_Equals(WebDriver driver,String String1, String String2,String screenshotname,String PositiveData,String NegativeData) throws IOException
	{
		try {
			if(String1.equals(String2)) {
				File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(f1, new File(Excels.filepath4 + "/" + ModuleName +"/" +"/pass/" + screenshotname + "_"+time +".png"));

				logger.log(LogStatus.PASS, "snapshot below:"+screenshotname+" ",logger.addScreenCapture(Excels.filepath4 + "/" + ModuleName +"/"  +"/pass/" + screenshotname + "_"+time +".png"));     
				logger.log(LogStatus.PASS, PositiveData);      
				report.endTest(logger);
				report.flush();     
				System.out.println("pass - "+PositiveData);
			}
		} catch (Exception e) {
			File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File(Excels.filepath4 + "/" + ModuleName +"/" +"/pass/" + screenshotname + "_"+time +".png"));

			logger.log(LogStatus.PASS, "snapshot below:"+screenshotname+" ",logger.addScreenCapture(Excels.filepath4 + "/" + ModuleName +"/"  +"/pass/" + screenshotname + "_"+time +".png"));     
			logger.log(LogStatus.PASS, NegativeData);      
			report.endTest(logger);
			report.flush();     
			System.out.println("fail - "+NegativeData);
		}
	}
	/*public static void CaptureScreenshot_for_Equals(WebDriver driver,Double String1, Double String2,String TestcaseID,String PositiveData,String NegativeData) throws IOException
	{      
		if(String1.equals(String2)) {
			captureScreenshot_pass(driver, TestcaseID, PositiveData);
			System.out.println("pass - "+PositiveData);
		}else{
			captureScreenshot_fail(driver, TestcaseID, NegativeData);
			System.out.println("fail - "+NegativeData);
		}
	}
	public static void CaptureScreenshot_for_Equals(WebDriver driver,Integer String1, Integer String2,String TestcaseID,String PositiveData,String NegativeData) throws IOException
	{      
		if(String1.equals(String2)) {
			captureScreenshot_pass(driver, TestcaseID, PositiveData);
			System.out.println("pass - "+PositiveData);
		}else{
			captureScreenshot_fail(driver, TestcaseID, NegativeData);
			System.out.println("fail - "+NegativeData);
		}
	}*/

	public static void CaptureScreenshot_for_Contains(WebDriver driver,String String1, String String2,String screenshotname,String PositiveData,String NegativeData) throws IOException
	{ 
		try {  
			if(String1.contains(String2)) {
				File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(f1, new File(Excels.filepath4 + "/" + ModuleName +"/" +"/pass/" + screenshotname + "_"+time +".png"));

				logger.log(LogStatus.PASS, "snapshot below:"+screenshotname+" ",logger.addScreenCapture(Excels.filepath4 + "/" + ModuleName +"/"  +"/pass/" + screenshotname + "_"+time +".png"));     
				logger.log(LogStatus.PASS, PositiveData);      
				report.endTest(logger);
				report.flush();     
				System.out.println("pass - "+PositiveData);
			}
		} catch (Exception e) {
			File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File(Excels.filepath4 + "/" + ModuleName +"/" +"/pass/" + screenshotname + "_"+time +".png"));

			logger.log(LogStatus.PASS, "snapshot below:"+screenshotname+" ",logger.addScreenCapture(Excels.filepath4 + "/" + ModuleName +"/"  +"/pass/" + screenshotname + "_"+time +".png"));     
			logger.log(LogStatus.PASS, NegativeData);      
			report.endTest(logger);
			report.flush();     
			System.out.println("fail - "+NegativeData);
		}
	}
	
	
	public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rng = new Random();
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }


	public static void CaptureScreenshot_for_IsDisplayed(WebDriver driver,By element,String TestcaseID,String PositiveData,String NegativeData) throws IOException
	{      
		try {
			if(driver.findElement(element).isDisplayed()) {
				captureScreenshot_pass(driver, TestcaseID, PositiveData);
				System.out.println("pass - "+PositiveData);
			}
		} catch (Exception e) {
			captureScreenshot_fail(driver, TestcaseID, NegativeData);
			System.out.println("fail - "+NegativeData);
		}
	}





	public static void CaptureScreenshot_for_IsDisplayed(WebDriver driver,WebElement element,String screenshotname,String PositiveData,String NegativeData) throws IOException
	{      
		try {
			if(element.isDisplayed()) {
				File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(f1, new File(Excels.filepath4 + "/" + ModuleName +"/" +"/pass/" + screenshotname + "_"+time +".png"));

				logger.log(LogStatus.PASS, "snapshot below:"+screenshotname+" ",logger.addScreenCapture(Excels.filepath4 + "/" + ModuleName +"/"  +"/pass/" + screenshotname + "_"+time +".png"));     
				logger.log(LogStatus.PASS, PositiveData);      
				report.endTest(logger);
				report.flush();     
				System.out.println("pass - "+PositiveData);
			}
		} catch (Exception e) {
			File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File(Excels.filepath4 + "/" + ModuleName +"/" +"/pass/" + screenshotname + "_"+time +".png"));

			logger.log(LogStatus.PASS, "snapshot below:"+screenshotname+" ",logger.addScreenCapture(Excels.filepath4 + "/" + ModuleName +"/"  +"/pass/" + screenshotname + "_"+time +".png"));     
			logger.log(LogStatus.PASS, NegativeData);      
			report.endTest(logger);
			//report.flush();     
			System.out.println("fail - "+NegativeData);
		}
	}

	public static void CaptureScreenshot_for_IsNotDisplayed(WebDriver driver,WebElement element,String screenshotname,String PositiveData,String NegativeData) throws IOException
	{      
		try {
			if(element.isDisplayed()) {
				File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(f1, new File(Excels.filepath4 + "/" + ModuleName +"/" +"/pass/" + screenshotname + "_"+time +".png"));

				logger.log(LogStatus.PASS, "snapshot below:"+screenshotname+" ",logger.addScreenCapture(Excels.filepath4 + "/" + ModuleName +"/"  +"/pass/" + screenshotname + "_"+time +".png"));     
				logger.log(LogStatus.PASS, PositiveData);      
				report.endTest(logger);
				report.flush();     
				System.out.println("pass - "+PositiveData);
			}
		} catch (Exception e) {
			File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File(Excels.filepath4 + "/" + ModuleName +"/" +"/pass/" + screenshotname + "_"+time +".png"));

			logger.log(LogStatus.PASS, "snapshot below:"+screenshotname+" ",logger.addScreenCapture(Excels.filepath4 + "/" + ModuleName +"/"  +"/pass/" + screenshotname + "_"+time +".png"));     
			logger.log(LogStatus.PASS, NegativeData);      
			report.endTest(logger);
			report.flush();     
			System.out.println("fail - "+NegativeData);
		}
	}

	public static void CaptureScreenshot_for_IsSelected(WebDriver driver,By element,String TestcaseID,String PositiveData,String NegativeData) throws IOException
	{      
		if(driver.findElement(element).isSelected()) {
			captureScreenshot_pass(driver, TestcaseID, PositiveData);
			System.out.println("pass - "+PositiveData);
		}else {
			captureScreenshot_fail(driver, TestcaseID, NegativeData);
			System.out.println("fail - "+NegativeData);
		}
	}


	public static void CaptureScreenshot_for_Isselected(WebDriver driver,WebElement element,String screenshotname,String PositiveData,String NegativeData) throws IOException
	{      
		if(element.isSelected()) {
			File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File(Excels.filepath4 + "/" + ModuleName +"/" +"/pass/" + screenshotname + "_"+time +".png"));

			logger.log(LogStatus.PASS, "snapshot below:"+screenshotname+" ",logger.addScreenCapture(Excels.filepath4 + "/" + ModuleName +"/"  +"/pass/" + screenshotname + "_"+time +".png"));     
			logger.log(LogStatus.PASS, PositiveData);      
			report.endTest(logger);
			report.flush();     
			System.out.println("pass - "+PositiveData);
		}else {
			File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File(Excels.filepath4 + "/" + ModuleName +"/" +"/pass/" + screenshotname + "_"+time +".png"));

			logger.log(LogStatus.PASS, "snapshot below:"+screenshotname+" ",logger.addScreenCapture(Excels.filepath4 + "/" + ModuleName +"/"  +"/pass/" + screenshotname + "_"+time +".png"));     
			logger.log(LogStatus.PASS, PositiveData);      
			report.endTest(logger);
			report.flush();     
			System.out.println("pass - "+PositiveData);
		}
	}

	public static void CaptureScreenshot_for_IsEnabled(WebDriver driver,WebElement element,String TestcaseID,String PositiveData,String NegativeData) throws IOException
	{      
		if(element.isEnabled()) {
			captureScreenshot_pass(driver, TestcaseID, PositiveData);
			System.out.println("pass - "+PositiveData);
		}else {
			captureScreenshot_fail(driver, TestcaseID, NegativeData);
			System.out.println("fail - "+NegativeData);
		}
	}

	public static void CaptureScreenshot_for_IsNotSelected(WebDriver driver,By element,String TestcaseID,String PositiveData,String NegativeData) throws IOException
	{      
		if(driver.findElement(element).isSelected()) {
			captureScreenshot_fail(driver, TestcaseID, NegativeData);
			System.out.println("fail - "+NegativeData);
		}else {
			captureScreenshot_pass(driver, TestcaseID, PositiveData);
			System.out.println("pass - "+PositiveData);
		}
	}
	public void waitexplicit(String e) throws Exception
	{
		//	wait = new WebDriverWait(driver, 80); 
		//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(e)));
	}

	public static void Click(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 80); 
		wait.until(ExpectedConditions.visibilityOf(element)).click();
	}

	public static void Click(By elements) {
		WebDriverWait wait = new WebDriverWait(driver, 80); 
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(elements))).click();
	}

	public static void SendKeys(WebElement element,String SendKeys) {
		WebDriverWait wait = new WebDriverWait(driver, 80); 
		wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(SendKeys);
	}

	public static void SendKeys(By element,String SendKeys) {
		WebDriverWait wait = new WebDriverWait(driver, 80); 
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(element))).sendKeys(SendKeys);
	}

	public static void Clear(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 80); 
		wait.until(ExpectedConditions.visibilityOf(element)).clear();
	}

	public static void Clear(By element) {
		WebDriverWait wait = new WebDriverWait(driver, 80); 
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(element))).clear();
	}

	public static void Wait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 80); 
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void Wait(By element) {
		WebDriverWait wait = new WebDriverWait(driver, 80); 
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
	}

	public static void TypeOfElement(By element, String ModuleName, String type, String value, String Screenshot, String PostiveData, String NegativeData) throws Throwable {
		String ElementType = driver.findElement(element).getAttribute(type);
		if (ElementType.equals(value)) {
			CommonUtils.captureScreenshot_pass(driver,ModuleName, Screenshot,PostiveData);
		} else {
			CommonUtils.captureScreenshot_fail(driver,ModuleName, Screenshot,NegativeData);
		}
	}

	public static String TomorrowDate() {
		Calendar cal1 = Calendar.getInstance();
		cal1.add(Calendar.DAY_OF_MONTH, 1);
		TomorrowDate = CommonUtils.df.format(cal1.getTime());
		System.out.println("Tomorrow will be " + TomorrowDate);
		return TomorrowDate;
	}

	public static String GetCurrenHour() {

		DateFormat TimeHour = new SimpleDateFormat("hh mm a");
		Date TimeHour1 = new Date();
		String TimeHour2= TimeHour.format(TimeHour1);
		String hour = TimeHour2.substring(0,2);
		int Hour = Integer.parseInt(hour);
		System.out.println("Start hour is " +Hour);
		if(Hour<10) {
			CurrentHour =Integer.toString(Hour);
			CurrentHour = "0"+CurrentHour;
			return CurrentHour;
		}else {
			CurrentHour =Integer.toString(Hour);
			return CurrentHour;
		}
	}

	public static String GetCurrenMin() {

		DateFormat TimeHour = new SimpleDateFormat("hh mm a");
		Date TimeHour1 = new Date();
		String TimeHour2= TimeHour.format(TimeHour1);
		String min = TimeHour2.substring(3,5);
		int Min = Integer.parseInt(min);
		//Min = Min+1;
		System.out.println("Min hour is " +Min);
		if(Min<10) {
			CurrentMin =Integer.toString(Min);
			CurrentMin = "0"+CurrentMin;
			return CurrentMin;
		}else {
			CurrentMin =Integer.toString(Min);
			return CurrentMin;
		}
	}

	public static String GetAMorPM() {

		DateFormat TimeHour = new SimpleDateFormat("hh mm a");
		Date TimeHour1 = new Date();
		String TimeHour2= TimeHour.format(TimeHour1);
		String AMorPM = TimeHour2.substring(6);
		System.out.println(AMorPM);
		return AMorPM;
	}


	/*public static void ui_login() {
		driver=getDriver();
		driver.manage().window().maximize();
		driver.get(baseUrll);
	}*/

	/*public static void UI_login() {
		driver=getDriver();
		driver.manage().window().maximize();
		driver.get(baseUrll);
	}*/
	/*public static void BE_login() {
		driver=getDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}*/

	public static String PresentDate() {
		Calendar cal1 = Calendar.getInstance();
		cal1.add(Calendar.DAY_OF_MONTH, 0);
		PresentDate = CommonUtils.df.format(cal1.getTime());
		System.out.println(PresentDate);
		return PresentDate;
	}

	public  static boolean isFileDownloaded(String downloadPath, String fileName) {
		boolean flag = false;
		File dir = new File(downloadPath);
		File[] dir_contents = dir.listFiles();

		for (int i = 0; i < dir_contents.length; i++) {
			if (dir_contents[i].getName().equals(fileName))
				return flag=true;
		}

		return flag;
	}

	public static String getrandomString() {
		return RandomStringUtils.randomNumeric(6);


	}


}
