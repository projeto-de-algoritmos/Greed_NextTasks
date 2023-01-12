package br.com.pokebox.util;

import br.com.pokebox.model.Pokemon;

import java.util.Comparator;

public class PointYComparator implements Comparator<Pokemon> {
    @Override
    public int compare(Pokemon pokemonA, Pokemon pokemonB) {
        return Integer.compare(pokemonA.getCoordinateY(), pokemonB.getCoordinateY());
    }
}
