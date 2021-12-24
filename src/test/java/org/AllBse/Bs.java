package org.AllBse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bs {

	public static WebDriver driver;

	public static WebElement element;

	public static void launchBrowser() {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	}

	public static void lauchUrl(String enterUrl) {
		// TODO Auto-generated method stub

		driver.get(enterUrl);

	}

	public static void maximize() {
		// TODO Auto-generated method stub

		driver.manage().window().maximize();

	}

	public static void close() {
		// TODO Auto-generated method stub

		driver.close();
	}

	public static void quit() {
		// TODO Auto-generated method stub

		driver.quit();

	}

	public static String getCurrtentUrl() {
		// TODO Auto-generated method stub

		String currentUrl = driver.getCurrentUrl();

		return currentUrl;

	}

	public static String getTitle() {
		// TODO Auto-generated method stub

		String title = driver.getTitle();

		return title;

	}

	public static String WindowId() {
		// TODO Auto-generated method stub

		String windowHandle = driver.getWindowHandle();

		return windowHandle;

	}

	public static Set<String> windowIds() {
		// TODO Auto-generated method stub

		Set<String> windowHandles = driver.getWindowHandles();

		return windowHandles;

	}

	public static WebElement findElementById(String id) {
		// TODO Auto-generated method stub

		WebElement element = driver.findElement(By.id(id));

		return element;

	}

	public static WebElement findElementByname(String name) {
		// TODO Auto-generated method stub

		WebElement element = driver.findElement(By.name(name));

		return element;

	}

	public static WebElement findElementByClassName(String className) {
		// TODO Auto-generated method stub

		WebElement element = driver.findElement(By.className(className));

		return element;

	}

	public static WebElement FindElementByXpath(String xpath) {
		// TODO Auto-generated method stub

		WebElement element = driver.findElement(By.xpath(xpath));

		return element;

	}

	public WebElement FindElementByTagName(String tagName) {
		// TODO Auto-generated method stub

		WebElement element = driver.findElement(By.tagName(tagName));

		return element;
	}

	public static void refresh() {
		// TODO Auto-generated method stub

		driver.navigate().refresh();

	}

	public static void forward() {
		// TODO Auto-generated method stub

		driver.navigate().forward();

	}

	public static void backword() {
		// TODO Auto-generated method stub

		driver.navigate().back();

	}

	public void sendtext(WebElement element, String text) {
		// TODO Auto-generated method stub

		element.sendKeys(text);

	}

	public void click(WebElement element) {
		// TODO Auto-generated method stub

		element.click();

	}

	public List<WebElement> FindElements(WebElement element, String tagName) {
		// TODO Auto-generated method stub

		List<WebElement> elements = element.findElements(By.tagName(tagName));

		return elements;

	}

	public String getText(WebElement element) {
		// TODO Auto-generated method stub

		String text = element.getText();

		return text;

	}

	public String getTagName(WebElement element) {
		// TODO Auto-generated method stub

		String tagName = element.getTagName();

		return tagName;

	}

	public String getAttributeValue(WebElement element) {
		
		String attribute = element.getAttribute("value");
		
		return attribute;
}
	public void clear(WebElement element) {
		// TODO Auto-generated method stub

		element.clear();

	}

	public boolean isEnable(WebElement element) {
		// TODO Auto-generated method stub
		boolean enabled = element.isEnabled();

		return enabled;
	}

	public boolean isSelect(WebElement element) {
		// TODO Auto-generated method stub

		boolean selected = element.isSelected();

		return selected;

	}

	public boolean isDisplay(WebElement element) {
		// TODO Auto-generated method stub

		boolean displayed = element.isDisplayed();

		return displayed;

	}

	public void selectByIndex(WebElement element, int index) {
		// TODO Auto-generated method stub

		Select s = new Select(element);

		s.selectByIndex(index);

	}

	public void selectByVisibleText(WebElement element, String text) {
		// TODO Auto-generated method stub

		Select s = new Select(element);

		s.selectByVisibleText(text);

	}

	public void selectByValue(WebElement element, String value) {
		// TODO Auto-generated method stub

		Select s = new Select(element);

		s.selectByValue(value);

	}

	public List<WebElement> getOptions(WebElement element) {
		// TODO Auto-generated method stub

		Select s = new Select(element);

		List<WebElement> options = s.getOptions();

		return options;

	}

	public List<WebElement> getAllSelectedOptions(WebElement element) {
		// TODO Auto-generated method stub

		Select s = new Select(element);

		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();

		return allSelectedOptions;

	}

	public WebElement getFirstSelectedOption(WebElement element) {
		// TODO Auto-generated method stub

		Select s = new Select(element);

		WebElement firstSelectedOption = s.getFirstSelectedOption();

		return firstSelectedOption;

	}

	public void deselectByindex(WebElement element, int index) {
		// TODO Auto-generated method stub

		Select s = new Select(element);

		s.deselectByIndex(index);

	}

	public void deselectByValue(WebElement element, String value) {
		// TODO Auto-generated method stub

		Select s = new Select(element);

		s.deselectByValue(value);

	}

	public void deselectByVisibleText(WebElement element, String text) {
		// TODO Auto-generated method stub

		Select s = new Select(element);

		s.deselectByVisibleText(text);

	}

	public void deselectAll(WebElement element) {
		// TODO Auto-generated method stub

		Select s = new Select(element);

		s.deselectAll();

	}

	public void rightClick() {
		// TODO Auto-generated method stub

		Actions action = new Actions(driver);

		action.contextClick().perform();

	}

	public void mouseHover(WebElement element) {
		// TODO Auto-generated method stub

		Actions action = new Actions(driver);

		action.moveToElement(element).perform();

	}

	public void doubleClick(WebElement element) {
		// TODO Auto-generated method stub

		Actions action = new Actions(driver);

		action.doubleClick(element);

	}

	public void dragAndDrop(WebElement element1, WebElement element2) {
		// TODO Auto-generated method stub

		Actions action = new Actions(driver);

		action.dragAndDrop(element1, element2);

	}

	public static void takescrrenShot(String path) throws IOException {
		// TODO Auto-generated method stub

		File f = new File(path);

		f.createNewFile();

		TakesScreenshot ss = (TakesScreenshot) driver;

		File as = ss.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(as, f);

	}

	public void jsExecutorSendText(String id, String text) {
		// TODO Auto-generated method stub

		// JavascriptExecutor js = new JavascriptExecutor(element);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement e = findElementById(id);

		js.executeScript("arguments[0].setAttribute('value',text)", e);

	}

	public void jsExecutorgetText(String id) {
		// TODO Auto-generated method stub

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement e = findElementById(id);

		js.executeScript("arguments[0].getAttribute('value')", e);

	}

	public void jsExecutorgetClick(String id) {
		// TODO Auto-generated method stub

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement e = findElementById(id);

		js.executeScript("arguments[0].click", e);

	}
	
	
	
	public String getExcelValue(String sheetName,int index,int cell) throws IOException {

		File file  = new File("C:\\Users\\mr_hacker\\eclipse-testng\\ExcelDrivernPom\\Excel\\HotelBook.xlsx");
		
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook book = new XSSFWorkbook(stream);
		
		Sheet sheet = book.getSheet(sheetName);
		
		Row row2 = sheet.getRow(index);
		
		Cell cell2 = row2.getCell(cell);
		
		
		String stringCellValue = cell2.getStringCellValue();
		
		return stringCellValue;
		
	}
}
