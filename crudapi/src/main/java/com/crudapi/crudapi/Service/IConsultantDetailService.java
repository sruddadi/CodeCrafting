package com.crudapi.crudapi.Service;

import com.crudapi.crudapi.Entity.ConsultantDetail;
import com.crudapi.crudapi.Entity.LeadDetail;
import com.crudapi.crudapi.Repository.ConsultantDetailsRepository;
import com.crudapi.crudapi.Repository.LeadDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IConsultantDetailService {
    @Autowired
    private ConsultantDetailsRepository repository;

    public List<ConsultantDetail> getAllConsultants() {
        return repository.findAll();
    }
    public ConsultantDetail createConsultant(ConsultantDetail consultantDetail) {
        return repository.save(consultantDetail);
    }

    public void deleteConsultant(long id) {
        repository.deleteById(id);
    }

    public ConsultantDetail updateConsultant(long id, ConsultantDetail consultantDetail) {
        consultantDetail.setId(id);
        return repository.save(consultantDetail);
    }

}
