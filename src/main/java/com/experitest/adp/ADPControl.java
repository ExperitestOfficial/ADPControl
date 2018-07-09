package com.experitest.adp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ADPControl {
	private String url;
	private String user;
	private String password;
	public ADPControl(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
	}
	
	public void resetPort(int portId) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(url + "/NMC/1kia1o4L0+zoOLyDNy0BtQ/outlctrl.htm");
		driver.findElement(By.xpath("//input[@name='login_username']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='login_password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log On']")).click();
		new Select(driver.findElementByName("outlet_control_option")).selectByVisibleText("Reboot Immediate");
		driver.findElement(By.xpath("//input[@value='?" + portId +"']")).click();
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		driver.findElement(By.xpath("//input[@value='Apply']")).click();
	}
}
