package com.example.jnhvic001.wifimapperv1;

import android.graphics.Color;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static android.graphics.Color.rgb;

public class BuildingMarkers {

    public BuildingMarkers() {}

    //method that returns a list of upper campus buildings
    public List<Building> initBuildings(){
        ArrayList<Building> buildings = new ArrayList<>();
        List<LatLng> csc = new ArrayList<>();
        csc.add(new LatLng(-33.956551, 18.460927));
        csc.add(new LatLng(-33.956585, 18.461268));
        csc.add(new LatLng(-33.957137, 18.461209));
        csc.add(new LatLng(-33.957103, 18.460860));
        buildings.add(new Building("Computer Science Building", csc));

       return buildings;
   }

    //arrayList of all the polygons of all the buildings
    public ArrayList<PolygonOptions> getPolygons(/*List<Building> buildings*/){
       ArrayList<PolygonOptions> shapes = new ArrayList<>();
       PolygonOptions csc = new PolygonOptions()
                .add(new LatLng(-33.956551, 18.460927),
                        new LatLng(-33.956585, 18.461268),
                        new LatLng(-33.957137, 18.461209),
                        new LatLng(-33.957103, 18.460860))
                .fillColor(rgb(178,255,102))
                .strokeColor(Color.blue(1));
       shapes.add(csc);

       PolygonOptions stevebiko = new PolygonOptions()
                .add(new LatLng(-33.956667, 18.460479),
                        new LatLng(-33.956692, 18.460706),
                        new LatLng(-33.957075, 18.460658),
                        new LatLng(-33.957065, 18.460427))
                ./*fillColor(buildings.get(0).getColor())*/fillColor(rgb(178,255,102))
                .strokeColor(Color.blue(1));
        shapes.add(stevebiko);

        PolygonOptions math = new PolygonOptions()
                .add(new LatLng(-33.956981, 18.461489),
                        new LatLng(-33.957016, 18.461770),
                        new LatLng(-33.957517, 18.461685),
                        new LatLng(-33.957481, 18.461397))
                .fillColor(rgb(178,255,102))
                .strokeColor(Color.blue(1));
        shapes.add(math);

        PolygonOptions ac_jordan = new PolygonOptions()
                .add(new LatLng(-33.958053, 18.461277),
                        new LatLng(-33.958109, 18.461556),
                        new LatLng(-33.958593, 18.461406),
                        new LatLng(-33.958538, 18.461135))
                .fillColor(rgb(255,178,102))
                .strokeColor(Color.blue(1));
        shapes.add(ac_jordan);

        PolygonOptions jagger_library = new PolygonOptions()
                .add(new LatLng(-33.957922, 18.460712),
                        new LatLng(-33.957977, 18.461027),
                        new LatLng(-33.958195, 18.460958),
                        new LatLng(-33.958144, 18.460641))
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));
        shapes.add(jagger_library);

        PolygonOptions cissy_gool_mall = new PolygonOptions()
                .add(new LatLng(-33.956777, 18.460736),
                        new LatLng(-33.956790, 18.460873),
                        new LatLng(-33.957069, 18.460849),
                        new LatLng(-33.957056, 18.460708))
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));
        shapes.add(cissy_gool_mall);

        PolygonOptions molly_blackburn2 = new PolygonOptions()
                .add(new LatLng(-33.957106, 18.460362),
                        new LatLng(-33.957169, 18.460863),
                        new LatLng(-33.957381, 18.460816),
                        new LatLng(-33.957326, 18.460331))
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));
        shapes.add(molly_blackburn2);

        PolygonOptions molly_blackburn = new PolygonOptions()
                .add(new LatLng(-33.957188, 18.460867),
                        new LatLng(-33.957232, 18.461190),
                        new LatLng(-33.957455, 18.461150),
                        new LatLng(-33.957411, 18.460815))
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));
        shapes.add(molly_blackburn);

        PolygonOptions memorial_hall = new PolygonOptions()
                .add(new LatLng(-33.957501, 18.460549),
                        new LatLng(-33.957564, 18.460888),
                        new LatLng(-33.957800, 18.460850),
                        new LatLng(-33.957736, 18.460488))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));
        shapes.add(memorial_hall);

        PolygonOptions botany = new PolygonOptions()
                .add(new LatLng(-33.956129, 18.461560),
                        new LatLng(-33.956141, 18.461836),
                        new LatLng(-33.956796, 18.461778),
                        new LatLng(-33.956783, 18.461521))
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));
        shapes.add(botany);

        PolygonOptions zoology = new PolygonOptions()
                .add(new LatLng(-33.955929, 18.460946),
                        new LatLng(-33.955926, 18.461284),
                        new LatLng(-33.956532, 18.461260),
                        new LatLng(-33.956514, 18.460943))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));
        shapes.add(zoology);

        PolygonOptions rw_james = new PolygonOptions()
                .add(new LatLng(-33.955274, 18.461557),
                        new LatLng(-33.955270, 18.461838),
                        new LatLng(-33.955963, 18.461838),
                        new LatLng(-33.955961, 18.461559))
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));
        shapes.add(rw_james);

        PolygonOptions chris_hani = new PolygonOptions()
                .add(new LatLng(-33.955666, 18.460962),
                        new LatLng(-33.955670, 18.461297),
                        new LatLng(-33.955877, 18.461302),
                        new LatLng(-33.955875, 18.460951))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));
        shapes.add(chris_hani);

        PolygonOptions molecularbiology = new PolygonOptions()
                .add(new LatLng(-33.955139, 18.460789),
                        new LatLng(-33.955132, 18.461031),
                        new LatLng(-33.954972, 18.461025),
                        new LatLng(-33.954973, 18.461292),
                        new LatLng(-33.955630, 18.461302),
                        new LatLng(-33.955637, 18.460802))
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));
        shapes.add(molecularbiology);

        PolygonOptions beatie = new PolygonOptions()
                .add(new LatLng(-33.958714, 18.461069),
                        new LatLng(-33.958784, 18.461343),
                        new LatLng(-33.959334, 18.461141),
                        new LatLng(-33.959262, 18.460865))
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));
        shapes.add(beatie);

        PolygonOptions architecture_building = new PolygonOptions()
                .add(new LatLng(-33.959437, 18.460787),
                        new LatLng(-33.959526, 18.461058),
                        new LatLng(-33.960131, 18.460757),
                        new LatLng(-33.960039, 18.460486))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));
        shapes.add(architecture_building);

        PolygonOptions leslie_social = new PolygonOptions()
                .add(new LatLng(-33.959093, 18.460094),
                        new LatLng(-33.959249, 18.460558),
                        new LatLng(-33.959791, 18.460289),
                        new LatLng(-33.959631, 18.459816))
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));
        shapes.add(leslie_social);

        PolygonOptions geo_building = new PolygonOptions()
                .add(new LatLng(-33.958809, 18.460349),
                        new LatLng(-33.958897, 18.460720),
                        new LatLng(-33.959113, 18.460638),
                        new LatLng(-33.959012, 18.460269))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));
        shapes.add(geo_building);

        PolygonOptions EM_building = new PolygonOptions()
                .add(new LatLng(-33.958230, 18.460603),
                        new LatLng(-33.958308, 18.460941),
                        new LatLng(-33.958840, 18.460760),
                        new LatLng(-33.958764, 18.460423))
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));
        shapes.add(EM_building);

        PolygonOptions menzies = new PolygonOptions()
                .add(new LatLng(-33.958404, 18.460061),
                        new LatLng(-33.958439, 18.460229),
                        new LatLng(-33.958953, 18.460071),
                        new LatLng(-33.958912, 18.459883))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));
        shapes.add(menzies);

        PolygonOptions snape = new PolygonOptions()
                .add(new LatLng(-33.958233, 18.459594),
                        new LatLng(-33.958320, 18.459919),
                        new LatLng(-33.958992, 18.459683),
                        new LatLng(-33.959089, 18.459423),
                        new LatLng(-33.959089, 18.459423),
                        new LatLng(-33.958393, 18.459676),
                        new LatLng(-33.958360, 18.459553)
                )
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));
        shapes.add(snape);

        PolygonOptions leslie_commerce = new PolygonOptions()
                .add(new LatLng(-33.958981, 18.459767),
                        new LatLng(-33.959059, 18.459993),
                        new LatLng(-33.959592, 18.459722),
                        new LatLng(-33.959520, 18.459497))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));
        shapes.add(leslie_commerce);

        PolygonOptions alex = new PolygonOptions()
                .add(new LatLng(-33.959778, 18.459802),
                        new LatLng(-33.959940, 18.460247),
                        new LatLng(-33.960257, 18.460065),
                        new LatLng(-33.960096, 18.459632))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));
        shapes.add(alex);

        PolygonOptions kaplan = new PolygonOptions()
                .add(new LatLng(-33.959811, 18.459365),
                        new LatLng(-33.959875, 18.459553),
                        new LatLng(-33.960068, 18.459453),
                        new LatLng(-33.960001, 18.459269))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));
        shapes.add(kaplan);

        PolygonOptions engineering = new PolygonOptions()
                .add(new LatLng(-33.958314, 18.459190),
                        new LatLng(-33.958367, 18.459458),
                        new LatLng(-33.959013, 18.459254),
                        new LatLng(-33.958948, 18.458974))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));
        shapes.add(engineering);

        PolygonOptions pd_pahn = new PolygonOptions()
                .add(new LatLng(-33.955429, 18.460238),
                        new LatLng(-33.955421, 18.460731),
                        new LatLng(-33.956447, 18.460738),
                        new LatLng(-33.956434, 18.460004),
                        new LatLng(-33.956079, 18.460011))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));
        shapes.add(pd_pahn);

        PolygonOptions hoeri = new PolygonOptions()
                .add(new LatLng(-33.956490, 18.459931),
                        new LatLng(-33.956518, 18.460327),
                        new LatLng(-33.956829, 18.460294),
                        new LatLng(-33.956872, 18.460168),
                        new LatLng(-33.956844, 18.459929))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));
        shapes.add(hoeri);

        PolygonOptions library = new PolygonOptions()
                .add(new LatLng(-33.957375, 18.460286),
                        new LatLng(-33.957409, 18.460528),
                        new LatLng(-33.957867, 18.460433),
                        new LatLng(-33.957909, 18.460682),
                        new LatLng(-33.958138, 18.460620),
                        new LatLng(-33.958057, 18.460148))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));
        shapes.add(library);

        PolygonOptions egs_building = new PolygonOptions()
                .add(new LatLng(-33.956994, 18.459729),
                        new LatLng(-33.957052, 18.460231),
                        new LatLng(-33.957371, 18.460193),
                        new LatLng(-33.957323, 18.459685))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));
        shapes.add(egs_building);

        return shapes;
    }

    //method that returns polygons with holes aka open spaces (still under construction)
    public ArrayList<PolygonOptions> getOutsideArea(List<PolygonOptions> buildings){
        ArrayList<PolygonOptions> outer = new ArrayList<>();

       /* PolygonOptions csc_outer = new PolygonOptions()
                .add(new LatLng(-33.956521, 18.460889),
                        new LatLng(-33.956567, 18.461397),
                        new LatLng(-33.956555, 18.461396),
                        new LatLng(-33.957137, 18.460821))
                .addHole(buildings.get(0).getPoints()).fillColor(Color.rgb(255, 178, 102)).strokeColor(Color.blue(1));

        outer.add(csc_outer);*/
        return outer;
    }

}