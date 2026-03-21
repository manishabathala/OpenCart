package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public FileInputStream fi;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	String path;
	
	public ExcelUtility(String path) {
		this.path=path;
	}
	
	public int getRowCount(String sheetName) throws IOException {
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		XSSFSheet sheet=workbook.getSheet(sheetName);
		int rowCount=sheet.getLastRowNum();
		return rowCount;
	}
	
	public int getCellCount(String sheetName,int rowNum) throws IOException {
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		XSSFSheet sheet=workbook.getSheet(sheetName);
		XSSFRow row=sheet.getRow(rowNum);
		int cellCount=row.getLastCellNum();
		return cellCount;
	}
	
	public String getCellData(String sheetName,int rowNum,int CellNum) throws IOException {
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		XSSFSheet sheet=workbook.getSheet(sheetName);
		XSSFRow row=sheet.getRow(rowNum);
		XSSFCell cell=row.getCell(CellNum);
		String cellData=cell.getStringCellValue();
		return cellData;
		
	}

}
