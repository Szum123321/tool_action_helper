package net.szum123321.tool_action_helper.mixin.accessors;

import net.minecraft.block.Block;
import net.minecraft.item.AxeItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;
import java.util.Set;

@Mixin(AxeItem.class)
public interface AxeItemAccessor {
    @Accessor(value = "EFFECTIVE_BLOCKS")
    static Set<Block> getEffectiveBlocks() {
        throw new AssertionError();
    }

    @Accessor(value = "STRIPPED_BLOCKS")
    static Map<Block, Block> getStrippedBlocks() {
        throw new AssertionError();
    }

    @Accessor(value = "STRIPPED_BLOCKS")
    static void setStrippedBlocks(Map<Block, Block> strippedBlocks) {
        throw new AssertionError();
    }
}
