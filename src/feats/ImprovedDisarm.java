package feats;

public class ImprovedDisarm extends Feat {

	public ImprovedDisarm() {
		name = "Improved Disarm";
		benefit = "+4 Bonus on disarm attempts; no attack of opporunity";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new CombatExpertise();
	}

}
