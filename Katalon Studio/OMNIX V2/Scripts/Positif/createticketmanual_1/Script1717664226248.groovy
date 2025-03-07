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

WebUI.callTestCase(findTestCase('Positif/switchappservice_1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Create Interaksi Manual/button_task_manual'))

WebUI.click(findTestObject('Object Repository/Create Interaksi Manual/button_clickplus'))

WebUI.setText(findTestObject('Object Repository/Create Interaksi Manual/input_fullname'), 'asyifa')

WebUI.setText(findTestObject('Login/input_email'), 'asyifa@gmail.com')

WebUI.setText(findTestObject('Object Repository/Create Interaksi Manual/input_phone_number'), '81283838323')

WebUI.click(findTestObject('Create Interaksi Manual/source'))

WebUI.click(findTestObject('Object Repository/Create Interaksi Manual/source_walk in'))

WebUI.setText(findTestObject('Object Repository/Create Interaksi Manual/textarea_testingqa'), 'testingqa')

WebUI.click(findTestObject('Object Repository/Create Interaksi Manual/button_Save'))

