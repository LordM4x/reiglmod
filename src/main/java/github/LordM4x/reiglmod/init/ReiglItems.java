package github.LordM4x.reiglmod.init;

import github.LordM4x.reiglmod.Reiglmod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ReiglItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reiglmod.MODID);

    public static final RegistryObject<Item> BLAZE_SWORD = ITEMS.register("blaze_sword", () ->
            new SwordItem(Tiers.NETHERITE, 4, -2.2f, new Item.Properties()
                    .durability(1830)
                    .rarity(Rarity.RARE)
                    .fireResistant()));

    public static final RegistryObject<Item> SHULKER_BLADE = ITEMS.register("shulker_blade", () ->
            new SwordItem(Tiers.NETHERITE, 3, -1.5f, new Item.Properties()
                    .durability(1215)
                    .rarity(Rarity.UNCOMMON)
            ));

    public static final RegistryObject<Item> KNIGHT_GREATSWORD = ITEMS.register("knight_greatsword", () ->
            new SwordItem(Tiers.IRON, 10, -3.5f, new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .durability(510)));
}
