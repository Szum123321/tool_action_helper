package net.szum123321.tool_action_helper.api;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

public interface ShovelPathHelper {
    static ShovelPathHelper getInstance() {
        return net.szum123321.tool_action_helper.impl.ShovelPathHelper.INSTANCE;
    }

    /**
     * When player uses shovel on the block, it will turn into state.
     * @param block {@link net.minecraft.block.Block} that play has to click
     * @param state {@link net.minecraft.block.BlockState} that the block will turn into
     */
    void addNewPathPair(Block block, BlockState state);
}
