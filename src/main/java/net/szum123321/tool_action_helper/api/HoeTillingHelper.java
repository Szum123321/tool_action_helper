package net.szum123321.tool_action_helper.api;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

public interface HoeTillingHelper {
    static HoeTillingHelper getInstance() {
        return net.szum123321.tool_action_helper.impl.HoeTillingHelper.INSTANCE;
    }

    /**
     * When player clicks with a hoe on the block, it gets replaced with state
     * @param block {@link net.minecraft.block.Block} that play has to click
     * @param state {@link net.minecraft.block.BlockState} that the block will turn into
     */
    void addNewTilledPair(Block block, BlockState state);
}
