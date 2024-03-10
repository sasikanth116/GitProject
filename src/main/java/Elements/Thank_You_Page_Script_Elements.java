package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Thank_You_Page_Script_Elements {

	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='email']")
	public WebElement Existing_User_Email_Address;

	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='password']")
	public WebElement Existing_User_Password;

	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='accessCode']")
	public WebElement Existing_User_Access_Code;

	@FindBy(how = How.XPATH, using = "//*[text()='Submit']")
	public WebElement Existing_User_Submit;

	@FindBy(how = How.XPATH, using = "(//*[@name='selectType'])[2]")
	public WebElement Existing_User_Radio_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='mens/products']")
	public WebElement Home_Mens;
	
	@FindBy(how = How.XPATH, using = "//*[@id='watches/products']")
	public WebElement Watches;
	
	@FindBy(how = How.XPATH, using = "//*[@id='groceries/products']")
	public WebElement Groceries;

	@FindBy(how = How.XPATH, using = "(//*[@class='card-img-top'])[3]")
	public WebElement Home_Mens_First_Product;

	@FindBy(how = How.XPATH, using = "//*[@class='btn btn-primary btn-block prime-yellow-btn w-100']")
	public WebElement Add_To_Bag;

	@FindBy(how = How.XPATH, using = "//*[@class='btn btn-primary btn-block prime-yellow-btn w-100']")
	public WebElement Go_To_Bag;
	
	@FindBy(how = How.XPATH,using = "(//*[@class='price-tag text-start'])[1]//following::select[1]")
    public WebElement Quantity;

	@FindBy(how = How.XPATH, using = "//*[@id='btn-chkout']")
	public WebElement Proceed_To_check_Out;

	@FindBy(how = How.XPATH, using = "//*[@class='btn btn-outline-primary text-14 w-100 font-600 plus-icon']")
	public WebElement Add_New_Address;

	@FindBy(how = How.XPATH, using = "//*[@id='shipping-first-name']")
	public WebElement Add_New_Address_Receivers_Name;

	@FindBy(how = How.XPATH, using = "(//*[@id='shipping-address'])[2]")
	public WebElement Add_New_Address_Full_address;

	@FindBy(how = How.XPATH, using = "//*[@id='shipping-zip-code']")
	public WebElement Add_New_Address_Pincode;

	@FindBy(how = How.XPATH, using = "//*[@id='shipping-phone-number']")
	public WebElement Add_New_Address_Phone_No;

	@FindBy(how = How.XPATH, using = "//*[@id='viewcart']")
	public WebElement Bag_Icon;

	@FindBy(how = How.XPATH, using = "//*[@class='remove-icon']")
	public WebElement Product_Removal_From_Bag;

	@FindBy(how = How.XPATH, using = "//*[@class='btn btn-primary']")
	public WebElement Product_Removal_From_Bag_Yes;

	@FindBy(how = How.XPATH, using = "//*[text()='Save & use this address']")
	public WebElement Add_New_Address_Save;

	@FindBy(how = How.XPATH, using = "(//*[@name='markerType1'])[1]")
	public WebElement Choose_Address;

	@FindBy(how = How.XPATH, using = "//*[@class='col-lg-7 btn btn-primary p-2 prime-yellow-btn']")
	public WebElement Continue_To_Payment;

	@FindBy(how = How.XPATH, using = "//*[@id='netbanking']")
	public WebElement Net_Banking;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='wallet']")
	public WebElement Wallet;
	
	@FindBy(how = How.XPATH,using = "(//*[text()='Back'])[1]")
	public WebElement Cancel_transaction_btn;
	
	@FindBy(how = How.XPATH,using = "//*[text()='PAYMENT FAILURE']")
	public WebElement Payment_failure_msg;

	@FindBy(how = How.XPATH, using = "//*[text()='Make Payment']")
	public WebElement Make_Payment;

	@FindBy(how = How.XPATH, using = "(//*[text()='Back'])[1]")
	public WebElement Make_Payment_Back_Btn;
	@FindBy(how = How.XPATH, using = "//*[text()='PAYMENT FAILURE']")
	public WebElement Payment_Cancelled_Msg;
	
	@FindBy(how = How.XPATH, using = "(//*[text()='Airtel Money'])")
	public WebElement Net_Banking_Andra_Bank;

	@FindBy(how = How.XPATH, using = "(//*[text()='PROCEED'])[1]")
	public WebElement Net_Banking_Andra_Bank_Submit;
	
	@FindBy(how = How.XPATH, using = "//*[@id='OTP']")
	public WebElement EntetOTP;
	
	@FindBy(how = How.XPATH, using = "//*[@alt='close-circle']")
	public WebElement CloseReviewpopup;


	@FindBy(how = How.XPATH, using = "//*[@id='username']")
	public WebElement Net_Banking_Andra_Bank_UserID;

	@FindBy(how = How.XPATH, using = "//*[@id='password']")
	public WebElement Net_Banking_Andra_Bank_Password;

	@FindBy(how = How.XPATH, using = "//*[@class='cmn-btn otp-cmn-btn']")
	public WebElement Net_Banking_Andra_Bank_login_Btn;

	@FindBy(how = How.XPATH, using = "//*[@class='cmn-btn form-btn-space full-width btn-full']")
	public WebElement Simulate_Success_Btn;

	@FindBy(how = How.XPATH, using = "(//*[@class='left'])[1]")
	public WebElement Payment_Cancel_Arrow;

	@FindBy(how = How.XPATH, using = "//*[text()=' Thank you for Your order!']")
	public WebElement Thank_You_msg;

	// BACKEND

	@FindBy(how = How.XPATH, using = "(//*[text()='Site Activity'])[1]")
	public WebElement Home_Site_Activity;

	@FindBy(how = How.XPATH, using = "//*[text()='PG Failure Panel']")
	public WebElement Home_Pg_Failure_Panel;

	@FindBy(how = How.XPATH, using = "//*[@name='ctl00$ContentPlaceHolder1$txtSearch']")
	public WebElement Pg_Failure_Panel_Order_No;

	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ContentPlaceHolder1_btnSearch']")
	public WebElement Pg_Failure_Panel_Search_Btn_;

	@FindBy(how = How.XPATH, using = "(//*[@title='Order Number'])[1]")
	public WebElement Pg_Failure_Panel_Actual_Order_Number;
	
	@FindBy(how = How.XPATH, using = "//*[@title='COD']")
	public WebElement COD;


	@FindBy(how = How.XPATH, using = "//*[text()='Place Order']")
	public WebElement Place_Order;

	@FindBy(how = How.XPATH, using = "//*[text()='COD is not applicable for smartwatches and orders above ₹ 10000.']")
	public WebElement CODNotApplicable_msg;
	
	@FindBy(how = How.XPATH,using = "//*[text()='Yes']")
	public WebElement Yes;
	
	@FindBy(how = How.XPATH,using = "(//*[@class='remove-icon'])[1]")
	public WebElement Remove_btn;

	@FindBy(how = How.XPATH,using = "//*[@id='ctl00_ContentPlaceHolder1_btnSearch']")
	public WebElement Search_btn;
	
	@FindBy(how = How.XPATH,using = "//*[text()=' View More ']")
	public WebElement Viewmore;

	public Thank_You_Page_Script_Elements(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
}
