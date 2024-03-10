package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class AdminElements {

	@FindBy(xpath = "//*[@title='Logout']")
	public WebElement Logout;

	@FindBy(how = How.XPATH, using = "//*[@id='txtUserName']")
	public WebElement Email;

	@FindBy(how = How.XPATH, using = "//*[@id='txtPassword']")
	public WebElement Password;

	@FindBy(how = How.XPATH, using = "//*[@id='lnkbtnLogin']")
	public WebElement Submit;

	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ContentPlaceHolder1_divSiteActivity']")
	public WebElement SiteActivity;

	@FindBy(xpath = "//*[@class='header-menuicon-siteactivity']")
	public WebElement SiteActivity1;

	@FindBy(how = How.XPATH, using = "//*[text()='Order Management']")
	public WebElement OrderManagement;

	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ContentPlaceHolder1_txtSearch']")
	public WebElement Searchbox;

	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ContentPlaceHolder1_btnSearch']")
	public WebElement Searchbutton;

	@FindBy(xpath = "//*[@title='Order Number']")
	public WebElement vieworder_Ordernumber;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_lblStoreOrderNumber")
	public WebElement OrderDetails_OrderNumber;

	@FindBy(how = How.XPATH, using = "(//*[@class='productexpand'])[1]")
	public WebElement PlusIcon;

	@FindBy(how = How.XPATH, using = "(//*[@class='productexpand'])[2]")
	public WebElement PlusIcon1;

	@FindBy(how = How.XPATH, using = "(//*[@class='dropdownlistclass'])[2]")
	public WebElement Statusdropdown;

	@FindBy(how = How.XPATH, using = "//*[text()='System Verified']")
	public WebElement SystemVerified;

	@FindBy(how = How.NAME, using = "ctl00$ContentPlaceHolder1$repStoreOrderDetails$ctl00$txtComments")
	public WebElement Comments;

	@FindBy(how = How.NAME, using = "ctl00$ContentPlaceHolder1$repStoreOrderDetails$ctl00$btnUpdateStatus")
	public WebElement Save;

	@FindBy(xpath = "//*[@class='arial_12']/input")
	public WebElement systemVerified_SelectAllCheckbox;

	@FindBy(xpath = "//*[text()='Yes']")
	public WebElement systemVerified_Yesbutton;

	@FindBy(xpath = "(//*[text()='No'])[2]")
	public WebElement systemVerified_Nobutton;

	@FindBy(xpath = "(//*[@class='popup-close'])2")
	public WebElement systemVerified_popupClose;

	@FindBy(how = How.XPATH, using = "//*[text()='Ready To Scan']")
	public WebElement ReadyToScan;

	@FindBy(how = How.XPATH, using = "(//*[@title='Store Invoice Date'])[2]")
	public WebElement InvoiceDate;

	@FindBy(xpath = "(//*[@class='imgCal'])[1]")
	public WebElement InvoiceDate_calender;

	@FindBy(xpath = "//*[contains(@class,'day selected today')]")
	public WebElement InvoiceCurrentDate;

	@FindBy(how = How.NAME, using = "ctl00$ContentPlaceHolder1$repStoreOrderDetails$ctl00$txtStoreInvoiceNumber")
	public WebElement InvoiceNumber;

	@FindBy(how = How.NAME, using = "ctl00$ContentPlaceHolder1$repStoreOrderDetails$ctl00$txtAWBNumber")
	public WebElement AwbNumber;

	@FindBy(css = "textarea[title*='Comments'][name*='ctl00$ContentPlaceHolder1$repStoreOrderDetails$ctl00$txtComments']")
	public WebElement ReadyToScan_comments;

	@FindBy(xpath = "(//*[@id='ctl00_ContentPlaceHolder1_lbnSaveClose'])")
	public WebElement SaveButton;

	// success message
	@FindBy(xpath = "//*[text()='OrderItem(s) updated successfully.']")
	public WebElement SystemVerified_SuccessMessage;

	@FindBy(how = How.XPATH, using = "(//*[@title='Close'])[2]")
	public WebElement Close;

	@FindBy(how = How.XPATH, using = "//*[text()='Go To Main Menu']")
	public WebElement GoToMenu;

	@FindBy(how = How.XPATH, using = "//*[text()='Print Invoice']")
	public WebElement PrintInvoice;

	@FindBy(xpath = "//*[@title='Search for Order Number']")
	public WebElement PrintInvoice_SearchForOrdernumber;

	@FindBy(xpath = "//*[text()='No items found']")
	public WebElement PrintInvoice_NoItemsFound;

	@FindBy(xpath = "//*[@title='Cancel Invoice']")
	public WebElement PrintInvoice_CancelInvoiceCheckBox;

	@FindBy(xpath = "//*[@title='Courier']")
	public WebElement PrintInvoice_CourierService;

	@FindBy(xpath = "//*[@title='Printed / NonPrinted']")
	public WebElement PrintInvoice_PrinedOrNonprinted;

	@FindBy(xpath = "//*[@title='From Date']")
	public WebElement PrintInvoice_FromDate;

	@FindBy(xpath = "(//*[@class='input-label-title'])[4]")
	public WebElement PrintInvoice_FromDate_label;

	@FindBy(xpath = "(//*[contains(@class,'button')]/div)[11]")
	public WebElement PrintInvoice_FromDate_prevyear;

	@FindBy(xpath = "(//tr[contains(@class,'headrow')])[2]/td[1]/div")
	public WebElement PrintInvoice_FromDate_prevyear1;

	@FindBy(xpath = "(//*[contains(@class,'button')]/div)[14]")
	public WebElement PrintInvoice_FromDate_Nextyear;

	@FindBy(xpath = "//*[contains(@class,'day selected today')]")
	public WebElement PrintInvoice_FromDate_day;

	// error message
	@FindBy(xpath = "//*[text()='From date should not be greater than current date.']")
	public WebElement PrintInvoice_FromDate_ErorMessage;

	@FindBy(xpath = "//*[@title='To Date']")
	public WebElement PrintInvoice_ToDate;

	@FindBy(xpath = "(//*[@class='imgCal'])[2]")
	public WebElement PrintInvoice_ToDate_calender;

	@FindBy(xpath = "//*[contains(@class,'day selected today')]")
	public WebElement PrintInvoice_ToDate_Currentday;

	@FindBy(xpath = "(//*[contains(@class,'button')]/div)[24]")
	public WebElement PrintInvoice_ToDate_prevyear;

	@FindBy(xpath = "(//*[contains(@class,'button')]/div)[28]")
	public WebElement PrintInvoice_ToDate_Nextyear;

	@FindBy(xpath = "(//*[contains(@class,'day selected')])[3]")
	public WebElement PrintInvoice_ToDate_day;

	// error message
	@FindBy(xpath = "//*[text()='To date should be greater than or equal to start date.']")
	public WebElement PrintInvoice_ToDate_ErorMessage1;

	@FindBy(xpath = "//*[text()='To date should not be greater than the current date.']")
	public WebElement PrintInvoice_ToDate_ErorMessage2;

	@FindBy(xpath = "//*[@title='Order Status']")
	public WebElement PrintInvoice_state;

	@FindBy(xpath = "//*[text()='Search']")
	public WebElement PrintInvoice_SearchButton;

	@FindBy(xpath = "//*[text()='Clear All']")
	public WebElement PrintInvoice_ClearAllButton;

	@FindBy(xpath = "//*[@title='Print Invoice']")
	public WebElement PrintInvoiceButton;

	@FindBy(xpath = "(//*[@title='Select'])[2]/input")
	public WebElement PrintInvoice_SelectCheckbox;

	@FindBy(xpath = "//*[@title='Page Number']")
	public WebElement PrintInvoice_pages_TextBox;

	@FindBy(xpath = "(//*[@class='uparrow'])[1]")
	public WebElement PrintInvoice_pages_Uparrow;

	@FindBy(xpath = "(//*[@class='downarrow'])[1]")
	public WebElement PrintInvoice_Pages_DownArrow;

	@FindBy(xpath = "//*[@title='Previous ']")
	public WebElement PrintInvoice_pages_previous;

	@FindBy(xpath = "//*[@title='Next ']")
	public WebElement PrintInvoice_pages_Next;

	@FindBy(xpath = "//*[@title='First']")
	public WebElement PrintInvoice_pages_FirstPage;

	@FindBy(xpath = "//*[@title='last']")
	public WebElement PrintInvoice_pages_LastPage;

	@FindBy(xpath = "//*[@title='PageSize']")
	public WebElement PrintInvoice_Items_TextBox;

	@FindBy(xpath = "(//*[@class='uparrow'])[2]")
	public WebElement PrintInvoice_items_UpArrow;

	@FindBy(xpath = "(//*[@class='downarrow'])[2]")
	public WebElement PrintInvoice_Items_DownArrow;

	@FindBy(xpath = "//*[@title='Go']")
	public WebElement PrintInvoice_GoButton;

	@FindBy(xpath = "//*[contains(@class,'tbl-alink')]")
	public WebElement printInvoice_OrderNumber;

	@FindBy(xpath = "//*[text()='Cancel Entire Order']")
	public WebElement CancelEntireOrder;

	@FindBy(xpath = "(//*[@title='Reason'])[2]")
	public WebElement Cancelorder_Reason;

	@FindBy(xpath = "//*[@title='Reason Remarks']")
	public WebElement Cancelorder_ReasonRemarks;

	@FindBy(xpath = "(//*[text()='Manyavar'])[5]")
	public WebElement Cancelorder_ManyavarButton;

	@FindBy(xpath = "(//*[@title='Customer'])[3]")
	public WebElement Cancelorder_CustomerButton;

	@FindBy(id = "ctl00_ContentPlaceHolder1_repStoreOrderDetails_ctl00_hlInvoicePdf")
	public WebElement pdfIcon;

	@FindBy(how = How.ID, using = "AiteActivityManageInput")
	public WebElement Searchbox1;

	@FindBy(how = How.XPATH, using = "//*[text()='Scan Invoice Before Manifest']")
	public WebElement ScanInvoiceBeforeManifest;

	@FindBy(how = How.XPATH, using = "//*[@class='menuicon']")
	public WebElement MenuinScanInvoiceBeforeManifest;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_lnkbtnAddRTSScanUpload")
	public WebElement RTSscanUploadinScanInvoiceBeforeManifest;

	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ContentPlaceHolder1_RTSScanType_0']")
	public WebElement SingleAWBNumberinScanInvoiceBeforeManifest;

	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ContentPlaceHolder1_ddlPartner']")
	public WebElement PartnerinScanInvoiceBeforeManifest;

	@FindBy(how = How.XPATH, using = "//*[text()='CSM']")
	public WebElement CSMPartnerinScanInvoiceBeforeManifest;

	@FindBy(how = How.NAME, using = "ctl00$ContentPlaceHolder1$txtAWBNumber")
	public WebElement AWBnumberinScanInvoiceBeforeManifest;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_lnkbtnSave")
	public WebElement SaveinScanInvoiceBeforeManifest;

	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ContentPlaceHolder1_lblSuccess']")
	public WebElement Success;

	@FindBy(how = How.XPATH, using = "//*[text()='Trigger Manifest']")
	public WebElement TriggerManifestmodule;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_gvInVoiceOrders_ctl02_chkInvoice")
	public WebElement SelectCheckbox;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_lnkTriggerManifest")
	public WebElement TriggerManifestbutton;

	@FindBy(how = How.XPATH, using = "//*[text()='Shipped']")
	public WebElement Shipped;

	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ContentPlaceHolder1_lblupdatemsg']")
	public WebElement SuccessinOMS;

	@FindBy(how = How.XPATH, using = "//*[text()='Delivered']")
	public WebElement Delivered;
	
	//Filters
	
	@FindBy(xpath="//*[@class='header-menuicon-modules']")
	public WebElement Modules;
	
	
	
	@FindBy(xpath="//*[@id='ModuleManageInput']")
	public WebElement Modulestextsearch;
	
	@FindBy(xpath="//*[text()='Filters']")
	public WebElement Filters;
	
	@FindBy(xpath="//*[@class='headding_text']")
	public WebElement ViewFiltersPAge;
	
	@FindBy(xpath="//*[@title='Search Filter']")
	public WebElement ViewFilterspage_SearchInputField;
	
	@FindBy(xpath="(//*[@class='submitbtn'])[1]")
	public WebElement ViewFiltersPage_SearchButton;
	
	@FindBy(xpath="//*[@class='view-pro-details noviewimg']")
	public WebElement ViewFilterspage_FilterDetails;
	
	@FindBy(xpath="(//*[@class='noRecords'])[2]")
	public WebElement ViewFiltersPage_NoFiltersAvailableErrMsg;
	
	@FindBy(xpath="(//*[@class='submitbtn'])[2]")
	public WebElement ViewFiltersPage_gobutton;
	
	@FindBy(xpath="//*[@class='icon-edit']")
	public WebElement ViewFiltersPage_EditIcon;
	
	@FindBy(xpath="//*[text()='Edit Filter']")
	public WebElement EditFilterpage;
	
	@FindBy(xpath="//*[@title='Publish']/input")
	public WebElement EditFilterPage_PublishCheckBox;
	
	@FindBy(xpath="//*[@title='Filter Name']")
	public WebElement EditFilterPage_FilterNameField;
	
	@FindBy(xpath="(//*[@class='input-label-title'])[1]")
	public WebElement EditFilterpage_FilterNameFieldLabel;
	
	@FindBy(xpath="//*[@title='Filter Code']")
	public WebElement EditFilterPage_FilterCodeField;
	
	@FindBy(xpath="(//*[@class='input-label-title'])[2]")
	public WebElement EditFilterPage_FilterCodeFieldLabel;
	
	@FindBy(xpath="//*[@title='Save']")
	public WebElement Filters_SaveButton;
	
	@FindBy(xpath="//*[@class='save_close']")
	public WebElement Filters_SaveandCloseButton;
	
	@FindBy(xpath="//*[@class='close_icon']")
	public WebElement Filters_CloseButton;
	
	@FindBy(xpath="//*[@title='Filter Options']")
	public WebElement EditFilterPage_FilteroptionsButton;
	
	@FindBy(xpath="//*[text()='Add Filter Option']")
	public WebElement AddfilterOptionPage;
	
	@FindBy(xpath="//*[@title='Filter Option']")
	public WebElement AddFilterOption_FilterOptionField;
	
	@FindBy(xpath="//*[@class='submitbtn']")
	public WebElement AddFilterOption_SubmitButton;
	
	@FindBy(xpath="//*[@class='submitbtn btn-clear']")
	public WebElement AddFilterOption_ClearButton;
	
	@FindBy(xpath="//*[@title='Published']")
	public WebElement Addfilteroption_published;
	
	@FindBy(xpath="//*[@title='Published']")
	public WebElement Addfilteroption_Unpublished;
	
	@FindBy(xpath="//*[@class='icon-edit']")
	public WebElement Addfilteroption_EditIcon;
		
	@FindBy(xpath="//*[@class='icon-delete']")
	public WebElement Addfilteroption_DeleteIcon;
	
	@FindBy(xpath="//*[@class='SuccessMsg']")
	public WebElement Addfilteroption_Successmesage;
	
	@FindBy(xpath="//*[@class='icon-delete']")
	public WebElement EditFilterPage_DeleteIcon;
	
	@FindBy(xpath="//*[@class='SuccessMsg']")
	public WebElement EditFilterPage_Successmesage;
	
	@FindBy(xpath="(//*[@class='icon-delete'])[4]")
	public WebElement ViewFiltersPage_Deleteicon;
	
	@FindBy(xpath="//*[@title='Add Filter']")
	public WebElement ViewFiltersPage_AddFilterButton;
	
	@FindBy(xpath="//*[text()='Add Filter']")
	public WebElement AddFilterPage;
	
	@FindBy(xpath="//*[@class='input-label-title']")
	public WebElement AddFilterPage_FilterNameLabel;
	
	@FindBy(xpath="//*[@title='Filter Name']")
	public WebElement AddFilterPage_FilterNameField;
	
	@FindBy(xpath="//*[text()='Enter a Filter name.']")
	public WebElement AddFilterPage_EnterFilterNameErrMsg;
	
	@FindBy(xpath="//*[text()='Filter with same name Already exists.']")
	public WebElement AddFilterPage_FilterAlreadyExistsErrMsg;
	
	@FindBy(xpath="//*[@class='SuccessMsg']")
	public WebElement AddfilterPage_SuccessMessage;
	
	@FindBy(xpath="//*[@title='Filter Options']")
	public WebElement AddFilterPage_FilterOptionsButton;
	
	@FindBy(xpath="//*[text()='Filter Option *']")
	public WebElement AddFilterPage_FilterOptionlabel;
	
	@FindBy(xpath="//*[@title='Filter Option']")
	public WebElement AddFilterPage_FilterOptionField;
	
	@FindBy(xpath="//*[text()='Filter option already exist(s)!']")
	public WebElement Addfilterpage_FilterOptionFieldErrMsg;
	
	@FindBy(xpath="//*[@title='Page Number']")
	public WebElement ViewFilterPage_pgenumberfield;
	
	@FindBy(xpath="(//*[@class='downarrow'])[1]")
	public WebElement ViewFiltersPage_PageNumber_DownArrow;
	
	@FindBy(xpath="(//*[@class='uparrow'])[1]")
	public WebElement ViewFiltersPage_PageNumber_UpArrow;
	
	@FindBy(xpath="//*[@title='Previous ']")
	public WebElement ViewFiltersPage_PageNumber_Prev;
	
	@FindBy(xpath="//*[@title='Next ']")
	public WebElement ViewFiltersPage_PageNumber_Next;
	
	@FindBy(xpath="//*[@title='Last']")
	public WebElement ViewFiltersPage_PageNumber_LastPage;
	
	@FindBy(xpath="//*[@title='First']")
	public WebElement ViewFiltersPage_PageNumber_Firstpage;
	
	@FindBy(xpath="//*[@title='Page Size']")
	public WebElement ViewFiltersPage_ItemsNumberField;
	
	@FindBy(xpath="(//*[@class='downarrow'])[2]")
	public WebElement ViewFiltersPage_ItemsNumber_DownArrow;
	
	@FindBy(xpath="(//*[@class='uparrow'])[2]")
	public WebElement ViewFiltersPage_ItemsNumber_UpArrow;

	@FindBy(xpath="//*[text()='Product']")
	public WebElement Product;
	
	@FindBy(xpath="//*[@class='headding_text']")
	public WebElement ViewProductspage;
	
	@FindBy(xpath="//*[@class='tab-smallheading']")
	public WebElement productname;
	
	@FindBy(xpath="//*[@title='General']")
	public WebElement ViewProducts_GeneralButton;
	
	@FindBy(xpath="//*[@title='Filters']")
	public WebElement ViewProducts_FiltersButton;
	
	@FindBy(xpath="(//*[@class='icon-edit'])[2]")
	public WebElement ViewProducts_EditButton;
	
	@FindBy(xpath="//*[@class='ParentNode']")
	public WebElement ViewProducts_AllfiltersHierarchy;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_tvAttributest277")
	public WebElement ViewProducts_FilterAddedVisible;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_tvAttributesn2CheckBox")
	public WebElement ViewProducts_FirstFilterCheckBox;
	
	//Category;
	
	@FindBy(xpath="//*[text()='Category']")
	public WebElement Category;
	
	@FindBy(xpath="//*[@class='headding_text']")
	public WebElement ViewCategoryPage;
	
	@FindBy(xpath="//*[@title='Add Category']")
	public WebElement ViewCategory_AddCategoryButton;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_chkIsPublish")
	public WebElement ViewCategory_PublishCheckBox;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_chkFreebieCategory")
	public WebElement ViewCategory_FreebieCategoryCheckBox;
	
	@FindBy(xpath="//*[@title='Category Name']")
	public WebElement ViewCategory_CategoryNameField;
	
	@FindBy(xpath="//*[@title='Third Party Number']")
	public WebElement ViewCategory_ThirdPartynumberField;
	
	@FindBy(xpath="//*[@title='Category Section Type']")
	public WebElement ViewCategory_CategorySectionTypeDropDown;
	
	@FindBy(xpath="//*[@title='Category']")
	public WebElement ViewCategory_CategoryDropDown;
	
	@FindBy(xpath="//*[@title='Sub Category']")
	public WebElement ViewCategory_SubCategoryDropDown;
	
//	@FindBy(xpath="//*[@title='Gender']")
//	public WebElement ViewCategory_GenderDropDown;
	
	@FindBy(xpath="(//*[@title='Gender']/div)[2]")
	public WebElement ViewCategory_GenderDropDown;
	
	@FindBy(xpath="//*[@id='ctl00_ContentPlaceHolder1_cblStore_0']")
	public WebElement ViewCategory_GenderDropDown_Kids;
	
	@FindBy(xpath="(//*[@title='Close'])[3]")
	public WebElement ViewCategory_GenderDropDownCloseButton;
	
	@FindBy(xpath="//*[@title='Clothing Type']")
	public WebElement ViewCategory_ClothingTypeDroPDown;
	
	@FindBy(xpath="//*[@title='Meta Title']")
	public WebElement ViewCategory_MetaTitleField;
	
	@FindBy(xpath="//*[@title='Meta Keywords']")
	public WebElement ViewCategory_MetaKeywordField;
	
	@FindBy(xpath="//*[@title='Meta Description']")
	public WebElement ViewCategory_MetaDescriptionField;
	
	@FindBy(xpath="//*[@title='Google Category']")
	public WebElement ViewCategory_GoogleCategoryField;
	
	@FindBy(xpath="//*[@title='H1 Tag']")
	public WebElement ViewCategory_HiTagField;
	
	@FindBy(xpath="//*[@class='SuccessMsg']")
	public WebElement ViewCategory_SuccessMessage;
	
	@FindBy(xpath="//*[@class='SuccessMsg']")
	public WebElement AddCategory_CategoryInsertedSuccessMsg;
	
	//errorMessages
	@FindBy(xpath="//*[@title='Enter category name.']")
	public WebElement ViewCategory_EnterCategoryNameFieldErrMsg;
	
	@FindBy(xpath="//*[text()='Select category section type.']")
	public WebElement ViewCategory_CategorySectionTypeFieldErrMsg;
	
	@FindBy(xpath="//*[@title='Select gender.']")
	public WebElement ViewCategory_GenderFieldErrMsg;
	
	@FindBy(xpath="//*[text()='Select clothing type.']")
	public WebElement ViewCategory_ClothingTypeFieldErrMsg;
	
	@FindBy(xpath="//*[text()='Third party number already exists.']")
	public WebElement ViewCategory_ThirdPartyNumberFieldErrMsg;
	
	@FindBy(xpath="//*[text()='Category name already exists.']")
	public WebElement ViewCategory_CategoryNameFieldErrMsg;
	//
	@FindBy(xpath="//*[@title='Sizes']")
	public WebElement AddCategory_SelectSizeButton;
	
	@FindBy(xpath="")
	public WebElement AddCategory_SelectSizePage; 
	
	@FindBy(xpath="//*[@title='NoSize']/input")
	public WebElement AddCategory_Selectsize_nosize;
	
	@FindBy(xpath="//*[@title='FreeSize']/input")
	public WebElement AddCategory_Selectsize_Freesize;
	
	@FindBy(xpath="(//*[@title='Min CM'])[1]")
	public WebElement Addcategory_SelectSize_MinCMField;
	
	@FindBy(xpath="(//*[@title='Min CM'])[3]")
	public WebElement Addcategory_SelectSize_MinCMField1;
	
	@FindBy(xpath="(//*[@title='Max CM'])[1]")
	public WebElement Addcategory_SelectSize_MaxCMField;
	
	@FindBy(xpath="(//*[@title='Max CM'])[3]")
	public WebElement Addcategory_SelectSize_MaxCMField1;
	
	@FindBy(xpath="(//*[@title='Min Inch'])[29]")
	public WebElement Addcategory_SelectSize_MinInchField;
	
	@FindBy(xpath="(//*[@title='Max Inch'])[29]")
	public WebElement Addcategory_SelectSize_MaxInchField;
	
	@FindBy(xpath="(//*[text()='Enter MinCM.'])[55]")
	public WebElement Addcategory_SelectSize_EnterMinCMErrmsg;
	
	@FindBy(xpath="(//*[text()='Enter MaxCM.'])[55]")
	public WebElement Addcategory_SelectSize_EnterMaxCMErrmsg;
	
	@FindBy(xpath="(//*[text()='Enter MinInch.'])[28]")
	public WebElement Addcategory_SelectSize_EnterMinInchErrmsg;
	
	@FindBy(xpath="(//*[text()='Enter MaxInch.'])[28]")
	public WebElement Addcategory_SelectSize_EnterMaxInchErrmsg;
	
	@FindBy(xpath="(//div[@class='col-xs-12 formItem']/span[3])[167]")
	public WebElement AddCategory_SelectSize_MinCMErrMsg;
	
	@FindBy(xpath="(//div[@class='col-xs-12 formItem']/span[4])[85]")
	public WebElement AddCategory_SelectSize_MaxCMErrMsg;
	
	@FindBy(xpath="(//div[@class='col-xs-12 formItem']/span[3])[168]")
	public WebElement AddCategory_SelectSize_MaxCMshouldbeGreaterthanMinCMErrMsg;
	
	@FindBy(xpath="(//div[@class='col-xs-12 formItem']/span[3])[169]")
	public WebElement AddCategory_SelectSize_MinInchErrMsg;
	
	@FindBy(xpath="(//div[@class='col-xs-12 formItem']/span[4])[86]")
	public WebElement AddCategory_SelectSize_MaxinchErrMsg;
	
	@FindBy(xpath="(//div[@class='col-xs-12 formItem']/span[3])[170]")
	public WebElement AddCategory_SelectSize_MaxInchshouldbeGreaterthanMinInchErrMsg;
	
	@FindBy(xpath="//*[text()='Please select at least one gender.']")
	public WebElement AddCategory_SelectSize_Errormessage;
	
	@FindBy(xpath="(//*[@title='Submit'])[1]")
	public WebElement AddCategory_SelectSize_SubmitButton;
	
	@FindBy(xpath="//*[@class='SuccessMsg']")
	public WebElement AddCategory_SelectSize_Successmessage;
	
	@FindBy(xpath="//*[@title='Facets']")
	public WebElement AddCategory_FacetsButton;
	
	@FindBy(xpath="//*[@class='headding_text']")
	public WebElement AddCategory_Facetspage;
	
	@FindBy(xpath="//*[@class='SuccessMsg']")
	public WebElement AddCategory_Facets_Successmessage;

	@FindBy(xpath="//*[@title='As Shown']/input")
	public WebElement AddCategory_Facets_OccassionCheckBox;
	
	@FindBy(xpath="//*[@title='AsShowns']/input")
	public WebElement AddCategory_Facets_WashCareCheckBox;
	
	@FindBy(xpath="(//*[@title='Submit'])[1]")
	public WebElement AddCategory_Facets_SubmitButton;
	
	@FindBy(xpath="//*[@title='Images']")
	public WebElement AddCategory_Imagesbutton;
	
	@FindBy(xpath="//*[@class='headding_text']")
	public WebElement AddCategory_ImagesPage;
	
	@FindBy(xpath="//*[@title='Container Type']")
	public WebElement AddCategory_ImagesPage_ContainerTypeField;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_MenuImageUpload_chkIsPublished")
	public WebElement AddCategory_ImagesPage_PublishCheckbox;
	
	@FindBy(xpath="//*[@class='SuccessMsg']")
	public WebElement AddCategory_ImagesPage_Successmessage;
	
	@FindBy(xpath="//*[@title='Product Display Conditions']")
	public WebElement AddCategory_productDisplayConditionsButton;
	
	@FindBy(xpath="//*[@class='headding_text']")
	public WebElement AddCategory_productDisplayConditionspage;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptDisplaySizes_ctl01_dtlDisplaySizes_ctl00_chkDisplaySize")
	public WebElement AddCategory_productDispalyConditionCheckbox;
	
	@FindBy(xpath="//*[@title='Min Active Sizes']")
	public WebElement AddCategory_ProductDisplayCondition_MinActiveSizesField;
	
	@FindBy(xpath="(//*[@title='Submit'])[4]")
	public WebElement AddCategory_ProductDispalyConditions_SubmitButton;
	
	@FindBy(xpath="//*[@class='SuccessMsg']")
	public WebElement AddCategory_ProductDispalyConditions_Successmessage;
	
	
	@FindBy(xpath="//*[@title='Sort Category']")
	public WebElement ViewCategory_SortCategoryButton;
	
	@FindBy(xpath="//*[@class='textfield_tfsearch']")
	public WebElement ViewCategory_SearchInputField;
	
	@FindBy(xpath="(//*[@class='search_btn'])[1]")
	public WebElement ViewCategory_SearchButton;
	
	@FindBy(xpath="(//*[@class='search_btn'])[2]")
	public WebElement ViewCategory_ExtractButton;
	
	@FindBy(xpath="//*[@class='go_btn']")
	public WebElement ViewCategory_GoButton;
	
	@FindBy(xpath="//*[@title='Page Size']")
	public WebElement ViewCategory_ItemsTextField;
	
	@FindBy(xpath="//*[@class='noRecords']")
	public WebElement ViewCategory_NocategorysAvailabelErrMsg;
	
	@FindBy(xpath="//*[@class='gridveiw-block']")
	public WebElement ViewCategory_CategoryDetails;
	
	@FindBy(xpath="(//*[@class='icon-edit'])[1]")
	public WebElement ViewCategory_EditIcon;
	
	@FindBy(xpath="(//img[@src='images/delete.gif'])[1]")
	public WebElement Deletebtn;
	
	
	@FindBy(xpath="(//*[@class='icon-delete'])[1]")
	public WebElement ViewCategory_DeleteIcon;
	
	@FindBy(xpath="//*[@class='warning']")
	public WebElement ViewCategory_DeleteWarningMessage;
	
	@FindBy(xpath="//*[@id='ctl00_ContentPlaceHolder1_lbntEntireCancel']")
	public WebElement CancelEntire;
	
	@FindBy(xpath="//*[@id='ctl00_ContentPlaceHolder1_lbntEntireModification']")
	public WebElement ModifyEntire;
	
	@FindBy(xpath="//*[@id='ctl00_ContentPlaceHolder1_lnkCancelOrderItems']")
	public WebElement CancelSelected;
	
	@FindBy(xpath="//*[@id='ctl00_ContentPlaceHolder1_lnkModifyOrderItems']")
	public WebElement ModifySelected;
	
	@FindBy(xpath="(//*[text()='Select atleast one modify item.'])[1]")
	public WebElement Selectitemerrmsg;
	
	@FindBy(xpath="//*[@id='ctl00_ContentPlaceHolder1_ddlExchangeReasons']")
	public WebElement Reasons;
	
	@FindBy(xpath="//*[@id='ctl00_ContentPlaceHolder1_lbtnEntireRetunnProcessTypeKK']")
	public WebElement wsi;
	
	@FindBy(xpath="//*[@id='ctl00_ContentPlaceHolder1_lbtnEntireReturnProcessTypeCustomer']")
	public WebElement Customer;
	
	@FindBy(xpath="(//*[@class='popup-close'])[6]")
	public WebElement closepopup;
	
	@FindBy(xpath="(//*[contains(text(),'Select reason.')])[6]")
	public WebElement Selectreasonerrmsg;
	
	@FindBy(xpath="//*[@id='ctl00_ContentPlaceHolder1_repStoreOrderDetailsForExchange_ctl00_ancDealTitle']")
	public WebElement Itemtitle;
	
	@FindBy(xpath="//*[@id='ctl00_ContentPlaceHolder1_repStoreOrderDetailsForExchange_ctl00_lblStoreProductPrice']")
	public WebElement Itemprize;
	
	@FindBy(xpath="//*[@id='ctl00_ContentPlaceHolder1_repStoreOrderDetailsForExchange_ctl00_ddlExchangedSize']")
	public WebElement Itemsize;
	
	@FindBy(xpath="//*[@id='ctl00_ContentPlaceHolder1_lnkExchange']")
	public WebElement Yesbtn;
	
	@FindBy(xpath="(//*[@class='popup-close'])[2]")
	public WebElement closepopup2;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ContentPlaceHolder1_lnkCategoryContentBox']")
	public WebElement CategoryContentboxtab;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ContentPlaceHolder1_lbtnSaveContentBoxes']")
	public WebElement Submitcategorycontent;
	
	@FindBy(how = How.XPATH,using = "//*[text()='Category Content Box(s) updated successfully.']")
	public WebElement CategpryContentboxsuccessmsg;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='ctl00_ContentPlaceHolder1_chkAdditionalBoxPublish'])[1]")
	public WebElement Publishcontent;
	
	@FindBy(how = How.XPATH,using = "(//*[@id='CE_ctl00_ContentPlaceHolder1_ceAdditionslBoxes_ID_Frame'])")
	public WebElement Descriptioncontent;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ContentPlaceHolder1_BtnAdditionalBoxContent']")
	public WebElement Submitcontentcontent;
	
	@FindBy(how = How.XPATH,using = "//*[text()='Content Content INSERTED SUCESSFULLY']")
	public WebElement CategpryContentinsertsuccessmsg;
	
	@FindBy(how = How.XPATH,using = "//img[contains(@src,'/assets/images/header-icons/search-desktop.svg')]")
	public WebElement Search_icon;
	
	@FindBy(how = How.XPATH,using = "//*[@id='headerInput']")
	public WebElement Search_txt;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='card-img-top'])[1]")
	public WebElement Home_Mens_First_Product;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='viewData f-gold text-decoration-underline'])[1]")
	public WebElement viewmore;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ContentPlaceHolder1_txtImagesCode']")
	public WebElement CategoryImagecode;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ContentPlaceHolder1_ddlCategoryType']")
	public WebElement CategoryType;

	
}
