public class Librarian {
    private int adminID;
    private String password;
    private String firstName;
    private String lastName;
    private String address;
    private double phoneNo;
    Library_Sys_JDBC lsj=new Library_Sys_JDBC();

    public Librarian(int adminID, String password, String firstName, String lastName, String address, double phoneNo) {
        AuthentificationSystem authSys=new AuthentificationSystem(adminID,password);
       // authSys.add();
        this.adminID = adminID;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNo = phoneNo;
        lsj.connection();
        lsj.insertion(add());

    }

    public void addMember(Member member)
    {
         String sqlCommand="INSERT INTO Member VALUES ( " + member.getUserID()
                + ", '"
                + member.getPassword()
                + "', '"
                + member.getAddress()
                + "', '"
                + member.getFirstName()
                + "', '"
                + member.getLastName()
                + "', "
                +member.getPhoneNo()
                +", '"
                +member.getProfession()
                +"')";
         lsj.insertion(sqlCommand);
    }
    public void addItem(Items item)
    {
        String sqlCommand="INSERT INTO Items VALUES ( " + item.getISBN()
                + ", "
                + item.getAuthNo()
                +", '"
                + item.getTitle()
                +"', '"
                + item.getEdition()
                +"', '"
                + item.getCategory()
                +"', "
                + item.getPrice()
                +")";
        lsj.connection();
        lsj.insertion(sqlCommand);

    }
    public void viewMembers()
    {
        String tableName="Members";
        lsj.selection(tableName);
    }
    public void viewItems()
    {
        String tableName="Items";
        lsj.connection();
        lsj.selection(tableName);
    }


    public String add()
    {
        return "INSERT INTO Librarian VALUES ("
                +adminID +", '"
                +password +"', '"
                +firstName +"', '"
                +lastName +"', '"
                +address +"', "
                +phoneNo +")";
    }

}
