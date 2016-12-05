package fcu.iecs.oop.pokemon;

public class Player {
	private String playername;
	private Pokemon[] pokemons;
	private int level = 1;
	
	public Player(String name){
		this.playername = name;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public Pokemon[] getPokemons() {
		return pokemons;
	}
	public void setPokemons(Pokemon[] pokemons) {
		this.pokemons = pokemons;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

}
