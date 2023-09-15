package fstrider.uraniummod.crafting;

import fstrider.uraniummod.block.UBlocks;
import fstrider.uraniummod.item.UItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.crafting.CraftingManager;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;

public abstract class UCrafting {
    public static void register() {
        CraftingManager craft = CraftingManager.getInstance();

        craft.addShapelessRecipe(new ItemStack(UItems.sulphuricacid,1), new ItemStack(Item.jar,1), new ItemStack(Item.bucketWater,1),new ItemStack(Item.sulphur,1),new ItemStack(Item.sulphur,1),new ItemStack(Item.sulphur,1));
        craft.addShapelessRecipe(new ItemStack(UItems.fluorinegas, 1), new ItemStack(UItems.sulphuricacid,1),new ItemStack(UItems.fluorspar,1));
        craft.addShapelessRecipe(new ItemStack(Item.sulphur,9), new ItemStack(UBlocks.sulphurBlock,1));
        craft.addRecipe(
                new ItemStack(UBlocks.sulphurBlock, 1),
                "###", "###","###",
                '#',new ItemStack(Item.sulphur, 1));
        craft.addShapelessRecipe(new ItemStack(UItems.sulphuricacid,3), new ItemStack(Item.bucketWater,1), new ItemStack(UBlocks.sulphurBlock,1),new ItemStack(Item.jar,1),new ItemStack(Item.jar,1),new ItemStack(Item.jar,1));
        craft.addRecipe(
                new ItemStack(Block.tnt, 2),
                "###", "#@#","###",
                '#',new ItemStack(Block.sand, 1),
                '@',new ItemStack(UBlocks.sulphurBlock, 1));
        craft.addShapelessRecipe(new ItemStack(UBlocks.clearglass,4), new ItemStack(UItems.fluorspar,1),new ItemStack(Block.glass,1),new ItemStack(Block.glass,1),new ItemStack(Block.glass,1));
        craft.addShapelessRecipe(new ItemStack(UItems.yellowcake,3), new ItemStack(UItems.sulphuricacid,1), new ItemStack(UItems.rawuranium,1),new ItemStack(UItems.rawuranium,1),new ItemStack(UItems.rawuranium,1));
        craft.addRecipe(
                new ItemStack(UBlocks.graphite, 1),
                "c c", "cic","c c",
                'c',new ItemStack(Item.coal, 1),
                '@',new ItemStack(Item.ingotIron, 1));
        craft.addRecipe(
                new ItemStack(UBlocks.graphite, 4),
                "iCi", " C ","iCi",
                'i',new ItemStack(Item.ingotIron, 1),
                'C',new ItemStack(Block.blockCoal, 1));
    }
}
