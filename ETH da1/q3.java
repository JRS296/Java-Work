import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class q3 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox rootPane = new VBox(10);
        rootPane.setPadding(new Insets(15, 5, 15, 5));
        Scene scene = new Scene(rootPane, 320, 240);
        String commonStyles = "-fx-background-color: white;" +
                "-fx-font-family: 'Times New Roman';" +
                "-fx-font-size: 20px;" +
                "-fx-font-weight: bold;" +
                "-fx-border-style: solid;" +
                "-fx-border-color: yellow;";
        rootPane.getChildren().addAll(
                new Label("Name: Edward Algorist") {
                    {
                        setStyle(commonStyles + "-fx-text-fill: black;");
                    }
                },
                new Label("ID: softwarenginerd0320") {
                    {
                        setStyle(commonStyles + "-fx-text-fill: blue;");
                    }
                },
                new Label("Address: Lusaka, Zambia") {
                    {
                        setStyle(commonStyles + "-fx-text-fill: cyan;");
                    }
                },
                new Label("Phone: +260 973 683 651") {
                    {
                        setStyle(commonStyles + "-fx-text-fill: green;");
                    }
                });
        // set a stage's scene
        primaryStage.setScene(scene);
        // center stage on screen
        primaryStage.centerOnScreen();
        // set a stage's name and show it
        primaryStage.setTitle("Exercise 3");
        primaryStage.show();
    }
}
