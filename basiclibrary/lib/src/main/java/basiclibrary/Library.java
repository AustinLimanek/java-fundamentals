/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;

public class Library {
    public static void main(String[] arg){
        int rollCount = 6;
        //roll(rollCount);
        System.out.println(Arrays.toString(roll(rollCount)));

        int[] example = {1,2,4,3,5,3};
        containsDuplicate(example);

        //avgOfArray(example);
        System.out.println(avgOfArray(example));

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        double value = minAvgOfMatrix(weeklyMonthTemperatures);
        System.out.println(value);

        int[] ary = {1,2,3,4};
        int n = 7;
        System.out.println(Arrays.toString(newElementInMidArray(ary, n)));
        weatherSummary(weeklyMonthTemperatures);

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        votes.size();

        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");
    }


    public boolean someLibraryMethod() {
        return true;
    }

    public static int[] roll(int num){
        int[] rolls = new int[num];
        for (int i = 0; i < num; i++){
            rolls[i] = (int) (Math.ceil(Math.random()*6));
            System.out.println(rolls[i]);
        }
        return rolls;
    }

    public static boolean containsDuplicate(int[] array){
        boolean result = false;
        int count;
        for (int el : array){
            count = 0;
            for (int r : array){
                if (r == el) {
                    count++;
                    System.out.println(count);
                }
            }
            if (count > 1){
                result = true;
                System.out.println("true");
                break;
            }
        }
        return result;
    }

    public static double avgOfArray (int [] array){
        int sum = 0;
        for (int el : array) {
            sum += el;
        }
        return sum/array.length;
    }

    public static double minAvgOfMatrix (int[][] matrix){
        double minAvg = avgOfArray(matrix[0]);
        for (int[] el : matrix){
            double currentAverage = avgOfArray(el);
            if (currentAverage < minAvg){
                minAvg = currentAverage;
            }
        }
        return minAvg;
    }

    public static int[] newElementInMidArray (int[] array, int num){
        int[] update = new int[array.length+1];
        double mid1 = (double) array.length / 2;
        int mid = (int) (Math.round(mid1));
        for ( int i = 0; i < mid; i++){
            update[i] = array[i];
        }
        update[mid] = num;
        for ( int j = mid + 1; j < update.length; j++){
            update[j] = array[j-1];
        }
        return update;
    }

    public static int[] weatherSummary (int[][] array){
        HashSet<Integer> tempSeen = new HashSet<>();
        int min = array[0][0];
        int max = min;
        for (int[] el : array){
            for (int r : el){
                if ( r < min) min = r;
                if ( r > max) max = r;
                tempSeen.add(r);
            }
        }
        System.out.println("High: " + max);
        System.out.println("Min: " + min);
        for (int i = min; i < max; i++){
            if (!tempSeen.contains(i)) System.out.println("Never saw temperature: " + i);
        }
        int[] spread = {min, max};
        return spread;
    }

    public static String tally (List<String> list){
        HashMap<String,Integer> mapResult = new HashMap<>();
        String win = "No one";
        int check = 1;
        for ( String el : list ){
            if(!mapResult.containsKey(el)){
                mapResult.put(el, 1);
            }
            else{
                mapResult.put(el, mapResult.get(el) + 1);
            }
            if(mapResult.get(el) > check ){
                check = mapResult.get(el);
                win = el;
            }
        }
        return win;
    }
}
