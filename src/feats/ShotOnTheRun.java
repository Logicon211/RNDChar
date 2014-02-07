package feats;

public class ShotOnTheRun extends Feat {

	public ShotOnTheRun() {
		name = "Shot on the Run";
		benefit = "Move before and after ranged attack";
		
		dexReq = 13;
		attackReq = 4;
		
		prereqFeat = new Feat[3];
		prereqFeat[0] = new PointBlankShot();
		prereqFeat[1] = new Mobility();
		prereqFeat[2] = new Dodge();
	}

}
