package asablock.baby.animals.drop.experience.mixin;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class MixinLivingEntity {
    @Inject(method = "shouldDropXp", at = @At("HEAD"), cancellable = true)
    private void shouldDropXp(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
