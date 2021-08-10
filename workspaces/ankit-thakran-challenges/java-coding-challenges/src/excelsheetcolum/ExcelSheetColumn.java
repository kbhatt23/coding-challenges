package excelsheetcolum;

public class ExcelSheetColumn {
	public static void main(String[] args) {
		System.out.println(titleToNumber("FXSHRXW"));
	}

	public static int titleToNumber(String columnTitle) {
		int result = 0;
		for(int i = columnTitle.length()-1 , k=0 ; i >=0 ; i--,k++) {
			result += Math.pow(26, k)*(columnTitle.charAt(i) - 'A' + 1);
		}
		
		return result;
	}
}
