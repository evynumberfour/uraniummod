package fstrider.uraniummod.crafting;

import fstrider.uraniummod.block.UBlocks;
import fstrider.uraniummod.item.UItems;
import net.minecraft.core.crafting.recipe.RecipesFurnace;
import net.minecraft.core.item.ItemStack;

public abstract class UFurnaceManager {
    public static void register() {
        RecipesFurnace smelt = RecipesFurnace.smelting();
        smelt.addSmelting(UItems.rawuranium.id, new ItemStack(UItems.uo2, 1));
        smelt.addSmelting(UBlocks.carnotite.id, new ItemStack(UItems.uo2, 1));
        smelt.addSmelting(UBlocks.pitchblende.id, new ItemStack(UItems.uo2, 1));
        smelt.addSmelting(UItems.yellowcake.id, new ItemStack(UItems.leu, 1));
    }
}