package br.com.serenitybddtemplate.utils;

import java.util.ArrayList;
import java.sql.*;
import java.util.Properties;

public class DBUtils {

    private static Connection connection;

    private static void closeConnection(){
        try {
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void connectDB(){
        //String connectionString = "jdbc:sqlserver://$SERVER;databaseName=$DATABASENAME;user=$DATABASEUSER;password=$DATABASEPASSWORD";

        String connectionString = "jbdc:mysql://127.0.0.1/;databaseName=bugtracker;user=root;password=";

        try {
            Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
            Statement stmt = null;
            connection = driver.connect(connectionString, new Properties());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> getQueryResult(String query){
        ArrayList<String> arrayList = null;

        try {
            connectDB();

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if(!rs.isBeforeFirst()){
                return null;
            }

            else{
                int numberOfColumns;
                ResultSetMetaData metadata=null;

                arrayList = new ArrayList<String>();
                metadata = rs.getMetaData();
                numberOfColumns = metadata.getColumnCount();

                while (rs.next()) {
                    int i = 1;
                    while(i <= numberOfColumns) {
                        arrayList.add(rs.getString(i++));
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            closeConnection();
        }
        return arrayList;
    }

    public static void executeQuery(String query){
        try {
            connectDB();

            Statement stmt = connection.createStatement();

            stmt.execute(query);

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            closeConnection();
        }
    }
}
