package DDF_framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo_ddf {
WebDriver driver;
@BeforeTest
public void openbrowser(){
	
		driver=new FirefoxDriver();	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		driver.get("http://newtours.demoaut.com/");
		//driver.get("http://facebook.com");
		//driver.findElement(By.partialLinkText("Register")).click();
}
@Test
public void testFB() throws IOException, Exception{
	
	String[][] data=Readxl.setExcelFile("DDF_data", "Sheet5");
	for(int i=1;i<data.length;i++){
		/*for(int j=0;j<data.length;j++){
			System.out.println("data is "+data[i][j]);
			String FN=data[i][j];*/
			/*String LN=data[i][1];	
		
		String FN=data[i][0];
		String LN=data[i][1];
		String num=data[i][2];
	//	String renum=data[i][3];
		String pwd=data[i][4];*/
		/*String user=data[i][0];
		String pass=data[i][1];*/
		//String FN=data[i][2];
		//String LN=data[i][3];
	//	String FN=data[i][4];
		
	//login
	/*driver.findElement(By.id("email")).sendKeys(user);
	driver.findElement(By.id("pass")).sendKeys(pass);
	driver.findElement(By.id("loginbutton")).click();
	
	driver.navigate().back();*/
		//driver.findElement(By.name("firstname")).sendKeys(FN);
		//driver.findElement(By.name("lastname")).sendKeys(LN);
	//	driver.findElement(By.name("reg_email__")).sendKeys(num);
	//	driver.findElement(By.name("reg_email_confirmation__")).sendKeys(renum);
	//	driver.findElement(By.name("reg_passwd__")).sendKeys(pwd);
		//driver.findElement(By.id("u_0_r")).click();
		//driver.navigate().back();
	/*String FN=data[i][0];
	String LN=data[i][1];
	//String ph=data[i][2];
	String email=data[i][2];*/
	/*driver.findElement(By.name("firstName")).sendKeys(FN);
	driver.findElement(By.name("lastName")).sendKeys(LN);
	//driver.findElement(By.name("phone")).sendKeys(ph);
	driver.findElement(By.name("userName")).sendKeys(email);
	driver.findElement(By.name("register")).click();;
	driver.navigate().back();*/
	String user=data[i][0];
	String pass=data[i][1];
	String FN=data[i][2];
	String LN=data[i][3];
	String card=data[i][4];
	//int cardval=Integer.parseInt(card);
	//int cardval1=Integer.parseInt(row1.Column1)+1 : "0";
	
	driver.findElement(By.name("userName")).sendKeys(user);
	 driver.findElement(By.name("password")).sendKeys(pass);
	driver.findElement(By.name("login")).click();
	//Thread.sleep(2000);

	
	driver.findElement(By.name("findFlights")).click();
	driver.findElement(By.name("reserveFlights")).click();
	
	//public void pasenger(){
/*@Test(priority=1)
	public void flightdetails() throws IOException, InterruptedException
	{
		String[][] data=Readxl.setExcelFile("DDF_data", "Sheet5");
		
	for(int i=1;i<data.length;i++){
		String FN=data[i][2];
		String LN=data[i][3];
		String card=data[i][4];*/
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys(FN);
	driver.findElement(By.name("passLast0")).sendKeys(LN);
	//Thread.sleep(7000);
	driver.findElement(By.name("creditnumber")).sendKeys(card);
	driver.findElement(By.name("buyFlights")).click();
	driver.findElement(By.linkText("Home")).click();
	//driver.navigate().back();
	//testFB();
	driver.close();
	}}
/*@AfterTest
public void closeapp(){
	
	driver.close();
	}*/
	
}


