package fstrider.uraniummod.block;

import fstrider.uraniummod.UraniumMod;
import fstrider.uraniummod.item.UItems;
import net.minecraft.client.sound.block.BlockSounds;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.BlockBuilder;
import static fstrider.uraniummod.UraniumMod.blockIdOffset;

public class UBlocks {
    public static final Block carnotite = new BlockBuilder(UraniumMod.MOD_ID)
            .setHardness(1.3f)
            .setResistance(2.2f)
            .setLuminance(1)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
            .setBlockSound(BlockSounds.STONE)
            .setSideTextures("carnotiteSide.png")
            .setBottomTexture("carnotiteBottom.png")
            .setTopTexture("carnotiteTop.png")
            .build(new BlockCarnotite("ore.uranium.sandstone", blockIdOffset + 1));

    public static final Block pitchblende = new BlockBuilder(UraniumMod.MOD_ID)
            .setHardness(1.3f)
            .setResistance(2.2f)
            .setLuminance(1)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
            .setBlockSound(BlockSounds.STONE)
            .setTextures("pitchblende.png")
            .build(new BlockPitchblende("ore.uranium.granite", blockIdOffset + 2));

    public static void register(){
        BlockCarnotite.register();
        BlockPitchblende.register();
    }
}
