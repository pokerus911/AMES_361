package polls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import mainProgram.CharacterInfoDisplay;
import mainProgram.MainGameRunner;
import mainProgram.Personality;
import mainProgram.Protagonist;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PersonalityPoll {
	private Map<String, String> resources;
	private ArrayList<Integer> personality;
	private final int QUESTION_SIZE = 300;
	private final int RESPONSE_SIZE = 500;
	public PersonalityPoll(){
		ResourceBundle myResources = ResourceBundle
				.getBundle("resources/PersonalityQuestions");
		resources = MainGameRunner.convertResourceBundleToMap(myResources);
		personality = new ArrayList<Integer>();
		personality.addAll(Arrays.asList(0, 0, 0, 0, 0));
	}
	
	public Scene makePersonalityPoll(BorderPane bottomContent, Stage stage, CharacterInfoDisplay characterInfo, GridPane root){
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(15, 12, 15, 12));
		grid.setHgap(10);
		grid.setVgap(10);
		
		Label question1Label = new Label(resources.get("Question1"));
		question1Label.setWrapText(true);
		ComboBox question1 = new ComboBox();
		PersonalityOption Q1A1 = new PersonalityOption(resources.get("Q1A1"), 0, 1, 0, 0, 2);
		PersonalityOption Q1A2 = new PersonalityOption(resources.get("Q1A2"), 1, 2, 0, 0, 0);
		PersonalityOption Q1A3 = new PersonalityOption(resources.get("Q1A3"), 0, 0, 0, 2, 1);
		PersonalityOption Q1A4 = new PersonalityOption(resources.get("Q1A4"), 0, 0, 2, 1, 0);
		PersonalityOption Q1A5 = new PersonalityOption(resources.get("Q1A5"), 2, 0, 1, 0, 0);
		question1.getItems().addAll(Q1A1.getText(), Q1A2.getText(), Q1A3.getText(), Q1A4.getText(), Q1A5.getText());
		question1.setPrefWidth(RESPONSE_SIZE);

		Label question2Label = new Label(resources.get("Question2"));
		question2Label.setWrapText(true);
		ComboBox question2 = new ComboBox();
		PersonalityOption Q2A1 = new PersonalityOption(resources.get("Q2A1"), 0, 0, 0, 2, 0);
		PersonalityOption Q2A2 = new PersonalityOption(resources.get("Q2A2"), 0, 2, 0, 0, 0);
		PersonalityOption Q2A3 = new PersonalityOption(resources.get("Q2A3"), 0, 0, 2, 0, 0);
		PersonalityOption Q2A4 = new PersonalityOption(resources.get("Q2A4"), 2, 0, 0, 0, 0);
		PersonalityOption Q2A5 = new PersonalityOption(resources.get("Q2A5"), 0, 0, 0, 0, 2);
		question2.getItems().addAll(Q2A1.getText(), Q2A2.getText(), Q2A3.getText(), Q2A4.getText(), Q2A5.getText());
		question2.setPrefWidth(RESPONSE_SIZE);
		
		Label question3Label = new Label(resources.get("Question3"));
		question3Label.setWrapText(true);
		ComboBox question3 = new ComboBox();
		PersonalityOption Q3A1 = new PersonalityOption(resources.get("Q3A1"), 1, 0, 2, 0, 0);
		PersonalityOption Q3A2 = new PersonalityOption(resources.get("Q3A2"), 2, 0, 0, 0, 1);
		PersonalityOption Q3A3 = new PersonalityOption(resources.get("Q3A3"), 0, 1, 0, 2, 0);
		PersonalityOption Q3A4 = new PersonalityOption(resources.get("Q3A4"), 0, 0, 0, 1, 2);
		PersonalityOption Q3A5 = new PersonalityOption(resources.get("Q3A5"), 0, 2, 1, 0, 0);
		question3.getItems().addAll(Q3A1.getText(), Q3A2.getText(), Q3A3.getText(), Q3A4.getText(), Q3A5.getText());
		question3.setPrefWidth(RESPONSE_SIZE);
		
		Label question4Label = new Label(resources.get("Question4"));
		question4Label.setWrapText(true);
		ComboBox question4 = new ComboBox();
		PersonalityOption Q4A1 = new PersonalityOption(resources.get("Q4A1"), 0, 0, 0, 1, 2);
		PersonalityOption Q4A2 = new PersonalityOption(resources.get("Q4A2"), 0, 0, 1, 2, 0);
		PersonalityOption Q4A3 = new PersonalityOption(resources.get("Q4A3"), 0, 2, 0, 0, 1);
		PersonalityOption Q4A4 = new PersonalityOption(resources.get("Q4A4"), 2, 1, 0, 0, 0);
		PersonalityOption Q4A5 = new PersonalityOption(resources.get("Q4A5"), 1, 0, 2, 0, 0);
		question4.getItems().addAll(Q4A1.getText(), Q4A2.getText(), Q4A3.getText(), Q4A4.getText(), Q4A5.getText());
		question4.setPrefWidth(RESPONSE_SIZE);
		
		Label question5Label = new Label(resources.get("Question5"));
		question5Label.setWrapText(true);
		ComboBox question5 = new ComboBox();
		PersonalityOption Q5A1 = new PersonalityOption(resources.get("Q5A1"), 0, 0, 2, 0, 0);
		PersonalityOption Q5A2 = new PersonalityOption(resources.get("Q5A2"), 0, 0, 0, 2, 0);
		PersonalityOption Q5A3 = new PersonalityOption(resources.get("Q5A3"), 0, 2, 0, 0, 0);
		PersonalityOption Q5A4 = new PersonalityOption(resources.get("Q5A4"), 0, 0, 0, 0, 2);
		PersonalityOption Q5A5 = new PersonalityOption(resources.get("Q5A5"), 2, 0, 0, 0, 0);
		question5.getItems().addAll(Q5A1.getText(), Q5A2.getText(), Q5A3.getText(), Q5A4.getText(), Q5A5.getText());
		question5.setPrefWidth(RESPONSE_SIZE);
		
		Label question6Label = new Label(resources.get("Question6"));
		question6Label.setWrapText(true);
		ComboBox question6 = new ComboBox();
		PersonalityOption Q6A1 = new PersonalityOption(resources.get("Q6A1"), 0, 0, 0, 0, 2);
		PersonalityOption Q6A2 = new PersonalityOption(resources.get("Q6A2"), 0, 0, 2, 0, 0);
		PersonalityOption Q6A3 = new PersonalityOption(resources.get("Q6A3"), 0, 0, 0, 2, 0);
		PersonalityOption Q6A4 = new PersonalityOption(resources.get("Q6A4"), 2, 0, 0, 0, 0);
		PersonalityOption Q6A5 = new PersonalityOption(resources.get("Q6A5"), 0, 2, 0, 0, 0);
		question6.getItems().addAll(Q6A1.getText(), Q6A2.getText(), Q6A3.getText(), Q6A4.getText(), Q6A5.getText());
		question6.setPrefWidth(RESPONSE_SIZE);
		
		grid.add(question1Label, 0, 0);
		grid.add(question1, 1, 0);
		grid.add(question2Label, 0, 1);
		grid.add(question2, 1, 1);
		grid.add(question3Label, 0, 2);
		grid.add(question3, 1, 2);
		grid.add(question4Label, 0, 3);
		grid.add(question4, 1, 3);
		grid.add(question5Label, 0, 4);
		grid.add(question5, 1, 4);
		grid.add(question6Label, 0, 5);
		grid.add(question6, 1, 5);
		
		ArrayList<ComboBox> questions = new ArrayList<ComboBox>();
		questions.addAll(Arrays.asList(question1, question2, question3, question4, question5, question6));
		ArrayList<List<PersonalityOption>> allOptions = new ArrayList<List<PersonalityOption>>();
		allOptions.addAll(Arrays.asList(
				Arrays.asList(Q1A1, Q1A2, Q1A3, Q1A4, Q1A5), 
				Arrays.asList(Q2A1, Q2A2, Q2A3, Q2A4, Q2A5), 
				Arrays.asList(Q3A1, Q3A2, Q3A3, Q3A4, Q3A5),
				Arrays.asList(Q4A1, Q4A2, Q4A3, Q4A4, Q4A5),
				Arrays.asList(Q5A1, Q5A2, Q5A3, Q5A4, Q5A5),
				Arrays.asList(Q6A1, Q6A2, Q6A3, Q6A4, Q6A5)));
		
		Button finish = new Button("Finish!");
		finish.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				for(int i = 0; i < questions.size(); i++){
					ComboBox cb = questions.get(i);
					String val = (String) cb.getValue();
					for(PersonalityOption po : allOptions.get(i)){
						if(val.equals(po.getText())){
							for(int j = 0; j < personality.size(); j++){
								personality.set(j, personality.get(j) + po.getPersonalityScore().get(j));
							}
						}
					}
				}
				MainGameRunner.myChar.setPersonality(findPersonalityType());
				root.getChildren().remove(bottomContent);
				root.getChildren().remove(characterInfo.getBorderPane());
				root.add(characterInfo.getBorderPane(), 0, 1);
				stage.close();
				characterInfo.update();
				
			}
		});
		grid.add(finish, 0, 6);
		
		grid.getColumnConstraints().add(new ColumnConstraints(QUESTION_SIZE));

		Scene pollingScene = new Scene(grid, MainGameRunner.XDIMENSION,
				grid.getHeight());
		return pollingScene;
	}

	protected Personality findPersonalityType() {
		int highest = 0;
		int index = 0;
		for(int i = 0; i < personality.size(); i++){
			if(personality.get(i) > highest){
				highest = personality.get(i);
				index = i;
			}
		}
		if(index == 0)
			return Personality.TSUNDERE;
		else if(index == 1)
			return Personality.YANDERE;
		else if(index == 2)
			return Personality.KUUDERE;
		else if(index == 3)
			return Personality.DANDERE;
		else if(index == 4)
			return Personality.DEREDERE;
		return Personality.NORMAL;
	}
}
