package practice.service;

import practice.model.Bet;

import static practice.db.Storage.bets;

//Добавить ставки и и взять все ставки
public interface BetService {

     void add(Bet bet);
     Bet[] getAll();
}
