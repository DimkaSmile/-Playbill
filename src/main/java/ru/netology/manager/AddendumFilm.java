package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class AddendumFilm {
    private int length;
    private int id;
    private String filmName;
    private String filmGenre;
    private int ticketPrice;

}
