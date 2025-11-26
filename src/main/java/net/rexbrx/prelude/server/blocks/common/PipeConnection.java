package net.rexbrx.prelude.server.blocks.common;

import net.minecraft.util.StringRepresentable;

public enum PipeConnection implements StringRepresentable {
    NONE("none"), CONNECTED("connected");

    private final String name;

    PipeConnection(String name) {
        this.name = name;
    }

    @Override
    public String getSerializedName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

