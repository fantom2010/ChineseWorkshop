package cityofskytcd.chineseworkshop.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockCWTreeAltar extends BlockCWT {

	public BlockCWTreeAltar(String id, Material materialIn, float hardness) {
		super(id, materialIn, hardness);
	}

	@Override
	public boolean isSideSolid(IBlockState base_state, IBlockAccess world, BlockPos pos, EnumFacing side) {
		return side == EnumFacing.UP || side == EnumFacing.DOWN;
	}
}
