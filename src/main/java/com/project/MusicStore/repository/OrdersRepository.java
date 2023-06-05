package com.project.MusicStore.repository;

import org.springframework.stereotype.Repository;
import com.project.MusicStore.model.Orders;

@Repository
interface OrdersRepository extends GenericRepository<Orders,Long> {

}
