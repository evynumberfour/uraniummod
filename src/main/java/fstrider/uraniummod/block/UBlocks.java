package fstrider.uraniummod.block;

import fstrider.uraniummod.UraniumMod;
import net.minecraft.client.sound.block.BlockSounds;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockAxisAligned;
import net.minecraft.core.block.BlockGravel;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
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

    public static final Block fluorspar = new BlockBuilder(UraniumMod.MOD_ID)
            .setHardness(3.0f)
            .setResistance(3.0f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
            .setBlockSound(BlockSounds.STONE)
            .setTextures("fluorsparOre.png")
            .build(new BlockFluorspar("ore.fluorspar.limestone", blockIdOffset + 3));

    public static final Block sulphurBlock = new BlockBuilder(UraniumMod.MOD_ID)
            .setHardness(1.0f)
            .setResistance(1.0f)
            .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.FENCES_CONNECT)
            .setBlockSound(BlockSounds.GRAVEL)
            .setTextures("sulphurBlock.png")
            .build(new BlockGravel("block.sulphur", blockIdOffset + 4));

    public static final Block clearglass = new BlockBuilder(UraniumMod.MOD_ID)
            .setHardness(0.5f)
            .setResistance(0.5f)
            .setLightOpacity(0)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
            .setBlockSound(BlockSounds.GLASS)
            .setTextures("clearGlass.png")
            .build(new BlockClearGlass("glass.clear", blockIdOffset + 5));

    public static final Block impossibleglass = new BlockBuilder(UraniumMod.MOD_ID)
            .setBlockSound(BlockSounds.GLASS)
            .setTextures("clearGlass.png")
            .build(new Block("glass.impossible", blockIdOffset + 6, Material.stone));

    public static final Block graphite = new BlockBuilder(UraniumMod.MOD_ID)
            .setHardness(3.0f)
            .setResistance(3.0f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
            .setBlockSound(BlockSounds.STONE)
            .setTopBottomTexture("graphiteTop.png")
            .setSideTextures("graphiteSide.png")
            .build(new BlockAxisAligned("pillar.graphite", blockIdOffset + 7,Material.stone));

    public static void register(){
        BlockCarnotite.register();
        BlockPitchblende.register();
        BlockFluorspar.register();
        BlockClearGlass.register();
    }
}
