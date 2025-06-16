package com.pmt.quizapp;

import com.pmt.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaryController {

    public void handleQuanlycauhoi(ActionEvent event) throws IOException{
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("questions.fxml")).load());
        Stage stage =new Stage();
        stage.setScene(scene);
        stage.show();
    }
    public void handleLuyenThi(ActionEvent event)
    {
        MyAlert.getInstance().ShowMsg("Luyen thi: Comming soon....");
    }
}
