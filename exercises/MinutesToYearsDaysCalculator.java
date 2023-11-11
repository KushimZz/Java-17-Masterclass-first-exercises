package udemy.exercises;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){

        int totalYears = (int) (minutes / (365 * 24 * 60));
        int totalDays = (int) (minutes % (365 * 24 * 60)) / (24 * 60);

        if(minutes<0){
            System.out.println("Invalid Value");
        }
        else{
            System.out.printf(minutes+ " min = "+ totalYears +" y and "+totalDays+" d");
        }

    }
}
