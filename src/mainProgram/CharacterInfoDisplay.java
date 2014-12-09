package mainProgram;

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
		characterDescription.getChildren().add(
				new Text(MainGameRunner.myChar.getPersonalityDescription()));
		characterPicture.setPrefWidth(MainGameRunner.XDIMENSION / 2);
		characterDescription.setPrefWidth(MainGameRunner.XDIMENSION / 2);
		characterInfo.setLeft(characterPicture);
		characterInfo.setRight(characterDescription);
	}
	public BorderPane getBorderPane() {
		return characterInfo;
	}
	public void update() {
		characterPicture.getChildren().clear();
		characterPicture.getChildren().add(MainGameRunner.myChar.getPicture());
		characterDescription.getChildren().clear();
		characterDescription.getChildren().add(
				new Text(MainGameRunner.myChar.getPersonalityDescription()));
	}
}
