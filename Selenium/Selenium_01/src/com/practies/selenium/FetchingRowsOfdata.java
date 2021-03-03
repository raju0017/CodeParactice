package com.practies.selenium;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingRowsOfdata {

	public static void main(String[] args) throws Exception
	{
		File f = new File("D:/PRACTIES/Java/Selenium/data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet1");
		
		int lastrowno = s.getLastRowNum();
		
		System.out.println(lastrowno);
		for (int i = 0; i <=lastrowno; i++) 
		{
			Row r = s.getRow(i);
			Cell c= r.getCell(0);
			System.out.println(c.getStringCellValue());
			
			
		}
		
	}

}
