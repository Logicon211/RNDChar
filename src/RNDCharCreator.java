import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

import feats.*;


public class RNDCharCreator {
	static int level;
	static int attributes[] = new int[6];
	static int str;
	static int dex;
	static int con;
	static int intl;
	static int wis;
	static int cha;
	static int HP;
	static String Class;
	static String Race;
	static int skillPoints;
	static Vector<Feat> Feats =  new Vector<Feat>();
	                                     
	public static void main(String[] args) throws IOException {
		Random rndGen = new Random();
		//initializing classes
		String classes[];
		classes = new String[11];
		classes[0] = "Barbarian";
		classes[1] = "Bard";
		classes[2] = "Cleric";
		classes[3] = "Druid";
		classes[4] = "Fighter";
		classes[5] = "Monk";
		classes[6] = "Paladin";
		classes[7] = "Ranger";
		classes[8] = "Rogue";
		classes[9] = "Sorcerer";
		classes[10] = "Wizard";
		
		//initializing races
		String races[];
		races = new String [7];
		races[0] = "Human";
		races[1] = "Dwarf";
		races[2] = "Elf";
		races[3] = "Gnome";
		races[4] = "Half-Elf";
		races[5] = "Half-Orc";
		races[6] = "Halfling";
		
		//initializing skills
		String skills[];
		skills = new String[45];
		int skillMod[];
		skillMod = new int[45];
		skills[0] ="Appraise" ;
		skills[1] ="Balance" ;
		skills[2] ="Bluff" ;
		skills[3] ="Climb" ;
		skills[4] ="Concentration" ;
		skills[5] ="Craft" ;
		skills[6] ="Decipher Script" ;
		skills[7] ="Diplomacy" ;
		skills[8] ="Disable Device" ;
		skills[9] ="Disguise" ;
		skills[10] ="Escape Artist" ;
		skills[11] ="Forgery" ;
		skills[12] ="Gather Information" ;
		skills[13] ="Handle Animal" ;
		skills[14] ="Heal" ;
		skills[15] ="Hide" ;
		skills[16] ="Intimidate" ;
		skills[17] ="Jump" ;
		skills[18] ="Knowledge(Arcana)" ;
		skills[19] ="Knowledge(Arcitecture + engineering)" ;
		skills[20] ="Knowledge(Dungeoneering)" ;
		skills[21] ="Knowledge(Geography)" ;
		skills[22] ="Knowledge(History)" ;
		skills[23] ="Knowledge(Local)" ;
		skills[24] ="Knowledge(Nature)" ;
		skills[25] ="Knowledge(Nobility)" ;
		skills[26] ="Knowledge(Religeon)" ;
		skills[27] ="Knowledge(The Planes)" ;
		skills[28] ="Listen" ;
		skills[29] ="Move Silently" ;
		skills[30] ="Open Lock" ;
		skills[31] ="Perform" ;
		skills[32] ="Profession" ;
		skills[33] ="Ride" ;
		skills[34] ="Search" ;
		skills[35] ="Sense Motive" ;
		skills[36] ="Slight of Hand" ;
		skills[37] ="Speak Language" ;
		skills[38] ="Spellcraft" ;
		skills[39] ="Spot" ;
		skills[40] ="Survival" ;
		skills[41] ="Swim" ;
		skills[42] ="Tumble" ;
		skills[43] ="Use Magic Device" ;
		skills[44] ="Use Rope" ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a level (1-20): ");
		level = sc.nextInt();
		
		//Choose class
		int rnd =(int)(Math.random() * 11);
		Class = classes[rnd];
		
		//roll for attributes
		int roll1 = (int)((Math.random() * 6) + 1);
		int roll2= (int)((Math.random() * 6) + 1);
		int roll3 = (int)((Math.random() * 6) + 1);
		int roll4 = (int)((Math.random() * 6) + 1);
		for (int i=0;i<6;i++) {
			if(roll1 <= roll2 && roll1 <= roll3 && roll1 <= roll4) {
				attributes[i] = roll2 + roll3 + roll4;
			}
			if(roll2 <= roll1 && roll2 <= roll3 && roll2 <= roll4) {
				attributes[i] = roll2 + roll3 + roll4;
			}
			if(roll3 <= roll2 && roll3 <= roll1 && roll3 <= roll4) {
				attributes[i] = roll2 + roll3 + roll4;
			}
			if(roll4 <= roll2 && roll4 <= roll3 && roll4 <= roll1) {
				attributes[i] = roll2 + roll3 + roll4;
			}
			roll1 = (int)((Math.random() * 6) + 1);
			roll2= (int)((Math.random() * 6) + 1);
			roll3 = (int)((Math.random() * 6) + 1);
			roll4 = (int)((Math.random() * 6) + 1);
		}
		
		//organizing them into their own groups
		for(int i=0;i<6;i++) {
			if(i == 0) {
				str = attributes[i];
			}
			if(i == 1) {
				dex = attributes[i];
			}
			if(i == 2) {
				con = attributes[i];
			}
			if(i == 3) {
				intl = attributes[i];
			}
			if(i == 4) {
				wis = attributes[i];
			}
			if(i == 5) {
				cha = attributes[i];
			}
		}
		//initializing skill points
		if(Class.equals("Barbarian")){
			skillPoints = ((4 + getModifier(intl)) * 4) + ((4+ getModifier(intl)) * level);
		}
		else if(Class.equals("Bard")){
			skillPoints = ((6 + getModifier(intl)) * 4) + ((6+ getModifier(intl)) * level);
		}
		else if(Class.equals("Cleric")){
			skillPoints = ((2 + getModifier(intl)) * 4) + ((2+ getModifier(intl)) * level);
		}
		else if(Class.equals("Druid")){
			skillPoints = ((4 + getModifier(intl)) * 4) + ((4+ getModifier(intl)) * level);
		}
		else if(Class.equals("Fighter")){
			skillPoints = ((2 + getModifier(intl)) * 4) + ((2+ getModifier(intl)) * level);
		}
		else if(Class.equals("Monk")){
			skillPoints = ((4 + getModifier(intl)) * 4) + ((4+ getModifier(intl)) * level);
		}
		else if(Class.equals("Paladin")){
			skillPoints = ((2 + getModifier(intl)) * 4) + ((2+ getModifier(intl)) * level);
		}
		else if(Class.equals("Ranger")){
			skillPoints = ((6 + getModifier(intl)) * 4) + ((6+ getModifier(intl)) * level);
		}
		else if(Class.equals("Rogue")){
			skillPoints = ((8 + getModifier(intl)) * 4) + ((8+ getModifier(intl)) * level);
		}
		else if(Class.equals("Sorcerer")){
			skillPoints = ((2 + getModifier(intl)) * 4) + ((2+ getModifier(intl)) * level);
		}
		else if(Class.equals("Wizard")){
			skillPoints = ((2 + getModifier(intl)) * 4) + ((2+ getModifier(intl)) * level);
		}
		//Choose race
		rnd =(int)(Math.random() * 7);
		Race = races[rnd];
		//change attributes accordingly
		if (Race.equals("Human")){
			skillPoints = skillPoints + 4 + level;
		}
		else if (Race.equals("Dwarf")) {
			con = con + 2;
			cha = cha - 2;
		}
		else if (Race.equals("Elf")) {
			dex = dex + 2;
			con = con - 2;
		}
		else if (Race.equals("Gnome")) {
			con = con + 2;
			str = str - 2;
		}
		else if (Race.equals("Half-Elf")) {
			
		}
		else if (Race.equals("Half-Orc")) {
			str = str + 2;
			intl = intl - 2;
			cha = cha - 2;
		}
		else if (Race.equals("Halfling")) {
			dex = dex + 2;
			str = str - 2;
		}
		//Allocate Skills
		int sentinel = 1;
		if(Class.equals("Barbarian")){
			BarbarianSkills SDB = new BarbarianSkills();
			while (sentinel < skillPoints) {
				rnd = rndGen.nextInt(45);
				if(SDB.isSkillAllowed(rnd)){
					if(skillMod[rnd] <= level + 4) {
						skillMod[rnd] = skillMod[rnd] + 1;
						sentinel++;
					}
				}
			}
		}
		else if(Class.equals("Bard")){
			BardSkills SDB = new BardSkills();
			while (sentinel < skillPoints) {
				rnd = rndGen.nextInt(45);
				if(SDB.isSkillAllowed(rnd)){
					if(skillMod[rnd] <= level + 4) {
						skillMod[rnd] = skillMod[rnd] + 1;
						sentinel++;
					}
				}
			}
		}
		else if(Class.equals("Cleric")){
			ClericSkills SDB = new ClericSkills();
			while (sentinel < skillPoints) {
				rnd = rndGen.nextInt(45);
				if(SDB.isSkillAllowed(rnd)){
					if(skillMod[rnd] <= level + 4) {
						skillMod[rnd] = skillMod[rnd] + 1;
						sentinel++;
					}
				}
			}
		}
		else if(Class.equals("Druid")){
			DruidSkills SDB = new DruidSkills();
			while (sentinel < skillPoints) {
				rnd = rndGen.nextInt(45);
				if(SDB.isSkillAllowed(rnd)){
					if(skillMod[rnd] <= level + 4) {
						skillMod[rnd] = skillMod[rnd] + 1;
						sentinel++;
					}
				}
			}
		}
		else if(Class.equals("Fighter")){
			FighterSkills SDB = new FighterSkills();
			while (sentinel < skillPoints) {
				rnd = rndGen.nextInt(45);
				if(SDB.isSkillAllowed(rnd)){
					if(skillMod[rnd] <= level + 4) {
						skillMod[rnd] = skillMod[rnd] + 1;
						sentinel++;
					}
				}
			}
		}
		else if(Class.equals("Monk")){
			MonkSkills SDB = new MonkSkills();
			while (sentinel < skillPoints) {
				rnd = rndGen.nextInt(45);
				if(SDB.isSkillAllowed(rnd)){
					if(skillMod[rnd] <= level + 4) {
						skillMod[rnd] = skillMod[rnd] + 1;
						sentinel++;
					}
				}
			}
		}
		else if(Class.equals("Paladin")){
			PaladinSkills SDB = new PaladinSkills();
			while (sentinel < skillPoints) {
				rnd = rndGen.nextInt(45);
				if(SDB.isSkillAllowed(rnd)){
					if(skillMod[rnd] <= level + 4) {
						skillMod[rnd] = skillMod[rnd] + 1;
						sentinel++;
					}
				}
			}
		}
		else if(Class.equals("Ranger")){
			RangerSkills SDB = new RangerSkills();
			while (sentinel < skillPoints) {
				rnd = rndGen.nextInt(45);
				if(SDB.isSkillAllowed(rnd)){
					if(skillMod[rnd] <= level + 4) {
						skillMod[rnd] = skillMod[rnd] + 1;
						sentinel++;
					}
				}
			}
		}
		else if(Class.equals("Rogue")){
			RogueSkills SDB = new RogueSkills();
			while (sentinel < skillPoints) {
				rnd = rndGen.nextInt(45);
				if(SDB.isSkillAllowed(rnd)){
					if(skillMod[rnd] <= level + 4) {
						skillMod[rnd] = skillMod[rnd] + 1;
						sentinel++;
					}
				}
			}
		}
		else if(Class.equals("Sorcerer")){
			SorcererSkills SDB = new SorcererSkills();
			while (sentinel < skillPoints) {
				rnd = rndGen.nextInt(45);
				if(SDB.isSkillAllowed(rnd)){
					if(skillMod[rnd] <= level + 4) {
						skillMod[rnd] = skillMod[rnd] + 1;
						sentinel++;
					}
				}
			}
		}
		else if(Class.equals("Wizard")){
			WizardSkills SDB = new WizardSkills();
			while (sentinel < skillPoints) {
				rnd = rndGen.nextInt(45);
				if(SDB.isSkillAllowed(rnd)){
					if(skillMod[rnd] <= level + 4) {
						skillMod[rnd] = skillMod[rnd] + 1;
						sentinel++;
					}
				}
			}
		}
		
		//initialize skill point attribute bonuses. This may be needed here because Magic item generation before this may effect attributes.
		int skillsAtr[] = new int[45];
		skillsAtr[0] = skillMod[0] == 0  ? getModifier(wis) : getModifier(intl);
		skillsAtr[1] = skillMod[1] == 0  ? getModifier(wis) : getModifier(dex);
		skillsAtr[2] = skillMod[2] == 0  ? getModifier(wis) : getModifier(cha);
		skillsAtr[3] = skillMod[3] == 0  ? getModifier(wis) : getModifier(str);
		skillsAtr[4] = skillMod[4] == 0  ? getModifier(wis) : getModifier(con);
		skillsAtr[5] = skillMod[5] == 0  ? getModifier(wis) : getModifier(intl);
		skillsAtr[6] = skillMod[6] == 0  ? getModifier(wis) : getModifier(intl);
		skillsAtr[7] = skillMod[7] == 0  ? getModifier(wis) : getModifier(cha);
		skillsAtr[8] = skillMod[8] == 0  ? getModifier(wis) : getModifier(intl);
		skillsAtr[9] = skillMod[9] == 0  ? getModifier(wis) : getModifier(cha);
		skillsAtr[10] = skillMod[10] == 0  ? getModifier(wis) : getModifier(dex);
		skillsAtr[11] = skillMod[11] == 0  ? getModifier(wis) : getModifier(intl);
		skillsAtr[12] = skillMod[12] == 0  ? getModifier(wis) : getModifier(cha);
		skillsAtr[13] = skillMod[13] == 0  ? getModifier(wis) : getModifier(cha);
		skillsAtr[14] = skillMod[14] == 0  ? getModifier(wis) : getModifier(wis);
		skillsAtr[15] =  skillMod[15] == 0  ? getModifier(wis) : getModifier(dex);
		skillsAtr[16] =  skillMod[16] == 0  ? getModifier(wis) : getModifier(cha);
		skillsAtr[17] = skillMod[17] == 0  ? getModifier(wis) : getModifier(str);
		skillsAtr[18] = skillMod[18] == 0  ? getModifier(wis) : getModifier(intl);
		skillsAtr[19] = skillMod[19] == 0  ? getModifier(wis) : getModifier(intl);
		skillsAtr[20] = skillMod[20] == 0  ? getModifier(wis) : getModifier(intl);
		skillsAtr[21] = skillMod[21] == 0  ? getModifier(wis) : getModifier(intl);
		skillsAtr[22] = skillMod[22] == 0  ? getModifier(wis) : getModifier(intl);
		skillsAtr[23] = skillMod[23] == 0  ? getModifier(wis) : getModifier(intl);
		skillsAtr[24] = skillMod[24] == 0  ? getModifier(wis) : getModifier(intl);
		skillsAtr[25] = skillMod[25] == 0  ? getModifier(wis) : getModifier(intl);
		skillsAtr[26] = skillMod[26] == 0  ? getModifier(wis) : getModifier(intl);
		skillsAtr[27] = skillMod[27] == 0  ? getModifier(wis) : getModifier(intl);
		skillsAtr[28] = skillMod[28] == 0  ? getModifier(wis) : getModifier(wis);
		skillsAtr[29] = skillMod[29] == 0  ? getModifier(wis) : getModifier(dex);
		skillsAtr[30] = skillMod[30] == 0  ? getModifier(wis) : getModifier(dex);
		skillsAtr[31] = skillMod[31] == 0  ? getModifier(wis) : getModifier(cha);
		skillsAtr[32] = skillMod[32] == 0  ? getModifier(wis) : getModifier(wis);
		skillsAtr[33] = skillMod[33] == 0  ? getModifier(wis) : getModifier(dex);
		skillsAtr[34] = skillMod[34] == 0  ? getModifier(wis) : getModifier(intl);
		skillsAtr[35] = skillMod[35] == 0  ? getModifier(wis) : getModifier(wis);
		skillsAtr[36] = skillMod[36] == 0  ? getModifier(wis) : getModifier(dex);
		skillsAtr[37] = 0;
		skillsAtr[38] = skillMod[38] == 0  ? getModifier(wis) : getModifier(intl);
		skillsAtr[39] = skillMod[39] == 0  ? getModifier(wis) : getModifier(wis);
		skillsAtr[40] = skillMod[40] == 0  ? getModifier(wis) : getModifier(wis);
		skillsAtr[41] = skillMod[41] == 0  ? getModifier(wis) : getModifier(str);
		skillsAtr[42] = skillMod[42] == 0  ? getModifier(wis) : getModifier(dex);
		skillsAtr[43] = skillMod[43] == 0  ? getModifier(wis) : getModifier(cha);
		skillsAtr[44] = skillMod[44] == 0  ? getModifier(wis) : getModifier(dex);
		//Roll for HP
		if(Class.equals("Barbarian")){
			HP = 12 + getModifier(con);
		}
		else if(Class.equals("Bard")){
			HP = 6 + getModifier(con);
		}
		else if(Class.equals("Cleric")){
			HP = 8 + getModifier(con);
		}
		else if(Class.equals("Druid")){
			HP = 8 + getModifier(con);
		}
		else if(Class.equals("Fighter")){
			HP = 10 + getModifier(con);
		}
		else if(Class.equals("Monk")){
			HP = 8 + getModifier(con);
		}
		else if(Class.equals("Paladin")){
			HP = 10 + getModifier(con);
		}
		else if(Class.equals("Ranger")){
			HP = 8 + getModifier(con);
		}
		else if(Class.equals("Rogue")){
			HP = 6 + getModifier(con);
		}
		else if(Class.equals("Sorcerer")){
			HP = 4 + getModifier(con);
		}
		else if(Class.equals("Wizard")){
			HP = 4 + getModifier(con);
		}
		for(int i=1;i<level;i++) {
			if(Class.equals("Barbarian")){
				HP = HP + (int)((Math.random() *12) + 1) + getModifier(con);
			}
			else if(Class.equals("Bard")){
				HP = HP + (int)((Math.random() *6) + 1) + getModifier(con);
			}
			else if(Class.equals("Cleric")){
				HP = HP + (int)((Math.random() *8) + 1) + getModifier(con);
			}
			else if(Class.equals("Druid")){
				HP = HP + (int)((Math.random() *8) + 1) + getModifier(con);
			}
			else if(Class.equals("Fighter")){
				HP = HP + (int)((Math.random() *10) + 1) + getModifier(con);
			}
			else if(Class.equals("Monk")){
				HP = HP + (int)((Math.random() *8) + 1) + getModifier(con);
			}
			else if(Class.equals("Paladin")){
				HP = HP + (int)((Math.random() *10) + 1) + getModifier(con);
			}
			else if(Class.equals("Ranger")){
				HP = HP + (int)((Math.random() *8) + 1) + getModifier(con);
			}
			else if(Class.equals("Rogue")){
				HP = HP + (int)((Math.random() *6) + 1) + getModifier(con);
			}
			else if(Class.equals("Sorcerer")){
				HP = HP + (int)((Math.random() *4) + 1) + getModifier(con);
			}
			else if(Class.equals("Wizard")){
				HP = HP + (int)((Math.random() *4) + 1) + getModifier(con);
			}
		}
		
		//FEAT STUFF GOES HERE
		
		boolean barbarian = false, bard = false, cleric = false, druid = false, fighter = false, monk = false, paladin = false, ranger = false, rogue = false, sorcerer = false, wizard = false;
		boolean magicUser = false;
		
		//Starting feats based on class. Cannot specifically add indivdual weapons. Up to the player to determine what their character can do
		if(Class.equals("Barbarian"))
		{
			Feats.add(new SimpleWeaponProficiency());
			Feats.add(new MartialWeaponProficiency());
			Feats.add(new ArmorProficiencyLight());
			Feats.add(new ArmorProficiencyMedium());
			Feats.add(new ShieldProficiency());
			barbarian = true;
		}
		if(Class.equals("Bard"))
		{
			Feats.add(new SimpleWeaponProficiency());
			Feats.add(new ArmorProficiencyLight());
			Feats.add(new ShieldProficiency());
			bard = true;
			magicUser = true;
		}
		if(Class.equals("Cleric"))
		{
			Feats.add(new SimpleWeaponProficiency());
			Feats.add(new ArmorProficiencyLight());
			Feats.add(new ArmorProficiencyMedium());
			Feats.add(new ArmorProficiencyHeavy());
			Feats.add(new ShieldProficiency());
			cleric = true;
			magicUser = true;
		}
		if(Class.equals("Druid"))
		{
			Feats.add(new ArmorProficiencyLight());
			Feats.add(new ArmorProficiencyMedium());
			druid = true;
			magicUser = true;
		}
		if(Class.equals("Fighter"))
		{
			Feats.add(new SimpleWeaponProficiency());
			Feats.add(new MartialWeaponProficiency());
			Feats.add(new ArmorProficiencyLight());
			Feats.add(new ArmorProficiencyMedium());
			Feats.add(new ArmorProficiencyHeavy());
			Feats.add(new ShieldProficiency());
			Feats.add(new TowerShieldProficiency());
			
			fighter = true;
		}
		if(Class.equals("Monk"))
		{
			Feats.add(new ImprovedUnarmedStrike());
			monk = true;
		}
		if(Class.equals("Paladin"))
		{
			Feats.add(new SimpleWeaponProficiency());
			Feats.add(new MartialWeaponProficiency());
			Feats.add(new ArmorProficiencyLight());
			Feats.add(new ArmorProficiencyMedium());
			Feats.add(new ArmorProficiencyHeavy());
			Feats.add(new ShieldProficiency());
			
			paladin = true;
			if(level >= 4)
			{
				magicUser = true;
			}
		}
		if(Class.equals("Ranger"))
		{
			Feats.add(new SimpleWeaponProficiency());
			Feats.add(new MartialWeaponProficiency());
			Feats.add(new ArmorProficiencyLight());
			Feats.add(new ShieldProficiency());
			
			ranger = true;
			if(level >= 4)
			{
				magicUser = true;
			}
		}
		if(Class.equals("Rogue"))
		{
			Feats.add(new ArmorProficiencyLight());
			Feats.add(new SimpleWeaponProficiency());
			rogue = true;
		}
		if(Class.equals("Sorcerer"))
		{
			Feats.add(new SimpleWeaponProficiency());
			sorcerer = true;
			magicUser = true;
		}
		if(Class.equals("Wizard"))
		{
			//nothng but a few weapons :S
			wizard = true;
			magicUser = true;
		}
		
		int numFeats = 1; //characters start with 1 feat to begin with
		FeatsDataBase FeatDB = new FeatsDataBase(); //initialize the feat Database
		
		if(Race.equals("Human"))
		{
			numFeats++; //plus 1 for human
		}
		
		double temp = Math.floor(level/3); //extra feats per 3 levels
		
		int extraFeats = (int)temp;
		
		if(Class.equals("Fighter")) //fighters get 1 extra feat every 2 levels + 1
		{
			extraFeats = extraFeats + (int)Math.floor(level/2) + 1;
		}
		else if(Class.equals("Wizard")) //wizrds get 1 extra feat every 5 levels
		{
			extraFeats = extraFeats + (int)Math.floor(level/5);
		}
		else if(Class.equals("Monk")) //monks get a few bonus feats early levels
		{
			if (level >= 6)
			{
				extraFeats = extraFeats + 3;
			}
			else if(level >= 2)
			{
				extraFeats = extraFeats + 2;
			}
			else
			{
				extraFeats++;
			}
		}
		
		numFeats = numFeats + extraFeats; //add total number of acquired Feats
		
		for(int i=0; i < numFeats; i++)
		{
			boolean featSelected = false;
			while(!featSelected)
			{
				rnd =(int)(Math.random() * FeatDB.featList.length);
				Feat[] arrayOfFeats = (Feat[])Feats.toArray(new Feat[Feats.size()]); //convert the vector into an array
				
				//check to see if we already have this feat.
				boolean alreadyHaveFeat = false;
				for(int j=0; j < arrayOfFeats.length; j++)
				{
					if(FeatDB.featList[rnd].getClass() == arrayOfFeats[j].getClass())
					{
						alreadyHaveFeat = true;
						break;
					}
				}
				
				if(FeatDB.featList[rnd].canTake(arrayOfFeats, str, dex, con, intl, wis, cha, level, barbarian, bard, cleric, druid, fighter, monk, paladin, ranger, rogue, sorcerer, wizard, magicUser) && !alreadyHaveFeat)
				{
					Feats.add(FeatDB.featList[rnd]); //if we can take, add it to the vector of feats
					featSelected = true; // onto the next feat
				}
			}
		}
		
		
		//MAGIC ITEM STUFF GOES HERE
		
		
		System.out.println(Race + " " + Class);
		System.out.println("HP: " + HP);
		System.out.println();
		System.out.println("Str: " +str);
		System.out.println("Dex: " +dex);
		System.out.println("Con: " +con);
		System.out.println("Int: " +intl);
		System.out.println("Wis: " +wis);
		System.out.println("Cha: " +cha);
		System.out.println();
		
		System.out.println("Skills:  -- Not including Feat or Magic Item bonuses, Wisdom Attribute on untrained --");
		for(int i=0;i<45;i++) {
			int numTabs = 5 - skills[i].length()/8;
			System.out.print(skills[i]);
			for(int j=0; j<numTabs;j++) //calculating tabs
			{
				System.out.print("\t");
			}
			System.out.print(" - Ranks: " + skillMod[i] + "\t  Attribute: " + skillsAtr[i]);
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("------ Feats ------");
		Feat[] arrayOfFeats = (Feat[])Feats.toArray(new Feat[Feats.size()]);
		
		for(int i=0; i<arrayOfFeats.length; i++)
		{
			int numTabs = 4 - arrayOfFeats[i].getName().length()/8;
			System.out.print(arrayOfFeats[i].getName());
			for(int j=0; j<numTabs;j++) //calculating tabs
			{
				System.out.print("\t");
			}
			System.out.print(" - " + arrayOfFeats[i].getBenefit());
			System.out.println("");
		}
		
	}
	
	static public int getModifier(int atr) {
		if(atr == 1) {
			return -5;
		}
		else if(atr == 2 || atr == 3) {
			return -4;
		}
		else if(atr == 4 || atr == 5) {
			return -3;
		}
		else if(atr == 6 || atr == 7) {
			return -2;
		}
		else if(atr == 8 || atr == 9) {
			return -1;
		}
		else if(atr == 10 || atr == 11) {
			return 0;
		}
		else if(atr == 12 || atr == 13) {
			return 1;
		}
		else if(atr == 14 || atr == 15) {
			return 2;
		}
		else if(atr == 16 || atr == 17) {
			return 3;
		}
		else if(atr == 18 || atr == 19) {
			return 4;
		}
		else if(atr == 20 || atr == 21) {
			return 5;
		}
		else if(atr == 22 || atr == 23) {
			return 6;
		}
		else if(atr == 24 || atr == 25) {
			return 7;
		}
		else if(atr == 26 || atr == 27) {
			return 8;
		}
		else if(atr == 28 || atr == 29) {
			return 9;
		}
		else {
			return 10;
		}
		
	}
}
