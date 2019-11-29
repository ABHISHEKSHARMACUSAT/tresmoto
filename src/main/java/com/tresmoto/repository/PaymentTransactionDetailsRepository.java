package com.tresmoto.repository;

import com.tresmoto.repository.entity.PaymentTransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentTransactionDetailsRepository extends JpaRepository<PaymentTransactionDetails, Integer> {
}
