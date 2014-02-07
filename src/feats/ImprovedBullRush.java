package feats;

public class ImprovedBullRush extends Feat {

	public ImprovedBullRush() {
		name = "Improved Bull Rush";
		benefit = "+4 Bonus to bull rush attempts, no attack of opportunity";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new PowerAttack();
	}

}
