# Day Moods Application

The Day Moods application is a simple Java program designed to reflect the mood associated with each day of the week according to a predefined set of rules. Users can input the day of the week, and the application will display a message reflecting the general sentiment attributed to that day.

## Structure

The application is structured around an enumeration (`enum`) called `Day`, which represents the seven days of the week. There is also a secondary class named `enumDayMood` that contains a static method `telDayMood(Day day)` to display messages based on the day passed to it. The main logic resides in the `main` method of the `DayMoods` class, which handles user input and calls the `telDayMood` method accordingly.

## Key Components

- **Enum Class (`Day`)**: Defines the days of the week as constants.
- **Secondary Class (`enumDayMood`)**: Contains the logic to display messages related to the mood of each day.
- **Main Program Method (`main`)**: Handles user input, maps the input to the appropriate `Day` enum value, and calls `telDayMood` to display the mood message.

## Usage

1. Run the `DayMoods` application.
2. When prompted, enter the number corresponding to the desired day of the week (1 for Monday, 2 for Tuesday, etc., up to 7 for Sunday).
3. The application will display a message reflecting the mood associated with the selected day.

## Example Interaction

- Entering `1` will result in the message "Mondays are bad."
- Entering `5` will result in the message "Fridays are better."
- Entering `6` or `7` will result in the message "Weekends are best."

## Contribution

Contributions to expand the application, add more days or moods, or improve the user interface are welcome. Please submit pull requests for review.

## Author

**Tertius Denis Liebenberg**  

For any questions or feedback, please contact [tertiusliebenberg7@gmail.com].