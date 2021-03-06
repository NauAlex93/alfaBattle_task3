package ru.alfa.alfabattle.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.alfa.alfabattle.model.Branch;

import java.util.List;

@Repository
public interface BranchRepository extends CrudRepository<Branch, Long> {
    Branch getById(Integer id);
    List<Branch> findAll();
}
