package pl.miloszlewandowski.hackersRank.Java.EasyLevel.Advanced;

import java.io.*;
import java.text.*;
import java.util.*;

class CalendarTask {

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
        Calendar calendar = new GregorianCalendar();
        calendar.set(year, month-1, day);


        String s = new SimpleDateFormat("EEEE").format(
                calendar.getTime()).toUpperCase();
        return s;
    }

}

public class CalendarSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = CalendarTask.findDay(month, day, year);

//        bufferedWriter.write(res);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
