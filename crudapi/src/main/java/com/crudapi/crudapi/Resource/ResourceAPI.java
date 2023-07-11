package com.crudapi.crudapi.Resource;

import com.crudapi.crudapi.Controller.UserDetails;
import com.crudapi.crudapi.Service.ServiceAPI;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/apicall")
public class ResourceAPI {
    private ServiceAPI dataService;

    @Autowired
    public ResourceAPI(ServiceAPI dataService) {
        this.dataService = dataService;
    }

    @GetMapping
    public List<UserDetails> getAllData() {
        return dataService.getDataList();
    }

    @GetMapping("/{name}")
    public List<UserDetails> getData(@PathVariable String name) {
        List<UserDetails> dataList = dataService.getDataList();

        List<UserDetails> filteredList = dataList.stream()
                .filter(userDetails -> userDetails.getVendorName().equals(name))
                .collect(Collectors.toList());

        return filteredList;
    }

    @PostMapping
    public void addData(@RequestBody UserDetails newData) {
        newData.setId(UUID.randomUUID().toString());
        dataService.getDataList().add(newData);
    }

    @DeleteMapping("/{index}")
    public void deleteData(@PathVariable int index) {
        dataService.getDataList().remove(index);
    }

    @PutMapping("/{index}")
    public void updateData(@PathVariable int index, @RequestBody UserDetails updatedData) {
        List<UserDetails> dataList = dataService.getDataList();

        if (index >= 0 && index < dataList.size()) {
            updatedData.setId(dataService.getDataList().get(index).getId());
            dataList.set(index, updatedData);
        }
    }

}
