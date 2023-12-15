package net.pamimod.pamitribu.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

public class PamiEntity extends Monster {
    public PamiEntity(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0,new FloatGoal(this));
        this.goalSelector.addGoal(1, new TemptGoal(this, 1.20, Ingredient.of(Items.DIAMOND, Items.EMERALD, Items.IRON_INGOT, Items.COPPER_INGOT, Items.LAPIS_BLOCK),false));
        this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 3f));
        this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));


        super.registerGoals();
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createLivingAttributes()
        .add(Attributes.MAX_HEALTH, 8D)
        .add(Attributes.MOVEMENT_SPEED, 1.5D)
                .add(Attributes.ATTACK_KNOCKBACK, 0.2f)
                .add(Attributes.ATTACK_DAMAGE, 0.3f)
                .add(Attributes.ATTACK_SPEED, 1.2f)
                .add(Attributes.KNOCKBACK_RESISTANCE, 2D)
                .add(Attributes.SPAWN_REINFORCEMENTS_CHANCE, Attributes.SPAWN_REINFORCEMENTS_CHANCE.getDefaultValue()*2);
    }

}

