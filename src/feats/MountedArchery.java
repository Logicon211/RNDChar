package feats;

public class MountedArchery extends Feat {

	public MountedArchery() {
		name = "Mounted Archery";
		benefit = "Half Penalty for ranged attacks while mounted";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new MountedCombat();
	}

}
