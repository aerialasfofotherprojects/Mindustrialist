package mindustrialist.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class MDITItems{
    public static Item
            //main items
            
            Money,
            ResearchPoints,
            
            //raw materials
            
            RawIron,
            Soil,
    
            //crafted materials
    
            Iron;
    
    public static void load(){
        //main items
        
        Money = new Item("Money", Color.valueOf("65bb65")){{alwaysUnlocked = true;}};
        ResearchPoints = new Item("research-points", Color.cyan){{buildable = false;}};
        
        //raw materials
        
        RawIron = new Item("raw-iron", Color.valueOf("43464b")){{buildable = false;}};
        Soil = new Item("soil", Color.brown){{buildable = false;}};
        
        //crafted materials
        
        Iron = new Item("iron", Color.valueOf("c0c0c0")){{buildable = false;}};
        
    }
}
