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

WebUI.click(findTestObject('Toko App Production/Admin Verifikasi - PROD/div_Saring'))

WebUI.click(findTestObject('Object Repository/Toko App Production/Admin Verifikasi - PROD/div_TOKO'))

WebUI.click(findTestObject('Object Repository/Toko App Production/Admin Verifikasi - PROD/div_UNVERIFIED'))

WebUI.click(findTestObject('Object Repository/Toko App Production/Admin Verifikasi - PROD/div_Atur Filter'))

WebUI.click(findTestObject('Object Repository/Toko App Production/Admin Verifikasi - PROD/div_Klaim'))

WebUI.click(findTestObject('Object Repository/Toko App Production/Admin Verifikasi - PROD/div_Dalam Masa Pengerjaan'))

WebUI.click(findTestObject('Toko App Production/Admin Verifikasi - PROD/Dalam Masa Pengerjaan - Filter'))

WebUI.click(findTestObject('Object Repository/Toko App Production/Admin Verifikasi - PROD/div_TOKO'))

WebUI.click(findTestObject('Object Repository/Toko App Production/Admin Verifikasi - PROD/div_Atur Filter'))

WebUI.click(findTestObject('Object Repository/Toko App Production/Admin Verifikasi - PROD/div_Tipe TOKO'))

WebUI.click(findTestObject('Object Repository/Toko App Production/Admin Verifikasi - PROD/div_Batal Klaim'))

WebUI.click(findTestObject('Object Repository/Toko App Production/Admin Verifikasi - PROD/div_Daftar Data'))

