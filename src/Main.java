import GUI.MainFrame;
import connector.DBConnector;

public class Main {

    public static void main(String[] args) {
        MainFrame m = new MainFrame();
        DBConnector connector = new DBConnector();
        connector.connect();
    }
}
