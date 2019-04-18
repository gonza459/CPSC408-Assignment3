# CPSC408-Assignment3

Samantha Gonzalez
2282119
Rene German
CPSC 408-01
Assignment 3
4/17/19

src files included:
DbConnect.java
PopulateDB.java
Main.java

Generating Data:
-Run FileMaker.py in Pycharm with faker to generate as many records in a .csv file

Normalizing Data:
-DBConnection.java connects intelliJ to the Database on Google cloud
-Enter the path to in csvreader method (pop.CSVReader()) in Main.java
    -CSVReader is initiated by PopulateDB.java
-pop.InsertToDatabase(conn) will insert the information from the csvfile into the database and the respective tables
-pop.DisplayDatabase(conn) will initiate a prompt to display a table from the database
    
Partner:
-Nic Cordova 
