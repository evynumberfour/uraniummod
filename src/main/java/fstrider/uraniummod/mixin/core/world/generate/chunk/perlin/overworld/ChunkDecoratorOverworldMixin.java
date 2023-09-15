package fstrider.uraniummod.mixin.core.world.generate.chunk.perlin.overworld;

import fstrider.uraniummod.block.UBlocks;
import fstrider.uraniummod.worldgen.WorldFeatureCustomOre;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockSand;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.chunk.perlin.overworld.ChunkDecoratorOverworld;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@SuppressWarnings("ALL")
@Mixin(value= ChunkDecoratorOverworld.class, remap = false)

public abstract class ChunkDecoratorOverworldMixin {
    @Final
    private World world;

    @Inject(method="decorate",at=@At("TAIL"))
    public void decorate(Chunk chunk, CallbackInfo info) {
        int chunkX = chunk.xPosition;
        int chunkZ = chunk.zPosition;
        int minY = world.getWorldType().getMinY();
        int maxY = world.getWorldType().getMaxY();
        int rangeY = maxY + 1 - minY;
        BlockSand.fallInstantly = true;
        int x = chunkX << 4;
        int z = chunkZ << 4;
        int y = world.getHeightValue(x + 16, z + 16);
        Biome biome = world.getBlockBiome(x + 16, y, z + 16);
        float oreHeightModifier = (float)rangeY / 128.0f;
        Random rand = new Random(this.world.getRandomSeed());
        long l1 = rand.nextLong() / 2L * 2L + 1L;
        long l2 = rand.nextLong() / 2L * 2L + 1L;
        rand.setSeed((long)chunkX * l1 + (long)chunkZ * l2 ^ this.world.getRandomSeed());
        int blockX, blockY, blockZ;

        for (int i=0;(float)i<60.0f*oreHeightModifier;i++) {
            blockX = x + rand.nextInt(16);
            blockY = minY + rand.nextInt(rangeY);
            blockZ = z + rand.nextInt(16);
            new WorldFeatureCustomOre(UBlocks.carnotite.id, rand.nextInt(17)+8, false, Block.sandstone.id).generate(world, rand, blockX, blockY, blockZ);
        }
        for (int i=0;(float)i<20.0f*oreHeightModifier;i++) {
            blockX = x + rand.nextInt(16);
            blockY = minY + rand.nextInt(rangeY);
            blockZ = z + rand.nextInt(16);
            new WorldFeatureCustomOre(UBlocks.pitchblende.id, rand.nextInt(5)+7, false, Block.granite.id).generate(world, rand, blockX, blockY, blockZ);
        }
        for (int i=0;(float)i<40.0f*oreHeightModifier;i++) {
            blockX = x + rand.nextInt(16);
            blockY = minY + rand.nextInt(rangeY);
            blockZ = z + rand.nextInt(16);
            new WorldFeatureCustomOre(UBlocks.fluorspar.id, rand.nextInt(5)+4, false, Block.limestone.id).generate(world, rand, blockX, blockY, blockZ);
        }
    }
}
