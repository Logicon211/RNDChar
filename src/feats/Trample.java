package feats;

public class Trample extends Feat {
	
	public Trample(){
		name = "Trample";
		benefit = "Target cannot avoid mounted overrun";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new MountedCombat();
	}

}
