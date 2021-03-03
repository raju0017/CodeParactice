/*package interview.company.novelsynth;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileReading {

	public static <Cell> void main(String[] args) throws Exception {

		File f = new File("D:\\JavaWorkSpace/Interview/RealTime_Programs/src/novelsynth/file.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new WorkbookFactory().create(fis);
		Sheet s = wb.getSheet("Sheet1");

		int rno = s.getLastRowNum();
		for (int i = 0; i <= rno; i++) {
			Row row = s.getRow(i);
			int cno = row.getLastCellNum();
			for (int j = 0; j < cno; j++) {
				Cell cell = row.getCell(j);
				System.out.print(cell.getStringCellValue() + "    \t");
			}
			System.out.println();
		}
		System.out.println();

	}

}
*/