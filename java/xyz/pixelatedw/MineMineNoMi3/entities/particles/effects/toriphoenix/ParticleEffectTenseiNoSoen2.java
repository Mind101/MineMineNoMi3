package xyz.pixelatedw.MineMineNoMi3.entities.particles.effects.toriphoenix;

import java.util.Random;
import java.util.Timer;

import net.minecraft.entity.player.EntityPlayer;
import xyz.pixelatedw.MineMineNoMi3.ID;
import xyz.pixelatedw.MineMineNoMi3.api.EnumParticleTypes;
import xyz.pixelatedw.MineMineNoMi3.entities.particles.EntityParticleFX;
import xyz.pixelatedw.MineMineNoMi3.entities.particles.effects.ParticleEffect;
import xyz.pixelatedw.MineMineNoMi3.lists.ListParticleEffects;

public class ParticleEffectTenseiNoSoen2 extends ParticleEffect
{

	public void spawn(EntityPlayer player, double posX, double posY, double posZ)
	{
		Timer timer = new Timer(true); 
		EntityParticleFX particle = new EntityParticleFX(player.worldObj, ID.PARTICLE_ICON_BLUEFLAME, 
				posX, 
				posY, 
				posZ, 
				0, 0, 0);
		timer.schedule(ListParticleEffects.createWave1FX(player, particle.posX, particle.posY, particle.posZ, particle), 0);
	}

}
