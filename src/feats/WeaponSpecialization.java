package feats;

public class WeaponSpecialization extends Feat {

	public WeaponSpecialization() {
		name = "Weapon Specialization (Pick focused weapon)";
		benefit = "+2 bonus on damage rolls with weapon";
		
		levelReq = 4;
		needsFighter = true;
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new WeaponFocus();
	}

}
