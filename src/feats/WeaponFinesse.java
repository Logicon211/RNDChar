package feats;

public class WeaponFinesse extends Feat {

	public WeaponFinesse() {
		name = "Weapon Finesse (Pick Weapon)";
		benefit = "Use Dex modifier instead of Str on attack rolls with light melee weapon";
		
		attackReq = 1;
	}

}
