package mindustrialist.content.blocks;

import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.draw.*;
import mindustrialist.content.MDITItems;
import mindustrialist.world.blocks.power.*;
import mindustrialist.world.draw.*;

import static mindustry.type.ItemStack;

public class MDITPowerBlocks{
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
            requirements(Category.power, with(MDITItems.money, 80));
            
            powerProduction = 1;
            size = 2;
            health = 1;
        }};
        
        LVPole = new PowerNode("lv-pole"){{
            requirements(Category.power, with(MDITItems.money, 10));
            
            laserRange = 14.1f;
            maxNodes = 1000;
            size = 2;
            health = 1;
        }};
        
        WindTurbineI = new WindGenerator("wind-turbine1"){{
            requirements(Category.power, with(MDITItems.money, 400));
            
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
            powerProduction = 3;
        }};
    }
}