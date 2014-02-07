package feats;

public class ImprovedOverrun extends Feat {

	public ImprovedOverrun() {
		name = "Improved Overrun";
		benefit = "+4 bonus on overrun attempts, no attack of opportunity";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new PowerAttack();
	}

}
