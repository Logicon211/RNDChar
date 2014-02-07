package feats;

public class SnatchArrows extends Feat {

	public SnatchArrows() {
		name = "Snatch Arrows";
		benefit = "Catch a deflected ranged attack";
		
		dexReq = 15;
		
		prereqFeat = new Feat[2];
		prereqFeat[0] = new DeflectArrows();
		prereqFeat[1] = new ImprovedUnarmedStrike();
	}

}
