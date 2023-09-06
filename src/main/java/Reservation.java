public class Reservation{

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
