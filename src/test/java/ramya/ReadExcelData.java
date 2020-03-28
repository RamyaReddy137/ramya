package ramya;

import cts.miniproject.utility.ExcelDataConfig;

public class ReadExcelData {

public static void main(String[] args) {
// TODO Auto-generated method stub
ExcelDataConfig excel=new ExcelDataConfig("C:\\Users\\user\\eclipse-workspace\\ramya\\src\\test\\resources\\XLSX\\TextData.xlsm");
System.out.println(excel.getData(0, 0, 0));
System.out.println(excel.getData(0, 0, 1));
}

}
