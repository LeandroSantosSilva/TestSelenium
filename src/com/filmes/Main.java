package com.filmes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	 public static void main(String[] args) {
	        
			System.setProperty("webdriver.chrome.driver","C:\\Users\\lssilva.BRQ\\eclipse-workspace\\ProejtoFilmes\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    	
	        String baseUrl = "http://www.brq.com/";
	        String expectedTitle = "BRQ Digital Solutions";
	        String actualTitle = "";

	        driver.get(baseUrl);

	        actualTitle = driver.getTitle();

	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        driver.close();
	    }
}
