package feats;

public class SpringAttack extends Feat {

	public SpringAttack() {
		name = "Spring Attack";
		benefit = "Move before and after melee attacks";
		
		attackReq = 4;
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new Mobility();
	}

}
