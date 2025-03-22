package org.example.oop.constructor.test;

import org.example.oop.constructor.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime(null, null, 0, null);
        Anime anime2 = new Anime();
        
        anime.print();
        anime2.print();
    }
}
