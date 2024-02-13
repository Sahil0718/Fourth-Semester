// FOR DATA_CONNECTIONS
// 1st we need connection_url
// 2nd we need driver, we need to seperately install the driver
// 3rd we need basic statement , callable statements: has dynamic input and
// output statements, prepaid statements: SQL Injection free statement

// we need url to connect to databases , name and passwords.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class labtest {

    // creating the variables to be passed.
    public static String USERNAME = "root";
    public static String PASSWORD = "oracle123";
    public static String URL = "jdbc:mysql://localhost:3306/java_nccs";

    public static void main(String[] Args) throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        Statement stmt = con.createStatement();
        stmt.executeUpdate("insert into student value(1,'RAM','9873818291'),(2,'SHYAM','9873619011'),(3,'NIRAJ', '9875609364')");
                     System.out.println("INSERT COMPLETED!!");
    }
}
