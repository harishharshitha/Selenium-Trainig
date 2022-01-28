package data_driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExcel
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./testResources/testdata.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
//		Sheet sheet=workbook.getSheet("Sheet2");
//		Row rowone=sheettwo.getRow(1);
//		rowone.getCell(0);0
//		rowone.getCell(1);
		Row row1=workbook.getSheet("Sheet2").getRow(1);
		String data1=row1.getCell(1).getStringCellValue();
		boolean data2=row1.getCell(2).getBooleanCellValue();
		java.util.Date data3=row1.getCell(3).getDateCellValue();
		LocalDateTime data4=row1.getCell(3).getLocalDateTimeCellValue();
		double data5=row1.getCell(4).getNumericCellValue();
		
		System.out.println(data1+","+data2+","+data3+","+data4+","+data5);

	}
	
}
