package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;


public class DataProviders {
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException{
		String path = ".//testData//LoginData.xlsx";		// taking xl file from testdata
		
		ExcelUtility xlutils = new ExcelUtility(path);		// creating an object for excelutility file
		
		int totalrows = xlutils.getrowCount("Sheet1");
		int totalcols = xlutils.getCellCount("Sheet1", 1);
		
		String logindata[][] = new String[totalrows][totalcols];		// created for 2-D array which can store
		
		for(int i=1;i<=totalrows;i++) {		//1 read the data from xl storing in 2-D array(row data)
			for(int j=0;j<totalcols;j++) {		//0 i is row, j is coloumn
				logindata[i-1][j] = xlutils.getCellData("Sheet1", i, j);		//1,0
			}
		}
		
		return logindata;		// returning 2-D array
		
	}

}
