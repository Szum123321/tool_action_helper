package net.szum123321.tool_action_helper.impl;

import net.minecraft.block.Block;
import net.szum123321.tool_action_helper.mixin.accessors.AxeItemAccessor;
import net.szum123321.tool_action_helper.mixin.accessors.ShovelItemAccessor;

public class ToolEffectivenessHelper implements net.szum123321.tool_action_helper.api.ToolEffectivenessHelper {
    /**
     * Use {@link net.szum123321.tool_action_helper.api.ToolEffectivenessHelper#getInstance()}
     */
    @Deprecated
    public static final ToolEffectivenessHelper INSTANCE = new ToolEffectivenessHelper();

    private ToolEffectivenessHelper() {}

    @Override
    public void addEffectiveBlockToAxe(Block block) {
        AxeItemAccessor.getEffectiveBlocks().add(block);
    }

    @Override
    public void addEffectiveBlockToShovel(Block block) {
        ShovelItemAccessor.getEffectiveBlocks().add(block);
    }
}
