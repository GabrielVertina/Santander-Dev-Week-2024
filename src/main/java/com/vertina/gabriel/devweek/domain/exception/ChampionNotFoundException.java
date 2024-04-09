package com.vertina.gabriel.devweek.domain.exception;

public class ChampionNotFoundException extends RuntimeException{

public ChampionNotFoundException(Long championId){
super("Champion %d not found".formatted(championId));

}

}
