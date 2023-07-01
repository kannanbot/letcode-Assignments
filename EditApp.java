package week1.day4;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditApp {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();  
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		//Thread.sleep(10000);
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//body[1]/div[6]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kannan");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kalai");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kalaikanan@gmail.com");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9999999999");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.xpath("//body[1]/div[6]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Newcomp");
		
		driver.findElement(By.xpath("//body[1]/div[6]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/table[1]/tbody[1]/tr[12]/td[2]/input[1]")).click();
		
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/a[3]")).click();
		
		
		driver.close();

	}

}
