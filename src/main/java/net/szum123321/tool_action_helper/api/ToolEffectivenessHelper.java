package net.szum123321.tool_action_helper.api;

import net.minecraft.block.Block;

public interface ToolEffectivenessHelper {
    static ToolEffectivenessHelper getInstance() {
        return net.szum123321.tool_action_helper.impl.ToolEffectivenessHelper.INSTANCE;
    }

    /**
     * This method lets you make axe effective on given block.
     * @param block {@link net.minecraft.block.Block}
     */
    void addEffectiveBlockToAxe(Block block);

    /**
     * This method lets you make shovel effective on given block.
     * @param block {@link net.minecraft.block.Block}
     */
    void addEffectiveBlockToShovel(Block block);
}
