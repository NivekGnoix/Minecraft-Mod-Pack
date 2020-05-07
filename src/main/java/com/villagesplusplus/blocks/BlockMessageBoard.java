package com.villagesplusplus.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockMessageBoard extends Blockbase {
	
	public BlockMessageBoard (String name) {
		super(name, Material.CLOTH);
		
	}
	
	@Override
	public boolean isOpaqueCube (IBlockState state)
	{
		return false;
	}
	
	@Override
	public boolean isFullCube (IBlockState state)
	{
		return false;
	}
	
}
