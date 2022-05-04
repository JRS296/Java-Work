import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import java.io.*;

public class Scene extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage s1) throws Exception {
        VBox root = new VBox();
        Label l1 = new Label("Welcome to Java FX programming");
        root.getChildren().add(l1);
        FileInputStream fis = new FileInputStream("C:/Users/jonat/Music/Album Art/394.jpg");
        Image im = new Image(fis);
        ImageView imv = new ImageView(im);
        root.getChildren().add(imv);
        javafx.scene.Scene scene1 = new javafx.scene.Scene(root, 500, 500);
        s1.setScene(scene1);
        s1.setTitle("Hello World!");
        s1.show();
    }

}
