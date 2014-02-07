
public class WizardSkills {
	boolean skillsAllowed[] = new boolean[45];
	
	public WizardSkills(){
		skillsAllowed[0] = false;
		skillsAllowed[1] = false;
		skillsAllowed[2] = false;
		skillsAllowed[3] = false;
		skillsAllowed[4] = true;
		skillsAllowed[5] = true;
		skillsAllowed[6] = true;
		skillsAllowed[7] = false;
		skillsAllowed[8] = false;
		skillsAllowed[9] = false;
		skillsAllowed[10] = false;
		skillsAllowed[11] = false;
		skillsAllowed[12] = false;
		skillsAllowed[13] = false;
		skillsAllowed[14] = false;
		skillsAllowed[15] = false;
		skillsAllowed[16] = false;
		skillsAllowed[17] = false;
		skillsAllowed[18] = true;
		skillsAllowed[19] = true;
		skillsAllowed[20] = true;
		skillsAllowed[21] = true;
		skillsAllowed[22] = true;
		skillsAllowed[23] = true;
		skillsAllowed[24] = true;
		skillsAllowed[25] = true;
		skillsAllowed[26] = true;
		skillsAllowed[27] = true;
		skillsAllowed[28] = false;
		skillsAllowed[29] = false;
		skillsAllowed[30] = false;
		skillsAllowed[31] = false;
		skillsAllowed[32] = true;
		skillsAllowed[33] = false;
		skillsAllowed[34] = false;
		skillsAllowed[35] = false;
		skillsAllowed[36] = false;
		skillsAllowed[37] = false;
		skillsAllowed[38] = true;
		skillsAllowed[39] = false;
		skillsAllowed[40] = false;
		skillsAllowed[41] = false;
		skillsAllowed[42] = false;
		skillsAllowed[43] = false;
		skillsAllowed[44] = false;
	}
	public boolean isSkillAllowed(int skill) {
		return skillsAllowed[skill];
	}
}
