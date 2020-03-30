package testData;

public class ExtraiDadoExcel {

	
	 public String getUserName() throws Exception {
		 
		 // vai naquele caminho do excel + neste excel e dentro dele, vai na planilha1
	     ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha1");
		 
		 return ExcelUtils.getCellData(1, 1);
	    }
	    
	    public String getPassWord() throws Exception {
	    	
	    	 ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha1");
	    	 
	        return ExcelUtils.getCellData(1, 2);
	    }
}
