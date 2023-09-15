package fstrider.uraniummod.crafting;

import fstrider.uraniummod.item.UItems;
import net.minecraft.core.crafting.CraftingManager;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;

public abstract class UCrafting {
    public static void register() {
        CraftingManager craft = CraftingManager.getInstance();

        craft.addShapelessRecipe(new ItemStack(UItems.sulphuricacid,1), new ItemStack(Item.jar,1), new ItemStack(Item.bucketWater,1),new ItemStack(Item.sulphur,1),new ItemStack(Item.sulphur,1),new ItemStack(Item.sulphur,1));
        craft.addShapelessRecipe(new ItemStack(UItems.fluorinegas, 1), new ItemStack(Item.jar,1), new ItemStack(UItems.sulphuricacid,1),new ItemStack(UItems.fluorspar,1));
    }
}
