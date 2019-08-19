package com.destiny.motoraksesoris.Model;

import com.destiny.motoraksesoris.R;

import java.util.ArrayList;

public class MrClassicModel {
    public static String[][] data = new String[][]{
            {String.valueOf(R.drawable.spionretrokotak),
                    "Spion Retro Kotak Fleksibel Hitam",
                    "RP.75.000",
            },
            {String.valueOf(R.drawable.spionretrobulat),
                    "Spion Retro Bulat",
                    "RP.65.000",
            },
            {String.valueOf(R.drawable.seinbesilancip),
                    "Sein Besi Lancip Set Breket Ch Led",
                    "RP.90.0000",
            },
            {String.valueOf(R.drawable.stoplamptriump),
                    "Stop Lamp Triump Set Pangkon Plat No",
                    "RP.100.000",
            },
            {String.valueOf(R.drawable.winshieldbebekan),
                    "Winshield Bebekan",
                    "RP.120.000",
            },
            {String.valueOf(R.drawable.headlampgrill),
                    "Headlamp Grill",
                    "RP.170.000",
            },
            {String.valueOf(R.drawable.headlampgrillhitamkotak),
                    "Head Lamp Grill Hitam Kotak",
                    "RP.170.000",
            },
            {
                String.valueOf(R.drawable.headlampscudulirgrillledgold),
                    "Head Lamp Grill Gold Kotak",
                    "RP.190.000"
            }

    };
    public static ArrayList<Model> getListData(){
        Model models = null;
        ArrayList<Model> list = new ArrayList<>();
        for (String[] aData : data) {
            models = new Model();
            models.setGambar(aData[0]);
            models.setNama(aData[1]);
            models.setHarga(aData[2]);
            list.add(models);
        }
        return list;
    }
}

