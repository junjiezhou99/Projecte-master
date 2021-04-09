import java.sql.*;

public class database {
    public static void main(String[] args) throws SQLException{
        Connection connection = null;
        PreparedStatement pstatement = null;
        ResultSet rs = null;
        String server = "jdbc:mysql://localhost:3306/";
        String bbdd = "vendes";
        String user = "root";
        String password = "wocao123";
        String sql;

        try {
            connection = DriverManager.getConnection(server + bbdd, user, password);

            sql = "select * from comandes";
            rs = pstatement.executeQuery();

            while(rs.next()){
                System.out.println(String.format("num_comanda: %d", rs.getString(1)));
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
        finally {
            rs.close();
            pstatement.close();
            connection.close();
        }

    }
}
