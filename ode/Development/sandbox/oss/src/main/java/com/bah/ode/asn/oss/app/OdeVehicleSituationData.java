package com.bah.ode.asn.oss.app;

import com.fasterxml.jackson.databind.ObjectMapper;

public class OdeVehicleSituationData {

	private OdeDateTime dateTime;
	private Location3D location;
	private String speed;
   private Integer heading;
   private String steeringAngle;
   private String accelSet;
   private String brakes;
   private VehicleSize size;
   
   
	
	public OdeVehicleSituationData() {
   }



	public OdeVehicleSituationData(OdeDateTime dateTime, Location3D location,
         String speed, Integer heading, String steeringAngle, String accelSet,
         String brakes, VehicleSize size) {
	   super();
	   this.dateTime = dateTime;
	   this.location = location;
	   this.speed = speed;
	   this.heading = heading;
	   this.steeringAngle = steeringAngle;
	   this.accelSet = accelSet;
	   this.brakes = brakes;
	   this.size = size;
   }



	public OdeDateTime getDateTime() {
		return dateTime;
	}



	public void setDateTime(OdeDateTime dateTime) {
		this.dateTime = dateTime;
	}



	public Location3D getLocation() {
		return location;
	}



	public void setLocation(Location3D location) {
		this.location = location;
	}



	public String getSpeed() {
		return speed;
	}



	public void setSpeed(String speed) {
		this.speed = speed;
	}



	public Integer getHeading() {
		return heading;
	}



	public void setHeading(Integer heading) {
		this.heading = heading;
	}



	public String getSteeringAngle() {
		return steeringAngle;
	}



	public void setSteeringAngle(String steeringAngle) {
		this.steeringAngle = steeringAngle;
	}



	public String getAccelSet() {
		return accelSet;
	}



	public void setAccelSet(String accelSet) {
		this.accelSet = accelSet;
	}



	public String getBrakes() {
		return brakes;
	}



	public void setBrakes(String brakes) {
		this.brakes = brakes;
	}



	public VehicleSize getSize() {
		return size;
	}



	public void setSize(VehicleSize size) {
		this.size = size;
	}



	public String toJson() {
		String msg = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			msg = mapper.writeValueAsString(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

}
