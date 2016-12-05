package fcu.iecs.oop.pokemon;

public class GYM {
	public static Player fight(Player player1,Player player2){
		Pokemon poke1[] = player1.getPokemons();
		Pokemon poke2[] = player2.getPokemons();
		int win1=0,win2=0;
		boolean check = false;
		
		for(int i=0;i<3;i++){
			check = false;
			if(poke1[i].getType()==PokemonType.FIRE){
				if(poke2[i].getType()==PokemonType.GRASS){
					win1+=1;
				}
				else if(poke2[i].getType()==PokemonType.WATER){
					win2+= 1;
				}
				else if(poke2[i].getType()==PokemonType.FIRE){
					check = false;
				}
			}
			else if(poke1[i].getType()==PokemonType.GRASS){
				if(poke2[i].getType()==PokemonType.WATER){
					win1+=1;
				}
				else if(poke2[i].getType()==PokemonType.FIRE){
					win2+=2;
				}
				else if(poke2[i].getType()==PokemonType.GRASS){
					check = false;
				}
			}
			else if(poke1[i].getType()==PokemonType.WATER){
				if(poke2[i].getType()==PokemonType.FIRE){
					win1+=1;
				}
				else if(poke2[i].getType()==PokemonType.GRASS){
					win2+=1;
				}
				else if(poke2[i].getType()==PokemonType.WATER){
					check = false;
				}
			}
			
			if(!check){
				if(poke1[i].getCp()>poke2[i].getCp()) win1+=1;
				if(poke1[i].getCp()<poke2[i].getCp()) win2+=2;
				else{
					if((int)(Math.random()*2+1)==1)win1+=1;
					else win2+=1;
				}
			}	
		}
		if(win1>win2)return player1;
		else return player2;
	}

}
