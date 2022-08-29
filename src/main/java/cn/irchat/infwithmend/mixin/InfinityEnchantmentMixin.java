package cn.irchat.infwithmend.mixin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentArrowInfinite;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(EnchantmentArrowInfinite.class)
public class InfinityEnchantmentMixin extends Enchantment {
    public InfinityEnchantmentMixin(Rarity rarityIn, EntityEquipmentSlot... slots) {
        super(rarityIn, EnumEnchantmentType.BOW, slots);
    }

    /**
     * @author GoForceX
     * @reason Remove the check for apply infinity enchantment and mending together.
     */
    @Overwrite(remap = false)
    public boolean canApplyTogether(Enchantment ench) {
        return this != ench;
    }
}
