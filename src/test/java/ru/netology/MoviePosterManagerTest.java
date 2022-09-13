package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoviePosterManagerTest {

    MoviePosterManager manager = new MoviePosterManager();

    MoviePoster poster1 = new MoviePoster(11, "Бладшот", ",боевик", "picture1", false);
    MoviePoster poster2 = new MoviePoster(22, "Вперед", ",мультфильм", "picture2", false);
    MoviePoster poster3 = new MoviePoster(33, "Белград", ",комедия", "picture3", false);
    MoviePoster poster4 = new MoviePoster(44, "Джентельмены", ",боевик", "picture4", false);
    MoviePoster poster5 = new MoviePoster(55, "Человек-невидимка", ",ужасы", "picture5", false);
    MoviePoster poster6 = new MoviePoster(66, "Тролли", ",мультфильм", "picture6", true);
    MoviePoster poster7 = new MoviePoster(77, "Номер один", ",комедия", "picture6", true);
    MoviePoster poster8 = new MoviePoster(88, "Гарри Поттер", ",фэнтези", "picture6", false);
    MoviePoster poster9 = new MoviePoster(99, "Один дома", ",комедия", "picture6", false);
    MoviePoster poster10 = new MoviePoster(00, "Малефисента", ",фэнтези", "picture6", false);
    MoviePoster poster11 = new MoviePoster(01, "Мальчишник в Вегасе1", ",комедия", "picture6", false);
    MoviePoster poster12 = new MoviePoster(02, "Мальчишник в Вегасе2", ",комедия", "picture6", false);


    @Test
    void shouldAdd() {

        MoviePoster[] expected = {poster1};
        manager.add(poster1);
        MoviePoster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAll() {
        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.add(poster5);
        manager.add(poster6);
        manager.add(poster7);
        manager.add(poster8);
        manager.add(poster9);
        manager.add(poster10);
        manager.add(poster11);
        manager.add(poster12);

        MoviePoster[] expected = {poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8, poster9, poster10, poster11, poster12};
        MoviePoster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    void shouldFindLast() {
        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.add(poster5);
        manager.add(poster6);
        manager.add(poster7);
        manager.add(poster8);
        manager.add(poster9);
        manager.add(poster10);
        manager.add(poster11);
        manager.add(poster12);

        MoviePoster[] expected = {poster12, poster11, poster10, poster9, poster8, poster7, poster6, poster5, poster4, poster3};
        MoviePoster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}