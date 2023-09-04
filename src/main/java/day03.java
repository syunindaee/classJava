import java.util.Arrays;
import java.util.Scanner;
class show{
    public String[] show = {"A", "B", "C"};

    public show(){

    }

    public int showId(){
        return Arrays.asList(show).indexOf("A");
    }
}
class Reservation{

    public String userName;
    public int showId;
    public String showName;

    public Reservation(String userName, int showId, String showName) {
        this.userName = userName;
        this.showId = showId;
        this.showName = showName;
    }

    public Reservation(){

    }


    public String showMessage(){

        return this.userName + "님! " + this.showName + "예약을 축하드립니다.";
    }

}

class InterPark extends Reservation{

    public String siteName;

    public InterPark(String userName, int showId, String siteName, String showName)
    {
        this.userName = userName;
        this.showId = showId;
        this.siteName = siteName;
        this.showName = showName;
    }

    public InterPark() {

    }

    public String InterParkReservation(){
        return userName + "님, 인터파크에서 예매하신 정보입니다.\n==================\n{" + showId + "}: {" +showName+"}\n==================";
    }
}
class checkReservation extends InterPark{

    public checkReservation(String userName, int showId, String siteName, String showName)
    {
        this.userName = userName;
        this.showId = showId;
        this.siteName = siteName;
        this.showName = showName;
    }


    public String checkReservation(){

        return userName + "님, 예매하신 정보입니다.\n==================\n예매한 사이트: {"+siteName + "}\n예매 정보: {" + showId + "}, {" + showName + "}\n==================";

    }
}
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
