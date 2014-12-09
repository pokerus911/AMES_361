package mainProgram;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class MainGameRunner extends Application {
	public static final int XDIMENSION = 760, YDIMENSION = 530;
	public Scene characterInfoDisplay;
	public ToolBar mainToolBar;
	public static Protagonist myChar;
	public BorderPane bottomContent;
	public static CharacterImages possibleCharacters;
	
	public CharacterInfoDisplay characterInfo;
	private StageBuilder myBuilder;

	@Override
	public void start(Stage primaryStage) {
		possibleCharacters = new CharacterImages();
		myChar = new Protagonist();
		myBuilder = new StageBuilder();
		characterInfo = new CharacterInfoDisplay();
		try {
			GridPane root = new GridPane();
			mainToolBar = createToolbar(root);
			bottomContent = myBuilder.getSplashScreen();
			root.add(mainToolBar, 0, 0);
			root.add(bottomContent, 0, 1);
			Scene scene = new Scene(root, XDIMENSION, YDIMENSION);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			System.out.println("Error creating the stage.");
			e.printStackTrace();
		}
	}

//	private BorderPane createCharacterInfoDisplay() {
//		characterInfo = new BorderPane();
//		Pane characterPicture = new Pane();
//		characterPicture.getChildren().add(myChar.getPicture());
//		Pane characterDescription = new Pane();
//		characterDescription.getChildren().add(
//				new Text(myChar.getPersonalityDescription()));
//		characterPicture.setPrefWidth(XDIMENSION / 2);
//		characterDescription.setPrefWidth(XDIMENSION / 2);
//		characterInfo.setLeft(characterPicture);
//		characterInfo.setRight(characterDescription);
//		return characterInfo;
//	}

	public static void main(String[] args) {
		launch(args);
	}

	private ToolBar createToolbar(GridPane root) {
		ToolBar toolBar = new ToolBar();
		MenuBar mainMenu = new MenuBar();

		Menu editMenu = new Menu("Edit");
		Menu newMenu = new Menu("Generate");

		MenuItem editAppearance = new MenuItem("Edit Character Appearance");
		editAppearance.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				root.getChildren().remove(bottomContent);
				root.getChildren().remove(characterInfo.getBorderPane());
//				bottomContent = new BorderPane();
//				bottomContent.setLeft(new ImageView(new Image(getClass()
//						.getResourceAsStream("/images/MikasaTest.png"))));
//				bottomContent.setRight(new Pane());
				//bottomContent = createCharacterInfoDisplay();
				
				
//				bottomContent = characterInfo.getBorderPane();				
//				myBuilder.editAppearance(bottomContent);
//				root.add(bottomContent, 0, 1);
				
				myBuilder.editAppearance(characterInfo, root);
			}

		});

		MenuItem editPersonality = new MenuItem("Edit Character Personality");
		editPersonality.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				myBuilder.editPersonality();
			}

		});

		MenuItem newBackstory = new MenuItem("Character Backstory");
		newBackstory.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				myBuilder.generateBackstory(myChar);
			}

		});

		MenuItem newRomance = new MenuItem("Romantic Scenario");
		newRomance.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				myBuilder.generateRomance(myChar);
			}

		});

		editMenu.getItems().addAll(editAppearance, editPersonality);
		newMenu.getItems().addAll(newBackstory, newRomance);
		mainMenu.getMenus().addAll(editMenu, newMenu);
		toolBar.getItems().addAll(mainMenu);
		toolBar.setPrefWidth(XDIMENSION);
		return toolBar;
	}
}