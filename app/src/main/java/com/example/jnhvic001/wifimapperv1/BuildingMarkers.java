package com.example.jnhvic001.wifimapperv1;

import android.graphics.Color;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.graphics.Color.rgb;

public class BuildingMarkers {

    private GoogleMap mMap;
    Map<String,PolygonOptions> mapper = new HashMap<>();

    public BuildingMarkers(GoogleMap mMap) {
        this.mMap = mMap;
    }

    public void drawPolygons() {

        PolygonOptions csc = new PolygonOptions()
                .add(new LatLng(-33.956551, 18.460927),
                        new LatLng(-33.956585, 18.461268),
                        new LatLng(-33.957137, 18.461209),
                        new LatLng(-33.957103, 18.460860))
                .fillColor(rgb(178,255,102))
                .strokeColor(Color.blue(1));

        Polygon csc2 = mMap.addPolygon(csc);
        csc2.setTag("Computer Science");

        mapper.put((String) csc2.getTag(),csc);
        addToDatabase();
    }

    public void addToDatabase() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Areas");

        List<Integer> list = new ArrayList<>();
        List<Date> list2 = new ArrayList<>();
        list.add(3);
        list2.add(Calendar.getInstance().getTime());

        for(Map.Entry<String,PolygonOptions> entry: mapper.entrySet()) {
            Building building = new Building(entry.getKey(),list,list2,list.size(),3);
            String id = myRef.push().getKey();
            myRef.child(id).setValue(building);
        }
    }

/*
    //arrayList of all the polygons of all the buildings
    public ArrayList<PolygonOptions> getPolygons(*/
/*List<Building> buildings*//*
){
        ArrayList<PolygonOptions> shapes = new ArrayList<>();

        shapes.add(csc);

        PolygonOptions stevebiko = new PolygonOptions()
                .add(new LatLng(-33.956667, 18.460479),
                        new LatLng(-33.956692, 18.460706),
                        new LatLng(-33.957075, 18.460658),
                        new LatLng(-33.957065, 18.460427))
                .*/
/*fillColor(buildings.get(0).getColor())*//*
fillColor(rgb(178,255,102))
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

        PolygonOptions outside_molecular = new PolygonOptions()
                .add(new LatLng(-33.955392, 18.460107),
                        new LatLng(-33.954675, 18.460135),
                        new LatLng(-33.954950, 18.461522),
                        new LatLng(-33.955640, 18.461546),
                        new LatLng(-33.955660, 18.460781),
                        new LatLng(-33.955407, 18.460482)
                )
                .addHole(buildings.get(13).getPoints())
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside_molecular);

        PolygonOptions outside1 = new PolygonOptions()
                .add(new LatLng(-33.955660, 18.460760),
                        new LatLng(-33.955667, 18.460945),
                        new LatLng(-33.956506, 18.460920),
                        new LatLng(-33.956494, 18.460768)
                )

                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside1);

        PolygonOptions outside2 = new PolygonOptions()
                .add(new LatLng(-33.955880, 18.460894),
                        new LatLng(-33.955878, 18.461398),
                        new LatLng(-33.955939, 18.461398),
                        new LatLng(-33.955922, 18.460887)
                )

                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside2);

        PolygonOptions outside3 = new PolygonOptions()
                .add(new LatLng(-33.955645, 18.461309),
                        new LatLng(-33.955643, 18.461550),
                        new LatLng(-33.955921, 18.461546),
                        new LatLng(-33.955895, 18.461301)
                )

                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside3);

        PolygonOptions outside4 = new PolygonOptions()
                .add(new LatLng(-33.954865, 18.461479),
                        new LatLng(-33.955214, 18.462143),
                        new LatLng(-33.955963, 18.462084),
                        new LatLng(-33.955962, 18.461841),
                        new LatLng(-33.955268, 18.461843),
                        new LatLng(-33.955261, 18.461454)
                )

                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside4);

        PolygonOptions outside5 = new PolygonOptions()
                .add(new LatLng(-33.955969, 18.461298),
                        new LatLng(-33.955965, 18.462020),
                        new LatLng(-33.956149, 18.462027),
                        new LatLng(-33.956112, 18.461291))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside5);
        PolygonOptions outside6 = new PolygonOptions()
                .add(new LatLng(-33.956112, 18.461291),
                        new LatLng(-33.956127, 18.461550),
                        new LatLng(-33.956783, 18.461507),
                        new LatLng(-33.956754, 18.461268))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside6);

        PolygonOptions outside7 = new PolygonOptions()
                .add(new LatLng(-33.956754, 18.461268),
                        new LatLng(-33.956820, 18.461925),
                        new LatLng(-33.957005, 18.461904),
                        new LatLng(-33.956958, 18.461234))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside7);

        PolygonOptions outside8 = new PolygonOptions()
                .add(new LatLng(-33.956958, 18.461234),
                        new LatLng(-33.956977, 18.461481),
                        new LatLng(-33.957263, 18.461431),
                        new LatLng(-33.957235, 18.461197))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside8);

        PolygonOptions outside9 = new PolygonOptions()
                .add(new LatLng(-33.957047, 18.460250),
                        new LatLng(-33.957145, 18.461208),
                        new LatLng(-33.957235, 18.461197),
                        new LatLng(-33.957089, 18.460241))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside9);

        PolygonOptions outside10 = new PolygonOptions()
                .add(new LatLng(-33.957233, 18.461195),
                        new LatLng(-33.957263, 18.461435),
                        new LatLng(-33.957756, 18.461331),
                        new LatLng(-33.957707, 18.461087))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside10);

        PolygonOptions outside11 = new PolygonOptions()
                .add(new LatLng(-33.957486, 18.461391),
                        new LatLng(-33.957534, 18.461759),
                        new LatLng(-33.958123, 18.461618),
                        new LatLng(-33.958034, 18.461225))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside11);

        PolygonOptions outside12 = new PolygonOptions()
                .add(new LatLng(-33.957435, 18.460952),
                        new LatLng(-33.957453, 18.461146),
                        new LatLng(-33.957707, 18.461124),
                        new LatLng(-33.957661, 18.460892))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside12);
        PolygonOptions outside13 = new PolygonOptions()
                .add(new LatLng(-33.957661, 18.460892),
                        new LatLng(-33.957788, 18.461557),
                        new LatLng(-33.958021, 18.461162),
                        new LatLng(-33.957935, 18.460806))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside13);

        PolygonOptions outside14 = new PolygonOptions()
                .add(new LatLng(-33.957976, 18.461029),
                        new LatLng(-33.958028, 18.461277),
                        new LatLng(-33.958364, 18.461181),
                        new LatLng(-33.958302, 18.460938))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside14);

        PolygonOptions outside15 = new PolygonOptions()
                .add(new LatLng(-33.958302, 18.460938),
                        new LatLng(-33.958352, 18.461184),
                        new LatLng(-33.958902, 18.460989),
                        new LatLng(-33.958842, 18.460760))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside15);

        PolygonOptions outside16 = new PolygonOptions()
                .add(new LatLng(-33.958541, 18.461106),
                        new LatLng(-33.958615, 18.461482),
                        new LatLng(-33.958800, 18.461425),
                        new LatLng(-33.958708, 18.461064))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside16);

        PolygonOptions outside17 = new PolygonOptions()
                .add(new LatLng(-33.958845, 18.460758),
                        new LatLng(-33.958899, 18.460996),
                        new LatLng(-33.959337, 18.460825),
                        new LatLng(-33.959275, 18.460550))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside17);

        PolygonOptions outside18 = new PolygonOptions()
                .add(new LatLng(-33.959264, 18.460860),
                        new LatLng(-33.959346, 18.461179),
                        new LatLng(-33.959541, 18.461114),
                        new LatLng(-33.959428, 18.460785))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside18);

        PolygonOptions outside19 = new PolygonOptions()
                .add(new LatLng(-33.959272, 18.460554),
                        new LatLng(-33.959336, 18.460818),
                        new LatLng(-33.960026, 18.460461),
                        new LatLng(-33.959922, 18.460223))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside19);

        PolygonOptions outside20 = new PolygonOptions()
                .add(new LatLng(-33.959937, 18.460250),
                        new LatLng(-33.960151, 18.460795),
                        new LatLng(-33.960418, 18.460430),
                        new LatLng(-33.960260, 18.460057))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside20);

        PolygonOptions outside21 = new PolygonOptions()
                .add(new LatLng(-33.960088, 18.459581),
                        new LatLng(-33.960394, 18.460460),
                        new LatLng(-33.960716, 18.459936),
                        new LatLng(-33.960415, 18.459421))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside21);

        PolygonOptions outside22 = new PolygonOptions()
                .add(new LatLng(-33.959883, 18.458979),
                        new LatLng(-33.960394, 18.460460),
                        new LatLng(-33.960439, 18.459440),
                        new LatLng(-33.960105, 18.458743))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside22);

        PolygonOptions outside23 = new PolygonOptions()
                .add(new LatLng(-33.958933, 18.458848),
                        new LatLng(-33.959053, 18.459421),
                        new LatLng(-33.959936, 18.459123),
                        new LatLng(-33.959329, 18.458753))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside23);

        PolygonOptions outside24 = new PolygonOptions()
                .add(new LatLng(-33.958281, 18.459039),
                        new LatLng(-33.958312, 18.459181),
                        new LatLng(-33.958957, 18.458966),
                        new LatLng(-33.958959, 18.458848))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside24);

        PolygonOptions outside25 = new PolygonOptions()
                .add(new LatLng(-33.958346, 18.459466),
                        new LatLng(-33.958391, 18.459675),
                        new LatLng(-33.959085, 18.459420),
                        new LatLng(-33.959013, 18.459252))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside25);

        PolygonOptions outside26 = new PolygonOptions()
                .add(new LatLng(-33.959091, 18.459421),
                        new LatLng(-33.958979, 18.459760),
                        new LatLng(-33.960022, 18.459249),
                        new LatLng(-33.959890, 18.459161))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside26);

        PolygonOptions outside27 = new PolygonOptions()
                .add(new LatLng(-33.959518, 18.459496),
                        new LatLng(-33.959825, 18.460409),
                        new LatLng(-33.959972, 18.460337),
                        new LatLng(-33.959625, 18.459309))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside27);

        PolygonOptions outside28 = new PolygonOptions()
                .add(new LatLng(-33.959625, 18.459309),
                        new LatLng(-33.959767, 18.459800),
                        new LatLng(-33.960118, 18.459607),
                        new LatLng(-33.960068, 18.459455),
                        new LatLng(-33.959874, 18.459553),
                        new LatLng(-33.959778, 18.459258)
                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside28);

        PolygonOptions outside29 = new PolygonOptions()
                .add(new LatLng(-33.958949, 18.460046),
                        new LatLng(-33.958974, 18.460145),
                        new LatLng(-33.959630, 18.459814),
                        new LatLng(-33.959598, 18.459722)

                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside29);

        PolygonOptions outside30 = new PolygonOptions()
                .add(new LatLng(-33.958974, 18.460145),
                        new LatLng(-33.959143, 18.460749),
                        new LatLng(-33.959283, 18.460682),
                        new LatLng(-33.959063, 18.460057)

                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside30);

        PolygonOptions outside31 = new PolygonOptions()
                .add(new LatLng(-33.958878, 18.459727),
                        new LatLng(-33.958974, 18.460145),
                        new LatLng(-33.959063, 18.460057),
                        new LatLng(-33.958964, 18.459698)

                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside31);

        PolygonOptions outside32 = new PolygonOptions()
                .add(new LatLng(-33.958030, 18.460036),
                        new LatLng(-33.958062, 18.460151),
                        new LatLng(-33.958912, 18.459883),
                        new LatLng(-33.958878, 18.459727)

                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside32);

        PolygonOptions outside33 = new PolygonOptions()
                .add(new LatLng(-33.958061, 18.460150),
                        new LatLng(-33.958147, 18.460632),
                        new LatLng(-33.958818, 18.460402),
                        new LatLng(-33.958806, 18.460348),
                        new LatLng(-33.959011, 18.460269),
                        new LatLng(-33.958953, 18.460070),
                        new LatLng(-33.958440, 18.460232),
                        new LatLng(-33.958391, 18.460012)
                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside33);

        PolygonOptions outside34 = new PolygonOptions()
                .add(new LatLng(-33.958762, 18.460423),
                        new LatLng(-33.958841, 18.460760),
                        new LatLng(-33.958897, 18.460747),
                        new LatLng(-33.958804, 18.460348)

                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside34);


        PolygonOptions outside35 = new PolygonOptions()
                .add(new LatLng(-33.958143, 18.460629),
                        new LatLng(-33.958199, 18.460967),
                        new LatLng(-33.958305, 18.460943),
                        new LatLng(-33.958229, 18.460601)

                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside35);

        PolygonOptions outside36 = new PolygonOptions()
                .add(new LatLng(-33.957732, 18.460460),
                        new LatLng(-33.957801, 18.460850),
                        new LatLng(-33.957936, 18.460816),
                        new LatLng(-33.957868, 18.460433)

                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside36);

        PolygonOptions outside37 = new PolygonOptions()
                .add(new LatLng(-33.957344, 18.460545),
                        new LatLng(-33.957389, 18.460824),
                        new LatLng(-33.957537, 18.460772),
                        new LatLng(-33.957500, 18.460548),
                        new LatLng(-33.957736, 18.460485),
                        new LatLng(-33.957732, 18.460462)

                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside37);

        PolygonOptions outside38 = new PolygonOptions()
                .add(new LatLng(-33.957415, 18.460821),
                        new LatLng(-33.957439, 18.461010),
                        new LatLng(-33.957764, 18.460889),
                        new LatLng(-33.957557, 18.460910),
                        new LatLng(-33.957526, 18.460744)

                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside38);

        PolygonOptions outside39 = new PolygonOptions()
                .add(new LatLng(-33.956424, 18.459842),
                        new LatLng(-33.956448, 18.460786),
                        new LatLng(-33.956551, 18.460920),
                        new LatLng(-33.956793, 18.460891),
                        new LatLng(-33.956774, 18.460711),
                        new LatLng(-33.956680, 18.460712),
                        new LatLng(-33.956646, 18.460318),
                        new LatLng(-33.956517, 18.460327),
                        new LatLng(-33.956467, 18.459832)
                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside39);

        PolygonOptions outside40 = new PolygonOptions()
                .add(new LatLng(-33.956467, 18.459832),
                        new LatLng(-33.956479, 18.459924),
                        new LatLng(-33.956842, 18.459940),
                        new LatLng(-33.956880, 18.460284),
                        new LatLng(-33.956646, 18.460316),
                        new LatLng(-33.956661, 18.460472),
                        new LatLng(-33.957065, 18.460421),
                        new LatLng(-33.956981, 18.459630)

                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside40);

        PolygonOptions outside41 = new PolygonOptions()
                .add(new LatLng(-33.957087, 18.460239),
                        new LatLng(-33.957112, 18.460392),
                        new LatLng(-33.957314, 18.460336),
                        new LatLng(-33.957342, 18.460546),
                        new LatLng(-33.957407, 18.460531),
                        new LatLng(-33.957375, 18.460285),
                        new LatLng(-33.958056, 18.460146),
                        new LatLng(-33.958032, 18.460044)

                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside41);

        PolygonOptions outside42 = new PolygonOptions()
                .add(new LatLng(-33.956974, 18.459600),
                        new LatLng(-33.956993, 18.459731),
                        new LatLng(-33.957327, 18.459670),
                        new LatLng(-33.957388, 18.460184),
                        new LatLng(-33.958316, 18.459910),
                        new LatLng(-33.958130, 18.459177)
                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside42);

        PolygonOptions outside43 = new PolygonOptions()
                .add(new LatLng(-33.958126, 18.459154),
                        new LatLng(-33.958228, 18.459587),
                        new LatLng(-33.958386, 18.459539),
                        new LatLng(-33.958291, 18.459103)
                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        outer.add(outside43);

        return outer;


    }
*/

}