package mainProgram;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class CharacterInfoDisplay {
	private Pane characterPicture, characterDescription;
	private BorderPane characterInfo;
	public CharacterInfoDisplay(){
		characterInfo = new BorderPane();
		characterPicture = new Pane();
		characterPicture.getChildren().add(MainGameRunner.myChar.getPicture());
		characterDescription = new Pane();
		ImageView personality = MainGameRunner.myChar.getPersonalityDescription();
		if(personality == null)
			characterDescription.getChildren().add(new Label("You do not have a generic anime personality!"));
		else
			characterDescription.getChildren().add(MainGameRunner.myChar.getPersonalityDescription());
		characterPicture.setMaxWidth(380);
		characterDescription.setPrefWidth(500);
		characterInfo.setLeft(characterPicture);
		characterInfo.setRight(characterDescription);
	}
	public BorderPane getBorderPane() {
		return characterInfo;
	}
	public void update() {
		characterPicture.getChildren().clear();
		characterPicture.getChildren().add(MainGameRunner.myChar.getPicture());
		characterPicture.setMaxWidth(380);
		characterDescription.getChildren().clear();
		ImageView personality = MainGameRunner.myChar.getPersonalityDescription();
		if(personality == null)
			characterDescription.getChildren().add(new Label("You do not have a generic anime personality!"));
		else
			characterDescription.getChildren().add(MainGameRunner.myChar.getPersonalityDescription());
		characterDescription.setPrefWidth(500);
	}
}
