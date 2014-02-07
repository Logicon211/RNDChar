package feats;

public class TwoWeaponDefense extends Feat {

	public TwoWeaponDefense() {
		name = "Two Weapon Defense";
		benefit = "Off hand weapon grants +1 shield bonus to AC";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new TwoWeaponFighting();
	}

}
