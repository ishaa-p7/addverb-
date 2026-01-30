import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url="jdbc:postgresql://localhost:5432/demo";
        String uname="postgres";
        String pass="postgres123";
        String sql = "select sname from student where sid=1";
        Class.forName("org.postgresql.Driver");
Connection con= DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        con.close();
        System.out.println("Connection closed");
        System.out.println("ce");
    }
}
