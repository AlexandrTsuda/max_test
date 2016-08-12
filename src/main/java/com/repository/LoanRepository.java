package com.repository;

import com.entity.Loan;
import com.entity.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "loan", path = "loan")
public interface LoanRepository extends PagingAndSortingRepository<Loan, Long> {

    List<Loan> findLoanByPerson(@Param("person") Person person);
}
