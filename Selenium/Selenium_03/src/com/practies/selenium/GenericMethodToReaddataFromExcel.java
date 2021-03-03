package com.practies.selenium;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericMethodToReaddataFromExcel
{
	public static String  ReaddatafromExcel(String filepath, String sheetname, int rowidex, int cellno) throws Exception
	{
		File f = new File(filepath);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet st = wb.getSheet(sheetname);
		Row r = st.getRow(rowidex);
		Cell c = r.getCell(cellno);
		String data = c.getStringCellValue();
		
		return data;
	}
	public static void main(String[] args) throws Exception 
	{
		String str = GenericMethodToReaddataFromExcel.ReaddatafromExcel("D:/PRACTIES/Java/Selenium/data.xlsx", "Sheet1", 1, 1);
		
		System.out.println(str);
	}

}
