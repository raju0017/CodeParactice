package com.practies.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {

	public static void main(String[] args) throws Exception
	{
		File f = new File("D:/PRACTIES/Java/Selenium/data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c= r.createCell(1);
		c.setCellValue("SELENIUM");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
		System.out.println("SUCCESS");
	}

}
