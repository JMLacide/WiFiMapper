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

    protected Map<String,PolygonOptions> mapper = new HashMap<>();
    private GoogleMap mMap;

    public BuildingMarkers(GoogleMap mMap) {
        this.mMap = mMap;
    }

    public Map<String,PolygonOptions> getHashMap() { return mapper; }

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

        PolygonOptions stevebiko = new PolygonOptions()
                .add(new LatLng(-33.956667, 18.460479),
                        new LatLng(-33.956692, 18.460706),
                        new LatLng(-33.957075, 18.460658),
                        new LatLng(-33.957065, 18.460427))
                .fillColor(rgb(178,255,102))
                .strokeColor(Color.blue(1));

        Polygon sb = mMap.addPolygon(stevebiko);
        sb.setTag("Steve Biko");
        mapper.put((String) sb.getTag(),stevebiko);

        PolygonOptions math = new PolygonOptions()
                .add(new LatLng(-33.956981, 18.461489),
                        new LatLng(-33.957016, 18.461770),
                        new LatLng(-33.957517, 18.461685),
                        new LatLng(-33.957481, 18.461397))
                .fillColor(rgb(178,255,102))
                .strokeColor(Color.blue(1));

        Polygon math2 = mMap.addPolygon(math);
        math2.setTag("Maths Building");
        mapper.put((String) math2.getTag(),math);

        PolygonOptions ac_jordan = new PolygonOptions()
                .add(new LatLng(-33.958053, 18.461277),
                        new LatLng(-33.958109, 18.461556),
                        new LatLng(-33.958593, 18.461406),
                        new LatLng(-33.958538, 18.461135))
                .fillColor(rgb(255,178,102))
                .strokeColor(Color.blue(1));

        Polygon ac_jordan2 = mMap.addPolygon(ac_jordan);
        ac_jordan2.setTag("AC Jordan");
        mapper.put((String) ac_jordan2.getTag(),ac_jordan);

        PolygonOptions jagger_library = new PolygonOptions()
                .add(new LatLng(-33.957922, 18.460712),
                        new LatLng(-33.957977, 18.461027),
                        new LatLng(-33.958195, 18.460958),
                        new LatLng(-33.958144, 18.460641))
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));

        Polygon jagger = mMap.addPolygon(jagger_library);
        jagger.setTag("Jagger Library");
        mapper.put((String) jagger.getTag(),jagger_library);

        PolygonOptions cissy_gool_mall = new PolygonOptions()
                .add(new LatLng(-33.956777, 18.460736),
                        new LatLng(-33.956790, 18.460873),
                        new LatLng(-33.957069, 18.460849),
                        new LatLng(-33.957056, 18.460708))
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));

        Polygon cissy_gool_mall2 = mMap.addPolygon(cissy_gool_mall);
        cissy_gool_mall2.setTag("Cissy Gool Mall");
        mapper.put((String) cissy_gool_mall2.getTag(),cissy_gool_mall);

        PolygonOptions molly_blackburn2 = new PolygonOptions()
                .add(new LatLng(-33.957106, 18.460362),
                        new LatLng(-33.957169, 18.460863),
                        new LatLng(-33.957381, 18.460816),
                        new LatLng(-33.957326, 18.460331))
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));

        Polygon molly2 = mMap.addPolygon(molly_blackburn2);
        molly2.setTag("Molly Blackburn 2");
        mapper.put((String) molly2.getTag(),molly_blackburn2);

        PolygonOptions molly_blackburn = new PolygonOptions()
                .add(new LatLng(-33.957188, 18.460867),
                        new LatLng(-33.957232, 18.461190),
                        new LatLng(-33.957455, 18.461150),
                        new LatLng(-33.957411, 18.460815))
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));

        Polygon molly = mMap.addPolygon(molly_blackburn);
        molly.setTag("Molly Blackburn");
        mapper.put((String) molly.getTag(),molly_blackburn);

        PolygonOptions memorial_hall = new PolygonOptions()
                .add(new LatLng(-33.957501, 18.460549),
                        new LatLng(-33.957564, 18.460888),
                        new LatLng(-33.957800, 18.460850),
                        new LatLng(-33.957736, 18.460488))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));

        Polygon memorial = mMap.addPolygon(memorial_hall);
        memorial.setTag("Memorial Hall");
        mapper.put((String) memorial.getTag(),memorial_hall);

        PolygonOptions botany = new PolygonOptions()
                .add(new LatLng(-33.956129, 18.461560),
                        new LatLng(-33.956141, 18.461836),
                        new LatLng(-33.956796, 18.461778),
                        new LatLng(-33.956783, 18.461521))
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));

        Polygon botany2 = mMap.addPolygon(botany);
        botany2.setTag("Botany");
        mapper.put((String) botany2.getTag(),botany);

        PolygonOptions zoology = new PolygonOptions()
                .add(new LatLng(-33.955929, 18.460946),
                        new LatLng(-33.955926, 18.461284),
                        new LatLng(-33.956532, 18.461260),
                        new LatLng(-33.956514, 18.460943))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));

        Polygon zoo = mMap.addPolygon(zoology);
        zoo.setTag("Zoology");
        mapper.put((String) zoo.getTag(),zoology);

        PolygonOptions rw_james = new PolygonOptions()
                .add(new LatLng(-33.955274, 18.461557),
                        new LatLng(-33.955270, 18.461838),
                        new LatLng(-33.955963, 18.461838),
                        new LatLng(-33.955961, 18.461559))
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));

        Polygon rw = mMap.addPolygon(rw_james);
        rw.setTag("RW James");
        mapper.put((String) rw.getTag(),rw_james);

        PolygonOptions chris_hani = new PolygonOptions()
                .add(new LatLng(-33.955666, 18.460962),
                        new LatLng(-33.955670, 18.461297),
                        new LatLng(-33.955877, 18.461302),
                        new LatLng(-33.955875, 18.460951))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));

        Polygon ch = mMap.addPolygon(chris_hani);
        ch.setTag("Chris Hani");
        mapper.put((String) ch.getTag(),chris_hani);

        PolygonOptions molecularbiology = new PolygonOptions()
                .add(new LatLng(-33.955139, 18.460789),
                        new LatLng(-33.955132, 18.461031),
                        new LatLng(-33.954972, 18.461025),
                        new LatLng(-33.954973, 18.461292),
                        new LatLng(-33.955630, 18.461302),
                        new LatLng(-33.955637, 18.460802))
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));

        Polygon mol = mMap.addPolygon(molecularbiology);
        mol.setTag("Molecular Biology");
        mapper.put((String) mol.getTag(),molecularbiology);

        PolygonOptions beatie = new PolygonOptions()
                .add(new LatLng(-33.958714, 18.461069),
                        new LatLng(-33.958784, 18.461343),
                        new LatLng(-33.959334, 18.461141),
                        new LatLng(-33.959262, 18.460865))
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));

        Polygon bt = mMap.addPolygon(beatie);
        bt.setTag("Beatie");
        mapper.put((String) bt.getTag(),beatie);

        PolygonOptions architecture_building = new PolygonOptions()
                .add(new LatLng(-33.959437, 18.460787),
                        new LatLng(-33.959526, 18.461058),
                        new LatLng(-33.960131, 18.460757),
                        new LatLng(-33.960039, 18.460486))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));

        Polygon ab = mMap.addPolygon(architecture_building);
        ab.setTag("Architecture Building");
        mapper.put((String) ab.getTag(),architecture_building);

        PolygonOptions leslie_social = new PolygonOptions()
                .add(new LatLng(-33.959093, 18.460094),
                        new LatLng(-33.959249, 18.460558),
                        new LatLng(-33.959791, 18.460289),
                        new LatLng(-33.959631, 18.459816))
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));

        Polygon ls = mMap.addPolygon(leslie_social);
        ls.setTag("Leslie Social");
        mapper.put((String) ls.getTag(),leslie_social);

        PolygonOptions geo_building = new PolygonOptions()
                .add(new LatLng(-33.958809, 18.460349),
                        new LatLng(-33.958897, 18.460720),
                        new LatLng(-33.959113, 18.460638),
                        new LatLng(-33.959012, 18.460269))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));

        Polygon gb = mMap.addPolygon(geo_building);
        gb.setTag("Geo Building");
        mapper.put((String) gb.getTag(),geo_building);

        PolygonOptions EM_building = new PolygonOptions()
                .add(new LatLng(-33.958230, 18.460603),
                        new LatLng(-33.958308, 18.460941),
                        new LatLng(-33.958840, 18.460760),
                        new LatLng(-33.958764, 18.460423))
                .fillColor(rgb(192,192,192))
                .strokeColor(Color.blue(1));

        Polygon em = mMap.addPolygon(EM_building);
        em.setTag("EM Building");
        mapper.put((String) em.getTag(),EM_building);

        PolygonOptions menzies = new PolygonOptions()
                .add(new LatLng(-33.958404, 18.460061),
                        new LatLng(-33.958439, 18.460229),
                        new LatLng(-33.958953, 18.460071),
                        new LatLng(-33.958912, 18.459883))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));

        Polygon me = mMap.addPolygon(menzies);
        me.setTag("Menzies");
        mapper.put((String) me.getTag(),menzies);

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

        Polygon sn = mMap.addPolygon(snape);
        sn.setTag("Snape");
        mapper.put((String) sn.getTag(),snape);

        PolygonOptions leslie_commerce = new PolygonOptions()
                .add(new LatLng(-33.958981, 18.459767),
                        new LatLng(-33.959059, 18.459993),
                        new LatLng(-33.959592, 18.459722),
                        new LatLng(-33.959520, 18.459497))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));

        Polygon lc = mMap.addPolygon(leslie_commerce);
        lc.setTag("Leslie Commerce");
        mapper.put((String) lc.getTag(),leslie_commerce);

        PolygonOptions alex = new PolygonOptions()
                .add(new LatLng(-33.959778, 18.459802),
                        new LatLng(-33.959940, 18.460247),
                        new LatLng(-33.960257, 18.460065),
                        new LatLng(-33.960096, 18.459632))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));

        Polygon al = mMap.addPolygon(alex);
        al.setTag("Alex");
        mapper.put((String) al.getTag(),alex);

        PolygonOptions kaplan = new PolygonOptions()
                .add(new LatLng(-33.959811, 18.459365),
                        new LatLng(-33.959875, 18.459553),
                        new LatLng(-33.960068, 18.459453),
                        new LatLng(-33.960001, 18.459269))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));

        Polygon kp = mMap.addPolygon(kaplan);
        kp.setTag("Kaplan");
        mapper.put((String) kp.getTag(),kaplan);

        PolygonOptions engineering = new PolygonOptions()
                .add(new LatLng(-33.958314, 18.459190),
                        new LatLng(-33.958367, 18.459458),
                        new LatLng(-33.959013, 18.459254),
                        new LatLng(-33.958948, 18.458974))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));

        Polygon en = mMap.addPolygon(engineering);
        en.setTag("Engineering");
        mapper.put((String) en.getTag(),engineering);

        PolygonOptions pd_pahn = new PolygonOptions()
                .add(new LatLng(-33.955429, 18.460238),
                        new LatLng(-33.955421, 18.460731),
                        new LatLng(-33.956447, 18.460738),
                        new LatLng(-33.956434, 18.460004),
                        new LatLng(-33.956079, 18.460011))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));

        Polygon pd = mMap.addPolygon(pd_pahn);
        pd.setTag("PD Hahn");
        mapper.put((String) pd.getTag(),pd_pahn);

        PolygonOptions hoeri = new PolygonOptions()
                .add(new LatLng(-33.956490, 18.459931),
                        new LatLng(-33.956518, 18.460327),
                        new LatLng(-33.956829, 18.460294),
                        new LatLng(-33.956872, 18.460168),
                        new LatLng(-33.956844, 18.459929))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));

        Polygon ho = mMap.addPolygon(hoeri);
        ho.setTag("Hoeri");
        mapper.put((String) ho.getTag(),hoeri);

        PolygonOptions library = new PolygonOptions()
                .add(new LatLng(-33.957375, 18.460286),
                        new LatLng(-33.957409, 18.460528),
                        new LatLng(-33.957867, 18.460433),
                        new LatLng(-33.957909, 18.460682),
                        new LatLng(-33.958138, 18.460620),
                        new LatLng(-33.958057, 18.460148))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));

        Polygon li = mMap.addPolygon(library);
        li.setTag("Library");
        mapper.put((String) li.getTag(),library);

        PolygonOptions egs_building = new PolygonOptions()
                .add(new LatLng(-33.956994, 18.459729),
                        new LatLng(-33.957052, 18.460231),
                        new LatLng(-33.957371, 18.460193),
                        new LatLng(-33.957323, 18.459685))
                .fillColor(rgb(255,255,0))
                .strokeColor(Color.blue(1));

        Polygon egs = mMap.addPolygon(egs_building);
        egs.setTag("EGS");
        mapper.put((String) egs.getTag(),egs_building);

        PolygonOptions outside_molecular = new PolygonOptions()
                .add(new LatLng(-33.955392, 18.460107),
                        new LatLng(-33.954675, 18.460135),
                        new LatLng(-33.954950, 18.461522),
                        new LatLng(-33.955640, 18.461546),
                        new LatLng(-33.955660, 18.460781),
                        new LatLng(-33.955407, 18.460482)
                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out = mMap.addPolygon(outside_molecular);
        out.setTag("Outside Molecular");
        mapper.put((String) out.getTag(),outside_molecular);

        PolygonOptions outside1 = new PolygonOptions()
                .add(new LatLng(-33.955660, 18.460760),
                        new LatLng(-33.955667, 18.460945),
                        new LatLng(-33.956506, 18.460920),
                        new LatLng(-33.956494, 18.460768)
                )

                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out1 = mMap.addPolygon(outside1);
        out1.setTag("Outside 01");
        mapper.put((String) out1.getTag(),outside1);

        PolygonOptions outside2 = new PolygonOptions()
                .add(new LatLng(-33.955880, 18.460894),
                        new LatLng(-33.955878, 18.461398),
                        new LatLng(-33.955939, 18.461398),
                        new LatLng(-33.955922, 18.460887)
                )

                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out2 = mMap.addPolygon(outside2);
        out2.setTag("Outside 02");
        mapper.put((String) out2.getTag(),outside2);

        PolygonOptions outside3 = new PolygonOptions()
                .add(new LatLng(-33.955645, 18.461309),
                        new LatLng(-33.955643, 18.461550),
                        new LatLng(-33.955921, 18.461546),
                        new LatLng(-33.955895, 18.461301)
                )

                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out3 = mMap.addPolygon(outside3);
        out3.setTag("Outside 03");
        mapper.put((String) out3.getTag(),outside3);

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

        Polygon out4 = mMap.addPolygon(outside4);
        out4.setTag("Outside 04");
        mapper.put((String) out4.getTag(),outside4);

        PolygonOptions outside5 = new PolygonOptions()
                .add(new LatLng(-33.955969, 18.461298),
                        new LatLng(-33.955965, 18.462020),
                        new LatLng(-33.956149, 18.462027),
                        new LatLng(-33.956112, 18.461291))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out5 = mMap.addPolygon(outside5);
        out5.setTag("Outside 05");
        mapper.put((String) out5.getTag(),outside5);

        PolygonOptions outside6 = new PolygonOptions()
                .add(new LatLng(-33.956112, 18.461291),
                        new LatLng(-33.956127, 18.461550),
                        new LatLng(-33.956783, 18.461507),
                        new LatLng(-33.956754, 18.461268))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        Polygon out6 = mMap.addPolygon(outside6);
        out6.setTag("Outside 06");
        mapper.put((String) out6.getTag(),outside6);

        PolygonOptions outside7 = new PolygonOptions()
                .add(new LatLng(-33.956754, 18.461268),
                        new LatLng(-33.956820, 18.461925),
                        new LatLng(-33.957005, 18.461904),
                        new LatLng(-33.956958, 18.461234))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out7 = mMap.addPolygon(outside7);
        out7.setTag("Outside 07");
        mapper.put((String) out7.getTag(),outside7);

        PolygonOptions outside8 = new PolygonOptions()
                .add(new LatLng(-33.956958, 18.461234),
                        new LatLng(-33.956977, 18.461481),
                        new LatLng(-33.957263, 18.461431),
                        new LatLng(-33.957235, 18.461197))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        Polygon out8 = mMap.addPolygon(outside8);
        out8.setTag("Outside 08");
        mapper.put((String) out8.getTag(),outside8);

        PolygonOptions outside9 = new PolygonOptions()
                .add(new LatLng(-33.957047, 18.460250),
                        new LatLng(-33.957145, 18.461208),
                        new LatLng(-33.957235, 18.461197),
                        new LatLng(-33.957089, 18.460241))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out9 = mMap.addPolygon(outside9);
        out9.setTag("Outside 09");
        mapper.put((String) out9.getTag(),outside9);

        PolygonOptions outside10 = new PolygonOptions()
                .add(new LatLng(-33.957233, 18.461195),
                        new LatLng(-33.957263, 18.461435),
                        new LatLng(-33.957756, 18.461331),
                        new LatLng(-33.957707, 18.461087))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out10 = mMap.addPolygon(outside10);
        out10.setTag("Outside 10");
        mapper.put((String) out10.getTag(),outside10);

        PolygonOptions outside11 = new PolygonOptions()
                .add(new LatLng(-33.957486, 18.461391),
                        new LatLng(-33.957534, 18.461759),
                        new LatLng(-33.958123, 18.461618),
                        new LatLng(-33.958034, 18.461225))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out11 = mMap.addPolygon(outside11);
        out11.setTag("Outside 11");
        mapper.put((String) out11.getTag(),outside11);

        PolygonOptions outside12 = new PolygonOptions()
                .add(new LatLng(-33.957435, 18.460952),
                        new LatLng(-33.957453, 18.461146),
                        new LatLng(-33.957707, 18.461124),
                        new LatLng(-33.957661, 18.460892))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out12 = mMap.addPolygon(outside12);
        out12.setTag("Outside 12");
        mapper.put((String) out12.getTag(),outside12);

        PolygonOptions outside13 = new PolygonOptions()
                .add(new LatLng(-33.957661, 18.460892),
                        new LatLng(-33.957788, 18.461557),
                        new LatLng(-33.958021, 18.461162),
                        new LatLng(-33.957935, 18.460806))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out13 = mMap.addPolygon(outside13);
        out13.setTag("Outside 13");
        mapper.put((String) out13.getTag(),outside13);

        PolygonOptions outside14 = new PolygonOptions()
                .add(new LatLng(-33.957976, 18.461029),
                        new LatLng(-33.958028, 18.461277),
                        new LatLng(-33.958364, 18.461181),
                        new LatLng(-33.958302, 18.460938))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        Polygon out14 = mMap.addPolygon(outside14);
        out14.setTag("Outside 14");
        mapper.put((String) out14.getTag(),outside14);

        PolygonOptions outside15 = new PolygonOptions()
                .add(new LatLng(-33.958302, 18.460938),
                        new LatLng(-33.958352, 18.461184),
                        new LatLng(-33.958902, 18.460989),
                        new LatLng(-33.958842, 18.460760))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out15 = mMap.addPolygon(outside15);
        out15.setTag("Outside 15");
        mapper.put((String) out15.getTag(),outside15);

        PolygonOptions outside16 = new PolygonOptions()
                .add(new LatLng(-33.958541, 18.461106),
                        new LatLng(-33.958615, 18.461482),
                        new LatLng(-33.958800, 18.461425),
                        new LatLng(-33.958708, 18.461064))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out16 = mMap.addPolygon(outside16);
        out16.setTag("Outside 16");
        mapper.put((String) out16.getTag(),outside16);

        PolygonOptions outside17 = new PolygonOptions()
                .add(new LatLng(-33.958845, 18.460758),
                        new LatLng(-33.958899, 18.460996),
                        new LatLng(-33.959337, 18.460825),
                        new LatLng(-33.959275, 18.460550))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out17 = mMap.addPolygon(outside17);
        out17.setTag("Outside 17");
        mapper.put((String) out17.getTag(),outside17);

        PolygonOptions outside18 = new PolygonOptions()
                .add(new LatLng(-33.959264, 18.460860),
                        new LatLng(-33.959346, 18.461179),
                        new LatLng(-33.959541, 18.461114),
                        new LatLng(-33.959428, 18.460785))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        Polygon out18 = mMap.addPolygon(outside18);
        out18.setTag("Outside 18");
        mapper.put((String) out18.getTag(),outside18);

        PolygonOptions outside19 = new PolygonOptions()
                .add(new LatLng(-33.959272, 18.460554),
                        new LatLng(-33.959336, 18.460818),
                        new LatLng(-33.960026, 18.460461),
                        new LatLng(-33.959922, 18.460223))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        Polygon out19 = mMap.addPolygon(outside19);
        out19.setTag("Outside 19");
        mapper.put((String) out19.getTag(),outside19);

        PolygonOptions outside20 = new PolygonOptions()
                .add(new LatLng(-33.959937, 18.460250),
                        new LatLng(-33.960151, 18.460795),
                        new LatLng(-33.960418, 18.460430),
                        new LatLng(-33.960260, 18.460057))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out20 = mMap.addPolygon(outside20);
        out20.setTag("Outside 20");
        mapper.put((String) out20.getTag(),outside20);

        PolygonOptions outside21 = new PolygonOptions()
                .add(new LatLng(-33.960088, 18.459581),
                        new LatLng(-33.960394, 18.460460),
                        new LatLng(-33.960716, 18.459936),
                        new LatLng(-33.960415, 18.459421))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        Polygon out21 = mMap.addPolygon(outside21);
        out21.setTag("Outside 21");
        mapper.put((String) out21.getTag(),outside21);

        PolygonOptions outside22 = new PolygonOptions()
                .add(new LatLng(-33.959883, 18.458979),
                        new LatLng(-33.960394, 18.460460),
                        new LatLng(-33.960439, 18.459440),
                        new LatLng(-33.960105, 18.458743))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        Polygon out22 = mMap.addPolygon(outside22);
        out22.setTag("Outside 22");
        mapper.put((String) out22.getTag(),outside22);

        PolygonOptions outside23 = new PolygonOptions()
                .add(new LatLng(-33.958933, 18.458848),
                        new LatLng(-33.959053, 18.459421),
                        new LatLng(-33.959936, 18.459123),
                        new LatLng(-33.959329, 18.458753))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out23 = mMap.addPolygon(outside23);
        out23.setTag("Outside 23");
        mapper.put((String) out23.getTag(),outside23);

        PolygonOptions outside24 = new PolygonOptions()
                .add(new LatLng(-33.958281, 18.459039),
                        new LatLng(-33.958312, 18.459181),
                        new LatLng(-33.958957, 18.458966),
                        new LatLng(-33.958959, 18.458848))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out24 = mMap.addPolygon(outside24);
        out24.setTag("Outside 24");
        mapper.put((String) out24.getTag(),outside24);

        PolygonOptions outside25 = new PolygonOptions()
                .add(new LatLng(-33.958346, 18.459466),
                        new LatLng(-33.958391, 18.459675),
                        new LatLng(-33.959085, 18.459420),
                        new LatLng(-33.959013, 18.459252))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out25 = mMap.addPolygon(outside25);
        out25.setTag("Outside 25");
        mapper.put((String) out25.getTag(),outside25);

        PolygonOptions outside26 = new PolygonOptions()
                .add(new LatLng(-33.959091, 18.459421),
                        new LatLng(-33.958979, 18.459760),
                        new LatLng(-33.960022, 18.459249),
                        new LatLng(-33.959890, 18.459161))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out26 = mMap.addPolygon(outside26);
        out26.setTag("Outside 26");
        mapper.put((String) out26.getTag(),outside26);

        PolygonOptions outside27 = new PolygonOptions()
                .add(new LatLng(-33.959518, 18.459496),
                        new LatLng(-33.959825, 18.460409),
                        new LatLng(-33.959972, 18.460337),
                        new LatLng(-33.959625, 18.459309))
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        Polygon out27 = mMap.addPolygon(outside27);
        out27.setTag("Outside 27");
        mapper.put((String) out27.getTag(),outside27);

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

        Polygon out28 = mMap.addPolygon(outside28);
        out28.setTag("Outside 28");
        mapper.put((String) out28.getTag(),outside28);

        PolygonOptions outside29 = new PolygonOptions()
                .add(new LatLng(-33.958949, 18.460046),
                        new LatLng(-33.958974, 18.460145),
                        new LatLng(-33.959630, 18.459814),
                        new LatLng(-33.959598, 18.459722)

                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out29 = mMap.addPolygon(outside29);
        out29.setTag("Outside 29");
        mapper.put((String) out29.getTag(),outside29);

        PolygonOptions outside30 = new PolygonOptions()
                .add(new LatLng(-33.958974, 18.460145),
                        new LatLng(-33.959143, 18.460749),
                        new LatLng(-33.959283, 18.460682),
                        new LatLng(-33.959063, 18.460057)

                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out30 = mMap.addPolygon(outside30);
        out30.setTag("Outside 30");
        mapper.put((String) out30.getTag(),outside30);

        PolygonOptions outside31 = new PolygonOptions()
                .add(new LatLng(-33.958878, 18.459727),
                        new LatLng(-33.958974, 18.460145),
                        new LatLng(-33.959063, 18.460057),
                        new LatLng(-33.958964, 18.459698)

                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out31 = mMap.addPolygon(outside31);
        out31.setTag("Outside 31");
        mapper.put((String) out31.getTag(),outside31);

        PolygonOptions outside32 = new PolygonOptions()
                .add(new LatLng(-33.958030, 18.460036),
                        new LatLng(-33.958062, 18.460151),
                        new LatLng(-33.958912, 18.459883),
                        new LatLng(-33.958878, 18.459727)

                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out32 = mMap.addPolygon(outside32);
        out32.setTag("Outside 32");
        mapper.put((String) out32.getTag(),outside32);

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

        Polygon out33 = mMap.addPolygon(outside33);
        out33.setTag("Outside 33");
        mapper.put((String) out33.getTag(),outside33);

        PolygonOptions outside34 = new PolygonOptions()
                .add(new LatLng(-33.958762, 18.460423),
                        new LatLng(-33.958841, 18.460760),
                        new LatLng(-33.958897, 18.460747),
                        new LatLng(-33.958804, 18.460348)

                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out34 = mMap.addPolygon(outside34);
        out34.setTag("Outside 34");
        mapper.put((String) out34.getTag(),outside34);

        PolygonOptions outside35 = new PolygonOptions()
                .add(new LatLng(-33.958143, 18.460629),
                        new LatLng(-33.958199, 18.460967),
                        new LatLng(-33.958305, 18.460943),
                        new LatLng(-33.958229, 18.460601)

                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out35 = mMap.addPolygon(outside35);
        out35.setTag("Outside 35");
        mapper.put((String) out35.getTag(),outside35);

        PolygonOptions outside36 = new PolygonOptions()
                .add(new LatLng(-33.957732, 18.460460),
                        new LatLng(-33.957801, 18.460850),
                        new LatLng(-33.957936, 18.460816),
                        new LatLng(-33.957868, 18.460433)

                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out36 = mMap.addPolygon(outside36);
        out36.setTag("Outside 36");
        mapper.put((String) out36.getTag(),outside36);

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

        Polygon out37 = mMap.addPolygon(outside37);
        out37.setTag("Outside 37");
        mapper.put((String) out37.getTag(),outside37);

        PolygonOptions outside38 = new PolygonOptions()
                .add(new LatLng(-33.957415, 18.460821),
                        new LatLng(-33.957439, 18.461010),
                        new LatLng(-33.957764, 18.460889),
                        new LatLng(-33.957557, 18.460910),
                        new LatLng(-33.957526, 18.460744)

                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));

        Polygon out38 = mMap.addPolygon(outside38);
        out38.setTag("Outside 38");
        mapper.put((String) out38.getTag(),outside38);

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

        Polygon out39 = mMap.addPolygon(outside39);
        out39.setTag("Outside 39");
        mapper.put((String) out39.getTag(),outside39);

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

        Polygon out40 = mMap.addPolygon(outside40);
        out40.setTag("Outside 40");
        mapper.put((String) out40.getTag(),outside40);

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

        Polygon out41 = mMap.addPolygon(outside41);
        out41.setTag("Outside 41");
        mapper.put((String) out41.getTag(),outside41);

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
        Polygon out42 = mMap.addPolygon(outside42);
        out42.setTag("Outside 42");
        mapper.put((String) out42.getTag(),outside42);

        PolygonOptions outside43 = new PolygonOptions()
                .add(new LatLng(-33.958126, 18.459154),
                        new LatLng(-33.958228, 18.459587),
                        new LatLng(-33.958386, 18.459539),
                        new LatLng(-33.958291, 18.459103)
                )
                .fillColor(rgb(255,200,0))
                .strokeColor(Color.blue(1));
        Polygon out43 = mMap.addPolygon(outside43);
        out43.setTag("Outside 43");
        mapper.put((String) out43.getTag(),outside43);

        createDatabase();
    }

    public void createDatabase() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Areas");

        List<Integer> listInt = new ArrayList<>();
        List<Date> listDate = new ArrayList<>();

        for(Map.Entry<String,PolygonOptions> entry: mapper.entrySet()) {
            Building building = new Building(entry.getKey(),listInt,listDate,0,0);
            String id = myRef.push().getKey();
            myRef.child(entry.getKey()).setValue(building);
        }
    }
}