package feats;

public class StunningFist extends Feat {

	public StunningFist() {
		name  = "Stunning Fist";
		benefit = "Stun opponent with an unarmed strike";
		
		dexReq = 13;
		wisReq = 13;
		attackReq = 8;
		
		prereqFeat = new Feat[1];
		prereqFeat[0] = new ImprovedUnarmedStrike();
	}

}
