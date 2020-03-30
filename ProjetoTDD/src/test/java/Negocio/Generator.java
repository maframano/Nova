package Negocio;

import java.security.Timestamp;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.formula.functions.T;

public class Generator {
	
	public static String dataHoraParaArquivo() {
		
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		
		return new SimpleDateFormat("yyyyMMddhhmmss").format(ts);
	}

}
