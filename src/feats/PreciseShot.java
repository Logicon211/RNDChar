package feats;

public class PreciseShot extends Feat {

	public PreciseShot() {
		name = "Precise Shot";
		benefit = "No -4 penalty for shooting into melee";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new PointBlankShot();
	}

}
