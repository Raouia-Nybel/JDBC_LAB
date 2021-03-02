public class Member {
    private int userID;
    private String password;
    private String address;
    private String firstName;
    private String lastName;
    private double phoneNo;
    private String profession;
    Library_Sys_JDBC lsj=new Library_Sys_JDBC();


    public Member(int userID, String password, String address, String firstName, String lastName, double phoneNo, String profession) {
        AuthentificationSystem authSys=new AuthentificationSystem(userID,password);
       // authSys.add();
        this.userID = userID;
        this.password = password;
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.profession = profession;

    }

    public int getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getPhoneNo() {
        return phoneNo;
    }

    public String getProfession() {
        return profession;
    }

   public void viewItems()
   {
       String tableName="Items";
       lsj.connection();
       lsj.selection(tableName);
   }
    public void reserveItem(Reservations reservation)
    {
        lsj.connection();
        lsj.insertion(reservation.addReservation());
        System.out.println("Item well reserved !");
    }

}
