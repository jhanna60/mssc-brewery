package guru.springFramework.msscbrewery.services.v2;

import guru.springFramework.msscbrewery.web.model.BeerDto;
import guru.springFramework.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
