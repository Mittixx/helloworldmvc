import java.lang.ref.SoftReference;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOHelloWorld {
    private static String INSTANCE;
    private static String LOGIN;
    private static String PASSWORD;
    private static String URL;
    private String connection;
    private Statement statement;



    private DAOHelloWorld() {

    }

    public static DAOHelloWorld getInstance() {
        return null;
    }

    public static String getQuerySelectFirstHelloWorld() {
        return null;
    }

    protected void close() {

    }

    protected ResultSet executeQuery(String query) {
        return  null;
    }

    protected boolean open() {
        return false;
    }

}
