package com.bah.ode.asn.oss.app;

import com.bah.ode.asn.oss.dsrc.AccelerationSet4Way;
import com.bah.ode.asn.oss.dsrc.BrakeSystemStatus;
import com.bah.ode.asn.oss.dsrc.Heading;
import com.bah.ode.asn.oss.dsrc.SteeringWheelAngle;
import com.bah.ode.asn.oss.dsrc.TransmissionAndSpeed;
import com.bah.ode.asn.oss.semi.VsmEventFlag;
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
	private String vsmEventFlag;
	public OdeVehicleSituationData() {
	}

	public OdeVehicleSituationData(OdeDateTime dateTime, Location3D location,
			TransmissionAndSpeed speed, Heading heading, SteeringWheelAngle steeringAngle,
			AccelerationSet4Way accelSet, BrakeSystemStatus brakes, VehicleSize size,
			VsmEventFlag vsmEventFlag) {
		super();
		this.dateTime = dateTime;
		this.location = location;
		this.speed = OdeHexTool.getHex(speed != null ? speed.byteArrayValue() : "".getBytes());
		this.heading = heading != null ? heading.intValue() : 0;
		this.steeringAngle = OdeHexTool.getHex(steeringAngle != null ? steeringAngle.byteArrayValue() : "".getBytes());
		this.accelSet = OdeHexTool.getHex(accelSet != null ? accelSet.byteArrayValue() : "".getBytes());
		this.brakes = OdeHexTool.getHex(brakes != null ? brakes.byteArrayValue() : "".getBytes());
		this.size = size;
		this.vsmEventFlag = OdeHexTool.getHex(vsmEventFlag != null ? vsmEventFlag.byteArrayValue() : "".getBytes());
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

	public String getVsmEventFlag() {
		return vsmEventFlag;
	}

	public void setVsmEventFlag(String vsmEventFlag) {
		this.vsmEventFlag = vsmEventFlag;
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
