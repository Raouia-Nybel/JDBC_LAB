import oracle.sql.DATE;

import java.sql.SQLException;

public class MainClass {

    public static void main(String[] args) {

        Library_Sys_JDBC lsj = new Library_Sys_JDBC();
        lsj.connection();
        Librarian librarian=new Librarian(9,"SUPERSUPERADMIN","NYRA","LOKBANI","1945 BUDAPEST",9991);
        Items item=new Items(99,3,"The art of killing","Meedy Edition","Crime",22000);
        librarian.addItem(item);
        librarian.viewItems();
        Member student=new Member(14,"14SDERT","3326 SZEGED","AMANI","MEZOUAR",4577,"Student");
        librarian.addMember(student);
        student.viewItems();
        student.reserveItem(new Reservations(5,120321,150321,3,0,389,4,1));

        // Librarian librarian=new Librarian(1,"ADMIN","Raouia","Lokbani","3529 MISKOLC",1245);
     //   Member student1=new Member(1, "STUDENT1", "3515 MISKOLC", "ZOHRA", "Lokbani", 2687, "Student");
      //  librarian.addMember(student1);



        // lsj.insertion(reader1.register());
    }
}
