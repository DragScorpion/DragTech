package de.dragtech.dragtech.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class MainItems {
	
	public static Item itemPistonHead;
	public static Item itemPistonBase;
	public static Item itemStoneGear;
	
	public static void init() {
		itemPistonHead = new SimpleItem("itemPistonHead");
		itemPistonBase = new SimpleItem("itemPistonBase");
		itemStoneGear = new SimpleItem("itemStoneGear");
		
		GameRegistry.registerItem(itemPistonHead, "itemPistonHead");
		GameRegistry.registerItem(itemPistonBase, "itemPistonBase");
		GameRegistry.registerItem(itemStoneGear, "itemStoneGear");
	}
}
