package mindustrialist.content;

import arc.func.*;
import arc.graphics.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.game.*;
import mindustry.content.*;
import mindustry.graphics.*;
import mindustry.graphics.g3d.*;
import mindustry.graphics.g3d.PlanetGrid.*;
import mindustry.maps.planet.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.meta.*;
import mindustrialist.content.*;

public class MDITPlanets{
    public static Planet
            mindustrialist,
            moon;
    
    public static void load(){
        mindustrialist = new Planet("mindustrialist-planet", Planets.sun, 1){{
            generator = new SerpuloPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 5);
            cloudMeshLoader = () -> new MultiMesh(
                    new HexSkyMesh(this, 2, 0.15f, 0.14f, 5, Color.valueOf("ffffff").a(0.75f), 2, 0.42f, 1f, 0.43f),
                    new HexSkyMesh(this, 3, 0.6f, 0.15f, 5, Color.valueOf("ffffff").a(0.75f), 2, 0.42f, 1.2f, 0.45f)
            );
            alwaysUnlocked = true;
            landCloudColor = Color.white;
            atmosphereColor = Color.valueOf("5de2e7");
            defaultEnv = Env.scorching | Env.terrestrial;
            startSector = 0;
            atmosphereRadIn = 0.02f;
            atmosphereRadOut = 0.3f;
            tidalLock = false;
            radius = 1f;
            minZoom = 1f;
            orbitTime = 365.4f * 60f;
            rotateTime = 23.5f * 60f;
            clearSectorOnLose = true;
            allowLaunchToNumbered = false;
            defaultCore = MDITBlocks.CoreBuilder;
        }};
    }
}