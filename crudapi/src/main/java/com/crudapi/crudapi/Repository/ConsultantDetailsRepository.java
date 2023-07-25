package com.crudapi.crudapi.Repository;

import com.crudapi.crudapi.Entity.ConsultantDetail;
import com.crudapi.crudapi.Entity.LeadDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultantDetailsRepository extends JpaRepository<ConsultantDetail, Long> {

}
