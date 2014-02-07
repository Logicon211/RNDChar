package feats;

public class GreaterSpellFocus extends Feat {

	public GreaterSpellFocus() {
		name = "Greater Spell Focus (Same school as Spell Focus)";
		benefit = "+1 bonus on save DCs against specific school of magic";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new SpellFocus();
	}

}
