package com.crudapi.crudapi.Resource;

import com.crudapi.crudapi.Entity.LeadDetail;
import com.crudapi.crudapi.Service.ILeadDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leads")
public class LeadDetailResource {

    @Autowired
    private ILeadDetailService service;

    @GetMapping
    public List<LeadDetail> getAllLeads(){
        return service.getAllLeads();
    }

    @PostMapping
    public LeadDetail createLead(@RequestBody LeadDetail leadDetail) {
        return service.createLead(leadDetail);
    }

    @DeleteMapping("/{id}")
    public void deleteLead(@PathVariable("id") long id) {
        service.deleteLead(id);
    }

    @PutMapping("/{id}")
    public LeadDetail updateLead(@PathVariable("id") long id, @RequestBody LeadDetail leadDetail) {
        return service.updateLead(id, leadDetail);
    }

}
