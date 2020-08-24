package net.szum123321.tool_action_helper.impl;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.szum123321.tool_action_helper.mixin.accessors.ShovelItemAccessor;

public class ShovelPathHelper implements net.szum123321.tool_action_helper.api.ShovelPathHelper {
    /**
     * Use {@link net.szum123321.tool_action_helper.api.ShovelPathHelper#getInstance()}
     */
    @Deprecated
    public static final ShovelPathHelper INSTANCE = new ShovelPathHelper();

    private ShovelPathHelper() {}

    @Override
    public void addNewPathPair(Block block, BlockState state) {
        ShovelItemAccessor.getPathStates().put(block, state);
    }
}
