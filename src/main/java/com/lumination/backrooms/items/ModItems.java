package com.lumination.backrooms.items;

import com.lumaa.libu.items.LibuWeapon;
import com.lumination.backrooms.BackroomsMod;
import com.lumination.backrooms.items.consumables.AlmondWater;
import com.lumination.backrooms.items.interactables.CameraItem;
import com.lumination.backrooms.items.interactables.TestItem;
import com.lumination.backrooms.sounds.ModSounds;
import com.lumination.backrooms.items.interactables.MusicTape;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {
    public static final Item LVL_0_CORE = registerItem("level_0_core", new TestItem(new FabricItemSettings().maxCount(1).fireproof()), List.of(ItemGroups.OPERATOR, BackroomsItemsGroup.Main));

    public static final Item SILK = registerItem("silk",
            new Item(new FabricItemSettings()), BackroomsItemsGroup.Main);
    public static final Item ALMOND_WATER = registerItem("almond_water", new AlmondWater(
            new FabricItemSettings().maxCount(8).food(new FoodComponent.Builder().alwaysEdible().hunger(2*2).saturationModifier(3f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 15, 0), 1F).build())), BackroomsItemsGroup.Main);
    public static final Item COOKED_ALMOND_WATER = registerItem("cooked_almond_water", CookedAlmondWater(new FabricItemSettings().maxCount(8).food(new FoodComponent.Builder().alwaysEdible().hunger(4*2).saturationModifier(4f).build())), BackroomsItemsGroup.Main);
    public static final Item TAPE = registerItem("tape", new Item(new FabricItemSettings()), BackroomsItemsGroup.Main);
    public static final Item CAMERA = registerItem("camera", new CameraItem(
            new FabricItemSettings().maxCount(1)), BackroomsItemsGroup.Main);
    public static final Item ENERGY_BAR = registerItem("energy_bar", new Item(
            new FabricItemSettings().maxCount(64).food(new FoodComponent.Builder().alwaysEdible().hunger(2*3).saturationModifier(3f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20 * 5, 0), 1F).build())), BackroomsItemsGroup.Main);

    // weapons
    public static final Item WRENCH = registerItem("wrench", new LibuWeapon.LibuSword(6.5f, 1.6f, 835, new Item.Settings()), BackroomsItemsGroup.Weapons);
    public static final Item CROWBAR = registerItem("crowbar", new LibuWeapon.LibuSword(8.0f, 1.6f, 2051, new Item.Settings()), BackroomsItemsGroup.Weapons);
    public static final Item SHARPENED_KNIFE = registerItem("sharpened_knife", new LibuWeapon.LibuSword(6.5f, 1.3f, 130, new Item.Settings()), BackroomsItemsGroup.Weapons);
    public static final Item NAILED_BAT = registerItem("nailed_bat", new LibuWeapon.LibuSword(7.0f, 1.8f, 515, new Item.Settings()), BackroomsItemsGroup.Weapons);
    public static final Item BASEBALL_BAT = registerItem("baseball_bat", new LibuWeapon.LibuSword(2.5f, 1.8f, 481, new Item.Settings()), BackroomsItemsGroup.Weapons);
    public static final Item BROKEN_BOTTLE = registerItem("broken_bottle", new LibuWeapon.LibuSword(1.5f, 0.8f, 3, new Item.Settings()), BackroomsItemsGroup.Weapons);

    // music tapes
    public static final Item HALLS_TAPE = registerItem("halls_tape", new MusicTape(7, ModSounds.HALLS, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item GOVERNMENT_TAPE = registerItem("government_funding_tape", new MusicTape(15, ModSounds.GOVERNMENT_FUNDING, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item COMPLEX_TAPE = registerItem("the_complex_tape", new MusicTape(13, ModSounds.COMPLEX, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item INSTANCES_TAPE = registerItem("instances_tape", new MusicTape(4, ModSounds.INSTANCES, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item NIGHTS_TAPE = registerItem("warm_nights_tape", new MusicTape(6, ModSounds.WARM_NIGHTS, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item TITLE_TAPE = registerItem("title_screen_tape", new MusicTape(8, ModSounds.TITLE_SCREEN, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item SNOW_TAPE = registerItem("snow_world_tape", new MusicTape(5, ModSounds.SNOW_WORLD, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item AUDITORY_TAPE = registerItem("auditory_guidepost_tape", new MusicTape(9, ModSounds.AUDITORY_GUIDEPOST, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item NOT_DECISION_TAPE = registerItem("not_your_decision_tape", new MusicTape(8, ModSounds.NOT_YOUR_DECISION, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item SEALED_AWAY_TAPE = registerItem("sealed_away_tape", new MusicTape(5, ModSounds.SEALED_AWAY, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item CLIFFS_DOVER_TAPE = registerItem("white_cliffs_of_dover_tape", new MusicTape(3, ModSounds.CLIFFS_OF_DOVER, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item THALASSOPHOBIA_TAPE = registerItem("thalassophobia_tape", new MusicTape(15, ModSounds.THALASSOPHOBIA, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item BURNING_MEMORY_TAPE = registerItem("its_just_a_burning_memory_tape", new MusicTape(15, ModSounds.BURNING_MEMORY, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item DUET_TAPE = registerItem("duet_tape", new MusicTape(15, ModSounds.DUET, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item EMPTY_BLISS_TAPE = registerItem("empty_bliss_beyond_this_world_tape", new MusicTape(12, ModSounds.EMPTY_BLISS, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item GLIMPSES_OF_HOPE_TAPE = registerItem("glimpses_of_hope_in_trying_times_tape", new MusicTape(8, ModSounds.GLIMPSES_OF_HOPE, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item GROSS_TAPE = registerItem("gross_tape", new MusicTape(3, ModSounds.GROSS, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item HAVE_MANY_DAYS_TAPE = registerItem("we_dont_have_many_days_tape", new MusicTape(10, ModSounds.HAVE_MANY_DAYS, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item AFTERNOON_DRIFTING_TAPE = registerItem("late_afternoon_drifting_tape", new MusicTape(5, ModSounds.AFTERNOON_DRIFTING, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item MY_HEART_BREAKS_TAPE = registerItem("does_it_matter_how_my_heart_breaks_tape", new MusicTape(1, ModSounds.MY_HEART_BREAKS, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item THE_VIOLIN_TAPE = registerItem("the_violin_tape", new MusicTape(13, ModSounds.THE_VIOLIN, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item WORLD_FADES_AWAY_TAPE = registerItem("place_in_the_world_fades_away_tape", new MusicTape(9, ModSounds.WORLD_FADES_AWAY, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item AHIRU_NO_SENTAKU_TAPE = registerItem("ahiru_no_sentaku_tape", new MusicTape(2, ModSounds.AHIRU_NO_SENTAKU, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item NO_SURPRISES_TAPE = registerItem("no_surprises_tape", new MusicTape(2, ModSounds.NO_SURPRISES, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item ORBIT_TAPE = registerItem("orbit_tape", new MusicTape(14, ModSounds.ORBIT, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item SLINGSHOT_TAPE = registerItem("slingshot_tape", new MusicTape(13, ModSounds.SLINGSHOT, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item NO_TIME_TO_EXPLAIN_TAPE = registerItem("no_time_to_explain_tape", new MusicTape(15, ModSounds.NO_TIME_TO_EXPLAIN, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item DRIFTING_TAPE = registerItem("drifting_tape", new MusicTape(8, ModSounds.DRIFTING, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);
    public static final Item TELL_ME_YOU_KNOW_TAPE = registerItem("tell_me_you_know_tape", new MusicTape(2, ModSounds.TELL_ME_YOU_KNOW, new FabricItemSettings(), 1), BackroomsItemsGroup.MusicTapes);

    public static AlmondWater CookedAlmondWater(Item.Settings settings) {
        return new AlmondWater(settings).setCooked(true);
    }

    // Register

    public static Item registerItem(String name, Item item, ItemGroup group) {
        Item newItem = Registry.register(Registries.ITEM, new Identifier(BackroomsMod.MOD_ID, name), item);

        // put in item group
        ItemGroupEvents.modifyEntriesEvent(group).register(content -> {
            content.add(newItem);
        });

        return newItem;
    }

    // can be used for new 1.19.3 creative inventory system
    private static Item registerItem(String name, Item item, List<ItemGroup> tabs) {
        Item newItem = Registry.register(Registries.ITEM, new Identifier(BackroomsMod.MOD_ID, name), item);

        // put in item group
        for (int i = 0; i < tabs.size(); i++) {
            ItemGroupEvents.modifyEntriesEvent(tabs.get(i)).register(content -> {
                content.add(newItem);
            });
        }
        return newItem;
    }

    public static void registerModItems() {
        BackroomsMod.print("Registering ModItems");
    }
}