/*package interview.company.novelsynth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileWriting {

	public static void main(String[] args) throws Exception {
		File f = new File("D:\\JavaWorkSpace/Interview/RealTime_Programs/src/novelsynth/file.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet st = wb.getSheet("Sheet2");
		Row r = st.getRow(0);
		Cell c = r.getCell(0);
		c.setCellValue("Nagaraju");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		System.out.println("success");
	}
}
*/