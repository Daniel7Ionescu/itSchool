package session18_recap.challenges.playlist_18;

import java.util.Arrays;
import java.util.List;

public class PlaylistApp {

    public static void main(String[] args) {
        //Problem 18
        //Create a Playlist class with attributes like name and a list of Song objects.
        //Each Song has a title and duration. Implement a method in Playlist that returns the total duration of all songs.

        List<Song> songList = Arrays.asList(
                new Song("Edgy 90's song", 2.25),
                new Song("That cool song", 3.14),
                new Song("What was the name again?", 4.10),
                new Song("Rockin' tunes", 2.30));

        Playlist coolPlaylist = new Playlist();
        coolPlaylist.setName("Cool playlist");
        coolPlaylist.setSongList(songList);

        System.out.printf("%s duration: %s",coolPlaylist.getName(), coolPlaylist.getPlaylistDuration());
    }
}
