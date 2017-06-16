package com.rong.combat;

import java.lang.reflect.Field;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ForgeEventHandler 
{
	/** ticksSinceLastSwing field */
	private static Field ticksSinceLastSwing = EntityLivingBase.class.getDeclaredFields()[23];
	
	static
	{
		//Don't waste time setting accessibility each time. Not required.
		ticksSinceLastSwing.setAccessible(true);
	}
	
	@SubscribeEvent
	public void handleLivingUpdate(LivingUpdateEvent event) {
		try {
			if (event.getEntity() instanceof EntityPlayerMP) {
				
				EntityPlayerMP player = (EntityPlayerMP)event.getEntity();

				if (ticksSinceLastSwing.getInt(player) < 20) {
					
					ticksSinceLastSwing.set(player, 20);
				}
			}
		}
		
		catch (Exception e) {
		}
	}
}
