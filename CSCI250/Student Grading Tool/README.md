Student Grading Tool program provides basic grade input and statistics calculation functionality, helping users analyze their entered grades in terms of maximum, minimum, and average.

The program uses the Scanner class to receive input from the user.

It prompts the user to enter a grade.

It initializes variables for the number of grades entered (i), the sum of grades (sum), the maximum grade (max), and the minimum grade (min) using the first entered grade.

The program enters a loop that continues until a grade outside the range of 0-100 is entered. Inside the loop:

The user is prompted to enter another grade.
If the entered grade is negative, it's not counted in the number of grades.
If the entered grade is positive, it's added to the sum.
If the entered grade is greater than the current maximum, it becomes the new maximum.
If the entered grade is smaller than the current minimum and greater than 0, it becomes the new minimum.
After the loop ends, the program prints:

The number of valid grades entered.
The maximum and minimum grades.
The average grade calculated as the sum divided by the number of grades.