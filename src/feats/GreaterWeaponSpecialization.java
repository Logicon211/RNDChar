package feats;

public class GreaterWeaponSpecialization extends Feat {

	public GreaterWeaponSpecialization() {
		name = "Greater Weapon Specialization (Pick focused and specialized wepon";
		benefit = "+4 bonus on damage rolls with selected weapon";
		
		levelReq = 12;
		needsFighter = true;
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new WeaponSpecialization();
	}

}
