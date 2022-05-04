import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class check extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    public void start(Stage primaryStage) throws Exception {

        HBox root = new HBox();
        Button b1 = new Button("Exit");
        Button b2 = new Button("Click Me");
        TextField t1 = new TextField();
        Label l1 = new Label("Welcome");
        root.getChildren().add(t1);
        root.getChildren().add(b1);
        root.getChildren().add(b2);
        javafx.scene.Scene scene = new javafx.scene.Scene(root, 300, 250);
        scene.setCursor(Cursor.WAIT);
        b1.setOnAction(e -> {
            System.out.println("I will exit");
            System.exit(0);
        });

        b2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("U have Clicked a button!" +
                        t1.getText());
            }
        });
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}