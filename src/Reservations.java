public class Reservations {
    private int reservationNo;
    private int reserveDate;
    private int returnDate;
    private int duration;
    private double fees;
    private int ISBN;
    private int userID;
    private int adminID;

    public Reservations(int reservationNo, int reserveDate, int returnDate, int duration, double fees, int ISBN, int userID, int adminID) {
        this.reservationNo=reservationNo;
        this.reserveDate = reserveDate;
        this.returnDate = returnDate;
        this.duration = duration;
        this.fees = fees;
        this.ISBN = ISBN;
        this.userID = userID;
        this.adminID=adminID;
    }

    public String addReservation()
    {
        return "INSERT INTO Reservations VALUES ("
                +reservationNo+","
                +reserveDate+","
                +returnDate+","
                +duration+","
                +fees+","
                +ISBN+","
                +userID+","
                +adminID+")";
    }

}
