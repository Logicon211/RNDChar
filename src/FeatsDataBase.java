import java.util.Vector;

import feats.*;


public class FeatsDataBase {

	static Vector<String> currentFeats = new Vector<String>();
	public Feat featList[] = new Feat [106];
	
	public FeatsDataBase() {
		featList[0] = new Acrobatics();
		featList[1] = new Agile();
		featList[2] = new Alertness();
		featList[3] = new AnimalAffinity();
		featList[4] = new ArmorProficiencyHeavy();
		featList[5] = new ArmorProficiencyLight();
		featList[6] = new ArmorProficiencyMedium();
		featList[7] = new Athletic();
		featList[8] = new AugmentedSummoning();
		featList[9] = new BlindFight();
		featList[10] = new BrewPotion();
		featList[11] = new Cleave();
		featList[12] = new CombatExpertise();
		featList[13] = new CombatReflexes();
		featList[14] = new CraftMagicArmsAndArmor();
		featList[15] = new CraftRod();
		featList[16] = new CraftStaff();
		featList[17] = new CraftWand();
		featList[18] = new CraftWonderousItem();
		featList[19] = new Deceitful();
		featList[20] = new DeflectArrows();
		featList[21] = new DeftHands();
		featList[22] = new DieHard();
		featList[23] = new Diligent();
		featList[24] = new Dodge();
		featList[25] = new EmpowerSpell();
		featList[26] = new Endurance();
		featList[27] = new EnlargeSpell();
		featList[28] = new EschewMaterials();
		featList[29] = new ExoticWeaponProficiency();
		featList[30] = new ExtendSpell();
		featList[31] = new ExtraTurning();
		featList[32] = new FarShot();
		featList[33] = new ForgeRing();
		featList[34] = new GreatCleave();
		featList[35] = new GreaterSpellFocus();
		featList[36] = new GreaterSpellPenetration();
		featList[37] = new GreaterTwoWeaponFighting();
		featList[38] = new GreaterWeaponFocus();
		featList[39] = new GreatFortitude();
		featList[40] = new HeightenSpell();
		featList[41] = new ImprovedBullRush();
		featList[42] = new ImprovedCounterSpell();
		featList[43] = new ImprovedCritical();
		featList[44] = new ImprovedDisarm();
		featList[45] = new ImprovedFeint();
		featList[46] = new ImprovedGrapple();
		featList[47] = new ImprovedInitiative();
		featList[48] = new ImprovedOverrun();
		featList[49] = new ImprovedPreciseShot();
		featList[50] = new ImprovedShieldBash();
		featList[51] = new ImprovedSunder();
		featList[52] = new ImprovedTrip();
		featList[53] = new ImprovedTurning();
		featList[54] = new ImprovedTwoWeaponFighting();
		featList[55] = new ImprovedUnarmedStrike();
		featList[56] = new Investigator();
		featList[57] = new IronWill();
		featList[58] = new LeaderShip();;
		featList[59] = new LightningReflexes();
		featList[60] = new MagicalAptitude();
		featList[61] = new Manyshot();
		featList[62] = new MartialWeaponProficiency();
		featList[63] = new MaximizeSpell();
		featList[64] = new Mobility();
		featList[65] = new MountedArchery();
		featList[66] = new MountedCombat();
		featList[67] = new NaturalSpell();
		featList[68] = new Negotiator();
		featList[69] = new NimbleFingers();
		featList[70] = new Persuasive();
		featList[71] = new PointBlankShot();
		featList[72] = new PowerAttack();
		featList[73] = new PreciseShot();
		featList[74] = new QuickDraw();
		featList[75] = new QuickenSpell();
		featList[76] = new RapidReload();
		featList[77] = new RapidShot();
		featList[78] = new RideByAttack();
		featList[79] = new Run();
		featList[80] = new ScribeScroll();
		featList[81] = new SelfSufficient();
		featList[82] = new ShieldProficiency();
		featList[83] = new ShotOnTheRun();
		featList[84] = new SilentSpell();
		featList[85] = new SimpleWeaponProficiency();
		featList[86] = new SkillFocus();
		featList[87] = new SnatchArrows();
		featList[88] = new SpellFocus();
		featList[89] = new SpellMastery();
		featList[90] = new SpellPenetration();
		featList[91] = new SpiritedCharge();
		featList[92] = new SpringAttack();
		featList[93] = new Stealthy();
		featList[94] = new StillSpell();
		featList[95] = new StunningFist();
		featList[96] = new Toughness();
		featList[97] = new TowerShieldProficiency();
		featList[98] = new Track();
		featList[99] = new TwoWeaponDefense();
		featList[100] = new TwoWeaponFighting();
		featList[101] = new WeaponFinesse();
		featList[102] = new WeaponFocus();
		featList[103] = new WeaponSpecialization();
		featList[104] = new WhirlwindAttack();
		featList[105] = new WidenSpell();		
	}
	
	//NOT USING THIS TO DETERMIE AVAILABILITY
	
	//Checks feat Prereqs -- String featPrereqs must follow this format in order to work:
	// "Attribute<number needed>,feat prereq, feat prereq,... (Haven't yet implemented Base attack bonus, will be easy
	// example: Improved Grapple> "dex13,Improved Unarmed Strike"
	/*public static boolean canTakeFeat(int str, int dex, int con, int intl, int wis, int cha,int feat) {
		if(featPrereq[feat].equals(null)) {
			return true;
		}
		else {
			//Attribute prereqs
			String preReqs[] = featPrereq[feat].split(",");
			if(preReqs[0].startsWith("str")){
				if(Integer.parseInt(preReqs[0].substring(3)) < str) {
					return true;
				}
				else {
					return false;
				}
			}
			if(preReqs[0].startsWith("dex")){
				if(Integer.parseInt(preReqs[0].substring(3)) < dex) {
					return true;
				}
				else {
					return false;
				}
			}
			if(preReqs[0].startsWith("con")){
				if(Integer.parseInt(preReqs[0].substring(3)) < con) {
					return true;
				}
				else {
					return false;
				}
			}
			if(preReqs[0].startsWith("intl")){
				if(Integer.parseInt(preReqs[0].substring(4)) < intl) {
					return true;
				}
				else {
					return false;
				}
			}
			if(preReqs[0].startsWith("wis")){
				if(Integer.parseInt(preReqs[0].substring(3)) < wis) {
					return true;
				}
				else {
					return false;
				}
			}
			if(preReqs[0].startsWith("cha")){
				if(Integer.parseInt(preReqs[0].substring(3)) < cha) {
					return true;
				}
				else {
					return false;
				}
			}
			
			// Other feat prereqs
			if(preReqs.length < 1) {
				return true;
			}
			int sentinel = 0;
			for(int i=1;i<preReqs.length;i++){
				for(int k=0;k<currentFeats.size();k++){
					if(k==0){
						sentinel = 0;
					}
					if(preReqs[i].equals(currentFeats.elementAt(k))) {
						sentinel = 1;
					}
					if(k == currentFeats.size() && sentinel == 0) {
						return false;
					}
				}
			}
			return true;
			
		}*/
}
