package cis232.classlab;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CoinFlipperController {

	Random rand = new Random();
	
    @FXML
    private ImageView coinImage;

    Image heads = new Image(getClass().getResourceAsStream("heads.jpg"));
    Image tails = new Image(getClass().getResourceAsStream("tails.jpg"));
    
    @FXML
    void buttonFlipListener() {
    	if(rand.nextBoolean()){
    		coinImage.setImage(heads);
    	}else{
    		coinImage.setImage(tails);
    	}
    }

}