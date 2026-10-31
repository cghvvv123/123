package com.example.mod.mixin;

import net.minecraft.world.chunk.ChunkManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChunkManager.class)
public class ChunkManagerMixin {
    @Inject(method = "getViewDistance", at = @At("RETURN"), cancellable = true)
    private void forceViewDistance(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(4096);
    }
}
