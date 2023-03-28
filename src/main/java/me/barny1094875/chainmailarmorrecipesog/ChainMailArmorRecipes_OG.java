package me.barny1094875.chainmailarmorrecipesog;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.minecart.RideableMinecart;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChainMailArmorRecipes_OG extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        // Adding each recipe for the chain armor/armour

        // recipe for chain helmet
        ShapedRecipe ChainHelmet1 = new ShapedRecipe(new NamespacedKey(this, "Chainmail_Helmet1"),
                new ItemStack(Material.CHAINMAIL_HELMET))
                .shape("ccc", "c c")
                .setIngredient('c', Material.CHAIN);
        Bukkit.addRecipe(ChainHelmet1);

        // recipe for chain chestplate
        ShapedRecipe ChainChestPlate = new ShapedRecipe(new NamespacedKey(this, "Chainmail_Chestplate"),
                new ItemStack(Material.CHAINMAIL_CHESTPLATE))
                .shape("c c", "ccc", "ccc")
                .setIngredient('c', Material.CHAIN);
        Bukkit.addRecipe(ChainChestPlate);

        // recipe for chain leggings
        ShapedRecipe ChainLeggings = new ShapedRecipe(new NamespacedKey(this, "Chainmail_Leggings"),
                new ItemStack(Material.CHAINMAIL_LEGGINGS))
                .shape("ccc", "c c", "c c")
                .setIngredient('c', Material.CHAIN);
        Bukkit.addRecipe(ChainLeggings);

        // recipe for chain boots
        ShapedRecipe ChainBoots1 = new ShapedRecipe(new NamespacedKey(this, "Chainmail_Boots1"),
                new ItemStack(Material.CHAINMAIL_BOOTS))
                .shape("c c", "c c")
                .setIngredient('c', Material.CHAIN);
        Bukkit.addRecipe(ChainBoots1);


    }

//    @Override
//    public void onDisable() {
//        // Plugin shutdown logic
//    }
}
