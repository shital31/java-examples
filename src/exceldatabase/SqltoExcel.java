package exceldatabase;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;


public class SqltoExcel {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.Jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost 3306/mydatabase", "root", "123shital");
            Statement st = conn.createStatement();
            ResultSet rs =st.executeQuery("Select * from Enquiry");

            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("Enquiry");



            Row row = sheet.createRow(1);
            int x = 1;
            while (rs.next() ){
                String Name = rs.getString(2);
                String Surname = rs.getString(3);
                String Birthdate= rs.getString(4);
                String Address = rs.getString(5);
                String Gender = rs.getString(6);
                String Reason = rs.getString(7);

                row.createCell(0).setCellValue(Name);
                row.createCell(1).setCellValue(Surname);
                row.createCell(2).setCellValue(Birthdate);
                row.createCell(3).setCellValue(Address);
                row.createCell(4).setCellValue(Gender);
                row.createCell(5).setCellValue(Reason);

            }
            x += 1;


            String str = "E:\\Enquiry.xls";
            FileOutputStream fileOut;
            try {
                fileOut = new FileOutputStream(str);
                workbook.write(fileOut);
                fileOut.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}