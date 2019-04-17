import oracle.jrockit.jfr.StringConstantPool;

import java.lang.*;
import java.io.*;
import java.sql.*;
import java.sql.Date;
import java.util.*;

public class PopulateDB {

    List<List<String>> attributes = new ArrayList<List<String>>();
    Connection conn;


    public PopulateDB() {

    }


    public List<List<String>> CSVReader(String csvfile) throws FileNotFoundException{

        Scanner s = new Scanner(new File(csvfile));
        s.useDelimiter(",");

        while(s.hasNext()) {
            String temp = s.nextLine();
            List<String> tuples = Arrays.asList(temp.split(","));

            attributes.add(tuples);
        }
        s.close();
        System.out.println(attributes);
        return attributes;
    }


    public void createDatabase(Connection conn) throws Exception{
        //List<String> headers = attributes.get(0);
       // System.out.print(headers);

        String insertSql = "Insert into Clients(FirstName, LastName, homeAddress, email, creditNum, cardExpiration)" +
                "VALUES (?, ?, ?, ?, ?, ?)";

        for(int i = 1; i <= attributes.size(); ++i) { // start from 1 to exclude headers
            List<String> row = attributes.get(i);
            System.out.println(row);

            String firstName = row.get(0);
            //System.out.println(firstName);
            String lastName = row.get(1);
            String homeAdd = row.get(2);
            String email = row.get(3);
            System.out.println(email);
            Integer cardNum = Integer.getInteger(row.get(4));
            Date cardExp = Date.valueOf(row.get(5));

            try (PreparedStatement query = conn.prepareStatement(insertSql)){
            query.setString(1, firstName);
            query.setString(2, lastName);
            query.setString(3, homeAdd);
            query.setString(4, email);
            query.setInt(5, cardNum);
            query.setDate(6, cardExp);
            query.executeUpdate();
            }

        }
    }
}
