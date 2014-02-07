package feats;

public class SpiritedCharge extends Feat {

	public SpiritedCharge() {
		name = "Spirited Charge";
		benefit = "Double Damage with mounted charge";
		
		prereqFeat = new Feat[2];
		prereqFeat[0] = new MountedCombat();
		prereqFeat[1] = new RideByAttack();
	}

}
