package testData;

public class Constant {



    public static final String Path_TestData = "src/test/resources/";

    public static final String File_TestData = "Principal.xlsx";
    
    public String getUserName() throws Exception {
        return ExcelUtils.getCellData(2, 2);
    }
    
    public String getPassWord() throws Exception {
        return ExcelUtils.getCellData(2, 3);
    }
}
