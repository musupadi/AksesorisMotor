package com.destiny.motoraksesoris.Model;

import com.destiny.motoraksesoris.R;

import java.util.ArrayList;

public class TokoModel {
    public static String[][] data = new String[][]{
            {String.valueOf(R.drawable.mrclassic),
                    "MR Classic TB",
                    "0812-1020-0037",
                    "No.70, Jl. Raya Lenteng Agung, RT.5/RW.2, Lenteng Agung, Kec. Jagakarsa, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12530",
                    String.valueOf(R.raw.mrclassictb)
            },
            {String.valueOf(R.drawable.lapakantik),
                    "Lapak Antik",
                    "0857-1137-5135",
                    "Jl. Raya Pd. Gede, RT.4/RW.2, Halim Perdana Kusumah, Kec. Makasar, Kota Jakarta Timur, Daerah Khusus Ibukota Jakarta 13810",
                    String.valueOf(R.raw.lapakantik)
            },
            {String.valueOf(R.drawable.lapaksetengahtua),
                    "Lapak Setengah Tua",
                    "0812-8913-3333",
                    "Jalan Raya Kelapa Dua Wetan No.1, Kelapa Dua Wetan, Ciracas, RT.6/RW.8, Klp. Dua Wetan, Kec. Ciracas, Kota Jakarta Timur, Daerah Khusus Ibukota Jakarta 13730",
                    String.valueOf(R.raw.lapaksetengahtua)
            },
            {String.valueOf(R.drawable.polarisvariasi),
                    "Polaris Variasi",
                    "(021) 62309552",
                    "Jl. Kebon Jeruk III No.51, RT.1/RW.4, Maphar, Kec. Taman Sari, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11160",
                    String.valueOf(R.raw.polarisvariasi)
            },
            {String.valueOf(R.drawable.antikmotor),
                    "Antik Motor",
                    "0812-8913-3333",
                    "11, 27 Jalan Ciracas Raya, RT.4/RW.11, Ciracas, East Jakarta City, Jakarta 13730",
                    String.valueOf(R.raw.antikmotor)
            },
            {String.valueOf(R.drawable.budungkustompart),
                    "Budung Custompart",
                    "0878-6888-8860",
                    "Blok C4 No, Jl. Pd. Kelapa Raya No.2C, RT.4/RW.11, Malaka Jaya, Kec. Duren Sawit, Kota Jakarta Timur, Daerah Khusus Ibukota Jakarta 13460",
                    String.valueOf(R.raw.budungkustompart)
            },
            {String.valueOf(R.drawable.centralclassiccustom),
                    "Central Classic Custom",
                    "0812-1001-0052",
                    "Jl. Bukit Cinere Raya No.58, RW.6, Gandul, Kec. Cinere, Kota Depok, Jawa Barat 16514",
                    String.valueOf(R.raw.centralclassiccustom)
            }
    };
    public static ArrayList<Model> getListData(){
        Model models = null;
        ArrayList<Model> list = new ArrayList<>();
        for (String[] aData : data) {
            models = new Model();
            models.setGambar(aData[0]);
            models.setNama(aData[1]);
            models.setTelpon(aData[2]);
            models.setAlamat(aData[3]);
            models.setSuaraToko(aData[4]);
            list.add(models);
        }
        return list;
    }
}
