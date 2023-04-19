import controller.Controller;
import model.DataSaver;
import model.StringParser;
import view.View;

public class main {
    public static void main(String[] args) {
        StringParser stringParser = new StringParser();
        DataSaver dataSaver = new DataSaver();
        Controller controller = new Controller(stringParser, dataSaver);
        View view = new View(controller);
        view.run();
    }
}
