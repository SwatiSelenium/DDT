package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenTest 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fs = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Excel sheet\\swatiexcel.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		Sheet s = wb.getSheet("login");
		Row  r1 = s.getRow(2);
		Cell c1 = r1.getCell(0);
		String username = c1.getStringCellValue();
		System.out.println(username);
		
		Row r2 = s.getRow(2);
		Cell c2 = r2.getCell(1);
		String password = c2.getStringCellValue();
		
		
		System.out.println(password);
	}
}
