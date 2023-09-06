import java.util.Arrays;
import java.util.Scanner;

public class day03 {

    public static void main(String[] args){

        Scanner a = new Scanner(System.in);

        System.out.print("예매자 이름: ");
        String userName = a.next();

        System.out.print("관람할 공연명: ");
        String showName = a.next();

        System.out.print("예매 사이트: ");
        String siteName = a.next();



        show SHOW;
        SHOW = new show();

        int showId = SHOW.showId();

        Reservation res;

        res = new Reservation(userName, showId, showName);
        System.out.println((res.showMessage()));

        InterPark interpark;

        interpark = new InterPark(userName, showId, siteName, showName);
        System.out.println((interpark.InterParkReservation()));

        checkReservation checkres;

        checkres = new checkReservation(userName, showId, siteName, showName);
        System.out.println((checkres.checkReservation()));

    }

}