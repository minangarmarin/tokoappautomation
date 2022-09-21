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

WebUI.navigateToUrl('https://demosite.executeautomation.com/Login.html')

WebUI.setText(findTestObject('Object Repository/Web Test/Page_Execute Automation/input_Login_UserName'), 'admin')

WebUI.setText(findTestObject('Object Repository/Web Test/Page_Execute Automation/input_Login_Password'), 'admin')

WebUI.click(findTestObject('Object Repository/Web Test/Page_Execute Automation/input_Login_Login'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot('D:\\test\\TC01.jpg')

WebUI.selectOptionByValue(findTestObject('Object Repository/Web Test/Page_Execute Automation/select_SelectMr.Ms'), '1', 
    true)

WebUI.setText(findTestObject('Object Repository/Web Test/Page_Execute Automation/input_Initial_Initial'), 'AR')

WebUI.setText(findTestObject('Object Repository/Web Test/Page_Execute Automation/input__FirstName'), 'MINANG')

WebUI.setText(findTestObject('Object Repository/Web Test/Page_Execute Automation/input_Middle Name_MiddleName'), 'ARMARIN')

WebUI.takeFullPageScreenshot('D:\\test\\TC02.jpg')

WebUI.click(findTestObject('Object Repository/Web Test/Page_Execute Automation/input_EnglishHindi_Save'))

WebUI.closeBrowser()

