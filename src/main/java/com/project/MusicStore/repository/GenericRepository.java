package com.project.MusicStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
interface GenericRepository<T, ID> extends JpaRepository<T, ID> {

}