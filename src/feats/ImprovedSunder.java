package feats;

public class ImprovedSunder extends Feat {

	public ImprovedSunder() {
		name = "Improved Sunder";
		benefit = "+4 bonus on sunder attempts, no attack of opporunity";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new PowerAttack();
	}

}
