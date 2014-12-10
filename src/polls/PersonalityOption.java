package polls;

import java.util.ArrayList;

import javafx.scene.control.Button;

public class PersonalityOption extends Button {
	int myTsundere, myYandere, myKuudere, myDandere, myDeredere;

	public PersonalityOption(String text, int tsundereCount, int yandereCount,
			int kuudereCount, int dandereCount, int deredereCount) {
		super(text);
		myTsundere = tsundereCount;
		myYandere = yandereCount;
		myKuudere = kuudereCount;
		myDandere = dandereCount;
		myDeredere = deredereCount;
	}

	public ArrayList<Integer> getPersonalityScore() {
		ArrayList<Integer> personalityScore = new ArrayList<Integer>();
		personalityScore.add(myTsundere);
		personalityScore.add(myYandere);
		personalityScore.add(myKuudere);
		personalityScore.add(myDandere);
		personalityScore.add(myDeredere);
		return personalityScore;
	}
}
