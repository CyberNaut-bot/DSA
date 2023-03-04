import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
    	String[] week_of_day= {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY",
    			"SATURDAY"};
    	  Calendar rightnow= Calendar.getInstance();
    	  //month is also month-1 because in inbuilt library it is month-1
    	  rightnow.set(year,month-1,day);
    	  /*p keeps a count of all the days.ie from SUNDAY till SATURDAY and 
    	  returns which number of day it is either 0, 1 etc*/ 
    	  int p=rightnow.get(Calendar.DAY_OF_WEEK);
    	  //returns p-1 because in an array it starts from 0
    	  return week_of_day[p-1];
    	}

    }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
