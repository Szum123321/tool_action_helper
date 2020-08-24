package net.szum123321.tool_action_helper.impl;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.szum123321.tool_action_helper.mixin.accessors.HoeItemAccessor;

public class HoeTillingHelper implements net.szum123321.tool_action_helper.api.HoeTillingHelper {
    /**
     * Use {@link net.szum123321.tool_action_helper.api.HoeTillingHelper#getInstance()}
     */
    @Deprecated
    public static final HoeTillingHelper INSTANCE = new HoeTillingHelper();

    private HoeTillingHelper() {}

    @Override
    public void addNewTilledPair(Block block, BlockState state) {
        HoeItemAccessor.getTilledBlocks().put(block, state);
    }
}
