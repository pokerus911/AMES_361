package mainProgram;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public enum Personality {
	NORMAL, TSUNDERE, YANDERE, KUUDERE, DANDERE, DEREDERE;

	@Override
	  public String toString() {
	       switch (this) {
	         case NORMAL:
	              return "You do not have a generic personality type!";
	         case TSUNDERE:
	              return "You are a Tsundere!";
	         case YANDERE:
	        	  return "You are a Yandere!";
	         case KUUDERE:
	        	  return "You are a Kuudere!";
	         case DANDERE:
	        	 return "You are a Dandere!";
	         case DEREDERE:
	        	 return "You are a Deredere!";
	        }
	       return "Error creating a personality description.";
	 }
	
	public ImageView getImage(){
		switch (this) {
		case NORMAL:
            return null;
       case TSUNDERE:
            return new ImageView(new Image(getClass().getResourceAsStream("/images/Tsundere.png")));
       case YANDERE:
      	  return new ImageView(new Image(getClass().getResourceAsStream("/images/Yandere.png")));
       case KUUDERE:
      	  return new ImageView(new Image(getClass().getResourceAsStream("/images/Kuudere.png")));
       case DANDERE:
      	 return new ImageView(new Image(getClass().getResourceAsStream("/images/Dandere.png")));
       case DEREDERE:
      	 return new ImageView(new Image(getClass().getResourceAsStream("/images/Deredere.png")));
		}
		return null;
	}
}
