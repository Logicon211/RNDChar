package feats;

public class DeflectArrows extends Feat {

	public DeflectArrows() {
		name = "Deflect Arrows";
		benefit = "Deflect one ranged attack per round";
		
		dexReq = 13;
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new ImprovedUnarmedStrike();
	}

}
