package com.agsatria.liriklagu;

import java.util.ArrayList;

public class LaguData {
    public static String[][] data = new String[][]{
            {"A Whole New World", "Zayn Malik ft Zhavia Ward", "https://i.scdn.co/image/cecb60cc819b8a8027d353b15c9334f6b3c1c2ad"},
            {"On My Way", "Alan Walker", "https://cdn-2.tstatic.net/wow/foto/bank/images/lagu-on-my-way-alan-walker.jpg"},
            {"I don't care", "Ed Sheeran ft Justin Beiber", "https://cdn-2.tstatic.net/wow/foto/bank/images/ed-sheeran-ft-justin-beiber-i-dont-care.jpg"},
            {"Cinta Luar Biasa", "Andmesh", "http://cdn2.tstatic.net/bogor/foto/bank/images/andmesh.jpg"},
            {"Kill This Love", "Black Pink", "https://scontent-lga3-1.cdninstagram.com/vp/136c8271115f3f4afd6a3f09cf59b273/5D4DE4EA/t51.2885-15/e35/54800371_587425621736044_2719311302554688219_n.jpg?_nc_ht=scontent-lga3-1.cdninstagram.com"},
            {"Thank u, next", "Ariana Grande", "https://s.mxmcdn.net/images-storage/albums4/7/1/7/7/0/4/42407717_350_350.jpg"},
            {"Adu Rayu", "Yovie Widianto", "https://img.solopos.com/thumb/posts/2019/03/29/981609/glenn-tulus-dan-yovie-instagram-tulusm.jpg?w=600&h=400"},
            {"Kau Tak Sendiri", "Bondan Prakoso", "https://s.mxmcdn.net/images-storage/albums8/8/5/2/1/3/8/30831258_350_350.jpg"}
    };

    public static ArrayList<Lagu> getListData(){
        Lagu lagu = null;
        ArrayList<Lagu> list = new ArrayList<>();
        for (String[] aData : data) {
            lagu = new Lagu();
            lagu.setJudul(aData[0]);
            lagu.setPenyanyi(aData[1]);
            lagu.setFoto(aData[2]);

            list.add(lagu);
        }

        return list;
    }
}
