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

WebUI.click(findTestObject('Object Repository/Create As/Page_Demo  Omnix/workspace'))

WebUI.click(findTestObject('Object Repository/Create As/Page_Demo  Omnix/button_Create As'))

WebUI.click(findTestObject('Object Repository/Create As/Page_Demo  Omnix/div_Case only'))

WebUI.setText(findTestObject('Object Repository/Create As/Page_Demo  Omnix/input_Subject_basic_subject'), 'testing lagi')

WebUI.click(findTestObject('Object Repository/Create As/Page_Demo  Omnix/button_category'))

WebUI.click(findTestObject('Object Repository/Create As/Page_Demo  Omnix/button_Choose'))

WebUI.setText(findTestObject('null'), 't')

WebUI.setText(findTestObject('null'), 'te')

WebUI.setText(findTestObject('null'), 'tes')

WebUI.setText(findTestObject('null'), 'test')

WebUI.setText(findTestObject('null'), 't')

WebUI.setText(findTestObject('null'), 'te')

WebUI.setText(findTestObject('null'), 'tes')

WebUI.setText(findTestObject('Object Repository/Create As/Page_Demo  Omnix/textarea_test_1'), 'test')

WebUI.setText(findTestObject('Object Repository/Create As/Page_Demo  Omnix/input_Negara_basic_field_1'), '')

WebUI.click(findTestObject('Object Repository/Create As/Page_Demo  Omnix/div_Indonesia'))

WebUI.click(findTestObject('Object Repository/Create As/Page_Demo  Omnix/button_category'))

WebUI.click(findTestObject('Object Repository/Create As/Page_Demo  Omnix/button_Choose'))

WebUI.setText(findTestObject('Object Repository/Create As/Page_Demo  Omnix/textarea_jakarta'), 'jakarta')

WebUI.click(findTestObject('Object Repository/Create As/Page_Demo  Omnix/label_Positive'))

WebUI.click(findTestObject('Object Repository/Create As/Page_Demo  Omnix/button_Save'))

