/*
 * MusicMaster V1.0
 * Developed by Dilum De Silva
 * 
 */
package musicmastebydilumdesilva;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;

/**
 *
 * @author DilumDeSilva
 */
public class FXMLDocumentController implements Initializable {
    
    private MediaPlayer mediaPlayer;
    
    @FXML
    private MediaView mediaView;
    
    //creating a global string variable to save file path
    private String filePath;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        FileChooser filechooser = new FileChooser();
        //set file extensions to java file extension filter 
        //if you want you can add any file type as you wish.
        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Select a file(*.mp4)", "*.mp4","*.mp3");
            filechooser.getExtensionFilters().add(filter);
            File file = filechooser.showOpenDialog(null);
            
            //set file path to file url
            filePath = file.toURI().toString();
    
            if (filePath != null)
            {
                Media media = new Media(filePath);
                mediaPlayer = new MediaPlayer(media);
                mediaView.setMediaPlayer(mediaPlayer);
                
                    //set boundries to the media
                    DoubleProperty width = mediaView.fitWidthProperty();
                    DoubleProperty height = mediaView.fitHeightProperty();
                    
                    //set video boundries to mediaView size
                    width.bind(Bindings.selectDouble(mediaView.sceneProperty(), "width"));
                    height.bind(Bindings.selectDouble(mediaView.sceneProperty(), "height"));
                    
                mediaPlayer.play();
            }
    } 
    
    //methods for video controllers
    //you can refer java docs for further improvements of the application. 
    //(https://docs.oracle.com/javafx/2/api/javafx/scene/media/MediaPlayer.html)
    @FXML
    private void pauseVideo(ActionEvent event){
        
    }
    
    @FXML
    private void playVideo(ActionEvent event){
        
    }
    
    @FXML
    private void stopVideo(ActionEvent event){
        
    }
    
    @FXML
    private void fastVideo(ActionEvent event){
        
    }
    
    @FXML
    private void fasterVideo(ActionEvent event){
        
    }
    
    @FXML
    private void slowVideo(ActionEvent event){
        
    }
    
    @FXML
    private void slowerVideo(ActionEvent event){
        
    }
    
    @FXML
    private void exitVideo(ActionEvent event){
        
    }
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
