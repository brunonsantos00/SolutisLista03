package questao57;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Questao57 {

    public static void main(String[] args) throws ParseException {
        String data1, data2;
        Date dt1, dt2;
        Scanner sc = new Scanner(System.in);
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite dois intervalos de data no formato dd/mm/aaaa:");
        data1 = sc.nextLine();
        data2 = sc.nextLine();

        sc.close();

        dt1 = df.parse(data1);
        dt2 = df.parse(data2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dt1);
        System.out.println();

        for (Date dt = dt1; dt.compareTo(dt2) <= 0;) {
            System.out.println(df.format(dt));
            calendar.add(Calendar.DATE, +1);
            dt = calendar.getTime();
        }
    }

}
