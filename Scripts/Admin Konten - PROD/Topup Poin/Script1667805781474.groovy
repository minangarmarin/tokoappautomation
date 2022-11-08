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

WebUI.click(findTestObject('Toko App Production/Admin Konten/Homepage - Poin Loyalti'))

WebUI.setText(findTestObject('Toko App Production/Admin Konten/Poin Loyalti - Cari Toko'), 'toko demo gamifikasi1')

WebUI.click(findTestObject('Toko App Production/Admin Konten/Poin Loyalti - Button Cari'))

WebUI.click(findTestObject('Toko App Production/Admin Konten/Poin Loyalti - LIHAT RINCIAN'))

WebUI.click(findTestObject('Toko App Production/Admin Konten/Poin Loyalti - Pilih Brand'))

WebUI.click(findTestObject('Toko App Production/Admin Konten/Poin Loyalti - Pilih Brand Rucika'))

WebUI.click(findTestObject('Toko App Production/Admin Konten/Poin Loyalti - Pilih Tipe'))

WebUI.click(findTestObject('Toko App Production/Admin Konten/Poin Loyalti - Pilih Tipe Transaksi'))

WebUI.setText(findTestObject('Toko App Production/Admin Konten/Poin Loyalti - Input Poin'), '1')

WebUI.setText(findTestObject('Toko App Production/Admin Konten/Poin Loyalti - Input Catatan'), 'smoke test - demo topup poin')

WebUI.click(findTestObject('Toko App Production/Admin Konten/Poin Loyalti - Tambah Poin'))

WebUI.click(findTestObject('Toko App Production/Admin Konten/Poin Loyalti - Konfirmasi topup'))

