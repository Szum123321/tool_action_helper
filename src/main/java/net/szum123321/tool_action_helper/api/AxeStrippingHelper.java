package net.szum123321.tool_action_helper.api;

import net.minecraft.block.Block;
import net.szum123321.tool_action_helper.exception.BadBlockException;

public interface AxeStrippingHelper {
    static AxeStrippingHelper getInstance() {
        return net.szum123321.tool_action_helper.impl.AxeStrippingHelper.INSTANCE;
    }

    /**
     * When you click on block1 with an axe, that block will turn into block2 (Stripping action)
     * @param block1 first block. Must be an instance of PillarBlock
     * @param block2 second block. Must be an instance of PillarBlock
     * @throws BadBlockException when one of the blocks is not a {@link net.minecraft.block.PillarBlock}
     */
    void addNewStrippingPair(Block block1, Block block2) throws BadBlockException;
}
