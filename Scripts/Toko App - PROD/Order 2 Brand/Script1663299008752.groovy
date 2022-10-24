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

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Order - Pilih Rucika'), 0)

Mobile.tap(findTestObject('Object Repository/Toko App Production/Toko App - PROD/Order - Pilih Lem'), 0)

Mobile.tap(findTestObject('Object Repository/Toko App Production/Toko App - PROD/Order - Pilih Ruglue'), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Order - Add QTY (Ruglue)'), 0)

Mobile.tap(findTestObject('Object Repository/Toko App Production/Toko App - PROD/Order - Beli'), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Order2 - Tambah Barang'), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Order2 - Pilih Kategori Brand'), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Order2 - Pilih Djabesmen'), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Order2 - Pilih Aksesoris'), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Order2 - Pilih Djabeskrup'), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Order2 - Add QTY (Djabeskrup)'), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Order - Beli'), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Order - Pilih Distributor DEMO MU'), 0)

int timeout = 10

def inputField = findTestObject('Toko App Production/Toko App - PROD/Order2 - Catatan')

Mobile.tap(inputField, timeout)

Mobile.sendKeys(inputField, 'smoke test - order 2 brand')

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Order - Next Page'), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Order2 - Pilih Distributor DEMO MU'), 0)

Mobile.tap(inputField, timeout)

Mobile.sendKeys(inputField, 'smoke test - order 2 brand')

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Order - Next Page'), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Order - Konfirmasi Order'), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Order - Close popup'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Order - Pilih Beranda'), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Redeem/Beranda  - Untung'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

