from faker import Faker
import csv

faker = Faker()

def writeToCSV():
    with open(fileName, 'w') as csvfile:
        fieldnames = ['first_name', 'last_name', 'address', 'email', 'creditCardNum', 'cardExpiration']

        writer = csv.DictWriter(csvfile, fieldnames = fieldnames)

        writer.writeheader()
        for i in range(int(numTuples)):
            writer.writerow(
                {
                    'first_name': faker.first_name(),
                    'last_name': faker.last_name(),
                    'address': faker.address(),
                    'email': faker.email(),
                    'creditCardNum': faker.credit_card_number(),
                    'cardExpiration': faker.credit_card_expire(),
                    'ID': faker.ean8()
                }
            )

if __name__ == '__main__':
    fileName = input('Enter the name of the file you want to create: ')
    fileName = fileName + '.csv'
    numTuples = input('Enter the number of tuples you would like: ')
    writeToCSV()

