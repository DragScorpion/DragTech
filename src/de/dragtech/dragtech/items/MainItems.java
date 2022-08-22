package de.dragtech.dragtech.items;

import net.minecraft.item.Item;

public class MainItems {
	
	public static Item itemPistonHead;
	public static Item itemPistonBase;
	public static Item itemStoneGear;
	
	public static void init() {
		itemPistonHead = new SimpleItem("pistonHead");
		itemPistonBase = new SimpleItem("pistonBase");
		itemStoneGear = new SimpleItem("stoneGear");
		
		new SimpleItem("earthParticle");
		new SimpleItem("windParticle");
		new SimpleItem("waterParticle");
		new SimpleItem("fireParticle");
		
		new SimpleItem("springParticle");
		new SimpleItem("summerParticle");
		new SimpleItem("autumnParticle");
		new SimpleItem("winterParticle");

		new SimpleItem("pressureParticle");
		new SimpleItem("vacuumParticle");
		
		new SimpleItem("basicGeneticParticle");
		new SimpleItem("advancedGeneticParticle");
		new SimpleItem("eliteGeneticParticle");
		new SimpleItem("ultimateGeneticParticle");
	}
}
