package thepwnd.traincrafttweaker;

import minetweaker.MineTweakerAPI;
import thepwnd.traincrafttweaker.mods.tc.handlers.AssemblyTable;
import thepwnd.traincrafttweaker.mods.tc.handlers.Distill;
import thepwnd.traincrafttweaker.mods.tc.handlers.HearthFurnace;
import thepwnd.traincrafttweaker.mods.tc.handlers.TrainWorkench;

public class CommonProxy {
	
	public void preInit() {
		
	}
	
	public void init() {
		MineTweakerAPI.registerClass(Distill.class);
		MineTweakerAPI.registerClass(TrainWorkench.class);
		MineTweakerAPI.registerClass(AssemblyTable.class);
		MineTweakerAPI.registerClass(HearthFurnace.class);
	}
	
	public void postInit() {
		
	}

}
