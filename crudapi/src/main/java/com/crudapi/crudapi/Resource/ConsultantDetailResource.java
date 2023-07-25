package com.crudapi.crudapi.Resource;

import com.crudapi.crudapi.Entity.ConsultantDetail;
import com.crudapi.crudapi.Entity.LeadDetail;
import com.crudapi.crudapi.Service.IConsultantDetailService;
import com.crudapi.crudapi.Service.ILeadDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultants")
public class ConsultantDetailResource {

    @Autowired
    private IConsultantDetailService service;

    @GetMapping
    public List<ConsultantDetail> getAllLeads(){
        return service.getAllConsultants();
    }

    @PostMapping
    public ConsultantDetail createConsultant(@RequestBody ConsultantDetail consultantDetail) {
        return service.createConsultant(consultantDetail);
    }

    @DeleteMapping("/{id}")
    public void deleteConsultant(@PathVariable("id") long id) {
        service.deleteConsultant(id);
    }

    @PutMapping("/{id}")
    public ConsultantDetail updateLead(@PathVariable("id") long id, @RequestBody ConsultantDetail consultantDetail) {
        return service.updateConsultant(id, consultantDetail);
    }

}
