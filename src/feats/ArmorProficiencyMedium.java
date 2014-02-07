package feats;

public class ArmorProficiencyMedium extends Feat {

	public ArmorProficiencyMedium() {
		name = "Armor Proficiency (medium)";
		benefit = "No Armor Check Penalty on attack rolls using medium armor";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new ArmorProficiencyLight();
		
	}

}
