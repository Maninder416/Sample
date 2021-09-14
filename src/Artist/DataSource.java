package Artist;

import javax.swing.plaf.nimbus.State;
import java.nio.file.attribute.PosixFileAttributes;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static final String DB_NAME= "music.db";
    public static final String CONNECTION_STRING= "jdbc:sqlite:/Users/manindersingh/Documents/ManinderSQLite/"+DB_NAME;

    public static final String TABLE_ALBUMS= "albums";
    public static final String COLUMN_ALBUM_ID= "_id";
    public static final String COLUMN_ALBUM_NAME= "name";
    public static final String COLUMN_ALBUM_ARTIST= "artist";
    public static final int INDEX_ALBUM_ID=1;
    public static final int INDEX_ALBUM_NAME=2;
    public static final int INDEX_ALBUM_ARTIST=3;



    public static final String TABLE_ARTISTS= "artists";
    public static final String COLUMN_ARTIST_ID= "_id";
    public static final String COLUMN_ARTIST_NAME= "name";
    public static final int INDEX_ARTIST_ID=1;
    public static final int INDEX_ARTIST_NAME=2;


    public static final String TABLE_SONGS= "songs";
    public static final String COLUMN_SONG_ID="_id";
    public static final String COLUMN_SONG_TRACK= "track";
    public static final String COLUMN_SONG_TITLE= "title";
    public static final String COLUMN_SONG_ALBUM="album";
    public static final int INDEX_SONG_ID=1;
    public static final int INDEX_SONG_TRACK=2;
    public static final int INDEX_SONG_TITLE=3;
    public static final int INDEX_SONG_ALBUM=4;

    public static final int ORDER_BY_NONE=1;
    public static final int ORDER_BY_ASC=2;
    public static final int ORDER_BY_DESC=3;


    private Connection conn;

    public boolean open(){
        try{
            conn= DriverManager.getConnection(CONNECTION_STRING);
            System.out.println("Connection Successful");
            return true;
        } catch (Exception e){
            System.out.println("Could't connect connection: "+e.getMessage());
            return false;
        }
    }

    public void close() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            System.out.println("could not close connection: " + e.getMessage());
        }

    }

    public List<Artist> queryArtists(int sortOrder) {
        StringBuilder sb= new StringBuilder("SELECT * FROM ");
        sb.append(TABLE_ARTISTS);
        if(sortOrder != ORDER_BY_NONE){
            sb.append(" ORDER BY ");
            sb.append(COLUMN_ARTIST_ID);
            sb.append(" COLLATE NOCASE ");
            if(sortOrder==ORDER_BY_DESC){
                sb.append("DESC");
            } else{
                sb.append("ASC");
            }
            sb.append(";");
            System.out.println(sb);


        }

        try (Statement statement= conn.createStatement();
             ResultSet results=statement.executeQuery(sb.toString())){
            List<Artist> artists= new ArrayList<>();
            while(results.next()){
                Artist artist= new Artist();
                artist.setId(results.getInt(INDEX_ARTIST_ID));
                artist.setName(results.getString(INDEX_ARTIST_NAME));
                artists.add(artist);
            }

            return artists;

        } catch (SQLException e) {
            System.out.println("Query failed: "+e.getMessage());
            return null;
        }
    }

    public List<Song> querySongs(){
        try(Statement statement= conn.createStatement();
        ResultSet results= statement.executeQuery("Select * from "+TABLE_SONGS)){
            List<Song> songs= new ArrayList<>();

            while(results.next()){
                Song song= new Song();
                song.setTrack(results.getInt(INDEX_SONG_TRACK));
                song.setAlbumId(results.getInt(INDEX_SONG_ALBUM));
                song.setTitle(results.getString(INDEX_SONG_TITLE));
                songs.add(song);

            }
            return songs;

        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }

    }

    public List<Album> albumquery(){
    List<Album> albums= new ArrayList();
    try(Statement statement= conn.createStatement();
    ResultSet results= statement.executeQuery("Select * from "+TABLE_ALBUMS)){
        while (results.next()){
            Album album= new Album();
            album.setArtistId(results.getInt(INDEX_ALBUM_ARTIST));
            album.setName(results.getString(INDEX_ALBUM_NAME));
            album.setId(results.getInt(INDEX_ALBUM_ID));
          //  album.setTableName(results.getString(TABLE_ALBUMS));
            albums.add(album);
        }
        return albums;

    } catch (Exception e){
        System.out.println(e);
        return null;
    }

    }

    public int getCount(String name){
        String sql= "Select count(*) from "+name;
        try(Statement statement= conn.createStatement();
        ResultSet results= statement.executeQuery(sql)){
            int count= results.getInt(1);
            return count;

        }
        catch (Exception e){
            System.out.println(e);
            return 0;
        }
    }



}
