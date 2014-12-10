package mainProgram;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
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
	public static final int XDIMENSION = 880, YDIMENSION = 530;
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

	public static void main(String[] args) {
		launch(args);
	}

	private ToolBar createToolbar(GridPane root) {
		ToolBar toolBar = new ToolBar();
		MenuBar mainMenu = new MenuBar();

		Menu editMenu = new Menu("Edit");

		MenuItem editAppearance = new MenuItem("Edit Character Appearance");
		editAppearance.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				myBuilder.editAppearance(bottomContent, characterInfo, root);
			}

		});

		MenuItem editPersonality = new MenuItem("Edit Character Personality");
		editPersonality.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				myBuilder.editPersonality(bottomContent, characterInfo, root);
			}

		});

		editMenu.getItems().addAll(editAppearance, editPersonality);
		mainMenu.getMenus().addAll(editMenu);
		toolBar.getItems().addAll(mainMenu);
		toolBar.setPrefWidth(XDIMENSION);
		return toolBar;
	}

	public static Map<String, String> convertResourceBundleToMap(
			ResourceBundle resource) {
		Map<String, String> map = new HashMap<String, String>();

		Enumeration<String> keys = resource.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			map.put(key, resource.getString(key));
		}
		return map;
	}
}
