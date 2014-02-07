package feats;

public class WhirlwindAttack extends Feat {

	public WhirlwindAttack()
	{
		name = "Whirlwind Attack";
		benefit = "One melee attack against each opponent within reach";
		
		dexReq = 13;
		attackReq = 4;
		
		prereqFeat = new Feat[4];
		prereqFeat[0] = new CombatExpertise();
		prereqFeat[1] = new Dodge();
		prereqFeat[2] = new Mobility();
		prereqFeat[3] = new SpringAttack();
	}
}
