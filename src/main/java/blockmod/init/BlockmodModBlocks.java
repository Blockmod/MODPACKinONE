
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package blockmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import blockmod.block.ChairBlock;

import blockmod.BlockmodMod;

public class BlockmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockmodMod.MODID);
	public static final RegistryObject<Block> CHAIR = REGISTRY.register("chair", () -> new ChairBlock());
}
