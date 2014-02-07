package feats;

public class GreaterWeaponFocus extends Feat {

	public GreaterWeaponFocus() {
		name = "Greater Weapon Focus (Pick focused weapon)";
		benefit = "+2 Bonus on attack rolls with selected weapon";
		
		levelReq = 8;
		needsFighter = true;
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new WeaponFocus();
	}

}
