package com.teambw.enderglass.common;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Flipz on 4/18/2015.
 */
@Mod(modid = "enderglass", name = "EnderGlass", version = "1.7.10-0.0.1")
public class EnderGlass {

    @Mod.Instance(value = "enderglass")
    public EnderGlass instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {

        FMLLog.info("Pre Init Complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {

        FMLLog.info("Init Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {

        FMLLog.info("Post Init Complete");
    }

}
