
public class BardSkills {
	boolean skillsAllowed[] = new boolean[45];
	
	public BardSkills() {
		skillsAllowed[0] = true;
		skillsAllowed[1] = true;
		skillsAllowed[2] = true;
		skillsAllowed[3] = true;
		skillsAllowed[4] = true;
		skillsAllowed[5] = true;
		skillsAllowed[6] = true;
		skillsAllowed[7] = true;
		skillsAllowed[8] = false;
		skillsAllowed[9] = true;
		skillsAllowed[10] = true;
		skillsAllowed[11] = false;
		skillsAllowed[12] = true;
		skillsAllowed[13] = false;
		skillsAllowed[14] = false;
		skillsAllowed[15] = true;
		skillsAllowed[16] = false;
		skillsAllowed[17] = true;
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
		skillsAllowed[28] = true;
		skillsAllowed[29] = true;
		skillsAllowed[30] = false;
		skillsAllowed[31] = true;
		skillsAllowed[32] = true;
		skillsAllowed[33] = false;
		skillsAllowed[34] = false;
		skillsAllowed[35] = true;
		skillsAllowed[36] = true;
		skillsAllowed[37] = true;
		skillsAllowed[38] = true;
		skillsAllowed[39] = false;
		skillsAllowed[40] = false;
		skillsAllowed[41] = true;
		skillsAllowed[42] = true;
		skillsAllowed[43] = true;
		skillsAllowed[44] = false;
	}
	public boolean isSkillAllowed(int skill) {
		return skillsAllowed[skill];
	}
}
