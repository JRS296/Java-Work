import javafx.Application;

public class javaFXDemo extends Application{
    private Label label;
    private DatePicker dp;
    private Button submit;

    public void start(Stage stage) //Step - 2: Override Start method, takes stage class as parameter.
    {
        Label = new Label("Date of Birth: "); //Constructors
        dp = new DatePicker();
        submit = new Button("Submit");

        HBox hbox = new Hbox();
        hbox.getChildren().add(label);
        hbox.getChildren().add(dp);
        hbox.getChildren().add(submit);
        //hbox.getChildren().addAll(label, dp, submit);

        Scene scene = new Scene(layout, 780, 640);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(); 
    }
    //Stage -> javafx.stage.Stage;
    //Scene -> javafx.scene.Scene;
    //HB0x -> javafx.scene.layout.HBox;
    
}
