import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ut-depan.pages.dev/login/')

WebUI.click(findTestObject('Object Repository/Page_United Tractors/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_United Tractors/a_Project Request'))

WebUI.click(findTestObject('Object Repository/Page_United Tractors/a_Propose New Project'))

WebUI.click(findTestObject('Object Repository/Page_United Tractors/button_Special Approval'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_United Tractors/select_Head OfficeBalikpapanJakartaLombok O_aafa85'), 
    'LBK', true)

WebUI.setText(findTestObject('Object Repository/Page_United Tractors/textarea_Project Name_input-textarea h-36'), 'test ini special approvalsss')

WebUI.setText(findTestObject('Object Repository/Page_United Tractors/input_Rp_border w-full rounded-r outline-none p-2'), 
    '300.000.000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_United Tractors/select_CO ACTIVITYCO PAYMENTNEW PROJECT 202_7d6755'), 
    'NEW PROJECT 2023', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_United Tractors/select_ElectricalHydrantKonsultanOfficeRene_fb2736'), 
    'Renewable Energy', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_United Tractors/select_CO PAYMENTFSHYDRANTNEW PROJECT 2023S_6c3a95'), 
    'NEW PROJECT 2023', true)

WebUI.click(findTestObject('Object Repository/Page_United Tractors/button_Submit'))

WebUI.closeBrowser()

