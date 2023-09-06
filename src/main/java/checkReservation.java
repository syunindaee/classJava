public class checkReservation extends InterPark{




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
