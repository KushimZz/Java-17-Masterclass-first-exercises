package udemy.exercises;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first, double second){
        if (first <0 && second >0 || first >0 && second <0){
            return false;
        }

        first = (int)(first*1000);
        second = (int)(second*1000);

        if(first == second){
            return true;
        }
        else{
            return false;
        }


    }
}
