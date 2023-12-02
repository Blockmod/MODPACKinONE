
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package blockmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import blockmod.block.entity.EletricFurnaceBlockEntity;

import blockmod.BlockmodMod;

public class BlockmodModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BlockmodMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ELETRIC_FURNACE = register("eletric_furnace", BlockmodModBlocks.ELETRIC_FURNACE, EletricFurnaceBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
