import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class grid extends Application {

    public void start(Stage primaryStage) {

        GridPane grid = new GridPane();
        grid.add(new Label("Earned Score"), 1, 0);
        grid.add(new Label("Max Possible"), 2, 0);
        grid.add(new Label("Score #1:"), 0, 1);
        grid.add(new TextField(), 1, 1);
        grid.add(new TextField(), 2, 1);
        grid.add(new Label("Score #2:"), 0, 2);
        grid.add(new TextField(), 1, 2);
        grid.add(new TextField(), 2, 2);
        grid.add(new Label("Score #3:"), 0, 3);
        grid.add(new TextField(), 1, 3);
        grid.add(new TextField(), 2, 3);
        grid.add(new Label("Score #4:"), 0, 4);
        grid.add(new TextField(), 1, 4);
        grid.add(new TextField(), 2, 4);
        grid.add(new Label("Score #5:"), 0, 5);
        grid.add(new TextField(), 1, 5);
        grid.add(new TextField(), 2, 5);
        grid.add(new Label("Score #6:"), 0, 6);
        grid.add(new TextField(), 1, 6);
        grid.add(new TextField(), 2, 6);

        // create scene and put calcCourseScore inside
        Scene scene1 = new Scene(grid);

        primaryStage.setScene(scene1);
        primaryStage.setTitle("Calculate Course Score");
        primaryStage.setResizable(true);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }

}
