package mindustrialist.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class MDITItems{
    public static Item
            money,
            researchpoints;
    
    public static void load(){
        money = new Item("money", Color.valueOf("65bb65"));
    }
}
