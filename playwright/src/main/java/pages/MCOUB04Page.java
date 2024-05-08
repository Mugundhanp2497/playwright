package pages;
import filereader.ExcelReader;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.aventstack.extentreports.Status;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import utilities.CommonMethods;
import utilities.Screenshots;

public class MCOUB04Page extends CommonMethods {

	ExcelReader el;


	private Page page;
	private Locator loading;
	private Locator createButton;
	private Locator myMCSClaim;
	private Locator providerSearch;
	private Locator providerId;
	private Locator providerSearchButton;
	private Locator selectSearchProvider;
	private Locator selectProviderButton;
	private Locator bpType;
	private Locator selectBpType;
	private Locator sitedropdown;
	private Locator selectSitedropdown;
	private Locator billType;
	private Locator statementFromDate;
	private Locator statementToDate;
	private Locator memberSearch;
	private Locator patientId;
	private Locator memberSearchButton;
	private Locator selectSearchMember;
	private Locator selectMemeberButton;
	private Locator admissionDate;
	private Locator selectfield13;
	private Locator field13;
	private Locator field14;
	private Locator field15;
	private Locator selectfield16;
	private Locator field16;
	private Locator field17;
	private Locator field18;
	private Locator field19;
	private Locator field20;
	private Locator field21;
	private Locator field22;
	private Locator field23;
	private Locator field24;
	private Locator field25;
	private Locator field26;
	private Locator field27;
	private Locator field28;
	private Locator field29;
	private Locator field31CodeA;
	private Locator field31DateA;
	private Locator field31CodeB;
	private Locator field31DateB;
	private Locator field32CodeA;
	private Locator field32DateA;
	private Locator field32CodeB;
	private Locator field32DateB;
	private Locator field33CodeA;
	private Locator field33DateA;
	private Locator field33CodeB;
	private Locator field33DateB;
	private Locator field34CodeA;
	private Locator field34DateA;
	private Locator field34CodeB;
	private Locator field34DateB;
	private Locator field35CodeA;
	private Locator field35DateA;
	private Locator field35ThroughA;
	private Locator field35CodeB;
	private Locator field35DateB;
	private Locator field35ThroughB;
	private Locator field36CodeA;
	private Locator field36DateA;
	private Locator field36ThroughA;
	private Locator field36CodeB;
	private Locator field36DateB;
	private Locator field36ThroughB;
	private Locator field39CodeA;
	private Locator field39AmountA;
	private Locator field39CodeB;
	private Locator field39AmountB;
	private Locator field39CodeC;
	private Locator field39AmountC;
	private Locator field39CodeD;
	private Locator field39AmountD;
	private Locator field40CodeA;
	private Locator field40AmountA;
	private Locator field40CodeB;
	private Locator field40AmountB;
	private Locator field40CodeC;
	private Locator field40AmountC;
	private Locator field40CodeD;
	private Locator field40AmountD;
	private Locator field41CodeA;
	private Locator field41AmountA;
	private Locator field41CodeB;
	private Locator field41AmountB;
	private Locator field41CodeC;
	private Locator field41AmountC;
	private Locator field41CodeD;
	private Locator field41AmountD;
	private Locator serviceAdd;
	private Locator revanueCode;
	private Locator selectRevanueCode;
	private Locator hippsCode;
	private Locator selectHippsCode;
	private Locator noOfUnit;
	private Locator nonCoverageCharge;
	private Locator serviceDate;
	private Locator totalcharges;
	private Locator serviceLineSavebutton;
	private Locator field51;
	private Locator field52;
	private Locator field53;
	private Locator field54;
	private Locator field55;
	private Locator payerTypeselect;
	private Locator payerTypeMedicare;
	private Locator payerTypeNonMedicare;
	private Locator billingNPI;
	private Locator billingNPIselectFirst;
	private Locator otherProviderID;
	private Locator insuredNameA;
	private Locator insuredNameB;
	private Locator insuredNameC;
	private Locator pRelA;
	private Locator pRelB;
	private Locator pRelC;
	private Locator insuranceIdA;
	private Locator insuranceIdB;
	private Locator insuranceIdC;
	private Locator groupNameA;
	private Locator groupNameB;
	private Locator groupNameC;
	private Locator insGroupNameA;
	private Locator insGroupNameB;
	private Locator insGroupNameC;
	private Locator treatAuthCodeA;
	private Locator treatAuthCodeB;
	private Locator treatAuthCodeC;
	private Locator documentControlNumberA;
	private Locator documentControlNumberB;
	private Locator documentControlNumberC;
	private Locator employeeNameA;
	private Locator employeeNameB;
	private Locator employeeNameC;
	private Locator field66;
	private Locator field66_0;
	private Locator field66_1;
	private Locator principalA;
	private Locator principalB;
	private Locator principalC;
	private Locator principalD;
	private Locator principalE;
	private Locator principalF;
	private Locator principalG;
	private Locator principalH;
	private Locator principalI;
	private Locator principalJ;
	private Locator principalK;
	private Locator principalL;
	private Locator principalM;
	private Locator principalN;
	private Locator principalO;
	private Locator principalP;
	private Locator principalQ;
	private Locator principalR;
	private Locator admtDX;
	private Locator patientReasonDXA;
	private Locator patientReasonDXB;
	private Locator patientReasonDXC;
	private Locator ppsCode;
	private Locator eciA;
	private Locator eciB;
	private Locator eciC;
	private Locator field74code;
	private Locator filed74Date;
	private Locator field74codeA;
	private Locator filed74DateA;
	private Locator field74codeB;
	private Locator filed74DateB;
	private Locator field74codeC;
	private Locator filed74DateC;
	private Locator field74codeD;
	private Locator filed74DateD;
	private Locator field74codeE;
	private Locator filed74DateE;
	private Locator remark;
	private Locator ccA2;
	private Locator selectccA2;
	private Locator ccA3;
	private Locator ccB1;
	private Locator ccB2;
	private Locator ccB3;
	private Locator ccC1;
	private Locator ccC2;
	private Locator ccC3;
	private Locator ccD1;
	private Locator ccD2;
	private Locator ccD3;
	private Locator attendingNPI;
	private Locator attendingQual1;
	private Locator attendingQual2;
	private Locator attendingLast;
	private Locator attendingFirst;
	private Locator operatingNPI;
	private Locator operatingQual1;
	private Locator operatingQual2;
	private Locator operatingLast;
	private Locator operatingFirst;
	private Locator otherNPI;
	private Locator otherQual1;
	private Locator otherQual2;
	private Locator otherLast;
	private Locator otherFirst;
	private Locator otherNPIA;
	private Locator otherQualA1;
	private Locator otherQualA2;
	private Locator otherLastA;
	private Locator otherFirstA;
	private Locator receivedDate;
	private Locator submit;


	MCOUB04Page(Page page){

		this.page = page;
		this.loading = this.page.getByText("Loading").first();
		this.createButton = this.page.locator("button").filter(new Locator.FilterOptions().setHasText("Create"));
		this.myMCSClaim=this.page.locator("//span[@class='ml-1 text-gray']");
		this.providerSearch= this.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Provider Search"));
		this.providerId= this.page.getByLabel("Provider ID");
		this.providerSearchButton= this.page.locator("//span[text()='Search']");
		this.selectSearchProvider= this.page.getByRole(AriaRole.GRIDCELL, new Page.GetByRoleOptions().setName("1066"));
		this.selectProviderButton= this.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Select Provider"));
		this.bpType= this.page.locator("//mat-select[@formcontrolname='bp_type']");
		this.selectBpType= this.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Medicaid(Except TP PH)")).locator("span");
		this.sitedropdown= this.page.locator("//mat-select[@formcontrolname='Site_nm_01']");
		// this.selectSitedropdown= this.page.getByText("GASTON MEMORIAL, CAROMONT");
		this.billType=this.page.locator("//input[@formcontrolname='Bill_type_04']");
		this.statementFromDate= this.page.locator("//input[@formcontrolname='Stmt_prd_frm_06']");
		this.statementToDate= this.page.locator("//input[@formcontrolname='Stmt_prd_to_06']");
		this.memberSearch= this.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("󰍉 Search"));
		this.patientId= this.page.getByLabel("Patient ID");
		this.memberSearchButton=this.page.locator("//span[text()='Search']");
		this.selectSearchMember= this.page.getByRole(AriaRole.GRIDCELL, new Page.GetByRoleOptions().setName("10982"));
		this.selectMemeberButton= this.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Select Patient"));
		this.admissionDate=this.page.locator("//input[@formcontrolname='Admsn_dt_12']");
		this.selectfield13= this.page.locator("//mat-select[@formcontrolname='Admsn_hr_13']");
		this.field13= this.page.locator("//span[text()=' 02 ']");
		this.field14=this.page.locator("//input[@formcontrolname='Priority_of_visit_type_14']");
		this.field15= this.page.locator("//input[@formcontrolname='Ref_src_15']");
		this.selectfield16= this.page.locator("//mat-select[@formcontrolname='Disch_hr_16']");
		this.field16= this.page.locator("//span[text()=' 02 ']");
		this.field17= this.page.locator("//input[@formcontrolname='Disch_stat_17']");
		this.field18= this.page.locator("//input[@formcontrolname='Condn_cd_18']");
		this.field19= this.page.locator("//input[@formcontrolname='Condn_cd_19']");
		this.field20= this.page.locator("//input[@formcontrolname='Condn_cd_20']");
		this.field21= this.page.locator("//input[@formcontrolname='Condn_cd_21']");
		this.field22= this.page.locator("//input[@formcontrolname='Condn_cd_22']");
		this.field23= this.page.locator("//input[@formcontrolname='Condn_cd_23']");
		this.field24= this.page.locator("//input[@formcontrolname='Condn_cd_24']");
		this.field25= this.page.locator("//input[@formcontrolname='Condn_cd_25']");
		this.field26= this.page.locator("//input[@formcontrolname='Condn_cd_26']");
		this.field27= this.page.locator("//input[@formcontrolname='Condn_cd_27']");
		this.field28= this.page.locator("//input[@formcontrolname='Condn_cd_28']");
		this.field29= this.page.locator("//input[@formcontrolname='Accident_state_29']");
		this.field31CodeA= this.page.locator("//input[@formcontrolname='Occur_cd_31a']");
		this.field31DateA= this.page.locator("//input[@formcontrolname='Occur_dt_31a']");
		this.field31CodeB= this.page.locator("//input[@formcontrolname='Occur_cd_31b']");
		this.field31DateB= this.page.locator("//input[@formcontrolname='Occur_dt_31b']");
		this.field32CodeA= this.page.locator("//input[@formcontrolname='Occur_cd_32a']");
		this.field32DateA= this.page.locator("//input[@formcontrolname='Occur_dt_32a']");
		this.field32CodeB= this.page.locator("//input[@formcontrolname='Occur_cd_32b']");
		this.field32DateB= this.page.locator("//input[@formcontrolname='Occur_dt_32b']");
		this.field33CodeA= this.page.locator("//input[@formcontrolname='Occur_cd_33a']");
		this.field33DateA= this.page.locator("//input[@formcontrolname='Occur_dt_33a']");
		this.field33CodeB= this.page.locator("//input[@formcontrolname='Occur_cd_33b']");
		this.field33DateB= this.page.locator("//input[@formcontrolname='Occur_dt_33b']");
		this.field34CodeA= this.page.locator("//input[@formcontrolname='Occur_cd_34a']");
		this.field34DateA= this.page.locator("//input[@formcontrolname='Occur_dt_34a']");
		this.field34CodeB= this.page.locator("//input[@formcontrolname='Occur_cd_34b']");
		this.field34DateB= this.page.locator("//input[@formcontrolname='Occur_dt_34b']");
		this.field35CodeA= this.page.locator("//input[@formcontrolname='Occur_span_cd_35a']");
		this.field35DateA= this.page.locator("//input[@formcontrolname='Occur_span_st_35a']");
		this.field35ThroughA=this.page.locator("//input[@formcontrolname='Occur_span_end_35a']");
		this.field35CodeB= this.page.locator("//input[@formcontrolname='Occur_span_cd_35b']");
		this.field35DateB= this.page.locator("//input[@formcontrolname='Occur_span_st_35b']");
		this.field35ThroughB=this.page.locator("//input[@formcontrolname='Occur_span_end_35b']");
		this.field36CodeA= this.page.locator("//input[@formcontrolname='Occur_span_cd_36a']");
		this.field36DateA= this.page.locator("//input[@formcontrolname='Occur_span_st_36a']");
		this.field36ThroughA= this.page.locator("//inputy[@formcontrolname='Occur_span_end_36a']");
		this.field36CodeB= this.page.locator("//input[@formcontrolname='Occur_span_cd_36b']");
		this.field36DateB= this.page.locator("//input[@formcontrolname='Occur_span_st_36b']");
		this.field36ThroughB= this.page.locator("//input[@formcontrolname='Occur_span_end_36b']");
		this.field39CodeA= this.page.locator("//input[@formcontrolname='Val_cd_39a']");
		this.field39AmountA=this.page.locator("//input[@formcontrolname='Val_cd_amt_39a']");	
		this.field39CodeB=this.page.locator("//input[@formcontrolname='Val_cd_39b']");
		this.field39AmountB=this.page.locator("//input[@formcontrolname='Val_cd_amt_39b']");
		this.field39CodeC=this.page.locator("//input[@formcontrolname='Val_cd_39c']");
		this.field39AmountC=this.page.locator("//input[@formcontrolname='Val_cd_amt_39c']");
		this.field39CodeD=this.page.locator("//input[@formcontrolname='Val_cd_39d']");
		this.field39AmountD=this.page.locator("//input[@formcontrolname='Val_cd_amt_39d']");
		this.field40CodeA= this.page.locator("//input[@formcontrolname='Val_cd_40a'");
		this.field40AmountA= this.page.locator("//input[@formcontrolname='Val_cd_amt_40a']");
		this.field40CodeB= this.page.locator("#mat-input-723");
		this.field40AmountB= this.page.locator("#mat-input-724");
		this.field40CodeC= this.page.locator("#mat-input-729");
		this.field40AmountC= this.page.locator("#mat-input-730");
		this.field40CodeD= this.page.locator("#mat-input-735");
		this.field40AmountD= this.page.locator("#mat-input-736");
		this.field41CodeA= this.page.locator("#mat-input-719");
		this.field41AmountA= this.page.locator("#mat-input-720");
		this.field41CodeB= this.page.locator("#mat-input-725");
		this.field41AmountB= this.page.locator("#mat-input-726");
		this.field41CodeC= this.page.locator("#mat-input-731");
		this.field41AmountC= this.page.locator("#mat-input-732");
		this.field41CodeD= this.page.locator("#mat-input-737");
		this.field41AmountD= this.page.locator("#mat-input-738");
		this.serviceAdd= this.page.locator("button").filter(new Locator.FilterOptions().setHasText("Add")).first();
		this.revanueCode= this.page.getByLabel("Rev.Cd", new Page.GetByLabelOptions().setExact(true));
		//this.selectRevanueCode=this.page.locator("//span[contains(text(),'""++'])");
		this.hippsCode= this.page.getByLabel("HIPPS Code");
		//this.selectHippsCode=this.page.locator("//span[contains(text(),'"++"'])");
		this.noOfUnit=this.page.getByLabel("Number of Units");
		this.nonCoverageCharge= this.page.getByLabel("Non Coverage Charges");
		this.serviceDate=this.page.getByLabel("Service Date");
		this.totalcharges= this.page.getByLabel("Total Charges");
		this.serviceLineSavebutton=this.page.locator("(//span[text()=' Save '])[2]");
		this.field51= this.page.locator("#mat-input-840");
		this.field52= this.page.locator("#mat-checkbox-14 > .mat-checkbox-layout > .mat-checkbox-inner-container");
		this.field53= this.page.locator("#mat-checkbox-15 > .mat-checkbox-layout > .mat-checkbox-inner-container");
		this.field54= this.page.locator("#mat-input-841");
		this.field55= this.page.locator("#mat-input-842");
		this.payerTypeselect= this.page.locator("#mat-select-value-107");
		this.payerTypeMedicare= this.page.getByText("Medicare", new Page.GetByTextOptions().setExact(true));
		this.payerTypeNonMedicare= this.page.getByText("Non-Medicare");
		this.billingNPI= this.page.locator("//mat-select[@formcontrolname='Bill_prv_npi_56']");
		this.billingNPIselectFirst= this.page.getByText("1013918960");
		this.otherProviderID= this.page.locator("#mat-input-741");
		this.insuredNameA= this.page.locator("#mat-input-742");
		this.insuredNameB= this.page.locator("#mat-input-747");
		this.insuredNameC= this.page.locator("#mat-input-752");
		this.pRelA= this.page.locator("#mat-input-743");
		this.pRelB= this.page.locator("#mat-input-748");
		this.pRelC= this.page.locator("#mat-input-753");
		this.insuranceIdA= this.page.locator("#mat-input-744");
		this.insuranceIdB= this.page.locator("#mat-input-749");
		this.insuranceIdC= this.page.locator("#mat-input-754");
		this.groupNameA= this.page.locator("#mat-input-745");
		this.groupNameB= this.page.locator("#mat-input-750");
		this.groupNameC= this.page.locator("#mat-input-755");
		this.insGroupNameA= this.page.locator("#mat-input-746");
		this.insGroupNameB= this.page.locator("#mat-input-751");
		this.insGroupNameC= this.page.locator("#mat-input-756");
		this.treatAuthCodeA= this.page.locator("#mat-input-757");
		this.treatAuthCodeB= this.page.locator("#mat-input-760");
		this.treatAuthCodeC= this.page.locator("#mat-input-763");
		this.documentControlNumberA= this.page.locator("#mat-input-758");
		this.documentControlNumberB= this.page.locator("#mat-input-761");
		this.documentControlNumberC= this.page.locator("#mat-input-764");
		this.employeeNameA= this.page.locator("#mat-input-759");
		this.employeeNameB= this.page.locator("#mat-input-762");
		this.employeeNameC= this.page.locator("#mat-input-765");
		this.field66= this.page.locator("#mat-select-104 div").nth(2);
		this.field66_0= this.page.getByText("0", new Page.GetByTextOptions().setExact(true));
		this.field66_1= this.page.getByText("1", new Page.GetByTextOptions().setExact(true));
		this.principalA= this.page.locator("//input[@formcontrolname='Prin_diag_cd_67']");
		this.principalB= this.page.locator("#mat-input-767");
		this.principalC= this.page.locator("#mat-input-768");
		this.principalD= this.page.locator("#mat-input-769");
		this.principalE= this.page.locator("#mat-input-770");
		this.principalF= this.page.locator("#mat-input-771");
		this.principalG= this.page.locator("#mat-input-772");
		this.principalH= this.page.locator("#mat-input-773");
		this.principalI= this.page.locator("#mat-input-774");
		this.principalJ= this.page.locator("#mat-input-775");
		this.principalK= this.page.locator("#mat-input-776");
		this.principalL= this.page.locator("#mat-input-777");
		this.principalM= this.page.locator("#mat-input-778");
		this.principalN= this.page.locator("#mat-input-779");
		this.principalO= this.page.locator("#mat-input-780");
		this.principalP= this.page.locator("#mat-input-781");
		this.principalQ= this.page.locator("#mat-input-782");
		this.principalR= this.page.locator("#mat-input-783");
		this.admtDX= this.page.locator("#mat-input-784");
		this.patientReasonDXA= this.page.locator("#mat-input-785");
		this.patientReasonDXB= this.page.locator("#mat-input-786");
		this.patientReasonDXC= this.page.locator("#mat-input-787");
		this.ppsCode= this.page.locator("#mat-input-788");
		this.eciA= this.page.locator("#mat-input-789");
		this.eciB= this.page.locator("#mat-input-790");
		this.eciC= this.page.locator("#mat-input-791");
		this.field74code= this.page.locator("#mat-input-792");
		this.filed74Date= this.page.locator("#mat-input-793");
		this.field74codeA= this.page.locator("#mat-input-794");
		this.filed74DateA= this.page.locator("#mat-input-795");
		this.field74codeB= this.page.locator("#mat-input-796");
		this.filed74DateB= this.page.locator("#mat-input-797");
		this.field74codeC= this.page.locator("#mat-input-798");
		this.filed74DateC= this.page.locator("#mat-input-799");
		this.field74codeD= this.page.locator("#mat-input-800");
		this.filed74DateD= this.page.locator("#mat-input-801");
		this.field74codeE= this.page.locator("#mat-input-802");
		this.filed74DateE= this.page.locator("#mat-input-803");
		this.remark= this.page.locator("#mat-input-804");
		this.ccA2= this.page.locator("//input[@formcontrolname='Cc_81a']");
		//        this.selectccA2= this.page.locator("//span[contains(text(),'282N00000X')]");
		this.ccA3= this.page.locator("#mat-input-807");
		this.ccB1= this.page.locator("#mat-input-808");
		this.ccB2= this.page.locator("#mat-input-809");
		this.ccB3= this.page.locator("#mat-input-810");
		this.ccC1= this.page.locator("#mat-input-811");
		this.ccC2= this.page.locator("#mat-input-812");
		this.ccC3= this.page.locator("#mat-input-813");
		this.ccD1= this.page.locator("#mat-input-814");
		this.ccD2= this.page.locator("#mat-input-815");
		this.ccD3= this.page.locator("#mat-input-816");
		this.attendingNPI= this.page.locator("//input[@formcontrolname='Attnd_phy_npi_76']");
		this.attendingQual1= this.page.locator("#mat-input-818");
		this.attendingQual2= this.page.locator("#mat-input-819");
		this.attendingLast= this.page.locator("#mat-input-820");
		this.attendingFirst= this.page.locator("#mat-input-821");
		this.operatingNPI= this.page.locator("#mat-input-822");
		this.operatingQual1= this.page.locator("#mat-input-823");
		this.operatingQual2=this.page.locator("#mat-input-824");
		this.operatingLast= this.page.locator("#mat-input-825");
		this.operatingFirst= this.page.locator("#mat-input-826");
		this.otherNPI= this.page.locator("#mat-input-827");
		this.otherQual1= this.page.locator("#mat-input-828");
		this.otherQual2= this.page.locator("#mat-input-829");
		this.otherLast= this.page.locator("#mat-input-830");
		this.otherFirst= this.page.locator("#mat-input-831");
		this.otherNPIA= this.page.locator("#mat-input-832");
		this.otherQualA1= this.page.locator("#mat-input-833");
		this.otherQualA2= this.page.locator("#mat-input-834");
		this.otherLastA= this.page.locator("#mat-input-835");
		this.otherFirstA= this.page.locator("#mat-input-836");
		this.receivedDate= this.page.locator("//input[@formcontrolname='Recd_dt']");
		this.submit= this.page.locator("button").filter(new Locator.FilterOptions().setHasText("Submit"));
	}


	public void submitUB04()
	{
		el = new ExcelReader(".//src/test//resources//UB04_datas.xlsx");

		List<Map<String, String>> datamap = el.getExcelDataMap("ub04");

		for(Map<String, String> data: datamap)
		{
			String ClaimID = data.get("claimID");
			String ProviderId = data.get("providerId");

			String SelectSitedropdown= data.get("selectSitedropdown");

			String BillType = data.get("billType");
			String StatementFromDate = data.get("statementFromDate");
			String StatementToDate = data.get("statementToDate");
			String PatientId = data.get("patientId");
			String AdmissionDate = data.get("admissionDate");
			String Field14 = data.get("field14");
			String Field15 = data.get("field15");
			String RevanueCode = data.get("revanueCode");
			String HippsCode = data.get("HippsCode");
			String NoOfUnit = data.get("NoOfUnit");
			String NonCoverageCharge = data.get("NonCoverageCharge");
			String ServiceDate = data.get("serviceDate");
			String Totalcharges = data.get("totalcharges");
			String PrincipalA = data.get("principalA");
			String CcA2 = data.get("ccA2");
			String AttendingNPI = data.get("attendingNPI");
			String ReceivedDate = data.get("receivedDate");



			if(loading.isVisible())
				page.waitForURL("**/finance/UB04");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			click(createButton, "Create Button");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			getText(myMCSClaim,"myMCSClaim");
			click(providerSearch, "Provider Search");
			if(loading.isVisible())
				page.waitForURL("**/finance/UB04");
			enterData(providerId,ProviderId, "Provider ID");
			if(loading.isVisible())
				page.waitForURL("**/finance/UB04");
			click(providerSearchButton,"Provider_Search Button");
			if(loading.isVisible())
				page.waitForTimeout(6000);
			click(selectSearchProvider,"select Search_Provider");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			click(selectProviderButton,"select_Provide rButton");
			if(loading.isVisible())
				page.waitForTimeout(6000);
			click(bpType,"bpType");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			click(selectBpType,"selectBpType");
			if(loading.isVisible())
				page.waitForTimeout(3000);
			click(sitedropdown,"sitedropdown");
			if(loading.isVisible())
				page.waitForTimeout(3000);

			
			this.selectSitedropdown= this.page.locator("//span[contains(text(),'"+SelectSitedropdown+"')]");

			click(selectSitedropdown,"selectSitedropdown");
			if(loading.isVisible())
				page.waitForTimeout(3000);
			enterData( billType,BillType," billType");
			if(loading.isVisible())
				page.waitForTimeout(3000);
			enterData(statementFromDate,StatementFromDate,"statementFromDate");
			if(loading.isVisible())
				page.waitForTimeout(3000);
			enterData(statementToDate,StatementToDate,"statementToDate"); 
			click(memberSearch,"memberSearch");
			if(loading.isVisible())
				page.waitForTimeout(3000);
			enterData(patientId,PatientId,"patientId");
			if(loading.isVisible())
				page.waitForTimeout(3000);
			click(memberSearchButton,"memberSearchButton");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			click(selectSearchMember,"selectSearchMember");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			click(selectMemeberButton,"selectMemeberButton");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			enterData(admissionDate,AdmissionDate,"admissionDate");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			if(loading.isVisible())
				page.waitForTimeout(5000);
			enterData(field14,Field14,"field14");
			if(loading.isVisible())
				page.waitForTimeout(3000);
			enterData(field15,Field15,"field15");

			//		  datamap.stream().filter(entry -> entry.get("claimID").equals(ClaimID)).collect(Collectors.toMap(null, null))
			//		  {
			//			  
			//		  }
			click(serviceAdd,"serviceAdd");
			enterData(revanueCode,RevanueCode,"revanueCode");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			this.selectRevanueCode=this.page.locator("//span[contains(text(),'"+RevanueCode+"')]");
			selectRevanueCode.click();
			enterData(hippsCode,HippsCode,"HippsCode");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			this.selectHippsCode=this.page.locator("//span[contains(text(),'"+HippsCode+"')]");
			selectHippsCode.click();
			enterData(noOfUnit,NoOfUnit," NoOfUnit");
			enterData(nonCoverageCharge,NonCoverageCharge,"NonCoverageCharge");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			enterData(serviceDate,ServiceDate,"serviceDate");
			enterData(totalcharges,Totalcharges,"totalcharges");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			click(serviceLineSavebutton,"ServiceLineSavebutton");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			click(billingNPI,"billingNPI");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			click(billingNPIselectFirst,"billingNPIselectFirst");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			enterData(principalA,PrincipalA,"principalA");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			enterData(ccA2,CcA2,"ccA2");
			//		  this.page.locator("//span[contains(text(),'282N00000X')]")
			this.selectccA2 = this.page.locator("//span[contains(text(),'"+CcA2+"')]");
			if(loading.isVisible())
				page.waitForTimeout(6000);
			click(selectccA2,"sSelectCcA2");
			enterData(attendingNPI,AttendingNPI,"attendingNPI");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			enterData(receivedDate,ReceivedDate,"receivedDate");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			click(submit,"submit");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			Screenshots.getBase64Image(this.page, Status.PASS);
		}

	}
	public void fullUB04()
	{

	}
}

