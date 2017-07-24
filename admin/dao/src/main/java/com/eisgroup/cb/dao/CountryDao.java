package com.eisgroup.cb.dao;

import com.eisgroup.cb.model.Country;

/**
 * Created by Titarenko on 25.05.2017 at 13:39.
 */
public interface CountryDao extends BaseObjectDAO<Country> {
    Country getCountryByName(String countryName);
}
