package feats;

public class AugmentedSummoning extends Feat {

	public AugmentedSummoning() {
		name = "Augmented Summoning";
		benefit = "Summoned creature gain +4 Str, +4 Con";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new SpellFocus();
	}

}
