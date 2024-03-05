package mindustrialist;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class MDIT extends Mod{

    public MDIT(){
        Log.info("Loaded Mindustrialist constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("This mod is still WIP. Do you wish to continue?");
                dialog.cont.button("Yes", dialog::hide).size(100f, 50f);
                dialog.cont.button("No", Core.app::exit).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading Mindustrialist content.");
        
        MDITBlocks.load();
        MDITItems.load();
        MDITPlanets.load();
    }

}
