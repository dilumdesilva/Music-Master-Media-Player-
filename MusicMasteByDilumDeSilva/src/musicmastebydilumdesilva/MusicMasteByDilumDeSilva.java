/*
 * MusicMaster V1.0
 * Developed by Dilum De Silva
 * 
 */
package musicmastebydilumdesilva;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author DilumDeSilva
 */
public class MusicMasteByDilumDeSilva extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        //Title of The Application
        stage.setTitle("MusicMaster");
        
        //A new event fired with the mouse click
        //If user double clicked on the screen full screen mode will fired
        scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent doubleClicked) {
                if(doubleClicked.getClickCount() == 2){
                    stage.setFullScreen(true);
                }
            }
        });
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
