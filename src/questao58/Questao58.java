package questao58;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Questao58 {

    public static void main(String[] args) throws ParseException {
        String data1;
        Date dt1;
        int dias;

        Scanner sc = new Scanner(System.in);

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite uma data no formato dd/mm/aaaa:");
        data1 = sc.nextLine();
        System.out.print("Digite a quantidade de dias: ");
        dias = sc.nextInt();

        sc.close();

        dt1 = df.parse(data1);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dt1);
        System.out.println();

        calendar.add(Calendar.DATE, +dias);
        dt1 = calendar.getTime();
        System.out.println(df.format(dt1));
    }

}
