package fstrider.uraniummod.item;

import fstrider.uraniummod.UraniumMod;
import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.ItemHelper;


public final class UItems extends Item {
    static int itemIdOffset = UraniumMod.itemIdOffset;
        public static final Item rawuranium = ItemHelper.createItem(UraniumMod.MOD_ID, new UItems("item.ore.raw.uranium", itemIdOffset+1), "rawuranium", "rawUranium.png");
        public static final Item yellowcake = ItemHelper.createItem(UraniumMod.MOD_ID, new ItemYellowcake("item.ore.refined.uranium", itemIdOffset+2), "yellowcake", "yellowcake.png");
        public static final Item uo2 = ItemHelper.createItem(UraniumMod.MOD_ID, new UItems("item.dust.uranium", itemIdOffset+3), "uo2", "uraniumOxide.png");
        public static final Item leu = ItemHelper.createItem(UraniumMod.MOD_ID, new UItems("item.ingot.uranium.poor", itemIdOffset+4), "leu", "LEU.png");
        public static final Item heu = ItemHelper.createItem(UraniumMod.MOD_ID, new UItems("item.ingot.uranium.rich", itemIdOffset+5), "heu", "HEU.png");
        public static final Item wgu = ItemHelper.createItem(UraniumMod.MOD_ID, new UItems("item.ingot.uranium.weaponsgrade", itemIdOffset+6), "wgu", "WGU.png");
        public static final Item fluorspar = ItemHelper.createItem(UraniumMod.MOD_ID, new UItems("item.ore.fluorspar", itemIdOffset+7), "fluorspar", "fluorspar.png");
        public static final Item fluorinegas = ItemHelper.createItem(UraniumMod.MOD_ID, new UItems("item.jar.fluorine", itemIdOffset+8), "fluorine", "fluorineGas.png");
        public static final Item sulphuricacid = ItemHelper.createItem(UraniumMod.MOD_ID, new UItems("item.bucket.sulphuricacid", itemIdOffset+9), "sulphuricacid", "sulphuricAcid.png");
        public UItems(String name,int id) {
            super(name, id);
        }
        public static void register(){
            ItemYellowcake.register();
        }
}

