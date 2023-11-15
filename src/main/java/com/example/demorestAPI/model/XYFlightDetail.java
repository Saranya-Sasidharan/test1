package com.example.demorestAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class XYFlightDetail {

	private int flight_Id;

    private String origin_airport;

	private String origin_code;

    private String dest_airport;

	private String dest_code;

	private String duration_time;


	public int getFlight_Id() {
		return flight_Id;
	}

	public void setFlight_Id(int flight_Id) {
		this.flight_Id = flight_Id;
	}

	public String getOrigin_airport() {
		return origin_airport;
	}

	public void setOrigin_airport(String origin_airport) {
		this.origin_airport = origin_airport;
	}

	public String getOrigin_code() {
		return origin_code;
	}

	public void setOrigin_code(String origin_code) {
		this.origin_code = origin_code;
	}

	public String getDest_airport() {
		return dest_airport;
	}

	public void setDest_airport(String dest_airport) {
		this.dest_airport = dest_airport;
	}

	public String getDest_code() {
		return dest_code;
	}

	public void setDest_code(String dest_code) {
		this.dest_code = dest_code;
	}

	public String getDuration_time() {
		return duration_time;
	}

	public void setDuration_time(String duration_time) {
		this.duration_time = duration_time;
	}


	public XYFlightDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public XYFlightDetail(int flight_Id, String origin_airport, String origin_code, String dest_airport,
			String dest_code, String duration_time) {
		super();
		this.flight_Id = flight_Id;
		this.origin_airport = origin_airport;
		this.origin_code = origin_code;
		this.dest_airport = dest_airport;
		this.dest_code = dest_code;
		this.duration_time = duration_time;
	}

	
}
