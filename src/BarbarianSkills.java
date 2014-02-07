
public class BarbarianSkills {

	boolean skillsAllowed[] = new boolean[45];
	
	public BarbarianSkills() {
		skillsAllowed[0] = false;
		skillsAllowed[1] = false;
		skillsAllowed[2] = false;
		skillsAllowed[3] = true;
		skillsAllowed[4] = false;
		skillsAllowed[5] = true;
		skillsAllowed[6] = false;
		skillsAllowed[7] = false;
		skillsAllowed[8] = false;
		skillsAllowed[9] = false;
		skillsAllowed[10] = false;
		skillsAllowed[11] = false;
		skillsAllowed[12] = false;
		skillsAllowed[13] = true;
		skillsAllowed[14] = false;
		skillsAllowed[15] = false;
		skillsAllowed[16] = true;
		skillsAllowed[17] = true;
		skillsAllowed[18] = false;
		skillsAllowed[19] = false;
		skillsAllowed[20] = false;
		skillsAllowed[21] = false;
		skillsAllowed[22] = false;
		skillsAllowed[23] = false;
		skillsAllowed[24] = false;
		skillsAllowed[25] = false;
		skillsAllowed[26] = false;
		skillsAllowed[27] = false;
		skillsAllowed[28] = true;
		skillsAllowed[29] = false;
		skillsAllowed[30] = false;
		skillsAllowed[31] = false;
		skillsAllowed[32] = false;
		skillsAllowed[33] = true;
		skillsAllowed[34] = false;
		skillsAllowed[35] = false;
		skillsAllowed[36] = false;
		skillsAllowed[37] = false;
		skillsAllowed[38] = false;
		skillsAllowed[39] = false;
		skillsAllowed[40] = true;
		skillsAllowed[41] = true;
		skillsAllowed[42] = false;
		skillsAllowed[43] = false;
		skillsAllowed[44] = false;
	}
	public boolean isSkillAllowed(int skill) {
		return skillsAllowed[skill];
	}
}
