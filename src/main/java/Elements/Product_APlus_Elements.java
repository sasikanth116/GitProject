package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Product_APlus_Elements {
	
	@FindBy(how =  How.XPATH, using = "(//*[text()='Product Image Bulk Upload'])")
	public WebElement ProductImageBulkUpload;
	
	
	@FindBy(how =  How.XPATH, using = "(//*[@id='ctl00_ContentPlaceHolder1_ddlUploadImageType'])")
	public WebElement ImageType;
	
	
	@FindBy(how =  How.XPATH, using = "(//*[@id='ctl00_ContentPlaceHolder1_FileUpload1'])")
	public WebElement UploadImage;
	
	@FindBy(how =  How.XPATH, using = "(//*[@id='ctl00_ContentPlaceHolder1_lnkSave'])")
	public WebElement Savebtn;
	
	@FindBy(how =  How.XPATH, using = "(//*[text()='(Upload image with width between 1500 and 1920 px)'])")
	public WebElement UploadMandatoryNotetext;
	
	@FindBy(how =  How.XPATH, using = "(//*[text()='Mininum 1 file has to be selected.'])")
	public WebElement Min1fileErrormsg;
	
	@FindBy(how =  How.XPATH, using = "(//*[text()='Please upload image with width between 1500 and 1920 px'])")
	public WebElement InvalidfileformattErrormsg;
	
	
	@FindBy(how =  How.XPATH, using = "(//*[text()='Please upload jpg or bmp or gif or jpeg images only.'])")
	public WebElement InvalidfileErrormsg;
	
	
	@FindBy(how =  How.XPATH, using = "(//*[text()='Select image type.'])")
	public WebElement BlankimagetypeErrormsg;
	
	@FindBy(how =  How.XPATH, using = "(//*[text()='IMAGE(S) HAS/HAVE BEEN IMPORTED SUCCESSFULLY.'])")
	public WebElement UploadSuccessmsg;
	
	@FindBy(how =  How.XPATH, using = "(//*[text()='Product Upload'])")
	public WebElement Productupload;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_lnkbtnClose'])")    
	public  WebElement closebtn;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_txtSearch'])")    
	public  WebElement searchbar;
	
	@FindBy(how = How.XPATH,using = "//*[@id='ctl00_ContentPlaceHolder1_btnSearch']")    
	public WebElement searchbtn;
	
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_gvProductPriceUpload_ctl02_lnkOriginalFile'])")    
	public  WebElement Originalfilebtn;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_gvProductPriceUpload_ctl02_lnkDownloadSuccessDetail'])")    
	public  WebElement Successfilebnt;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_gvProductPriceUpload_ctl02_lnkDownloadError'])")    
	public  WebElement Errorfilebtn;
	
	@FindBy(how =  How.XPATH, using = "(//*[@id='ctl00_ContentPlaceHolder1_lnlViewUpdateProductsUpload'])")
	public WebElement UpdateProductupload;
	
	@FindBy(how =  How.XPATH, using = "(//*[@id='ctl00_ContentPlaceHolder1_lnkbtnAddEmployee'])")
	public WebElement AddUpdateProductupload;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_lnkbtnSave'])")    
	public  WebElement savebtn;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_lblSuccess'])")    
	public  WebElement successmsg;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_fudCourierMasterFile'])")    
	public  WebElement UploadFile;
	
	@FindBy(how =  How.XPATH, using = "(//*[@id='ctl00_ContentPlaceHolder1_lblClose'])")
	public WebElement Closebtn;
	

	
	@FindBy(xpath="//*[text()='Modules']")
	public WebElement Modules;
	
	@FindBy(xpath="//*[@id='ModuleManageInput']")
	public WebElement Modulessearchtxt;
	
	
	@FindBy(how = How.XPATH,using = "(//*[@alt='header-search'])[1]")
	public WebElement Search_icon;

	@FindBy(how = How.XPATH,using = "//*[@id='headerInput']")
	public WebElement Search_txt;
	
	
	@FindBy(how = How.XPATH, using = "(//*[@class='card-img-top'])[1]")
	public WebElement Home_Mens_First_Product;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='col-12 mt-lg-0 mt-2'])/a[1]/picture/img")
	public WebElement AplusimageUI;
	

}
