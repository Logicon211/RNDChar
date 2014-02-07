package feats;

public class Mobility extends Feat {

	public Mobility() {
		name = "Mobility";
		benefit = "+4 bonus to AC against some attacs of opportunity";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new Dodge();
	}

}
