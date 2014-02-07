package feats;

public class GreaterSpellPenetration extends Feat {

	public GreaterSpellPenetration() {
		name = "Greater Spell Penetration";
		benefit = "+4 to caster level checks to defeat spell resistance";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new SpellPenetration();
	}

}
