public class DaysAlive {
    public static void main(String[] args) {

        //initializes integers for year, month and day for the date of birth for user
        int dobYear = 1999;
        int dobMonth = 6;
        int dobDay = 15;
        
        //Constructs two methods from Day class for the date of birth and today's date
        Day dateOfBirth = new Day(dobYear, dobMonth, dobDay);
        Day todayDate = new Day();
        
        //calculates the days from dateOfBirth to todayDate
        int daysSinceBirth = todayDate.daysFrom(dateOfBirth);
       
        //Prints out the number of days user has been alive
        System.out.print("Number of days alive since birth: ");
        System.out.println(daysSinceBirth);
    }
}
