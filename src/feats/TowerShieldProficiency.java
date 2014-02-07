package feats;

public class TowerShieldProficiency extends Feat {

	public TowerShieldProficiency() {
		name = "Tower Shield Proficiency";
		benefit = "No armor check penalty on attack rolls";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new ShieldProficiency();
	}

}
