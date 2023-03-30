Student List Array Program
This is a simple Java program that allows users to manage a student database using an array list.

Code Overview
The program is composed of two classes, Student and functions, and the main method in the StudentListArr class.

Student class
The Student class has four private variables: prn_num (an integer), st_name (a string), st_dob (a string representing date of birth), and st_marks (an integer representing the student's marks). The class has a constructor that takes these variables as arguments and a getter and a setter method for each variable.


Functions Class
The functions class contains the methods for adding, displaying, searching, updating, and deleting student records in the database. The class contains an ArrayList of Student objects to store the student records.

addStudent
This method allows the user to add a new student record to the database. The user is prompted to enter the number of students to add and the details for each student. If a student with the same prn_num already exists, the program displays an error message.

display
This method displays all the student records in the database. It calls the printStudent method to print the details of each student.

search
This method allows the user to search for a specific student record in the database. The user is prompted to select the search criteria, such as prn_num, st_name, or position. The program then displays the student record(s) that match the search criteria.

update
This method allows the user to update an existing student record in the database. The user is prompted to enter the prn_num of the student record to update. If the student record exists, the program prompts the user to enter the new details for the student record.

delete
This method allows the user to delete an existing student record from the database. The user is prompted to enter the prn_num of the student record to delete. If the student record exists, the program removes the record from the ArrayList.