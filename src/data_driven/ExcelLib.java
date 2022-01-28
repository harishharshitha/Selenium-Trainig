package data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/*
 * 
 * @author Harshitha G
 *
 */

public class ExcelLib {
	
	static String excelPath="./testResources/testData.xlsx";
	/**
	 * This method is used to read string data from an excel file
	 * @param sheetName provide the sheet name where you have the test data
	 * @param rowNum provide the row number where you have the test data
	 * @param cellNum provide the cell number which you want to read
	 * @return it returns the data in that respective sheet,row,cell in the form of string
	 */
	public static String readStringData(String sheetName,int rowNum,int cellNum)  {
		Workbook workbook=null;
		File absPath=new File(excelPath);
		FileInputStream fis;
		try {
			fis=new FileInputStream(absPath);
			workbook=WorkbookFactory.create(fis);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(EncryptedDocumentException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		
	}
	
	/**
	 * This method is used to read boolean data from an excel file
	 * @param sheetName provide the sheet name where you have the test data
	 * @param rowNum provide the row number where you have the test data
	 * @param cellNum provide the cell number which you want to read
	 * @return it returns the data in that respective sheet,row,cell in the form of boolean
	 */
	public static boolean readBooleanData(String sheetName,int rowNum,int cellNum) {
	
		Workbook workbook=null;
		File absPath=new File(excelPath);
		FileInputStream fis;
		try {
			fis=new FileInputStream(absPath);
			workbook=WorkbookFactory.create(fis);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(EncryptedDocumentException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();
		
	}
	
	/**
	 * This method is used to read numeric data from an excel file
	 * @param sheetName provide the sheet name where you have the test data
	 * @param rowNum provide the row number where you have the test data
	 * @param cellNum provide the cell number which you want to read
	 * @return it returns the data in that respective sheet,row,cell in the form of double
	 */
	
	
	public static double readNumericData(String sheetName,int rowNum,int cellNum) {
		
		Workbook workbook=null;
		File absPath=new File(excelPath);
		FileInputStream fis;
		try {
			fis=new FileInputStream(absPath);
			workbook=WorkbookFactory.create(fis);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(EncryptedDocumentException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
		
	}
}