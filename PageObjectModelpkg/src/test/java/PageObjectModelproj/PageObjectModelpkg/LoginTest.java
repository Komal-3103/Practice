package PageObjectModelproj.PageObjectModelpkg;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.orghrm.utility.ExcelDataReader;

public class LoginTest extends BaseTest {

//	@Test
//	public void verifyLogin() {
//		HomePage hp = loginPage.doLogin("Admin", "admin123");
//
//		System.out.println("Starts");
//
//		String actPgHeading = hp.homePageHeading();
//
//		Assert.assertEquals(actPgHeading, "Dashboard", "Something Went wrong");
//
//		System.out.print("Info : Login Successfully");
//
//	}
	
	
	@Test(dataProvider="readData")
	public void LoginNegativeTesting(String username,String password) throws IOException {
	

		HomePage hp = loginPage.doLogin(username, password);

	}

	@DataProvider
	public String[][] readData() throws IOException {
		// get path of excel sheet
		String sheetPath = System.getProperty("user.dir") + "\\com.qa.orghrm.testData\\ExcelDataReader.xlsx";
		ExcelDataReader xlr = new ExcelDataReader(sheetPath);

		// row count
		int countR = xlr.getRowCount("Login");
		System.out.println("Total Rows" + countR);

		// column count
		int countCol = xlr.getColumnCount();
		System.out.println("Total Columns" + countCol);

		// read data from cell
		/*
		 * 
		 * String calVal = xlr.getCellData(1,1); System.out.println(calVal);
		 * 
		 */

		// read all data from cell
		String[][] dataArr = new String[countR - 1][countCol];
		for (int row = 1; row < countR; row++) {
			for (int col = 0; col < countCol; col++) {
				dataArr[row - 1][col] = xlr.getCellData(row, col);
			}
		}
		return dataArr;

	}
}
