import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void Add0Poster() {
        PosterManager manager = new PosterManager();

        String[] expected = {};
        String[] actual = manager.findAllPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Add1Poster() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Бладшот_боевик");

        String[] expected = {"Бладшот_боевик"};
        String[] actual = manager.findAllPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Add5Posters() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Бладшот_боевик");
        manager.addPoster("Вперёд_мультфильм");
        manager.addPoster("Отель 'Белград'_комедия");
        manager.addPoster("Джентльмены_боевик");
        manager.addPoster("Человек-невидимка_ужасы");

        String[] expected = {"Бладшот_боевик", "Вперёд_мультфильм", "Отель 'Белград'_комедия", "Джентльмены_боевик", "Человек-невидимка_ужасы"};
        String[] actual = manager.findAllPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastPostersBeforeLimit() {
        PosterManager manager = new PosterManager(5);

        manager.addPoster("Бладшот_боевик");
        manager.addPoster("Вперёд_мультфильм");
        manager.addPoster("Отель 'Белград'_комедия");
        manager.addPoster("Джентльмены_боевик");
        manager.addPoster("Человек-невидимка_ужасы");

        String[] expected = {"Человек-невидимка_ужасы", "Джентльмены_боевик", "Отель 'Белград'_комедия", "Вперёд_мультфильм", "Бладшот_боевик"};
        String[] actual = manager.findLastPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastPostersBeforeCurrentLimit() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Бладшот_боевик");
        manager.addPoster("Вперёд_мультфильм");
        manager.addPoster("Отель 'Белград'_комедия");
        manager.addPoster("Джентльмены_боевик");
        manager.addPoster("Человек-невидимка_ужасы");

        String[] expected = {"Человек-невидимка_ужасы", "Джентльмены_боевик", "Отель 'Белград'_комедия", "Вперёд_мультфильм", "Бладшот_боевик"};
        String[] actual = manager.findLastPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllPosters() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Бладшот_боевик");
        manager.addPoster("Вперёд_мультфильм");
        manager.addPoster("Отель 'Белград'_комедия");
        manager.addPoster("Джентльмены_боевик");
        manager.addPoster("Человек-невидимка_ужасы");
        manager.addPoster("Тролли. Мировой тур_мультфильм");
        manager.addPoster("Номер один_комедия");

        String[] expected = {"Бладшот_боевик", "Вперёд_мультфильм", "Отель 'Белград'_комедия", "Джентльмены_боевик", "Человек-невидимка_ужасы", "Тролли. Мировой тур_мультфильм", "Номер один_комедия"};
        String[] actual = manager.findAllPosters();

        Assertions.assertArrayEquals(expected, actual);
    }
}

