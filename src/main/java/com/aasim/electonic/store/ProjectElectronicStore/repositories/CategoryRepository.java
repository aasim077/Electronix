package com.aasim.electonic.store.ProjectElectronicStore.repositories;

import com.aasim.electonic.store.ProjectElectronicStore.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category , String> {

    List<Category> findByTitleContaining(String keyword);
}
