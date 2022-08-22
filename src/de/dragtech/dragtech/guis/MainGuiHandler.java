package de.dragtech.dragtech.guis;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class MainGuiHandler implements IGuiHandler {
	
	
	@Override
	public Object getServerGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z) {
		switch(guiId) {
		
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z) {
		switch(guiId) {
		
		}
		return null;
	}
}
