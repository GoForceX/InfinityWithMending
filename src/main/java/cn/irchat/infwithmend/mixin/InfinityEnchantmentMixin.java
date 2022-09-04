package cn.irchat.infwithmend.mixin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.InfinityEnchantment;
import net.minecraft.inventory.EquipmentSlotType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(InfinityEnchantment.class)
public class InfinityEnchantmentMixin extends Enchantment {
    protected InfinityEnchantmentMixin(Rarity rarity, EquipmentSlotType[] types) {
        super(rarity, EnchantmentType.BOW, types);
    }

    /**
     * @author GoForceX
     * @reason Remove the check for apply infinity enchantment and mending together.
     */
    @Overwrite(remap = false)
    public boolean checkCompatibility(Enchantment ench) {
        return this != ench;
    }
}
