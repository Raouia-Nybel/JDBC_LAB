public class Reports {
    private int reportNo;
    private int reservationNo;
    private int adminID;

    public Reports(int reservationNo, int adminID) {
        this.reservationNo = reservationNo;
        this.adminID = adminID;
    }

    public String addReport()
    {
        return "INSERT INTO Reports VALUES ("
                +reservationNo+","
                +adminID+")";
    }
}
