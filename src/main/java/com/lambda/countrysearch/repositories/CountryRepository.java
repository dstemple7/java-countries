package com.lambda.countrysearch.repositories;

import com.lambda.countrysearch.models.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository <Country, Long>
{
}
