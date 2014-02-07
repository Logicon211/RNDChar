package feats;

public class NaturalSpell extends Feat {

	public NaturalSpell() {
		name = "Natural Spell";
		benefit = "Casts Spells while in wild shape";
		
		wisReq = 13;
		needsDruid = true;
	}

}
