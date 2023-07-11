package com.crudapi.crudapi.Service;

import com.crudapi.crudapi.Controller.UserDetails;
import lombok.Data;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class ServiceAPI {
    private List<UserDetails> dataList;
    public ServiceAPI(List<UserDetails> dataList) {
        this.dataList = dataList;
    }
}
