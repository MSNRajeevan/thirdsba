package com.sba3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sba3.model.CustomerModel;


@Repository
public interface CustdetDAO extends JpaRepository<CustomerModel,Long> {

}
