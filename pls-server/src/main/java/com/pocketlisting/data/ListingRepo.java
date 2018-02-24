package com.pocketlisting.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ListingRepo  extends CrudRepository<Listing, String>{

}
