package feats;

public class ImprovedTwoWeaponFighting extends Feat {

	public ImprovedTwoWeaponFighting() {
		name = "Improved Two Weapon Fighting";
		benefit = "Gain second offhand Attack";
		
		dexReq = 17;
		attackReq = 6;
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new TwoWeaponFighting();
	}

}
