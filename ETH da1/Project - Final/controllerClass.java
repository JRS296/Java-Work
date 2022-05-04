import java.net.URL;
import java.sql.*;

import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class controllerClass extends Application implements Initializable{

    @FXML
    private TableColumn<?, ?> amount;

    @FXML
    private Button checkBal;

    @FXML
    private Button deposit;

    @FXML
    private TableColumn<?, ?> from;

    @FXML
    private Label label_action;

    @FXML
    private Label label_uname_show;

    @FXML
    private Button login;

    @FXML
    private Button send;

    @FXML
    private TableColumn<?, ?> status;

    @FXML
    private TableColumn<?, ?> tid;

    @FXML
    private TableColumn<?, ?> to;

    @FXML
    private TextField txt_amt;

    @FXML
    private TextField txt_bal;

    @FXML
    private TextField txt_dep;

    @FXML
    private TextField txt_pword;

    @FXML
    private TextField txt_uname;

    @FXML
    private TextField txt_uname2;

    @FXML
    private TextField txt_wdraw;

    @FXML
    private Button withdraw;

    @FXML
    private Font x1;

    @FXML
    private Color x2;

    @FXML
    private Font x3;

    @FXML
    private Font x31;

    @FXML
    private Color x4;

    @FXML
    private Color x41;

    Connection con;
    PreparedStatement pst;

    public void Connect(String x) {
        String query = "jdbc:mysql://localhost:3307/jdbc_" + x;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(query, "root", "pama2018");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    void Login(ActionEvent event) {

        String name = txt_uname.getText();
        String password = txt_pword.getText();

        if (name == "Jonathan" || name == "Namitha" || name == "Deepthi") {
            if (password == "1234") {
                Connect(name);
                label_action.setText(name + " Successfully Logged in!");
            }

        } else {
            label_action.setText("INVALID CREDENTIALS");
        }

    
        try {
        con.prepareStatement("insert into records(name,address,age)values(?,?,?)");
        pst.setString(1, name);
        pst.setString(2, address);
        pst.setString(3, age);
        int status = pst.executeUpdate();
        
        if (status == 1) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText("Member");
        alert.setContentText("Record Addedd Successfully");
        alert.showAndWait();
        table();
        txtMname.setText("");
        txtAddress.setText("");
        txtAge.setText("");
        txtMname.requestFocus();
        
        } else {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Fail");
        alert.setHeaderText("Member");
        alert.setContentText("Record Addedd Failed");
        alert.showAndWait();
        }
        } catch (SQLException ex) {
        Logger.getLogger(controllerClass.class.getName()).log(Level.SEVERE, null,
         ex);
        }
    }

    
    public void table() {
    ObservableList<Record> records = FXCollections.observableArrayList();
    try {
    pst = con.prepareStatement("select id,name,address,age from records");
    ResultSet rs = pst.executeQuery();
    {
    while (rs.next()) {
    Record record = new Record();
    record.setId(rs.getString("id"));
    record.setName(rs.getString("name"));
    record.setAddress(rs.getString("address"));
    record.setAge(rs.getString("age"));
    records.add(record);
    }
    }
    table.setItems(records);
    idColoum.setCellValueFactory(f -> f.getValue().idProperty());
    MnameColoum.setCellValueFactory(f -> f.getValue().nameProperty());
    AddressColoum.setCellValueFactory(f -> f.getValue().addressProperty());
    AgeColoum.setCellValueFactory(f -> f.getValue().ageProperty());
    }
    
    catch (SQLException ex) {
    Logger.getLogger(controllerClass.class.getName()).log(Level.SEVERE, null,
    ex);
    }
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        table();
    }

    public static void main(String[] args) {
        controllerClass.launch(args);
        // launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
        
    }

}