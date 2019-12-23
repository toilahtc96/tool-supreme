import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebDriver as WebDriver
import java.util.List as List
import java.util.ArrayList as ArrayList
import org.junit.After as After
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import org.openqa.selenium.remote.RemoteWebElement as RemoteWebElement
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser('https://www.supremenewyork.com/mobile/#categories/new')

def timeRun = new Date(2019, 12, 23, 5, 15, 0)

println(timeRun - new Date())

WebDriver driver = DriverFactory.getWebDriver()

def name = 'Bandana Box Logo Tee'

//Checkerboard Puffy Jacket
//if (WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Supreme/spName'), 10)) {
while (!(CustomKeywords.'test.jquery.clickByName'('Checkerboard Puffy Jacket'))) {
    WebUI.delay(0.2)
}

while (CustomKeywords.'test.jquery.loadSoldOut'()) {
    WebUI.delay(0.2)
}

if (By.id('size-options')) {
    def size = driver.findElement(By.id('size-options'))

    size.sendKeys('Large')

    if (By.className('cart-button')) {
        driver.findElement(By.className('cart-button')).click()

        driver.findElement(By.id('checkout-now')).click()

        CustomKeywords.'test.jquery.fillInfo'()
    }
}