package feats;

public class GreatCleave extends Feat {

	public GreatCleave() {
		name = "Great Cleave";
		benefit ="No limit to cleave attacks each round";
		
		attackReq = 4;
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new Cleave();
	}

}
