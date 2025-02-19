package com.example.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class Mascotas {

    public List<String> getBreeds(String category) {
        List<String> breeds = new ArrayList<>();

        switch (category) {
            case "Pastores":
                breeds.add("Catalán");
                breeds.add("Alemán");
                breeds.add("Collie");
                breeds.add("Belga");
                breeds.add("Shetland");
                breeds.add("Suizo");
                break;
            case "Pinscher":
                breeds.add("Dobermann");
                breeds.add("miniature");
                breeds.add("Aleman");
                break;
            case "Terriers":
                breeds.add("Scottish");
                breeds.add("Border Terrier");
                breeds.add("Cairn Terrier");
                breeds.add("Airedale Terrier");
                breeds.add("Norfolk Terrier");
                breeds.add("Yorkshire Terrier");
                break;
            default:
                breeds.add("No hay razas disponibles");
        }

        return breeds;
    }
}