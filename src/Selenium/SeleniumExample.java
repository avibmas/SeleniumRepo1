package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pageobjects.allelements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SeleniumExample extends allelements{

	public static void main(String...args){
	
	WebDriver driver;
	List<String> finalvalues = new ArrayList<String>();
	
	driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe" );
	
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
	
	List<WebElement> ddlist = new ArrayList<WebElement>();
	driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
	Select option = new Select(driver.findElement(By.xpath("//select")));
	ddlist = option.getOptions();
	
	Iterator itr = ddlist.iterator();
	while(itr.hasNext()){
		WebElement a1 =  (WebElement) itr.next();
		finalvalues.add(a1.getText());
		System.out.println("values in option >>>>"+a1.getText());
	}
	
	Collections.sort(finalvalues);
	Iterator itr2 = finalvalues.iterator();
	while(itr2.hasNext()){
		String a2 = (String) itr2.next();
		System.out.println("values in list 2 after sorting >>>>"+a2);
	}
	
	
	}
}
