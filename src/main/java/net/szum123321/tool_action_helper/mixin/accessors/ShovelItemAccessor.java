package net.szum123321.tool_action_helper.mixin.accessors;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ShovelItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;
import java.util.Set;

@Mixin(ShovelItem.class)
public interface ShovelItemAccessor {
    @Accessor("EFFECTIVE_BLOCKS")
    static Set<Block> getEffectiveBlocks() {
        throw new AssertionError();
    }

    @Accessor("PATH_STATES")
    static Map<Block, BlockState> getPathStates() {
        throw new AssertionError();
    }
}
