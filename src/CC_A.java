import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CC_A extends Application {
    @Override
    public void start(Stage CC_S_Main) {
        Label CC_CTRL_Label_Title = new Label("CarbonCoffee");
        Scene CC_SC_Main = new Scene(new StackPane(CC_CTRL_Label_Title), 640, 480);
        CC_S_Main.setScene(CC_SC_Main);
        CC_S_Main.show();
    }

    public static void Main(String[] args) {
        launch();
    }

}