# Flights

This project is a Java-based application designed to manage and process flight data. It allows users to search, sort, and filter flight information efficiently.

## Features

- **Search flights** by departure and arrival cities
- **Sort flights** by various parameters (e.g., price, duration, departure time)
- **Filter flights** by airlines, price range, and duration
- **Real-time updates** of flight information

## Technologies Used

- **Java 17**
- **Maven** - project management
- **Spring Boot** - backend development
- **Hibernate** - ORM and database interaction
- **MySQL** - as the database
- **Thymeleaf** - front-end templating
- **Bootstrap** - UI styling

## Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/anasstaisshaa/Flights.git
    ```


 2. Navigate to the project directory:

    ```bash
    cd Flights
    ```

 3. Build the project using Maven:
    ```bash
    mvn clean install
    ```
    
4. Set up the database:
   
- Create a MySQL database named `flights_db`
  Update the database connection details in the application.properties file

6. Run the application:
   
    ```bash
    mvn spring-boot:run
    ```
    
8. Access the application:
   
- Open your browser and go to `http://localhost:8080`

## How to Use

- **Search Flights:** Enter departure and arrival cities to find available flights.
- **Sort Flights:** Use the sorting options to organize flights by price, duration, or time.
- **Filter Flights:** Select filters like airlines, price range, and flight duration to narrow down the search results.
  
## Future Enhancements

- User authentication and profiles
- Flight booking functionality
- Third-party flight data API integration
- International flights support with multiple currencies
- Contributing
- Contributions are welcome! If you’d like to contribute, please submit a pull request. Make sure your changes are properly documented and tested.

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please fork the repository and create a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.


    
