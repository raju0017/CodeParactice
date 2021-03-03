package keyworddrivenframework;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel 
{
	Workbook wb;
	Sheet sh;

	public void openSheet(String filePath) {
		FileInputStream fis;
		try {
			fis = new FileInputStream(filePath);
			wb = WorkbookFactory.create(fis);
			sh=wb.getSheetAt(0);
			
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	public String getValueFromCell(int iColNumber, int iRowNumber) {
		return sh.getRow(iRowNumber).getCell(iColNumber).getStringCellValue();
	}

	public int getRowCount() {
		return sh.getLastRowNum();
	}

	public int getColumnCount() {
		return 5;
	}

}
