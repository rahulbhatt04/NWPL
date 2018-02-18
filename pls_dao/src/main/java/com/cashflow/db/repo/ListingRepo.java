package com.cashflow.db.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cashflow.db.ListingDao;

@Repository
public interface ListingRepo  extends CrudRepository<ListingDao, String>{

}
