package feats;

public class DieHard extends Feat {

	public DieHard() {
		name = "Die Hard";
		benefit = "Remain conscious at -1 to -9 hp";
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new Endurance();
	}

}
