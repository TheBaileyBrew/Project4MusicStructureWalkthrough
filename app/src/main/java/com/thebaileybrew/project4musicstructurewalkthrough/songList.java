package com.thebaileybrew.project4musicstructurewalkthrough;

import java.util.ArrayList;

public class songList extends ArrayList {
    private ArrayList<song> SongItems = new ArrayList<>();

    public ArrayList getSongList() {
        SongItems.add(new song("The Chainsmokers", "Something Just Like You",
                R.drawable.chainsmokers_image, "feat: Coldplay"));
        SongItems.add(new song("Marshmello", "Wolves",R.drawable.marshmello_image,
                "feat: Selena Gomez"));
        SongItems.add(new song("Zedd", "The Middle", R.drawable.zedd_image,
                "feat: Maren Morris"));
        SongItems.add(new song("Avicii", "Wake Me Up", R.drawable.avicii_image,
                "feat: "));
        SongItems.add(new song("The Chainsmokers", "Dont Let Me Down",
                R.drawable.chainsmokers_image, "feat: Daya"));
        return SongItems;
    }


}
