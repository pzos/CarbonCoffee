import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.*;
import javafx.stage.*;
import javafx.scene.paint.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CC_A extends Application {
    @Override
    public void start(Stage CC_S_Main) throws FileNotFoundException {
        //Font CC_F_Header1 = new Font();
        Image CC_I_suitcase_general = new Image(new FileInputStream("data_DONT_TOUCH_PLEASE/rsrc/suitcase_general.png"));
        ImageView CC_IMGV_suitcase_general = new ImageView(CC_I_suitcase_general);
        Label CC_CTRL_Label_Title = new Label("CarbonCoffee");
        Group CC_GR_Main_Controls = new Group(CC_CTRL_Label_Title);
        Scene CC_SC_Main = new Scene(CC_GR_Main_Controls, 794, 663);
        Stop[] CC_G_Main_Background = new Stop[] {
                new Stop(0, Color.rgb(75, 75, 75, 1)),
                new Stop(1, Color.rgb(80, 80, 80, 1))
        };
        LinearGradient CC_G_L_Main_Background = new LinearGradient(0, 0, 1, 1, true, CycleMethod.NO_CYCLE, CC_G_Main_Background);
        CC_SC_Main.setFill(CC_G_L_Main_Background);

        CC_S_Main.setScene(CC_SC_Main);
        CC_S_Main.show();
    }

    public static void Main(String[] args) {
        launch();
    }
}