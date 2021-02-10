

public class DaysAlive {
    public static void main(String[] args) {

        int dobYear = 1999;
        int dobMonth = 6;
        int dobDay = 15;
        
        Day dateOfBirth = new Day(dobYear, dobMonth, dobDay);
        Day todayDate = new Day();

        int daysSinceBirth = todayDate.daysFrom(dateOfBirth);
       
        System.out.println("Number of Days from birth: ");
        System.out.print(daysSinceBirth);
    }
}
