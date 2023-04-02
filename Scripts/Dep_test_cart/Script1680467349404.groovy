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

WebUI.click(findTestObject('Object Repository/cart/Page_Klond Choice/button_Home_navbar-toggler'))

WebUI.click(findTestObject('Object Repository/cart/Page_Klond Choice/a_Login'))

WebUI.setText(findTestObject('Object Repository/cart/Page_Login/input_Login_emailAdress'), Emailaddress)

WebUI.setText(findTestObject('Object Repository/cart/Page_Login/input_Email address_UserPassword'), Password)

WebUI.click(findTestObject('Object Repository/cart/Page_Login/input'))

WebUI.click(findTestObject('Object Repository/cart/Page_Klond Choice/button_Home_navbar-toggler'))

WebUI.click(findTestObject('Object Repository/cart/Page_Klond Choice/a_Menu'))

WebUI.verifyElementText(findTestObject('Object Repository/cart/Page_Klond Choice/h3_Salad'), name)

WebUI.click(findTestObject('Object Repository/cart/Page_Klond Choice/a_Add Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/cart/Page_Klond Choice/h3_Teriyaki Meatballs'), name2)

WebUI.click(findTestObject('Object Repository/cart/Page_Klond Choice/a_Add Cart_1'))

WebUI.click(findTestObject('Object Repository/cart/Page_Klond Choice/button_Home_navbar-toggler'))

WebUI.click(findTestObject('Object Repository/cart/Page_Klond Choice/a_(                                      0 _829b13'))

WebUI.verifyElementText(findTestObject('Object Repository/cart/Page_Klond Choice/td_Salad'), name)

WebUI.verifyElementText(findTestObject('Object Repository/cart/Page_Klond Choice/td_Teriyaki Meatballs'), name2)

WebUI.closeBrowser()

