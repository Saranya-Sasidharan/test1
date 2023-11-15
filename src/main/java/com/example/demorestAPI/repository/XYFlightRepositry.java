package com.example.demorestAPI.repository;

import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.demorestAPI.model.XYFlightDetail;

import java.util.ArrayList;
import java.util.List;

@Repository
public class XYFlightRepositry {

	private List<XYFlightDetail> list = new ArrayList<XYFlightDetail>();

    public void createFlightDtls() {
        list = List.of(
                new XYFlightDetail(11,"chennai","MAA","Hyderabad","HYD","2-hrs"),
                new XYFlightDetail(12,"chennai","MAA","Bangalore","BAN","2-hrs"),
                new XYFlightDetail(13,"chennai","MAA","kochi","KOC","2-hrs")
        );
    }

    public List<XYFlightDetail> getAllFlightDtls() {
        return list;
    }

    public XYFlightDetail findById(int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFlight_Id() == (id)) {
                return list.get(i);
            }
        }
        return null;
    }

    public List<XYFlightDetail> search(String duration) {
        return list.stream().filter(x -> x.getDuration_time().startsWith(duration)).collect(Collectors.toList());
    }

    public XYFlightDetail save(XYFlightDetail xYFlight) {
    	XYFlightDetail flightDtl = new XYFlightDetail();
        flightDtl.setFlight_Id(xYFlight.getFlight_Id());
        flightDtl.setOrigin_airport(xYFlight.getOrigin_airport());
        flightDtl.setOrigin_code(xYFlight.getOrigin_code());
        flightDtl.setDest_airport(xYFlight.getDest_airport());
        flightDtl.setDest_code(xYFlight.getDest_code());
        flightDtl.setDuration_time(xYFlight.getDuration_time());
        list.add(flightDtl);
        return flightDtl;
    }

    public String delete(Integer id) {
        list.removeIf(x -> x.getFlight_Id() == (id));
        return null;
    }

    public XYFlightDetail update(XYFlightDetail xYFlightDetail) {
        int idx = 0;
        int id = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFlight_Id() == (xYFlightDetail.getFlight_Id())) {
                id = xYFlightDetail.getFlight_Id();
                idx = i;
                break;
            }
        }

        XYFlightDetail flightDtls = new XYFlightDetail();
        flightDtls.setFlight_Id(id);
        flightDtls.setOrigin_airport(xYFlightDetail.getOrigin_airport());
        flightDtls.setOrigin_code(xYFlightDetail.getOrigin_code());
        flightDtls.setDest_airport(xYFlightDetail.getDest_airport());
        flightDtls.setDest_code(xYFlightDetail.getDest_code());
        flightDtls.setDuration_time(xYFlightDetail.getDuration_time());
        list.set(idx, xYFlightDetail);
        return flightDtls;
    }
	
}
