import java.sql.SQLException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SQLException {

        DB.DB_connect();



        /*DB.ps = DB.con.prepareStatement("insert into bookcontroll.Book(initialcode, bookname, writer, company) value(?, ?, ?, ?);");
        DB.ps.setString(1, "AB4444");
        DB.ps.setString(2, "chill");
        DB.ps.setString(3, "HanSeol");
        DB.ps.setString(4, "현대문학");
        DB.ps.executeUpdate();

         */

        DB.rs = DB.stmt.executeQuery("select * from bookcontroll.Book inner join bookcontroll.rentdata on Book.initialcode = rentdata.bookcode;");

        while(DB.rs.next()) {
            System.out.print(DB.rs.getString("initialcode") + " ");
            System.out.print(DB.rs.getString("bookname") + " ");
            System.out.print(DB.rs.getString("writer") + " ");
            System.out.println(DB.rs.getString("company"));
        }


        DB.DB_disconnect();
    }

}