package mainProgram;

import polls.AppearancePoll;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StageBuilder {

	public BorderPane getSplashScreen() {
		BorderPane bpane = new BorderPane();
		ImageView splashScreen = new ImageView(new Image(getClass()
				.getResourceAsStream("/images/AnimeSplashScreen.png")));
		bpane.setBottom(splashScreen);
		return bpane;
	}

	public void editAppearance(CharacterInfoDisplay characterInfo, GridPane root) {
		System.out.println("Appearance");
		Stage pollStage = new Stage();
		pollStage.setTitle("Edit Appearance!");
		pollStage.setHeight(350);
		pollStage.setWidth(450);

		AppearancePoll appearancePoll = new AppearancePoll();

		pollStage.setScene(appearancePoll.makeAppearancePoll(pollStage, characterInfo, root));
		pollStage.show();

	}

	public void editPersonality() {
		System.out.println("Personality");

	}

	public void generateRomance(Protagonist myChar) {
		System.out.println("Romance");

	}

	public void generateBackstory(Protagonist myChar) {
		System.out.println("Backstory");

	}

}
