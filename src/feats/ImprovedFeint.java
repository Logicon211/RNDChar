package feats;

public class ImprovedFeint extends Feat {

	public ImprovedFeint() {
		name = "Improved Feint";
		benefit = "Feint in combat as a move action";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new CombatExpertise();
	}

}
