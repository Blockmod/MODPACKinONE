
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package blockmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import blockmod.world.inventory.ElectikFurnaceGUIMenu;

import blockmod.BlockmodMod;

public class BlockmodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BlockmodMod.MODID);
	public static final RegistryObject<MenuType<ElectikFurnaceGUIMenu>> ELECTIK_FURNACE_GUI = REGISTRY.register("electik_furnace_gui", () -> IForgeMenuType.create(ElectikFurnaceGUIMenu::new));
}
