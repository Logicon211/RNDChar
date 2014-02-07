package feats;

public class GreaterTwoWeaponFighting extends Feat {

	public GreaterTwoWeaponFighting() {
		name = "Greater Two Weapon Fighting";
		benefit = "Gain a third off hand attack";
		
		dexReq = 19;
		attackReq = 11;
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new ImprovedTwoWeaponFighting();
	}

}
