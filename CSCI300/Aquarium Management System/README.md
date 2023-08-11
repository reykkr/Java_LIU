Aquarium Management Systemis a Java-based project that enables users to effectively manage and organize an aquarium environment. This system consists of two essential classes, namely Fish and Aquarium, each designed to model fish and aquarium properties. Through this project, users can create, add, search, and display fish in an aquarium, while ensuring data integrity and preventing duplicate fish entries.

The main components of the project are:

Fish Class:

The Fish class represents individual fish within the aquarium.
It includes a constructor to initialize the fish's name and type.
The class provides a method equals() to compare fish objects based on their names.
The toString() method offers a convenient way to represent fish details as a string.
Aquarium Class:

The Aquarium class is responsible for managing the overall aquarium environment.
It contains attributes for length, width, height, and an array of fish objects.
The constructor allows users to create an aquarium with specified dimensions and capacity.
Methods like addFish() allow users to add new fish to the aquarium while preventing duplicates.
The searchFish() method checks if a fish of a certain name and type exists in the aquarium.
The toString() method generates a comprehensive string representation of the aquarium and its inhabitants.
Application:

The project includes an application that demonstrates the functionality of the Fish and Aquarium classes. The application lets users:

Create an aquarium with specified dimensions and capacity.
Add fish to the aquarium, ensuring no duplicates are added based on fish names.
Search for a specific fish by providing its name and type.
Retrieve and display information about a fish at a specified index in the aquarium.
Display a detailed summary of the entire aquarium, including its dimensions and the list of fish.

The Aquarium Management System provides a practical example of how object-oriented programming concepts can be applied to create a structured and user-friendly environment for managing an aquarium. It showcases the importance of class design, encapsulation, and data validation in ensuring efficient and error-free management of aquatic inhabitants.
