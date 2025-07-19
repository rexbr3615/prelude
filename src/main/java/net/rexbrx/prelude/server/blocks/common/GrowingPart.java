package net.rexbrx.prelude.server.blocks.common;

import net.minecraft.util.StringRepresentable;

public enum GrowingPart implements StringRepresentable {
    BASE("base"),
    MIDDLE("middle"),
    TOPMID("topmid"),
    TOP("top");

    private final String name;

    GrowingPart(String name) {
        this.name = name;
    }

    @Override
    public String getSerializedName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
