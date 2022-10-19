package edu.monmouth.grade;
public class Grade2 {
	private static final String UNKNOWN= "UNKNOWN";
	private String gradeLetter;{
		gradeLetter = "A";
		gradeLetter = "A-";
		gradeLetter = "B+";
		gradeLetter = "B";
		gradeLetter = "B-";
		gradeLetter = "C+";
		gradeLetter = "C";
		gradeLetter = "C-";
		gradeLetter = "INC";
	}
	public Grade2() {
		this.gradeLetter = UNKNOWN;
	}
	public Grade2(char gradeLetter) {
		String gradeLetterS = Character.toString(gradeLetter);
		setGradeLetter(gradeLetterS);
		this.gradeLetter = UNKNOWN;
	}
	public Grade2(String gradeLetter) {
		this.gradeLetter = gradeLetter;
	}
	public String getGradeLetter() {
		return gradeLetter;
	}
	public void setGradeLetter(String gradeLetter) {
		if (gradeLetter.equals("A")) {
			this.gradeLetter = gradeLetter;
		}else if (gradeLetter.equals ("A-")){
			this.gradeLetter=gradeLetter;
		}else if (gradeLetter.equals ("B+")){
			this.gradeLetter=gradeLetter;
		}else if (gradeLetter.equals ("B")){
			this.gradeLetter=gradeLetter;
		}else if (gradeLetter.equals ("B-")){
			this.gradeLetter=gradeLetter;
		}else if (gradeLetter.equals ("C-")){
			this.gradeLetter=gradeLetter;
		}else if (gradeLetter.equals ("C")){
			this.gradeLetter=gradeLetter;
		}else if (gradeLetter.equals ("C+")){
			this.gradeLetter=gradeLetter;
		}else if (gradeLetter.equals ("INC")){
			this.gradeLetter=gradeLetter;	
		}else
			this.gradeLetter=UNKNOWN;
		}
		}
		
