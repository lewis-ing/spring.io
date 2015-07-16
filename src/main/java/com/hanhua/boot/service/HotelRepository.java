package com.hanhua.boot.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hanhua.boot.domain.City;
import com.hanhua.boot.domain.Hotel;


@RepositoryRestResource(collectionResourceRel = "hotels", path = "hotels")
interface HotelRepository extends PagingAndSortingRepository<Hotel, Long> {

	Hotel findByCityAndName(City city, String name);

}
