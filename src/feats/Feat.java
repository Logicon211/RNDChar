package feats;

public class Feat {
	
	protected String name = ""; //Feat name
	protected Feat prereqFeat[] = null; //feat prerequisites
	protected int strReq = 0;
	protected int dexReq = 0;
	protected int conReq = 0;
	protected int intReq = 0;
	protected int wisReq = 0;
	protected int chaReq = 0;
	protected int attackReq = 0;
	protected int levelReq = 0;
	
	protected boolean needsBarbarian = false, needsBard = false, needsCleric = false, needsDruid = false, needsFighter = false, needsMonk = false, needsPaladin = false, needsRanger = false, needsRogue = false, needsSorcerer = false, needsWizard = false;
	protected boolean needsMagicUser = false;
	
	protected String benefit = "";
	
	public Feat()
	{
		
	}

	public String getName()
	{
		return name;
	}
	
	public String getBenefit()
	{
		return benefit;
	}
	
	public boolean canTake(Feat feats[], int str, int dex, int con, int intl, int wis, int cha, int level, boolean barbarian, boolean bard, boolean cleric, boolean druid, boolean fighter, boolean monk, boolean paladin, boolean ranger, boolean rogue, boolean sorcerer, boolean wizard, boolean magicUser)
	{
		if(str >= strReq && dex >= dexReq && con >= conReq && intl >= intReq && wis >= wisReq && cha >= chaReq && level >= levelReq)
		{
			if(((needsBarbarian && barbarian) || !needsBarbarian) && ((needsBard && bard) || !needsBard)  && ((needsCleric && cleric) || !needsCleric) && ((needsDruid && druid) || !needsDruid) && ((needsFighter && fighter) || !needsFighter) && ((needsMonk && monk) || !needsMonk)  && ((needsPaladin && paladin) || !needsPaladin)  && ((needsRanger && ranger) || !needsRanger) && ((needsRogue && rogue) || !needsRogue) && ((needsSorcerer && sorcerer) || !needsSorcerer) && ((needsMagicUser && magicUser) || !needsMagicUser))
			{
				boolean ret = false;
				if(prereqFeat == null) //if there are no prereq feats, return true
				{
					ret = true;
				}
				else
				{
					int numOfCorrectFeats = 0; //to keep track of the number of feats match the prereqs
				
					for(int i=0;i < prereqFeat.length; i++)
					{
						for(int j=0;j < feats.length; j++)
						{
							if(prereqFeat[i].getClass() == feats[j].getClass())
							{
								numOfCorrectFeats++; //add one more to the number of correct feats
								break; //get out of current loop
							}
						}
					}
				
					if(numOfCorrectFeats >= prereqFeat.length)
					{
						ret = true; //if we have the same amount or more (?) of the prereq feats then set return to true
					}
				}
			
				return ret;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false; //can't take if character doesn't have the right attributes
		}
	}
}
