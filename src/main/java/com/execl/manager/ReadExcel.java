package com.execl.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public void getExcelData(int rowIndex, int columnIndex) throws IOException {
		//excel location or path
		File file = new File("./src/test/resources/testCases.xls");
		//covert data to stream
		FileInputStream fis = new FileInputStream(file); //checked==>FileNotFoundException
		//Apache POI Methods to read excel
		//new or old ==> .xlsx = new ==> XSSF
		//1st steps = read whole excel as a book  = workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);// Checked = 
		//XSSFSheet sht = wb.getSheetAt(1);//index
		XSSFSheet sht = wb.getSheet("NY Branch");
		//int totalRow = sht.getPhysicalNumberOfRows(); //total row numbers
	//loop all rows
		for (int i=0;i<sht.getPhysicalNumberOfRows();i++) {
			if(i==rowIndex) {
			Row row = sht.getRow(i);
			//row.getLastCellNum();//total column number
		//start another loop for column
			for(int j=0;j<row.getLastCellNum();j++) {
				if(j==columnIndex) {
				Cell cell = row.getCell(j);//cell data
				System.out.println(cell.getStringCellValue());
			}
		}
			}
		}
	}
 public static void main(String[] args) throws IOException {
	 new ReadExcel().getExcelData(0, 0);
 }
	 
	
}

