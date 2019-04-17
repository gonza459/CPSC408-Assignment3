import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.*;
import java.sql.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println("test");

        Connection conn;
        DBConnection database = new DBConnection();
        conn = database.getMySqlConnection();

        List<List<String>> clientArray;

        PopulateDB pop = new PopulateDB();
        clientArray= pop.CSVReader("/Users/Sam_comp/IdeaProjects/cpsc408_demo/src/Clients.csv");

        pop.createDatabase(conn);

    }

}