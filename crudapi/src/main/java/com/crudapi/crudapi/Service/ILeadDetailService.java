package com.crudapi.crudapi.Service;

import com.crudapi.crudapi.Entity.LeadDetail;
import com.crudapi.crudapi.Repository.LeadDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ILeadDetailService {
    @Autowired
    private LeadDetailsRepository repository;

    public List<LeadDetail> getAllLeads() {
        return repository.findAll();
    }
    public LeadDetail createLead(LeadDetail leadDetail) {
        return repository.save(leadDetail);
    }

    public void deleteLead(long id) {
        repository.deleteById(id);
    }

    public LeadDetail updateLead(long id, LeadDetail leadDetail) {
        leadDetail.setId(id);
        return repository.save(leadDetail);
    }

}
