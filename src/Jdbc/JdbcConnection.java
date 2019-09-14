package Jdbc;

import java.sql.*;

public class JdbcConnection {
    public static void main(String[] args) {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/Student", "root", "123shital");
        Statement st=con.createStatement();
        PreparedStatement pst = con.prepareStatement("insert into roll_call_list values(?,?,?)");
        pst.setInt(1,3);
        pst.setString(2,"Sagar");
        pst.setString(3,"BCS");
        pst.executeUpdate();
        ResultSet rs=st.executeQuery("select * from roll_call_list");
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
        con.close();
    }
    catch (Exception e ) {
        System.out.println( e.getMessage( ) );
    }

}
}
