package thepwnd.traincrafttweaker;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import thepwnd.reference.References;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class TrainCraftTweaker {
	
	@Instance(References.MODID)
	public TrainCraftTweaker instance;
	
	@SidedProxy(clientSide = "thepwnd.traincrafttweaker.CombinedClientProxy", serverSide = "thepwnd.traincrafttweaker.DedicatedServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLInitializationEvent event) {
		proxy.postInit();
	}
}
