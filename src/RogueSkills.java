
public class RogueSkills {
	boolean skillsAllowed[] = new boolean[45];
	
	public RogueSkills(){
		skillsAllowed[0] = true;
		skillsAllowed[1] = true;
		skillsAllowed[2] = true;
		skillsAllowed[3] = true;
		skillsAllowed[4] = false;
		skillsAllowed[5] = true;
		skillsAllowed[6] = true;
		skillsAllowed[7] = true;
		skillsAllowed[8] = true;
		skillsAllowed[9] = true;
		skillsAllowed[10] = true;
		skillsAllowed[11] = true;
		skillsAllowed[12] = true;
		skillsAllowed[13] = false;
		skillsAllowed[14] = false;
		skillsAllowed[15] = true;
		skillsAllowed[16] = true;
		skillsAllowed[17] = true;
		skillsAllowed[18] = false;
		skillsAllowed[19] = false;
		skillsAllowed[20] = false;
		skillsAllowed[21] = false;
		skillsAllowed[22] = false;
		skillsAllowed[23] = true;
		skillsAllowed[24] = false;
		skillsAllowed[25] = false;
		skillsAllowed[26] = false;
		skillsAllowed[27] = false;
		skillsAllowed[28] = true;
		skillsAllowed[29] = true;
		skillsAllowed[30] = true;
		skillsAllowed[31] = true;
		skillsAllowed[32] = true;
		skillsAllowed[33] = false;
		skillsAllowed[34] = true;
		skillsAllowed[35] = true;
		skillsAllowed[36] = true;
		skillsAllowed[37] = false;
		skillsAllowed[38] = false;
		skillsAllowed[39] = true;
		skillsAllowed[40] = false;
		skillsAllowed[41] = true;
		skillsAllowed[42] = true;
		skillsAllowed[43] = true;
		skillsAllowed[44] = true;
	}
	public boolean isSkillAllowed(int skill) {
		return skillsAllowed[skill];
	}
}
