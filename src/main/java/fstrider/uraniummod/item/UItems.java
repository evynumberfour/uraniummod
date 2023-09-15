package fstrider.uraniummod.item;

import fstrider.uraniummod.UraniumMod;
import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.ItemHelper;


public final class UItems extends Item {
    static int itemIdOffset = UraniumMod.itemIdOffset;
        public static final Item uo2 = ItemHelper.createItem(UraniumMod.MOD_ID, new UItems("item.dust.uranium", itemIdOffset+1), "uo2", "uraniumOxide.png");
        public static final Item rawuranium = ItemHelper.createItem(UraniumMod.MOD_ID, new UItems("item.ore.raw.uranium", itemIdOffset+2), "rawuranium", "rawUranium.png");
        public static final Item fluorspar = ItemHelper.createItem(UraniumMod.MOD_ID, new UItems("item.ore.fluorspar", itemIdOffset+3), "fluorspar", "fluorspar.png");
        public static final Item sulphuricacid = ItemHelper.createItem(UraniumMod.MOD_ID, new UItems("item.bucket.sulphuricacid", itemIdOffset+4), "sulphuricacid", "sulphuricacid.png");
        public static final Item fluorinegas = ItemHelper.createItem(UraniumMod.MOD_ID, new UItems("item.jar.fluorine", itemIdOffset+5), "fluorine", "fluorineGas.png");
        public UItems(String name,int id) {
            super(name, id);
        }
        public static void register(){}
}

