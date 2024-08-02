package com.idtech.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ItemMod {

    //BASIC ITEMS
    public static final Item STRUCTURE_GEL = ItemUtils.buildBasicItem("structuregel", CreativeModeTab.TAB_MISC);
    //public static final Item HIGH_RADIATION_URANIUM = ItemUtils.buildBasicItem("highradiationuranium", CreativeModeTab.TAB_MISC);

    //FOODS

    public static FoodProperties highradiationuraniumfood = (new FoodProperties.Builder().nutrition(5).saturationMod(1.4f)
            .effect(new MobEffectInstance(MobEffects.WEAKNESS, 22500, 4), 1.0f)
            .effect(new MobEffectInstance(MobEffects.WITHER, 22500, 2), 1.0f)

            .alwaysEat().build());
    public static Item highradiationuraniumItem = ItemUtils.buildFoodItem("highradiationuraniumfood", highradiationuraniumfood);
    public static final Item GOJIRA_SCALE = ItemUtils.buildBasicItem("gojirascale", CreativeModeTab.TAB_MISC);
    public static final Item HAZMAT_LEATHER = ItemUtils.buildBasicItem("hazmatleather", CreativeModeTab.TAB_MISC);

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        //BASIC ITEMS
        event.getRegistry().register(STRUCTURE_GEL);
        //event.getRegistry().register(HIGH_RADIATION_URANIUM);
        // ITEMS
        event.getRegistry().register(GOJIRA_SCALE);
        event.getRegistry().register(HAZMAT_LEATHER);
        // TOOLS
        event.getRegistry().register(irradiatedhammeritem.INSTANCE);
        // FOOD
        event.getRegistry().register(highradiationuraniumItem);
        // ARMOR
        event.getRegistry().register(CustomArmorItem.HELM);
        event.getRegistry().register(CustomArmorItem.CHEST);
        event.getRegistry().register(CustomArmorItem.LEGS);
        event.getRegistry().register(CustomArmorItem.FEET);
        //PROJECTILES

    }
}
