package com.example.demorestAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demorestAPI.model.XYFlightDetail;
import com.example.demorestAPI.repository.XYFlightRepositry;

import java.util.List;

@Service
public class XYFlightService {
    @Autowired
    private XYFlightRepositry repository;

    public XYFlightDetail saveFlightDtls(XYFlightDetail flightDtls) {
        return repository.save(flightDtls);
    }

    public List<XYFlightDetail> getFlightDtls() {
        return repository.getAllFlightDtls();
    }

    public XYFlightDetail getFlightById(int id) {
        return repository.findById(id);
    }
    
    public String deleteFlightDtls(int id) {
        repository.delete(id);
        return "Flight Details removed !! " + id;
    }

    public XYFlightDetail updateFlightDtls(XYFlightDetail flightDtls) {
       return repository.update(flightDtls);
    }
}
