package com.villagesplusplus.items;

import com.villagesplusplus.initialization.ModItems;
import com.villagesplusplus.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.villagesplusplus.VillagesPlusPlus;


public class ItemBase extends Item implements IHasModel 
{

public ItemBase (String name)
{
	this.setUnlocalizedName(name);
	this.setRegistryName(name);
	this.setCreativeTab(CreativeTabs.MATERIALS);
	
	ModItems.ITEMS.add(this);
}

@Override
public void registerModels() 
{
	VillagesPlusPlus.proxy.registerItemRenderer(this, 0, "Inventory");
}

}
