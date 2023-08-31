package org.waste.of.time.mixin;

import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.s2c.play.StatisticsS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.waste.of.time.serializer.StatisticSerializer;

@Mixin(ClientPlayNetworkHandler.class)
public class MixinStatisticGrabber {
    @Inject(method = "onStatistics", at = @At("RETURN"))
    private void onStatistics(StatisticsS2CPacket packet, CallbackInfo ci) {
        StatisticSerializer.INSTANCE.writeStats();
    }
}
