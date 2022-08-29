package cn.irchat.infwithmend;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModEntry.MODID, name = ModEntry.NAME, version = ModEntry.VERSION)
public class ModEntry
{
    public static final String MODID = "infwithmend";
    public static final String NAME = "Infinity with Mending";
    public static final String VERSION = "1.0.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
}
