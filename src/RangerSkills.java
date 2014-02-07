
public class RangerSkills {
	boolean skillsAllowed[] = new boolean[45];
	
	public RangerSkills(){
		skillsAllowed[0] = false;
		skillsAllowed[1] = false;
		skillsAllowed[2] = false;
		skillsAllowed[3] = true;
		skillsAllowed[4] = true;
		skillsAllowed[5] = true;
		skillsAllowed[6] = false;
		skillsAllowed[7] = false;
		skillsAllowed[8] = false;
		skillsAllowed[9] = false;
		skillsAllowed[10] = false;
		skillsAllowed[11] = false;
		skillsAllowed[12] = false;
		skillsAllowed[13] = true;
		skillsAllowed[14] = true;
		skillsAllowed[15] = true;
		skillsAllowed[16] = false;
		skillsAllowed[17] = true;
		skillsAllowed[18] = false;
		skillsAllowed[19] = false;
		skillsAllowed[20] = true;
		skillsAllowed[21] = true;
		skillsAllowed[22] = false;
		skillsAllowed[23] = false;
		skillsAllowed[24] = true;
		skillsAllowed[25] = false;
		skillsAllowed[26] = false;
		skillsAllowed[27] = false;
		skillsAllowed[28] = true;
		skillsAllowed[29] = true;
		skillsAllowed[30] = false;
		skillsAllowed[31] = false;
		skillsAllowed[32] = true;
		skillsAllowed[33] = true;
		skillsAllowed[34] = true;
		skillsAllowed[35] = false;
		skillsAllowed[36] = false;
		skillsAllowed[37] = false;
		skillsAllowed[38] = false;
		skillsAllowed[39] = true;
		skillsAllowed[40] = true;
		skillsAllowed[41] = true;
		skillsAllowed[42] = false;
		skillsAllowed[43] = false;
		skillsAllowed[44] = true;
	}
	public boolean isSkillAllowed(int skill) {
		return skillsAllowed[skill];
	}
}
