package pl.filo.brewberyrestapi.services.v2;

import pl.filo.brewberyrestapi.web.model.v2.BeerDtoV2;

import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by T. Filo Zegarlicki on 09.05.2022
 **/
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
