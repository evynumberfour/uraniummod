package fstrider.uraniummod.block;

import fstrider.uraniummod.item.UItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockCarnotite extends Block {
    public BlockCarnotite(String key, int id) {
        super(key, id, Material.stone);
    }
    @Override
    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        switch (dropCause) {
            case SILK_TOUCH:
            case PICK_BLOCK:
                return new ItemStack[]{new ItemStack(this)};
            case PROPER_TOOL:
            case EXPLOSION:
                return new ItemStack[]{new ItemStack(UItems.rawuranium, world.rand.nextInt(2)+1)};
            default:
                return null;
        }
    }
    public static void register(){}
}
