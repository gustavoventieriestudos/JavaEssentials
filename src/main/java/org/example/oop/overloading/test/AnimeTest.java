package org.example.oop.overloading.test;

import org.example.oop.overloading.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init(null, null, 0);
        anime.init(null, null, 0, null);

        anime.print();
       
    }
}
