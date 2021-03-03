package com.practies.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.SystemOutLogger;

public class GenericMethodTowriteDataintoExcel 
{
	public static void writedata(String filepath, String sheetname, int rowindex, int cellno, String data  ) throws Exception
	{
	
		File f = new File("D:/PRACTIES/Java/Selenium/data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet st = wb.getSheet(sheetname);
		Row r = st.getRow(rowindex);
		Cell c= r.createCell(cellno);
		c.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
	}

	public static void main(String[] args) throws Exception 
	{
		GenericMethodTowriteDataintoExcel.writedata("D:/PRACTIES/Java/Selenium/data1.xlsx", "sheet1", 0, 0, "NAGARAJu");
		
		System.out.println("SAUCCESS");

	}
	

}
