package mainProgram;

import javafx.scene.image.ImageView;

public class Protagonist {

	private Personality myPersonality;
	private String myHairColor, myHairLength, myName;
	private boolean hasGlasses;
	private ImageView myPicture;

	public Protagonist() {
		myPersonality = Personality.NORMAL;
		myHairColor = "";
		myHairLength = "";
		hasGlasses = false;
		myPicture = new ImageView();
	}

	public Protagonist(String hairColor, String hairLength, boolean glasses) {
		myHairColor = hairColor;
		myHairLength = hairLength;
		hasGlasses = glasses;
	}

	public Protagonist(String hairColor, String hairLength, boolean glasses,
			Personality personality) {
		myHairColor = hairColor;
		myHairLength = hairLength;
		hasGlasses = glasses;
		myPersonality = personality;
	}

	public Protagonist(String hairColor, String hairLength, String name,
			boolean glasses, ImageView picture) {
		myHairColor = hairColor;
		myHairLength = hairLength;
		myName = name;
		hasGlasses = glasses;
		myPicture = picture;
	}

	public void setPersonality(Personality personality) {
		myPersonality = personality;
	}

	public void setHairColor(String hairColor) {
		myHairColor = hairColor;
	}

	public void setHairLength(String hairLength) {
		myHairLength = hairLength;
	}

	public void setGlasses(boolean glasses) {
		hasGlasses = glasses;
	}

	public void setPicture(ImageView newPicture) {
		myPicture = newPicture;
	}

	public boolean equals(Protagonist prot) {
		return (myHairColor.equals(prot.getHairColor())
				&& myHairLength.equals(prot.getHairLength()) && (hasGlasses == prot
					.getGlasses()));
	}

	public Personality getPersonality() {
		return myPersonality;
	}

	public String getHairColor() {
		return myHairColor;
	}

	public String getHairLength() {
		return myHairLength;
	}

	public boolean getGlasses() {
		return hasGlasses;
	}

	public ImageView getPicture() {
		return myPicture;
	}

	public ImageView getPersonalityDescription() {
		return myPersonality.getImage();
	}
}
