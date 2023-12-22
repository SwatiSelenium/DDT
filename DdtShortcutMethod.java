package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DdtShortcutMethod 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fs = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Excel sheet\\swatiexcel.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		String value = wb.getSheet("login").getRow(4).getCell(1).getStringCellValue();
		System.out.println(value);
	}
}
