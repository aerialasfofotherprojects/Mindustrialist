package mindustrialist.content.blocks;

import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.draw.*;
import mindustrialist.world.blocks.power.*;
import mindustrialist.world.draw.*;

import static mindustry.type.ItemStack.*;

public class PowerBlocks{
    public static Block
            SolarPanel,
            LVPole,
            WindTurbineI,
            LVBattery,
            MVPole,
            SolarPanelII,
            WindTurbineII,
            MVBattery,
            DoubleMVBattery;
    
    public static void load(){ // TODO make more blocks
        SolarPanel = new SolarGenerator("solar-panel1"){{
            requirements(Category.power, with(Item.money, 80));
            
            powerProduction = 1;
            size = 2;
            health = 1;
        }};
        
        LVPole = new PowerNode("lv-pole"){{
            requirements(Category.power, with(Item.money, 10));
            
            laserRange = 14.1f;
            maxNodes = 1000;
            size = 2;
            health = 1;
        }};
        
        WindTurbineI = new WindGenerator("wind-turbine1"){{
            requirements(Category.power, with(Item.money, 400));
            
            drawer = new DrawMulti(
              new DrawRegion("-rotator-shadow"){{
                spinSprite = true; 
                rotateSpeed = 2;
                x = -0.49;
                y = -0.49;
              }},
              new DrawDefault(),
              new DrawRegion("-rotator"){{
                spinSprite = true;
                rotateSpeed = 2;
                x = -0.5;
                y = -0.5;
              }},
              new DrawRegion("-top")
            );
            size = 2;
            powerProduction = 3;
        }};
    }
}