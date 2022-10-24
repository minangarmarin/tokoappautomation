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

Mobile.startExistingApplication('com.dbo.newdboindonesiahd')

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Login Page - Daftar Sekarang'), 0)

Mobile.setText(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regist Page - Nama Toko'), findTestData('Registrasi Toko App/Regsitrasi').getValue(
        'NamaToko', 1), 0)

Mobile.setText(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regist Page - Nomor Telepon'), findTestData('Registrasi Toko App/Regsitrasi').getValue(
        'NomorTelepon', 1), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regist Page - Lanjut'), 0)

Mobile.setText(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regist Page 2 - Nomor Telepon Toko'), findTestData('Registrasi Toko App/Regsitrasi').getValue(
        'NomorToko', 1), 0)

Mobile.setText(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regist Page 2 - Alamat Toko'), findTestData('Registrasi Toko App/Regsitrasi').getValue(
        'AlamatToko', 1), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regist Page 2 - Provinsi'), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regist Page 2 - Pilih Provinsi'), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regist Page 2 - Kota'), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regist Page 2 - Pilih Kota'), 0)

Mobile.setText(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regist Page 2 - Nama Anda'), findTestData('Registrasi Toko App/Regsitrasi').getValue(
        'NamaAnda', 1), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regist Page 2 - Posisi'), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regist Page 2 - Pilih Posisi'), 0)

Mobile.scrollToText('Nama Distributor', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regist Page 2 - Pilih Merek'), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regist Page 2 - RUCIKA'), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regist Page 2 - Save'), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regsit Page 2 - Lanjut'), 0)

Mobile.scrollToText('Kata Sandi', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regist Page 3 - Password 1'), findTestData('Registrasi Toko App/Regsitrasi').getValue(
        'Password', 1), 0)

Mobile.setText(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regist Page 3 - Password 2'), findTestData('Registrasi Toko App/Regsitrasi').getValue(
        'Password', 1), 0)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regist Page 3 - Ceklis Syarat'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regist Page 3 - Konfirmasi'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Toko App Production/Toko App - PROD/Registrasi/Regist Page 4 - Kirim'), 0, FailureHandling.STOP_ON_FAILURE)

