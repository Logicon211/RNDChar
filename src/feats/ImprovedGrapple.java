package feats;

public class ImprovedGrapple extends Feat {

	public ImprovedGrapple() {
		name = "Imrpoved Grapple";
		benefit = "+4 Bonus to Grapple, no attacks of opportunity";
		
		dexReq = 13;
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new ImprovedUnarmedStrike();
	}

}
