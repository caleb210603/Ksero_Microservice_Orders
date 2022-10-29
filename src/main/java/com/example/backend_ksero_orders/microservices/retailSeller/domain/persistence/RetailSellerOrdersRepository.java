package com.example.backend_ksero_orders.microservices.retailSeller.domain.persistence;

import com.example.backend_ksero_orders.microservices.retailSeller.domain.model.entity.RetailSellerOrders;
import com.example.backend_ksero_orders.microservices.wholesaler.domain.model.entity.WholeSalerOrders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RetailSellerOrdersRepository extends JpaRepository<RetailSellerOrders, Long> {
    List<RetailSellerOrders> findByUserId(Long userId);
}
