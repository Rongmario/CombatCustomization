package com.rong.combat;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

	@Mod(modid = CombatCustomization.MODID, name = CombatCustomization.NAME, version = CombatCustomization.VERSION, useMetadata = true)
	
	public class CombatCustomization {
		
		//@SidedProxy(serverSide = "com.rong.combat.CommonProxy")
	    //public static CommonProxy proxy;
				
	    public static final String MODID = "combatcus";
	    public static final String NAME = "Combat Customization";
	    public static final String VERSION = "1.0";
	    
	    @EventHandler
	    public void preInit(FMLPreInitializationEvent event) {

	    	MinecraftForge.EVENT_BUS.register(new ForgeEventHandler());
	    }

}
