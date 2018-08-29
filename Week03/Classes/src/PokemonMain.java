import java.util.ArrayList;
import java.util.List;

public class PokemonMain {
    public static void main(String[] args) {
        List<Pokemon> pokemonOfAsh = initializePokemons();
        Pokemon pokemon1 = new Pokemon("Pikatchu", "electric", "water");
        pokemonOfAsh.add(pokemon1);
        System.out.println(pokemonOfAsh);

        // Every pokemon has a name and a type.
        // Certain types are effective against others, e.g. water is effective against fire.

        // Ash has a few pokemon.
        // A wild pokemon appeared!

        Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

        // Which pokemon should Ash use?

        for (Pokemon pokemon : pokemonOfAsh) {

            if (pokemon.isEffectiveAgainst(wildPokemon))
            {


                System.out.print("I choose you, " + pokemon.name);
            }
        }
    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();
        Pokemon pokemon1 = new Pokemon("Pikatchu", "electric", "water");

        pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
        pokemon.add(pokemon1);
        pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }


}
