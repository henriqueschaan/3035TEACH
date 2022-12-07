import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class Programa {

    public static void main(String[] args) throws ParseException {
        //String inputDate = "07/12/2022";
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a data no formato MM/DD/YYYY");
        String inputDate = sc.nextLine();        
        System.out.println("O dia inserido é " + getDay(inputDate));
    }

    public static String getDay(String inputDate) throws ParseException {
    SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
    Date dt1 = format1.parse(inputDate);
    DateFormat format2 = new SimpleDateFormat("EEEE"); 
    return format2.format(dt1);
}

}