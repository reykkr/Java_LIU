Flight Seat Reservation System is a Java-based application designed to facilitate the reservation and management of flight seats. This system encompasses an abstract Seat class, along with its subclasses PremiumSeat and NormalSeat, providing varying seat options for customers. Additionally, the system features the Flight class, enabling users to create flights, reserve seats, and calculate payment totals.

Key Features:

Seat Classes:

The Seat class serves as the base for seat types, ensuring consistent behavior and interaction.
Derived from Seat, the PremiumSeat class represents premium seats, incorporating an additional fee for enhanced services.
The NormalSeat class, another Seat subclass, caters to standard seat reservations.
Seat Reservation:

Customers can purchase seats using the buy() method, which verifies if their payment is sufficient.
Flight class provides the ability to reserve specific seats and ensures that the seat is available and payment is successful.
Flight Management:

The Flight class models flight information, including source and destination cities.
Users can buy and reserve seats for a particular flight, helping manage seat availability and customer preferences.
The class computes the total amount paid by customers for the reserved seats.
User Interaction:

The application interacts with users through the console to demonstrate seat reservation and flight management functionality.
Customers can select seat types, enter payment information, and receive reservation confirmation.
Application:

The Agency class within the application showcases the functionality of the system. Users can:

Create a new flight, specifying its source and destination.
Allow customers to buy and reserve various types of seats for the flight.
Display detailed information about the flight and the reserved seats.
Compare two seat options based on their prices.

The Flight Seat Reservation System empowers users to manage flight seat reservations efficiently, offering a range of seat choices and facilitating smooth customer interactions. This project demonstrates object-oriented programming concepts, including inheritance, abstraction, and interaction between classes, in the context of a practical flight reservation scenario.
