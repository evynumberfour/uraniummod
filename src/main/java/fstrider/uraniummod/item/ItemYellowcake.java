package fstrider.uraniummod.item;

import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.world.World;

public class ItemYellowcake extends Item {
    public ItemYellowcake(String key, int id) {super(key,id);}

    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
        entityplayer.hurt(entityplayer, 4, DamageType.GENERIC);

        return new ItemStack(itemstack.getItem(), itemstack.stackSize-1);
    }
    public static void register(){}
}
