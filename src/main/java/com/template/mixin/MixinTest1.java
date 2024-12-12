package com.template.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;


@Mixin(Minecraft.class)
public class MixinTest1
{
    @Redirect(method = "setScreen", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/ClientLevel;getLevelData()Lnet/minecraft/client/multiplayer/ClientLevel$ClientLevelData;"))
    private ClientLevel.ClientLevelData redirect2(final ClientLevel instance)
    {
        return instance.getLevelData();
    }
}
