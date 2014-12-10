package polls;

import java.nio.file.Path;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import mainProgram.CharacterInfoDisplay;
import mainProgram.MainGameRunner;
import mainProgram.Protagonist;

public class AppearancePoll {

	private String myHairColor, myHairLength;
	private boolean hasGlasses;
	private static String[] allHairColors = new String[] { "Black", "Blonde",
			"Blue", "Brown", "Green", "Pink", "Purple", "Red",
			"Silver" };
	private static String[] allHairLengths = new String[] { "Short", "Medium",
			"Long" };

	public AppearancePoll() {
		myHairColor = allHairColors[(int) (Math.random() * allHairColors.length)];
		myHairLength = allHairLengths[(int) (Math.random() * allHairLengths.length)];
		int rand = (int) Math.random() * 2;
		if (rand == 0)
			hasGlasses = true;
		else
			hasGlasses = false;
	}

	public Scene makeAppearancePoll(Stage stage, CharacterInfoDisplay characterInfo, GridPane root) {
		GridPane pollPane = new GridPane();
		pollPane.setPadding(new Insets(15, 12, 15, 12));
		pollPane.setHgap(15);
		// pollPane.setGridLinesVisible(true);
		pollPane.add(new Label("Hair Color"), 0, 0);

		ToggleGroup hairColor = new ToggleGroup();
		VBox hairColors = new VBox();
		createHairColorButtons(hairColor, hairColors);

		RadioButton randomHairColor = new RadioButton("I don't care!");
		randomHairColor.setToggleGroup(hairColor);
		randomHairColor.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				myHairColor = allHairColors[(int) (Math.random() * allHairColors.length)];
				System.out.println(myHairColor);
			}
		});
		hairColors.getChildren().add(randomHairColor);
		pollPane.add(hairColors, 0, 1);

		pollPane.add(new Label("Hair Length"), 1, 0);
		ToggleGroup hairLength = new ToggleGroup();
		VBox hairLengths = new VBox();
		createHairLengthButtons(hairLength, hairLengths);
		RadioButton randomHairLength = new RadioButton("I don't care!");
		randomHairLength.setToggleGroup(hairLength);
		randomHairLength.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				myHairLength = allHairLengths[(int) (Math.random() * allHairLengths.length)];
				System.out.println(myHairLength);
			}
		});
		hairLengths.getChildren().add(randomHairLength);
		pollPane.add(hairLengths, 1, 1);

		pollPane.add(new Label("Glasses?"), 2, 0);
		ToggleGroup glasses = new ToggleGroup();
		VBox glassesOptions = new VBox();
		createGlassesButtons(glasses, glassesOptions);
		pollPane.add(glassesOptions, 2, 1);

		Button confirm = new Button("Create!");
		confirm.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				MainGameRunner.myChar.setHairColor(myHairColor);
				MainGameRunner.myChar.setHairLength(myHairLength);
				MainGameRunner.myChar.setGlasses(hasGlasses);
				MainGameRunner.myChar.setPicture(getSimilarImage(MainGameRunner.myChar));
				if(MainGameRunner.myChar.getPicture() == null)
					System.out.println("No image");
				else
					System.out.println("Set image");
				characterInfo.update();
				root.add(characterInfo.getBorderPane(), 0, 1);
				//stage.close();
			}

			private ImageView getSimilarImage(Protagonist myChar) {
				return MainGameRunner.possibleCharacters.getSimilarImage(myChar);
			}
		});
		pollPane.add(confirm, 2, 2);

		Scene pollingScene = new Scene(pollPane, MainGameRunner.XDIMENSION,
				MainGameRunner.YDIMENSION);
		return pollingScene;

	}

	private void createGlassesButtons(ToggleGroup glasses, VBox glassesOptions) {
		RadioButton yes = new RadioButton("Yes!");
		yes.setToggleGroup(glasses);
		yes.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				hasGlasses = true;
				System.out.println(hasGlasses);
			}
		});

		RadioButton no = new RadioButton("No!");
		no.setToggleGroup(glasses);
		no.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				hasGlasses = false;
				System.out.println(hasGlasses);
			}
		});

		RadioButton random = new RadioButton("I don't care!");
		random.setToggleGroup(glasses);
		random.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if ((int) (Math.random() * 2) == 0)
					hasGlasses = true;
				else
					hasGlasses = false;
				System.out.println(hasGlasses);
			}
		});

		glassesOptions.getChildren().addAll(yes, no, random);
	}

	private void createHairLengthButtons(ToggleGroup hairLength,
			VBox hairLengths) {
		for (int i = 0; i < allHairLengths.length; i++) {
			RadioButton hairOption = new RadioButton(allHairLengths[i]);
			hairOption.setToggleGroup(hairLength);
			hairOption.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					myHairLength = hairOption.getText();
					System.out.println(myHairLength);
				}
			});
			hairLengths.getChildren().add(hairOption);
		}

	}

	private void createHairColorButtons(ToggleGroup hairColor, VBox hairColors) {
		for (int i = 0; i < allHairColors.length; i++) {
			RadioButton hairOption = new RadioButton(allHairColors[i]);
			hairOption.setToggleGroup(hairColor);
			hairOption.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					myHairColor = hairOption.getText();
					System.out.println(myHairColor);
				}
			});
			hairColors.getChildren().add(hairOption);
		}

	}
}
