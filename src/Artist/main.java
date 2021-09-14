package Artist;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        DataSource dataSource= new DataSource();
        if(!dataSource.open()){
            System.out.println("Can't open datasource");
            return;
        }

        List<Artist> artists= dataSource.queryArtists(DataSource.ORDER_BY_ASC);
        if(artists==null){
            System.out.println("No Artists!");
            return;
        }

        for(Artist artist: artists){
           //System.out.println("ID: "+artist.getId()+" , Name : "+artist.getName());
        }

        List<Song> songs= dataSource.querySongs();
        if(songs==null){
            System.out.println("No Songs");
            return;
        }

        for(Song song: songs){
            System.out.println("Track id: "+song.getTrack()+", Get Title: "+song.getTitle());
        }


        List<Album> albums= dataSource.albumquery();

        if(albums==null){
            System.out.println("Not album exist");
        }

        for(Album album: albums){
          //  System.out.println("Album name is: "+album.getName());
        }

        int count= dataSource.getCount(DataSource.TABLE_ALBUMS);
        System.out.println("m");
        System.out.println(count);


        dataSource.close();


    }
}
