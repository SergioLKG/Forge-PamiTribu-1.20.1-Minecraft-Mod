package net.pamimod.pamitribu.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pamimod.pamitribu.PamiTribu;
import net.pamimod.pamitribu.entity.custom.PamiEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PamiTribu.MOD_ID);

    public static final RegistryObject<EntityType<PamiEntity>> RHINO =
            ENTITY_TYPES.register("rhino", () -> EntityType.Builder.of(PamiEntity::new, MobCategory.CREATURE)
                    .sized(2.5f, 2.5f).build("rhino"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}