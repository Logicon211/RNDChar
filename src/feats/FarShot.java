package feats;

public class FarShot extends Feat {

	public FarShot() {
		name = "Far Shot";
		benefit = "Increase Range increment by 50% or 100%";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new PointBlankShot();
	}

}
