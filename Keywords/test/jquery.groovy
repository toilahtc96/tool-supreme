package test
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebDriver as WebDriver
import java.util.List
import java.util.ArrayList

import org.junit.After
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor

import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.remote.RemoteWebElement



public class jquery {
	@Keyword
	def clickByName(String name) {
		WebDriver driver = DriverFactory.getWebDriver()
		JavascriptExecutor js;

		if (driver instanceof JavascriptExecutor) {
			js = (JavascriptExecutor)driver;
		}
		//\$('.name').each(function(index,val){if(val.innerHTML == 'Bandana Box Logo Tee'){val.click();\$rs = true;} \$rs = false;})

		//		js.executeScript("setTimeout(function() {window.location.reload();\$('.btn-primary').each(function(index,val){if(val.innerHTML == 'Xem Thêm'){val.click();\$rs = true;} \$rs = false;});},1000)",name)
		driver = DriverFactory.getWebDriver()

		if(By.cssSelector(".name")){
			ArrayList<WebElement> fields = driver.findElements(By.cssSelector(".name"))


			def bl = false;
			//			---theo danh sach---
			for (var in fields) {
				if(var.getText().equals(name)){
					bl = true;
					var.click();
					return bl;
				}
			}
			//			---end---
			//			---theo index-----
			//			if(fields.get(7).getText().equals(name)){
			//				bl = true;
			//				fields.get(7).click();
			//				return bl;
			//			}
			//-----end-----
			if(!bl){
				WebUI.refresh();
			}
		}
		return false;
	}

	@Keyword
	def fillInfo() {
		WebDriver driver = DriverFactory.getWebDriver()
		WebUI.waitForPageLoad(1)
		JavascriptExecutor js;
		if (driver instanceof JavascriptExecutor) {
			js = (JavascriptExecutor)driver;

		}



		js.executeScript("\$('#order_billing_name').val('Dao Van Dung')");
		js.executeScript("\$('#order_billing_name').val('Dao Van Dung')");
		js.executeScript("\$('#order_billing_name').val('Dao Van Dung')");
		js.executeScript("\$('#order_billing_name').val('Dao Van Dung')");
		js.executeScript("\$('#order_billing_name').val('Dao Van Dung')");
		js.executeScript("\$('#order_billing_name').val('Dao Van Dung')");
		js.executeScript("\$('#order_billing_name').val('Dao Van Dung')");
		js.executeScript("\$('#order_billing_name').val('Dao Van Dung')");
		js.executeScript("\$('#order_email').val('thegentlemen2711@gmail.com')");
		/// Moi ` truoc
		js.executeScript("\$('#order_tel').val('09096492311')");
		js.executeScript("\$('#order_billing_zip').val('3320001')");
		js.executeScript("\$('#order_billing_state').val(' 埼玉県')");
		js.executeScript("\$('#order_billing_city').val('川口市朝日2-22-1')");
		js.executeScript("\$('#order_billing_address').val('301号　セザール川口朝日町')");
		js.executeScript("\$('#remember_address').click()");
		js.executeScript("\$('#credit_card_type').val('visa')");
		js.executeScript("\$('#credit_card_n').val('4986360338731019')");
		js.executeScript("\$('#credit_card_month').val('02')");
		js.executeScript("\$('#credit_card_year').val('2022')");
		js.executeScript("\$('#credit_card_cvv').val('217')");
		js.executeScript("\$('#order_terms').click()");
		js.executeScript("\$('#order_billing_name').val('Dao Van Dung')");
		js.executeScript("\$('#order_email').val('thegentlemen2711@gmail.com')");

		//			submit
		//		    js.executeScript("\$('#submit_button').click()");

	}


	@Keyword
	def loadSoldOut() {
		WebDriver driver = DriverFactory.getWebDriver()

		driver = DriverFactory.getWebDriver()



		def bl = false;
		if(By.cssSelector(".sold-out")){
			try {
				if(driver.findElement(By.cssSelector(".sold-out"))){
					bl = true;
					WebUI.refresh();
					WebUI.waitForPageLoad(1)
					return bl;
				}

			} catch (Exception e) {
				e.printStackTrace()
				return bl;
			}

		}
		return bl;
	}

}
