package asablock.baby.animals.drop.experience.mixin;

import net.minecraft.entity.passive.AnimalEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AnimalEntity.class)
public class MixinAnimalEntity {
    @Inject(method = "getXpToDrop", at = @At("RETURN"), cancellable = true)
    private void getXpToDrop(CallbackInfoReturnable<Integer> cir) {
        if (((AnimalEntity) (Object) this).isBaby()) cir.setReturnValue(cir.getReturnValueI() * 2 / 3);
    }
}
