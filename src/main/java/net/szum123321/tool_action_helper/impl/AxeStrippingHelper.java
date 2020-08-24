package net.szum123321.tool_action_helper.impl;

import com.google.common.collect.ImmutableMap;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;
import net.szum123321.tool_action_helper.exception.BadBlockException;
import net.szum123321.tool_action_helper.mixin.accessors.AxeItemAccessor;

public class AxeStrippingHelper implements net.szum123321.tool_action_helper.api.AxeStrippingHelper {
    /**
     * @deprecated Use {@link net.szum123321.tool_action_helper.api.AxeStrippingHelper#getInstance()}
     */
    @Deprecated
    public final static AxeStrippingHelper INSTANCE = new AxeStrippingHelper();

    private AxeStrippingHelper() {}

    @Override
    public void addNewStrippingPair(Block block1, Block block2) throws BadBlockException {
        if(!(block1 instanceof PillarBlock))
            throw new BadBlockException(block1, PillarBlock.class);

        if(!(block2 instanceof PillarBlock))
            throw new BadBlockException(block2, PillarBlock.class);

        ImmutableMap.Builder<Block, Block> builder = ImmutableMap.builder();

        builder.putAll(AxeItemAccessor.getStrippedBlocks());
        builder.put(block1, block2);

        AxeItemAccessor.setStrippedBlocks(builder.build());
    }
}
