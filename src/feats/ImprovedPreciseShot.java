package feats;

public class ImprovedPreciseShot extends Feat {

	public ImprovedPreciseShot() {
		name = "Improved Precise Shot";
		benefit = "Ignore less than total cover/concealment on ranged attacks";
		
		dexReq = 19;
		attackReq = 11;
		
		prereqFeat = new Feat[2];
		prereqFeat[0] = new PointBlankShot();
		prereqFeat[1] = new PreciseShot();
	}

}
