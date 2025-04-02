package packagename.ProjectName;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Data_Fetching {

 public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fs=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\SeleniumProject\\excelsheet\\seleniumexcel.xlsx");
	Workbook wb=WorkbookFactory.create(fs);
	String un=NumberToTextConverter.toText(wb.getSheet("login").getRow(2).getCell(0).getNumericCellValue());
	System.out.println(un);
	String pwd=wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
	System.out.println(pwd);
	}
}
