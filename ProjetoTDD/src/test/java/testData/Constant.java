package testData;

public class Constant {

   // public static final String URL = "http://www.store.demoqa.com";
    
   // public static final String Username = "testuser_1";

   // public static final String Password = "Test@123";

    public static final String Path_TestData = "C:\\Users\\mafra.romao\\eclipse-workspace\\nova\\ProjetoTDD\\src\\test\\resources";

    public static final String File_TestData = "Principal.xlsx";
    
    public String getUserName() throws Exception {
        return ExcelUtils.getCellData(2, 2);
    }
    
    public String getPassWord() throws Exception {
        return ExcelUtils.getCellData(2, 3);
    }
}
