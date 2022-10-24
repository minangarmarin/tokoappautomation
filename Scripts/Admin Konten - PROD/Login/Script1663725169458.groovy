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

WebUI.navigateToUrl('https://app.cms.dbo.id/')

WebUI.setText(findTestObject('Object Repository/Toko App Production/Admin Konten/input_Email_MuiInputBase-input MuiOutlinedI_f297b5'), '')

WebUI.click(findTestObject('Object Repository/Toko App Production/Admin Konten/div_Email Kata Sandi Masuk'))

WebUI.setText(findTestObject('Object Repository/Toko App Production/Admin Konten/input_Email_MuiInputBase-input MuiOutlinedI_f297b5'), 'dbo1@admin.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Toko App Production/Admin Konten/input_Kata Sandi_MuiInputBase-input MuiOutl_9c0fb1'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/Toko App Production/Admin Konten/div_Masuk'))

WebUI.scrollToElement(findTestObject('Toko App Production/Admin Konten/div_KODE REFERRAL SALESMAN'), 0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Toko App Production/Admin Konten/div_Admin'), 0)

