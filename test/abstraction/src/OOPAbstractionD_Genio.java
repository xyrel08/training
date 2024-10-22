import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

abstract class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public abstract void play();

    public abstract void pause();
}

class MusicPlayer {
    private List<Song> playlist;
    private int currentIndex;
    private boolean isPlaying;

    public MusicPlayer() {
        playlist = new ArrayList<>();
        currentIndex = 0;
        isPlaying = false;
    }

    public void addSong(Song song) {
        playlist.add(song);
    }

    public void removeSong(Song song) {
        playlist.remove(song);
    }

    public void play() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty.");
            return;
        }

        Song currentSong = playlist.get(currentIndex);
        currentSong.play();
        isPlaying = true;

        System.out.println("Now playing: " + currentSong.getTitle() + " by " + currentSong.getArtist());
    }

    public void pause() {
        if (!isPlaying) {
            System.out.println("The music player is not currently playing.");
            return;
        }

        Song currentSong = playlist.get(currentIndex);
        currentSong.pause();
        isPlaying = false;

        System.out.println("Paused: " + currentSong.getTitle());
    }

    public void skip() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty.");
            return;
        }

        currentIndex = (currentIndex + 1) % playlist.size();

        if (isPlaying) {
            play();
        } else {
            Song currentSong = playlist.get(currentIndex);
            System.out.println("Skipped to: " + currentSong.getTitle());
        }
    }

    public void shuffle() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty.");
            return;
        }

        Collections.shuffle(playlist, new Random());
        currentIndex = 0;

        System.out.println("Playlist shuffled.");
    }
}

class AudioSong extends Song {
    public AudioSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    public void play() {
        System.out.println("Playing audio song...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing audio song...");
    }
}

class VideoSong extends Song {
    public VideoSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    public void play() {
        System.out.println("Playing video song...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing video song...");
    }
}

public class OOPAbstractionD_Genio {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        Scanner scanner = new Scanner(System.in);
        musicPlayer.addSong(new AudioSong("Song 1", "Artist 1"));
        musicPlayer.addSong(new VideoSong("Song 2", "Artist 2"));
        musicPlayer.addSong(new AudioSong("Song 3", "Artist 3"));
        musicPlayer.addSong(new AudioSong("Song 4", "Artist 4"));
        musicPlayer.addSong(new AudioSong("Song 5", "Artist 5"));
        musicPlayer.addSong(new AudioSong("Song 6", "Artist 6"));
        boolean exit = false;

        while (!exit) {
            System.out.println("--- Music Player ---");
            System.out.println("1. Add Song");
            System.out.println("2. Play");
            System.out.println("3. Pause");
            System.out.println("4. Skip");
            System.out.println("5. Shuffle");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the title of the song: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the artist of the song: ");
                    String artist = scanner.nextLine();
                    Song song = new AudioSong(title, artist);
                    musicPlayer.addSong(song);
                    System.out.println("Song added to the playlist.");
                    break;
                case 2:
                    musicPlayer.play();
                    break;
                case 3:
                    musicPlayer.pause();
                    break;
                case 4:
                    musicPlayer.skip();
                    break;
                case 5:
                    musicPlayer.shuffle();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting the music player...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}