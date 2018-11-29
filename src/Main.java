import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        System.out.println("JDBC database eksempel");

        // 1) Load the JDBC driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Der er fejl med din database driver JDBC");
            e.printStackTrace();
        }
        System.out.println("Driver loaded");

        // 2) Connect to a database
        Connection connection = DriverManager.getConnection
                ("jdbc:mysql://localhost:33067/world" , "root", "");
        System.out.println("Database connected");

        // 3) Create a statement
        Statement statement = connection.createStatement();

        // 4) Execute a statement
        String sql = "select * from city";
        //ResultSet resultSet = statement.executeQuery(sql);
        String sql1 = "insert into city (Name);

        statement.executeUpdate(sql1);


        // 5) Iterate through the result and print the city names
        //while (resultSet.next())
          //  System.out.println(
            //        resultSet.getString(2) + "\t" + resultSet.getString(3));

        // 6) Close the connection
        connection.close();



    }
}