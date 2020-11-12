package thepwnd.traincrafttweaker.mods.tc.handlers;

import minetweaker.IUndoableAction;
import minetweaker.MineTweakerAPI;
import minetweaker.api.item.IItemStack;
import net.minecraft.item.ItemStack;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;
import train.common.core.managers.TierRecipeManager;

@ZenClass("mods.tc.AssemblyTable")
public class AssemblyTable {
	
	@ZenMethod
	public static void addRecipe(int tier, ItemStack planks, ItemStack wheels, ItemStack frame, ItemStack coupler, ItemStack chimney, ItemStack cab, ItemStack boiler, ItemStack firebox, ItemStack additional, ItemStack dye, ItemStack output, int outputSize) {
		MineTweakerAPI.apply(new AddRecipeAction(tier, planks, wheels, frame, coupler, chimney, cab, boiler, firebox, additional, dye, output, outputSize));
	}
	
	@ZenMethod
	public static void removeRecipe() {
		
	}
	
	// ######################
	// ### Action classes ###
	// ######################
	
	private static class AddRecipeAction implements IUndoableAction {
		
		private final ItemStack output;
		private final TierRecipeManager recipe = new TierRecipeManager();
		
		public AddRecipeAction(int tier, ItemStack planks, ItemStack wheels, ItemStack frame, ItemStack coupler, ItemStack chimney, ItemStack cab, ItemStack boiler, ItemStack firebox, ItemStack additional, ItemStack dye, ItemStack output, int outputSize) {
			this.output = output;
			
			recipe.addRecipe(tier, planks, wheels, frame, coupler, chimney, cab, boiler, firebox, additional, dye, output, outputSize);
		}

		@Override
		public void apply() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean canUndo() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public String describe() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String describeUndo() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object getOverrideKey() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void undo() {
			// TODO Auto-generated method stub
			
		}
		
	}

}
