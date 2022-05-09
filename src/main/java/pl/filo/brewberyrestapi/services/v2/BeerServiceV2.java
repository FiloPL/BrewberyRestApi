package pl.filo.brewberyrestapi.services.v2;

import pl.filo.brewberyrestapi.web.model.v2.BeerDtoV2;

import java.util.UUID;

/**
 * Created by T. Filo Zegarlicki on 09.05.2022
 **/
public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);
}
