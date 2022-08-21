package ca.georgiancollege.comp1011m2022assignment3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

//It's controlling the details view controller
public class DetailsViewController implements Initializable {

    @FXML
    private Button gobackbutton;

    @FXML
    private Text text;

    @FXML
    private VBox vbox;

    @FXML
    private ImageView image;

    @FXML
    void gobackbuttonclicked(ActionEvent event) throws IOException {

        //It switches scenes
        SceneManager.Instance().changeScene(event, "search-view.fxml");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        var posterNotFoundImage = new Image(getClass().getResourceAsStream("poster-not-found.png"));
        image.setImage(posterNotFoundImage);
    }
}
