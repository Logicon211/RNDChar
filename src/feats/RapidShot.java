package feats;

public class RapidShot extends Feat {

	public RapidShot() {
		name = "Rapid Shot";
		benefit = "One extra ranged attack each round";
		
		dexReq = 13;
		prereqFeat = new Feat[1];
		prereqFeat[0] = new PointBlankShot();
	}

}
