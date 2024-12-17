package org.waste.of.time.mixin;

import it.unimi.dsi.fastutil.shorts.ShortList;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.nbt.NbtList;
import net.minecraft.network.packet.s2c.play.StatisticsS2CPacket;
import net.minecraft.world.chunk.SerializedChunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.waste.of.time.manager.CaptureManager;
import org.waste.of.time.storage.serializable.StatisticStoreable;

@Mixin(SerializedChunk.class)
public interface SerializedChunkMixin {
    @Invoker("toNbt")
    public static NbtList toNbt(ShortList[] lists) {
        throw new AssertionError();
    }
}
