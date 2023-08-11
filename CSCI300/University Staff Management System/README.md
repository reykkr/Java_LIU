University Staff Management System is a Java-based application that facilitates the management of various staff members within a university environment. The system includes classes representing different types of employees such as teachers, IT staff, and administrative personnel. It provides a structured approach to store and manipulate employee information, calculate salaries, and categorize staff based on their roles and attributes.

Key Features:

Employee Hierarchy: The system is built upon an employee hierarchy that includes classes such as Employee, IT, Teacher, FullTimeTeacher, and PartTimeTeacher. Each class represents a specific type of university staff.

Salary Calculation: The system allows for the calculation of salaries for teachers based on factors like worked hours, teaching rate, and proctoring hours. The computeSalary methods in the teacher subclasses are responsible for these calculations.

Role-specific Information: Different subclasses of teachers, such as FullTimeTeacher and PartTimeTeacher, have their own attributes and behaviors. For example, FullTimeTeacher calculates salaries based on base salary and extra hours, while PartTimeTeacher accounts for proctoring hours.

Staff Management: The University class acts as a container for storing employees. It provides methods to add employees, retrieve employee information by index, and categorize employees based on their roles.

Data Analysis: The system can analyze and categorize employees by their role, allowing users to view information about full-time teachers, part-time teachers, and teachers of a specific major.

The University Staff Management System streamlines the management of university staff by providing a structured and extensible framework for organizing employee data and performing calculations related to salaries and roles. The modular design of the classes allows for easy expansion and customization to accommodate changing university staff requirements.