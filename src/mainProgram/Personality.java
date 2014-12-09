package mainProgram;

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
}
