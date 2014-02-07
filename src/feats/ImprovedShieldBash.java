package feats;

public class ImprovedShieldBash extends Feat {

	public ImprovedShieldBash() {
		name = "Improved Shield Bash";
		benefit = "Retain shield bonus to AC when shield bashing";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new ShieldProficiency();
	}

}
