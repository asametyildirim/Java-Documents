import java.sql.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet;

        try{
            connection = dbHelper.getConnection();
            System.out.println("Connection Successful");

            String sql ="DELETE FROM city where id=?;";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4089);


            int result = statement.executeUpdate();
            System.out.println("Registration Deleted");

        }catch (SQLException e){
            dbHelper.showErrorMesage(e);
        }finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }


    public static void selectDemo() {
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;

        try{
            connection = dbHelper.getConnection();
            System.out.println("Connection Successful");

            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from world.country");
            ArrayList<Country> countries = new ArrayList<Country>();

            while (resultSet.next()){
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }

            System.out.println(countries.size());

        }catch (SQLException e){
            dbHelper.showErrorMesage(e);
        }finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void InsertDemo(){
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet;

        try{
            connection = dbHelper.getConnection();
            System.out.println("Bağlantı Başarılı");
            String sql ="insert into city (Name,CountryCode,District,Population) values(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"CapitalCity");
            statement.setString(2,"TUR");
            statement.setString(3,"CapitalCity1");
            statement.setInt(4,1453);
            int result = statement.executeUpdate();
            System.out.println("Registration Add");


        }catch (SQLException e){
            dbHelper.showErrorMesage(e);
        }finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void updateDemo(){
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet;

        try{
            connection = dbHelper.getConnection();
            System.out.println("Connection Successful");

            String sql ="update city set Population =1,District='Baskent' where id=?;";

            statement = connection.prepareStatement(sql);

            statement.setInt(1,4089);


            int result = statement.executeUpdate();
            System.out.println("Registration Update");

        }catch (SQLException e){
            dbHelper.showErrorMesage(e);
        }finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}