package feats;

public class Manyshot extends Feat {

	public Manyshot()
	{
		name = "Manyshot";
		benefit = "Shoot 2 or more arrows simultaneously";
		
		dexReq = 17;
		attackReq = 4;
		
		prereqFeat = new Feat[2];
		prereqFeat[0] = new PointBlankShot();
		prereqFeat[1] = new RapidShot();
	}
}
