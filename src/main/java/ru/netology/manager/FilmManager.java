package ru.netology.manager;

public class FilmManager {

    private AddendumFilm[] items = new AddendumFilm[0]; //завели поле(собственную память)
    private int limit;

    
    public FilmManager() {
        limit = 10;
    }
    public FilmManager (int limit) {
        this.limit = limit;
    }

    public void save(AddendumFilm item) {
        int length = items.length + 1; 
        AddendumFilm[] tmp = new AddendumFilm[length];
        // for (int i = 0; i < items.length; i++) { 
        //    tmp[i] = items[i];
        //  }
        System.arraycopy(items, 0, tmp, 0, items.length); 
        int lastIndex = tmp.length - 1; 
        tmp[lastIndex] = item; 
        items = tmp;
    }

    public AddendumFilm[] findAll() {
        //int[] film = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //for (int i = film.length - 1; i <= 0; i--) {
        return items;
    }

    public AddendumFilm[] findLast() {
        int resultLength;
        if (items.length < limit) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }
        AddendumFilm[] result = new AddendumFilm[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = items[items.length - 1 - i];
        }
        return result;

    }
}
