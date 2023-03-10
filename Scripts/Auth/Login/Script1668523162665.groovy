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

WebUI.click(findTestObject('Object Repository/Page_United Tractors/html_United Tractorslink relstylesheet href_a153eb'))

WebUI.setText(findTestObject('Object Repository/Page_United Tractors/input_Username_email (2)'), '1133')

WebUI.click(findTestObject('Object Repository/Page_United Tractors/div_Username                               _9006cc'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_United Tractors/input_Password_password (2)'), 'G5VoZgHiI9acJfA/lKAfPw==')

WebUI.click(findTestObject('Object Repository/Page_United Tractors/span_Remember Me_h-4 w-4 inline-block mr-2 _8864da (2)'))

WebUI.click(findTestObject('Object Repository/Page_United Tractors/button_Login (4)'))

WebUI.closeBrowser()

