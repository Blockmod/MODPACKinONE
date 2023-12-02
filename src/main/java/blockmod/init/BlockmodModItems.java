
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package blockmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import blockmod.BlockmodMod;

public class BlockmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BlockmodMod.MODID);
	public static final RegistryObject<Item> CHAIR = block(BlockmodModBlocks.CHAIR);
	public static final RegistryObject<Item> ELETRIC_FURNACE = block(BlockmodModBlocks.ELETRIC_FURNACE);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
