Employee Management System is a Java program designed to manage employee information within various departments of an organization. The system consists of three main classes: Department, Employee, and Test.

Department Class:
The Department class represents different departments within the organization. It contains attributes such as the department's name and code. The class provides methods to retrieve the department's name and code, and it also has a toString method to generate a user-readable representation of the department.

Employee Class:
The Employee class is used to create and manage employee information. It includes attributes like the employee's name, address, salary, and associated department. This class offers methods to get the employee's city and phone number from the address, to raise the employee's salary, and to generate a formatted string containing employee details. The setDepartment method has been added to allow updating the employee's department.

Test Class:
The Test class serves as the main application entry point. It prompts the user to input employee names, department names, and department codes. It then creates instances of the Employee class and associates them with the provided departments. The program performs various operations, including counting employees in a specific department, giving a raise to an employee, and updating an employee's department. Finally, it displays the employee information using the overridden toString method.

The "Employee Management System" offers a simplified way to manage employee records and their associated departments. Users can input employee data, perform operations on employees, and view updated employee information. The program is designed to enhance the organization's HR processes by providing easy access to employee details and facilitating updates to department assignments and salaries.
