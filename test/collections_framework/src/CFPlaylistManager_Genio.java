import java.util.ArrayList;


import java.util.Collections;

public class CFPlaylistManager_Genio {
    private ArrayList<String> playlist;

    public CFPlaylistManager_Genio() {
        playlist = new ArrayList<>();
    }

    public void addSong(String song) {
        playlist.add(song);
    }

    public void removeSong(String song) {
        playlist.remove(song);
    }

    public void shufflePlaylist() {
        Collections.shuffle(playlist);
    }

    public void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Playlist:");
            for (int i = 0; i < playlist.size(); i++) {
                System.out.println((i + 1) + ". " + playlist.get(i));
            }
        }
    }

    public static void main(String[] args) {
        CFPlaylistManager_Genio playlistManager = new CFPlaylistManager_Genio();

        // Add songs to the playlist
        playlistManager.addSong("Song 1");
        playlistManager.addSong("Song 2");
        playlistManager.addSong("Song 3");
        playlistManager.addSong("Song 4");
        playlistManager.addSong("Song 5");

        System.out.println("Initial Playlist:");
        playlistManager.displayPlaylist();

        // Remove a song
        playlistManager.removeSong("Song 3");

        System.out.println("\nUpdated Playlist (after removing a song):");
        playlistManager.displayPlaylist();

        // Shuffle the playlist
        playlistManager.shufflePlaylist();

        System.out.println("\nShuffled Playlist:");
        playlistManager.displayPlaylist();
    }
}