package mindustrialist.content;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustrialist.world.blocks.power.WindGenerator;
import mindustry.*;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import mindustrialist.content.*;

import static mindustry.type.ItemStack.with;

public class MDITBlocks{
    public static Block
            //environment
            Grass,
            Sand,
    
            //effect
            CoreBuilder,
            SmallItemStorageSilo,
            SmallLiquidStorageSilo,
            MediumItemStorageSilo,
            MediumLiquidStorageSilo,
            GoldItemStorageSilo,
            GoldLiquidStorageSilo,
    
            //drills
            CoalDrill,
            CopperDrill,
            AdvancedCoalDrill,
            AdvancedCopperDrill,
            IronDrill,
            SoilExcavator,

            //power
            SolarPanel,
            LVPole,
            WindTurbineI,
            RustyBattery,
            SmallMVPole,
            MVPole,
            AdvancedMVPole,
            HMVT,
            HVPole,
            SolarPanelII,
            WindTurbineII,
            MVBattery,
            DoubleMVBattery,
            HVBattery,
            HVBatteryMK2,
            
            //distribution & selling
            ShortItemPipe,
            ItemPipeJunction,
            ItemPipeRouter,
            ShortFluidPipe,
            FluidPipeJunction,
            FluidPipeRouter,
            ShortItemPipe2,
            ItemPipeJunction2,
            ItemPipeRouter2,
            ShortFluidPipe2,
            FluidPipeJunction2,
            FluidPipeRouter2,
    
    end;

    public static void load(){ // TODO make more blocks
        
        //environment
        
        Grass = new Floor("mgrass"){{attributes.set(Attribute.get("grass"), 1);}};
        Sand = new Floor("msand"){{attributes.set(Attribute.get("sand"), 1);}};
        
        //effect
        
        CoreBuilder = new CoreBlock("core-builder"){{
            requirements(Category.effect, with(MDITItems.Money, 1000000000));
            
            size = 2;
            health = 1;
            
            isFirstTier = true;
            requiresCoreZone = true;
            incinerateNonBuildable = true;
            unitType = MDITUnitTypes.builder;
        }};
        SmallItemStorageSilo = new Router("small-item-storage-silo"){{
            requirements(Category.effect, with(MDITItems.Money, 100));
            
            itemCapacity = 500; //idk how much
        }};
        SmallLiquidStorageSilo = new LiquidRouter("small-liquid-storage-silo"){{
            requirements(Category.effect, with(MDITItems.Money, 100));
            
            itemCapacity = 500;
        }};
        MediumItemStorageSilo = new Router("medium-item-storage-silo"){{
            requirements(Category.effect, with(MDITItems.Money, 500));
            
            itemCapacity = 5000;
        }};
        MediumLiquidStorageSilo = new LiquidRouter("medium-liquid-storage-silo"){{
            requirements(Category.effect, with(MDITItems.Money, 500));
            
            itemCapacity = 5000;
        }};
        GoldItemStorageSilo = new Router("gold-item-storage-silo"){{
            requirements(Category.effect, with(MDITItems.Money, 100000));
            
            itemCapacity = 1665000;
        }};
        GoldLiquidStorageSilo = new LiquidRouter("gold-liquid-storage-silo"){{
            requirements(Category.effect, with(MDITItems.Money, 100000));
            
            itemCapacity = 1665000;
        }};
        
        //drills
        
        CoalDrill = new AttributeCrafter("coal-drill"){{
            requirements(Category.production, with(MDITItems.Money, 50));
            
            health = 1;
            size = 2;
            
            outputItem = new ItemStack(Items.coal, 1);
            craftTime = 260;
            hasItems = true;
            craftEffect = Fx.smoke;
            attribute = Attribute.get("stone");
            
            consumePower(1.2f);
        }};
        CopperDrill = new AttributeCrafter("copper-drill"){{
            requirements(Category.production, with(MDITItems.Money, 50));
            
            health = 1;
            size = 2;
            
            outputItem = new ItemStack(Items.copper, 1);
            craftTime = 540;
            hasItems = true;
            craftEffect = Fx.smoke;
            attribute = Attribute.get("stone");
            
            consumePower(3.6f);
        }};
        AdvancedCoalDrill = new AttributeCrafter("advanced-coal-drill"){{
            requirements(Category.production, with(MDITItems.Money, 1000));
            
            health = 1;
            size = 4;
            
            outputItem = new ItemStack(Items.coal, 3);
            craftTime = 800;
            hasItems = true;
            hasPower = true;
            craftEffect = Fx.none;
            attribute = Attribute.get("stone");
            
            consumePower(9f);
        }};
        AdvancedCopperDrill = new AttributeCrafter("advanced-copper-drill"){{
            requirements(Category.production, with(MDITItems.Money, 520));
            
            health = 1;
            size = 4;
            
            outputItem = new ItemStack(Items.copper, 4);
            craftTime = 700;
            hasItems = true;
            craftEffect = Fx.none;
            attribute = Attribute.get("stone");
            
            consumePower(6f);
        }};
        IronDrill = new AttributeCrafter("iron-drill"){{
            requirements(Category.production, with(MDITItems.Money, 350));
            
            health = 1;
            size = 2;
            
            outputItem = new ItemStack(MDITItems.RawIron, 1);
            craftTime = 900;
            hasItems = true;
            craftEffect = Fx.smoke;
            attribute = Attribute.get("stone");
            
            consumePower(1.2f);
        }};
        SoilExcavator = new AttributeCrafter("soil-excavator"){{
            requirements(Category.production, with(MDITItems.Money, 500000));
            
            health = 1;
            size = 5;
            
            outputItem = new ItemStack(MDITItems.Soil, 1);
            craftTime = 60;
            hasItems = true;
            craftEffect = Fx.none;
            attribute = Attribute.get("grass");
            
            consumePower(300f);
        }};
        
        //power
        
        SolarPanel = new SolarGenerator("solar-panel1"){{
            requirements(Category.power, with(MDITItems.Money, 80));

            powerProduction = 1;
            size = 2;
            health = 1;
        }};
        LVPole = new PowerNode("lv-pole"){{
            requirements(Category.power, with(MDITItems.Money, 10));

            laserRange = 5.1f * 8;
            maxNodes = 10000;
            size = 2;
            health = 1;
        }};
        WindTurbineI = new WindGenerator("wind-turbine1"){{
            requirements(Category.power, with(MDITItems.Money, 400));

            drawer = new DrawMulti(
                    new DrawRegion("-rotator-shadow"){{
                        spinSprite = true;
                        rotateSpeed = 2;
                        x = -0.49f;
                        y = -0.49f;
                    }},
                    new DrawDefault(),
                    new DrawRegion("-rotator"){{
                        spinSprite = true;
                        rotateSpeed = 2;
                        x = -0.5f;
                        y = -0.5f;
                    }},
                    new DrawRegion("-top")
            );
            size = 2;
            minPower = 0.1f;
            maxPower = 3f;
        }};
        RustyBattery = new Battery("lv-battery"){{
            requirements(Category.power, with(MDITItems.Money, 100));
            
            consumePowerBuffered(0.1f);
            baseExplosiveness = 99999999999999999f;
        }};
        SmallMVPole = new PowerNode("small-mv-pole"){{
            requirements(Category.power, with(MDITItems.Money, 40));
            
            laserRange = 5.1f * 8f;
            maxNodes = 10000;
            size = 2;
            health = 1;
        }};
        MVPole = new PowerNode("mv-pole"){{
            requirements(Category.power, with(MDITItems.Money, 80));
            
            laserRange = 9.1f * 8f;
            maxNodes = 10000;
            size = 2;
            health = 1;
        }};
        AdvancedMVPole = new PowerNode("advanced-mv-pole"){{
            requirements(Category.power, with(MDITItems.Money, 300));
            
            laserRange = 14.1f * 8f;
            maxNodes = 10000;
            size = 2;
            health = 1;
        }};
        HMVT = new PowerNode("hmvt"){{
            requirements(Category.power, with(MDITItems.Money, 10000));
            
            laserRange = 24.1f * 8f;
            maxNodes = 10000;
            size = 2;
            health = 1;
        }};
        HVPole = new PowerNode("hv-pole"){{
            requirements(Category.power, with(MDITItems.Money, 2500000));
            
            laserRange = 34.1f * 8f;
            maxNodes = 10000;
            size = 2;
            health = 1;
        }};
        
        
        //special
        end = null;
    }
}