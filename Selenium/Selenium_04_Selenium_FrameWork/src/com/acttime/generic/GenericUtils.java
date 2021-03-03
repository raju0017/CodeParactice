package com.acttime.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils
{
	//DDL generic
	
	public static void selectDDLByIndex(WebElement element, int index)
	{
		Select sct = new Select(element);
		sct.selectByIndex(index);
		
	}
	public static void selectDDLByvalue(WebElement element, String value)
	{
		Select sct = new Select(element);
		sct.selectByValue(value);
		
	}
	public static void selectDDLByVisibleText(WebElement element, String visibleText)
	{
		Select sct = new Select(element);
		sct.selectByVisibleText(visibleText);
		
	}
	
	public static boolean checkDDLisMultiple(WebElement element)
	{
		Select sct = new Select(element);
		boolean status = sct.isMultiple();
		return status; 
		
	}
	public static void deselectDDLByIndex(WebElement element, int index)
	{
		Select sct = new Select(element);
		sct.deselectByIndex(index);
		
	}
	public static void deselectDDLByvalue(WebElement element, String value)
	{
		Select sct = new Select(element);
		sct.deselectByValue(value);
		
	}
	public static void deselectDDLByVisibleText(WebElement element, String visibleText)
	{
		Select sct = new Select(element);
		sct.deselectByVisibleText(visibleText);
		
	}
	public static void deselectAllOptions(WebElement element)
	{
		Select sct = new Select(element);
		sct.deselectAll();
	}
	
	
	// Alert generic
	
	public static void acceptAlert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
	}
	public static void dismissAlert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
		
	}
	public static String getAlertText(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		return text;
	}
	
	
	//Window handles and controlshift
	
	static Set<String> handles;
	
	public static void controlShiftToChildWindow(WebDriver driver)
	{
		handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		
	}
	
	public static void controlShiftToParentWindow(WebDriver driver)
	{
		handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parent = it.next();
		
		driver.switchTo().window(parent);
		
	}
	
	public static boolean checkNextWindow(WebDriver driver)
	{
		handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		boolean status = it.hasNext();
		return status;
		
	}
	
	
	// MouseOver Actions
	
	
	public static void mouseOver(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
	}
	public static void rightclick(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
		
	}
	public static void doubleclick(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
		
	}
	
	// Exceldata File handling
	
	
	public static String getExcelData(String filepath,String sheetname,int rowindex,int cellno)
	{
		String data=null;
		try
		{
			File f = new File(filepath);
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			
			Sheet st = wb.getSheet(sheetname);
			Row  r =st.getRow(rowindex);
			Cell c = r.getCell(cellno);
			data = c.getStringCellValue();
			
		}
		catch( Exception e){}
		return data;
		
	}
	public static void writeDataintoExcel(String filepath,String sheetname,int rowindex,int cellno, String data)
	{
		try
		{
			File f = new File(filepath);
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			
			Sheet st = wb.getSheet(sheetname);
			Row  r =st.getRow(rowindex);
			Cell c = r.getCell(cellno);
			data = c.getStringCellValue();
			c.setCellValue(data);
			
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			
		}
		catch( Exception e){}
	}
	
	

}


