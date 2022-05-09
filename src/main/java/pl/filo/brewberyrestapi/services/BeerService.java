package pl.filo.brewberyrestapi.services;

import pl.filo.brewberyrestapi.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by T. Filo Zegarlicki on 09.05.2022
 **/
public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
