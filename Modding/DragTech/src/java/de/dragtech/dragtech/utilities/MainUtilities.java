package de.dragtech.dragtech.utilities;

import de.dragtech.dragtech.items.MainItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MainUtilities {
	public static CreativeTabs tabDragTech;
	
	public static final void init() {
		initCreativeTabs();
	}
	
	public static final void initCreativeTabs() {
		tabDragTech = new CreativeTabs("tabDragTech") {
			@Override
			public Item getTabIconItem() { return MainItems.itemPistonHead; }
			};
	}
}
