package session15_equals_hashcode.challenges.equals_hashcode_challenges_1_to_5.song_4;

public class SongApp {

    public static void main(String[] args) {
        Song song1 = new Song();
        song1.setArtist("Generic boy-band");
        song1.setTitle("Generic summer hit");
        song1.setLength(3.17);

        Song song2 = new Song();
        song2.setArtist("Generic boy-band");
        song2.setTitle("Generic summer hit");
        song2.setLength(2.45);

        System.out.println("song1 hashcode: " + song1.hashCode());
        System.out.println("song2 hashcode: " + song2.hashCode());
        System.out.println("song1 equals song2: "+ song1.equals(song2));
    }
}
