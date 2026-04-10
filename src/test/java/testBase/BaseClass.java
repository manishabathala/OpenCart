package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	
	@BeforeClass(groups= {"Sanity","Regression","Master","DataDriven"})
	@Parameters({"os","browser"})
	public void setUp(String os,String br) throws IOException{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//src/test/resources//config.properties");
		prop=new Properties();
		prop.load(file);
		
		switch(br) {
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		default:System.out.println("Invalid Browser Name");return;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("appurl"));
		driver.manage().window().maximize();
	}
	
	@AfterClass(groups= {"Sanity","Regression","Master","DataDriven"})
	public void tearDown() {
		driver.quit();
	}
	
	public String randomString() {
		return RandomStringUtils.randomAlphabetic(5);

	}
	
	public String randomNumber() {
		return RandomStringUtils.randomNumeric(10);
		
	}
	
	public String randomAlphaNumeric() {
		return RandomStringUtils.randomAlphabetic(4)+"@"+RandomStringUtils.randomNumeric(4);
	}
	
	public String captureScreenShot(String testName) {
		
		String timeStamp=new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		String targetFilePath=System.getProperty("user.dir")+"//screenshots//"+testName+"_"+timeStamp+".png";
		File targetFile=new File(targetFilePath);
		sourceFile.renameTo(targetFile);
		return targetFilePath;
		
	}

}
