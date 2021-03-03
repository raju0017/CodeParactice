package com.practies.selenium;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingCellsOfdata {

	public static void main(String[] args) throws Exception
	{

		File f = new File("D:/PRACTIES/Java/Selenium/data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet1");
		Row r = s.getRow(1);
		int lastcellno = r.getLastCellNum();
		System.out.println(lastcellno);
		
		for (int i = 0; i < lastcellno; i++) 
		{
			Cell c = r.getCell(i);
			String cellvalue = c.getStringCellValue();
			System.out.print(cellvalue+"     ");
			
		}
		
		System.out.println("SUccess");
		
		
	}

}