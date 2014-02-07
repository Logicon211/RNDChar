package feats;

public class Cleave extends Feat {

	public Cleave() {
		name = "Cleave";
		benefit = "Extra Melee attack after dropping target";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new PowerAttack();
	}

}
