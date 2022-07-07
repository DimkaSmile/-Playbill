package ru.netology.manager;

public class FilmManager {
    private AddendumFilm[] items = new AddendumFilm[0]; //завели поле(собственную память)


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
        int resultLength = items.length;
        int lastIndex = 10;
        if (resultLength > lastIndex) {
            resultLength = lastIndex;
        } else resultLength = items.length;
        AddendumFilm[] result = new AddendumFilm[items.length];
        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;

    }
}