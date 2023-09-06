public class InterPark extends Reservation{

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
