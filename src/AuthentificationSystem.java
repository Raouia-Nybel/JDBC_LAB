public class AuthentificationSystem {
    private int ID;
    private int loginID;
    private String password;

    public AuthentificationSystem() {
    }

    public AuthentificationSystem(int loginID, String password) {
        Library_Sys_JDBC lsj=new Library_Sys_JDBC();
        lsj.connection();
        if(lsj.verif(verification(loginID)))
        {
            System.out.println("This member already exists !");
        }else{
            this.loginID=loginID;
            this.password=password;
            lsj.insertion(add());
            System.out.println("New member was added ! ");
        }
        this.loginID = loginID;
        this.password = password;
    }

    public String verification(int userID)
    {
        String sqlCommand="SELECT * FROM Authentification_System WHERE LoginID = " + userID;
        return sqlCommand;
    }
    public String add()
    {
        return "INSERT INTO Authentification_System VALUES ("
                +loginID
                +", '"
                +password
                +"')";
    }

    public int getLoginID() {
        return loginID;
    }

    public void setLoginID(int loginID) {
        this.loginID = loginID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
