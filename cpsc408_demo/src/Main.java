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

        //Creates an array to store the data from the csv file
        //Enter the csvfile path for the reader to locate the file
        clientArray= pop.CSVReader("/Users/Sam_comp/PycharmProjects/Assignment3/Salon.csv");

        pop.InsertToDatabase(conn); //insert data into the database
        pop.DisplayDatabase(conn); //Prompts for displaying data tables

    }

}