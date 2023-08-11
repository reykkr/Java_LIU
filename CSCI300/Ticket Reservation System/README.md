Ticket Reservation System is a Java application that models a ticket booking system for different types of trips, including flights and bus trips. The system is implemented using various classes and interfaces, adhering to the specifications presented in a provided UML diagram.

Key Classes and Features:

Trip Class (Abstract): Represents a generic trip with attributes like departure city, arrival city, and basic price. Subclasses of Trip implement specific trip types (e.g., flights and bus trips). It includes methods for calculating the cost of a trip and generating a description.

Economical Interface: Defines the economize() method, which can be implemented by classes that allow cost reduction.

Flight Class: Extends the Trip class and represents flight trips. It has a seat class attribute and includes methods to calculate the cost of a flight, indicate seat class, and implement the Economical interface.

BusTrip Class: Extends the Trip class and represents bus trips. It includes methods for calculating the cost of a bus trip and generating a description.

Ticket Class: Represents a ticket that can store multiple trips. It includes methods to add trips, reduce costs using the Economical interface, and generate a detailed description of the ticket.

TicketApplication Class: Serves as the main driver program to demonstrate the functionality of the implemented classes. It creates ticket objects, adds various trips to them, applies cost reduction, and provides information about the total cost and trip count.
