package github.LordM4x.reiglmod;

import github.LordM4x.reiglmod.init.ReiglItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reiglmod.MODID)
public class Reiglmod {
    public static final String MODID = "reiglmod";

    public Reiglmod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ReiglItems.ITEMS.register(bus);
    }
}
