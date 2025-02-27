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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Login Valid
'Membuka Web Browser'
WebUI.openBrowser('')

//WebUI.openBrowser(GlobalVariable.URL)
WebUI.maximizeWindow()

'Menampilkan halaman Web - CURA Healthcare'
WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.takeScreenshot()

'Klik menu toggle'
WebUI.click(findTestObject('Inspect/menu_toggle'))

'Pilih dan klik menu Login'
WebUI.focus(findTestObject('Object Repository/Spy/a_Login'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Spy/a_Login'))

//menggunakan global variable - value dengan diisi manual
//WebUI.setText(findTestObject('Object Repository/Spy/input_Username_username'), GlobalVariable.Username)
//WebUI.setText(findTestObject('Object Repository/Spy/input_Password_password'), GlobalVariable.Password)
//menggunakan global variable - value dengan data excel
'Input Username dan Password'
WebUI.setText(findTestObject('Object Repository/Spy/input_Username_username'), GlobalVariable.DataUsername)

WebUI.setText(findTestObject('Object Repository/Spy/input_Password_password'), GlobalVariable.DataPassword)

WebUI.takeScreenshot()

'Klik button Login'
WebUI.click(findTestObject('Object Repository/Spy/button_Login'))

//verifikasi berhasil login
if (WebUI.verifyElementVisible(findTestObject('Object Repository/Spy/h2_Make Appointment'))) {
    println('Login Berhasil')

    'Tampilan Login Berhasil'
}

WebUI.takeScreenshot()

WebUI.delay(GlobalVariable.Waiting)

WebUI.closeBrowser()

