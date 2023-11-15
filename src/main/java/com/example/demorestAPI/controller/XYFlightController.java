package com.example.demorestAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.demorestAPI.model.XYFlightDetail;
import com.example.demorestAPI.service.XYFlightService;


@RestController
@RequestMapping("api/xyflights")
public class XYFlightController {    
	@Autowired
    private XYFlightService flightService;

    @PostMapping
    public XYFlightDetail addProduct(@RequestBody XYFlightDetail flightDtls) {
        return flightService.saveFlightDtls(flightDtls);
    }

    @GetMapping
    public List<XYFlightDetail> findAllFlightDtls() {
        return flightService.getFlightDtls();
    }

    @GetMapping("{id}")
    public XYFlightDetail findFlightDtlsById(@PathVariable int id) {
        return flightService.getFlightById(id);
    }

    @PutMapping
    public XYFlightDetail updateFlightDtls(@RequestBody XYFlightDetail flightDtls) {
        return flightService.updateFlightDtls(flightDtls);
    }

    @DeleteMapping("{id}")
    public String deleteFlightDtls(@PathVariable int id) {
        return flightService.deleteFlightDtls(id);
    }
    
}
