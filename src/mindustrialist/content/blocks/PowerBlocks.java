package mindustrialist.content.blocks;

import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.draw.*;
import mindustrialist.world.blocks.power.*;
import mindustrialist.world.draw.*;

import static mindustry.type.ItemStack.*;

public class PowerBlocks{
    public static Block
            SolarPanelI,
            LVPole,
            WindTurbine,
            LVBattery,
            MVPole,
            MVBattery,
            DoubleMVBattery,
    
    end;
    
    public static void load(){
        SolarPanelI = new SolarGenerator("solar-panel1"){{
            requirements(Category.power, with(Item.money, 10));
            
            
        }};
    }
}