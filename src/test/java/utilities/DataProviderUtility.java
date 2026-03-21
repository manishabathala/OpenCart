package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderUtility {
	
	@DataProvider(name="dp")
	public String[][] getData() throws IOException{
		String path=".//testData//Opencart_LoginData.xlsx";
		
		ExcelUtility exUtil=new ExcelUtility(path);
		int rows=exUtil.getRowCount("Sheet1");
		int columns=exUtil.getCellCount("Sheet1", 1);
		
		String loginData[][]=new String[rows][columns];
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<columns;j++) {
				loginData[i-1][j]=exUtil.getCellData("Sheet1", i, j);
			}
		}
		
		return loginData;
		
	}

}
