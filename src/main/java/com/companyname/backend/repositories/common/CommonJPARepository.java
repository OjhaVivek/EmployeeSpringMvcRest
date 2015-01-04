package com.companyname.backend.repositories.common;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CommonJPARepository<T, ID extends Serializable> extends JpaRepository<T, ID>,
JpaSpecificationExecutor<T> {

}