package com.villagesplusplus.blocks;

import com.villagesplusplus.VillagesPlusPlus;
import com.villagesplusplus.initialization.ModItems;
import com.villagesplusplus.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class Blockbase extends Block implements IHasModel {

	public Blockbase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		BlockInit.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		
		VillagesPlusPlus.proxy.registerItemRenderer(this, 0, "Inventory");
		
	}
	
}
