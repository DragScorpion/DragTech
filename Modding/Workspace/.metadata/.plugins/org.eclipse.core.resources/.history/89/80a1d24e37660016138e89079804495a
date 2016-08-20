package de.dragtech.dragtech;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, version = Main.MODVERSION)
public class Main {
	
	public static final String MODID = "dragtech";
	public static final String MODNAME = "DragTech";
	public static final String MODVERSION = "0.0.0";
	
	@Instance
	public static Main instance = new Main();

	@SidedProxy(clientSide = "de.dragtech.dragtech.ClientProxy", serverSide = "de.dragtech.dragtech.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}
