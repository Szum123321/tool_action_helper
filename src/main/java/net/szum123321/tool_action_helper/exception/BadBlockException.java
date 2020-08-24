package net.szum123321.tool_action_helper.exception;

import net.minecraft.block.Block;

public class BadBlockException extends RuntimeException {
    public BadBlockException(Block block, Class<? extends Block> expected) {
        super("Block: " + block + " is not an instance of: " + expected.getName() + "!");
    }
}
