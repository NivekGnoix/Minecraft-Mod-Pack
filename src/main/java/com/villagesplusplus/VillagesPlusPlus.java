package com.villagesplusplus;

import com.villagesplusplus.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = VillagesPlusPlus.MODID, name = VillagesPlusPlus.NAME, version = VillagesPlusPlus.VERSION)
public class VillagesPlusPlus {
	
	public static final String MODID = "villagesplusplus";
	public static final String NAME = "Villages++";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_MINECRAFT_VERSIONS = "[1.12]";
	public static final String CLIENT_PROXY_CLASS = "com.villagesplusplus.proxy.ClientProxy";
	public static final String COMMON_PROXY_CLASS = "com.villagesplusplus.proxy.CommonProxy";
	
	@Instance
	public static VillagesPlusPlus instance;
	
	@SidedProxy(clientSide = VillagesPlusPlus.CLIENT_PROXY_CLASS, serverSide = VillagesPlusPlus.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(VillagesPlusPlus.MODID + " :preInit");
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println(VillagesPlusPlus.MODID + " :init");
	}
	
	@EventHandler
	public void postInit(FMLPreInitializationEvent event) {
		System.out.println(VillagesPlusPlus.MODID + " :postInit");
	}

}
