package feats;

public class ImprovedTrip extends Feat {

	public ImprovedTrip() {
		name = "Improved Trip";
		benefit ="+4 bonus on trip attempts; no attack of opportunity";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new CombatExpertise();
	}

}
