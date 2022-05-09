package pl.filo.brewberyrestapi.web.mappers;

import pl.filo.brewberyrestapi.domain.Beer;
import pl.filo.brewberyrestapi.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by T. Filo Zegarlicki on 09.05.2022
 **/
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
