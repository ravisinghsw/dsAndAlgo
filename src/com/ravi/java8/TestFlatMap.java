package com.ravi.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestFlatMap {

    public static void main(String[] args) {
        String testString = "my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\n video.mp4 200b\n game.exe 100b\nmovie.mkv 10000b";
        System.out.println(solutions(testString));
    }

    private static String solutions(String s) {

        String[] keys = s.split("b");
        System.out.println(Arrays.toString(keys));

        List<String> music = Arrays.stream(keys).filter(a -> a.contains("mp3")
                || a.contains("aac") || a.contains("flac")).collect(Collectors.toList());
        List<String> image = Arrays.stream(keys).filter(a -> a.contains("jpg")
                || a.contains("bmp") || a.contains("gif")).collect(Collectors.toList());
        List<String> movie = Arrays.stream(keys).filter(a -> a.contains("mp4")
                || a.contains("avi") || a.contains("mkv")).collect(Collectors.toList());

        List<String> others = Arrays.stream(keys).filter(a -> a.contains("7z")
                || a.contains("txt") || a.contains("zip")).collect(Collectors.toList());

        Integer musicSum = music.stream().map(a -> a.trim().split(" ")[1]).mapToInt(a -> Integer.parseInt(a)).sum();
        Integer imageSum = image.stream().map(a -> a.trim().split(" ")[1]).mapToInt(a -> Integer.parseInt(a)).sum();
        Integer movieSum = movie.stream().map(a -> a.trim().split(" ")[1]).mapToInt(a -> Integer.parseInt(a)).sum();
        Integer otherSum = others.stream().map(a -> a.trim().split(" ")[1]).mapToInt(a -> Integer.parseInt(a)).sum();
        StringBuilder result = new StringBuilder();
        result.append("music " + musicSum + "b \n");
        result.append("image " + imageSum + "b \n");
        result.append("movie " + movieSum + "b \n");
        result.append("other " + otherSum + "b \n");

        System.out.println(result.toString());

        return result.toString();
    }

}
