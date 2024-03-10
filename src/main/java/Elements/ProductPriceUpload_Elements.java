package Elements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPriceUpload_Elements {
	
	@FindBy(how = How.XPATH,using = "(//*[text()='Site Activity'])[1]")    
	public WebElement SiteActivity;
	
	@FindBy(how = How.XPATH,using = "//*[@id='ModuleManageInput']")    
	public WebElement SiteActivitysearchtextbox;
	
	@FindBy(how = How.XPATH,using = "//*[text()='Product Price Upload']")    
	public WebElement Product_Price_Uploadmodule;
	
	
	@FindBy(how = How.XPATH,using = "//*[text()='Product GST Upload']")    
	public WebElement Product_Gst_Uploadmodule;

	
	@FindBy(how = How.XPATH,using = "//*[text()='Product']")    
	public WebElement Product_module;


	
	
	@FindBy(how = How.XPATH, using = "//*[text()='Bestseller']")
	public WebElement New;
	
	@FindBy(xpath="//*[text()='Modules']")
	public WebElement Modules;
	
	@FindBy(how = How.XPATH,using = "//*[@name='sort']/option[4]")
	public WebElement newarrival;
	
	@FindBy(xpath="//*[@id='ModuleManageInput']")
	public WebElement Modulessearchtxt;
	
	@FindBy(how = How.XPATH,using = "//*[@id='ctl00_ContentPlaceHolder1_divSaveClose']")
	public WebElement SaveAndClose_btn;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='card-img-top'])[1]")
	public WebElement Home_Mens_First_Product;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='card-img-top'])[1]")
	public WebElement Home_Mens_First_Product2;
	
	
	@FindBy(how = How.XPATH,using = "//*[@id='ctl00_ContentPlaceHolder1_btnSearch']")    
	public WebElement searchbtn;
	
	@FindBy(how = How.XPATH,using = "//*[@id='ctl00_ContentPlaceHolder1_lnkbtnSubmit']")    
	public WebElement submitbtn;
	
	@FindBy(how = How.XPATH,using = "//*[@class='headding_text']")    
	public WebElement viewProduct_price_Uploadpage;
	
	@FindBy(how = How.XPATH,using = "(//*[@class='grid_color1'])")    
	public List<WebElement> ExistedRecords;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_lbtnSampleProductPriceUpload'])")    
	public  WebElement SampleFilebtn;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_lnkbtnAddEmployee'])")    
	public  WebElement AddProductpricebtn;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_lblAddProductGSTupload'])")    
	public  WebElement AddProductgstebtn;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_lblError'])")    
	public  WebElement FileexistsErrormsg;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_fudCourierMasterFile'])")    
	public  WebElement UploadFile;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_fuStockUpload'])")    
	public  WebElement UploadFileStock;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_chkIsPublish'])")    
	public  WebElement publish_checkbox;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_lnkbtnSave'])")    
	public  WebElement savebtn;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_lnkbtnClose'])")    
	public  WebElement closebtn;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_txtSearch'])")    
	public  WebElement searchbar;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_btnGo'])")    
	public  WebElement Gobtn;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='anchelp-icon'])")    
	public  WebElement Helpbtn;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_lbnNext'])")    
	public  WebElement Nextbtn;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_lbnLast'])")    
	public  WebElement DoubleNextbtn;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_lbnPrevious'])")    
	public  WebElement Previousbtn;
	
	@FindBy(how = How.XPATH,using = "(//*[@class='downarrow'])[2]")    
	public  WebElement DownArrowbtn;
	
	@FindBy(how = How.XPATH,using = "(//*[@class='uparrow'])[2]")    
	public  WebElement Uparrowbtn;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_lbnFirst'])")    
	public  WebElement DoublePreviousbtn;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_txtPage'])")    
	public  WebElement PageInputtext;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_txtPageSize'])")    
	public  WebElement RecordInputtext;
	
	@FindBy(how = How.XPATH,using = "(//*[@class='menuicon'])")    
	public  WebElement Toggle;
	
	
	
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_gvProductPriceUpload_ctl02_lnkOriginalFile'])")    
	public  WebElement Originalfilebtn;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_gvProductPriceUpload_ctl02_lnkDownloadSuccessDetail'])")    
	public  WebElement Successfilebnt;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_gvProductPriceUpload_ctl02_lnkDownloadError'])")    
	public  WebElement Errorfilebtn;
	
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_gvCourierUpload_ctl02_lnkOriginalFile'])")    
	public  WebElement Originalfilebtn2;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_gvCourierUpload_ctl02_lnkDownloadSuccessDetail'])")    
	public  WebElement Successfilebnt2;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_gvCourierUpload_ctl02_lnkDownloadError'])")    
	public  WebElement Errorfilebtn2;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_gvRefundInitiatedOrdersUpload_ctl02_lnkOriginalFile'])")    
	public  WebElement Originalfilebtn3;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_gvRefundInitiatedOrdersUpload_ctl02_lnkDownloadSuccessDetail'])")    
	public  WebElement Successfilebnt3;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_gvRefundInitiatedOrdersUpload_ctl03_lnkDownloadError'])")    
	public  WebElement Errorfilebtn3;
	
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_gvProductGSTUpload_ctl02_lnkOriginalFile'])")    
	public  WebElement Originalfilebtn4;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_gvProductGSTUpload_ctl02_lnkDownloadSuccessDetail'])")    
	public  WebElement Successfilebnt4;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_gvProductGSTUpload_ctl02_lnkDownloadError'])")    
	public  WebElement Errorfilebtn4;
	
	@FindBy(how = How.XPATH,using = "(//*[text()='Go To Main Menu'])")    
	public  WebElement Gotofilebtn;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_lblSuccess'])")    
	public  WebElement successmsg;
	
	@FindBy(how = How.XPATH,using = "(//*[@class='spndates total-records'])[1]")    
	public  WebElement TotalRecords;
	
	@FindBy(how = How.XPATH,using = "(//*[@class='spndates error-records'])[1]")    
	public  WebElement ErrorRecords;
	
	@FindBy(how = How.XPATH,using = "(//*[@class='spndates'])[1]")    
	public  WebElement UploadedDate_Time;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_rfvItemMasterFile'])[1]")    
	public  WebElement Errormsg_withoutfile;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_revItemMasterFile'])[1]")    
	public  WebElement InvalidFileErrormsg_withoutfile;
	
	@FindBy(how = How.XPATH,using = "(//*[@class='input-label-title'])[1]")    
	public  WebElement selectfile_wateramark;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_spnHeaders'])[1]")    
	public  WebElement uploadheaders_Instruction;
	
	@FindBy(how = How.XPATH,using = "(//*[@class='spndates'])[3]")    
	public  WebElement FileProcess_Status;

	
	@FindBy(how = How.XPATH,using = "(//*[@class='menuicon'])")    
	public  WebElement MenuPanel;
	
	@FindBy(how = How.XPATH,using = "(//*[text()='Go To Main Menu'])")    
	public  WebElement Mainmenu;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_uscHelp_tdHelp'])")    
	public  WebElement ViewHelp;

	
	@FindBy(how = How.XPATH,using = "//*[@id='ctl00_ContentPlaceHolder1_txtSearch']")    
	public WebElement product_search;
	
	@FindBy(how = How.XPATH,using = "//*[@id='ctl00_ContentPlaceHolder1_gvDeal_ctl02_lnkbtnEdit']")    
	public WebElement edit_btn;
	
	@FindBy(how = How.XPATH,using = "//*[@id='ctl00_ContentPlaceHolder1_gvInventory_ctl02_lnkbtnEdit']")    
	public WebElement InventoryEdit;
	
	@FindBy(how = How.XPATH,using = "//*[@id='ctl00_ContentPlaceHolder1_lbtnInventory']")    
	public WebElement ProuctInventoryTab;
	
	@FindBy(how = How.XPATH,using = "(//*[@class='grid_heading'])[2]/following::tr[1]/td[2]")    
	public WebElement MRPPRICE;
	
	@FindBy(how = How.XPATH,using = "(//*[@class='grid_heading'])[2]/following::tr[1]/td[3]")    
	public WebElement DiscountPRICE;
	
	@FindBy(how = How.ID,using = "ctl00_ContentPlaceHolder1_txtDiscount")    
	public WebElement DiscountPRICE_InventoryEditpage;
	
	@FindBy(how = How.XPATH,using = "//*[@id='ctl00_ContentPlaceHolder1_txtMRP']")    
	public WebElement MRPPRICE_InvenoryEditpage;
	
	@FindBy(how = How.XPATH,using = "(//*[@class='grid_heading'])[2]/following::tr[1]/td[4]")    
	public WebElement ONLINEPRICE;
	
	@FindBy(how = How.XPATH,using = "//*[@id='ctl00_ContentPlaceHolder1_txtOnlinePrice']")    
	public WebElement ONLINEPRICE_InventoryEditpage;
	
	@FindBy(how = How.XPATH,using = "//*[@id='ctl00_ContentPlaceHolder1_btnExtract']")    
	public WebElement downloadorder_btn;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_gvProductPriceUpload_ctl02_lnkDownloadBTErrorFile'])")    
	public  WebElement DownloadBTErrorfilebtn;
	
	@FindBy(how = How.XPATH,using = "(//*[@class='spndates'])[5]")    
	public  WebElement BTFileprocessstatus;
	
	@FindBy(how = How.XPATH,using = "(//*[@class='spndates'])[6]")    
	public  WebElement EmailSent;
	
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_txtOnlinePrice'])[1]")    
	public  WebElement OnlinePrice;
	
	@FindBy(how = How.XPATH,using = "//img[contains(@src,'/assets/images/header-icons/search-desktop.svg')]")
	public WebElement Search_icon;
	
	@FindBy(how = How.XPATH,using = "//*[@id='headerInput']")
	public WebElement Search_txt;
	
	@FindBy(how = How.XPATH,using = "//*[@id='ctl00_ContentPlaceHolder1_chkProductPublish']")
	public WebElement Publishcheckbox;
	
	@FindBy(how = How.XPATH,using = "//*[@id='ctl00_ContentPlaceHolder1_chkDiscontinued']")
	public WebElement Discontinuedcheckbox;
	
	@FindBy(how =  How.XPATH, using = "(//*[text()='Product Upload'])")
	public WebElement Productupload;
	
	@FindBy(how =  How.XPATH, using = "(//*[@id='ctl00_ContentPlaceHolder1_lnkbtnProductsUpload'])")
	public WebElement AddProductupload;
	
	@FindBy(how =  How.XPATH, using = "(//*[text()='Go To Main Menu'])")
	public WebElement GOTOMENU;
	
	@FindBy(how =  How.XPATH, using = "(//*[text()='Stock Upload'])")
	public WebElement Stockupload;
	
	@FindBy(how =  How.XPATH, using = "(//*[@id='ctl00_ContentPlaceHolder1_lnkbtnAddRefundInitiatedOrderUpload'])")
	public WebElement AddStockupload;
	
	@FindBy(how =  How.XPATH, using = "//*[@id='ctl00_ContentPlaceHolder1_spnHeaders']")
	public WebElement Weightmandatory;
	
	@FindBy(how =  How.XPATH, using = "(//*[text()='Product Image Bulk Upload'])")
	public WebElement ProductImageBulkUpload;
	
	
	@FindBy(how =  How.XPATH, using = "(//*[@id='ctl00_ContentPlaceHolder1_ddlUploadImageType'])")
	public WebElement ImageType;
	
	
	@FindBy(how =  How.XPATH, using = "(//*[@id='ctl00_ContentPlaceHolder1_FileUpload1'])")
	public WebElement UploadImage;
	
	@FindBy(how =  How.XPATH, using = "(//*[@id='ctl00_ContentPlaceHolder1_lnkSave'])")
	public WebElement Savebtn;
	
	@FindBy(how =  How.XPATH, using = "(//*[text()='IMAGE(S) HAS/HAVE BEEN IMPORTED SUCCESSFULLY.'])")
	public WebElement UploadSuccessmsg;
	
}
