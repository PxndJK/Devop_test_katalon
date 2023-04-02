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

WebUI.navigateToUrl('http://184.72.246.106:3000/')

WebUI.click(findTestObject('Object Repository/admin/Page_Klond Choice/button_Home_navbar-toggler'))

WebUI.click(findTestObject('Object Repository/admin/Page_Klond Choice/a_Login'))

WebUI.click(findTestObject('Object Repository/admin/Page_Login/a_Admin'))

WebUI.setText(findTestObject('Object Repository/admin/Page_Login/input_Login as Admin_emailAdressAdmin'), 'admin@admin')

WebUI.setEncryptedText(findTestObject('Object Repository/admin/Page_Login/input_Email address_AdminPassword'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/admin/Page_Login/input'))

WebUI.click(findTestObject('Object Repository/admin/Page_Klond Choice/p_testhandsome'))

WebUI.click(findTestObject('Object Repository/admin/Page_Klond Choice/td_Sun Apr 02 2023 205223 GMT0000 (Coordina_23c476'))

WebUI.click(findTestObject('Object Repository/admin/Page_Klond Choice/span_Pending'))

WebUI.click(findTestObject('Object Repository/admin/Page_Klond Choice/button_Cook'))

WebUI.click(findTestObject('Object Repository/admin/Page_Klond Choice/span_Cooking'))

WebUI.closeBrowser()

