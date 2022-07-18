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
        int length = items.length + 1; //создаем новый массив на единицу больше
        AddendumFilm[] tmp = new AddendumFilm[length]; // создали временный массив
        // for (int i = 0; i < items.length; i++) { //сделали цикл
        //    tmp[i] = items[i];
        //  }
        System.arraycopy(items, 0, tmp, 0, items.length); //указали откуда и куда копируем
        int lastIndex = tmp.length - 1; //вычисляем последнюю ячейку нового массива и ее заполняем
        tmp[lastIndex] = item; // вычисляем элемент
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