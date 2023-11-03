package session18_recap.challenges.playlist_18;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Playlist {

    private String name;
    private List<Song> songList;

    public Double getPlaylistDuration(){
        if(songList.isEmpty()){
            System.out.println("Playlist is empty");
            return null;
        }
        return songList.stream()
                .map(Song::getDuration)
                .reduce(0.0,(acc, value) -> acc + value);

    }
}
