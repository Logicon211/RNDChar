package feats;

public class RideByAttack extends Feat {

	public RideByAttack() {
		name = "Ride-By Attack";
		benefit = "Move before and after a mounted charge";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new MountedCombat();
	}

}
