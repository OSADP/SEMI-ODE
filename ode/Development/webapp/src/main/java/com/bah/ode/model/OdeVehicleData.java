package com.bah.ode.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.asn.OdeDateTime;
import com.bah.ode.asn.OdePosition3D;
import com.bah.ode.asn.OdeVehicleSize;
import com.bah.ode.asn.oss.Oss;
import com.bah.ode.asn.oss.dsrc.AccelerationSet4Way;
import com.bah.ode.asn.oss.dsrc.BrakeSystemStatus;
import com.bah.ode.asn.oss.dsrc.DDateTime;
import com.bah.ode.asn.oss.dsrc.Heading;
import com.bah.ode.asn.oss.dsrc.Position3D;
import com.bah.ode.asn.oss.dsrc.SteeringWheelAngle;
import com.bah.ode.asn.oss.dsrc.TransmissionAndSpeed;
import com.bah.ode.asn.oss.semi.FundamentalSituationalStatus;
import com.bah.ode.asn.oss.semi.GroupID;
import com.bah.ode.asn.oss.semi.VehSitDataMessage;
import com.bah.ode.asn.oss.semi.VehSitDataMessage.Bundle;
import com.bah.ode.asn.oss.semi.VehSitRecord;
import com.bah.ode.asn.oss.semi.VsmEventFlag;
import com.bah.ode.util.CodecUtils;
import com.oss.asn1.Coder;

public class OdeVehicleData {
	private static Logger logger = LoggerFactory.getLogger(OdeVehicleData.class);

	private String groupId;
	private OdeDateTime dateTime;
	private OdePosition3D location;
	private String speed;
	private Integer heading;
	private String steeringAngle;
	private String accelSet;
	private String brakes;
	private OdeVehicleSize size;
	private String vsmEventFlag;

	public OdeVehicleData() {
	}

	public OdeVehicleData(GroupID groupId, OdeDateTime dateTime, OdePosition3D location,
			TransmissionAndSpeed speed, Heading heading, SteeringWheelAngle steeringAngle,
			AccelerationSet4Way accelSet, BrakeSystemStatus brakes, OdeVehicleSize size,
			VsmEventFlag vsmEventFlag) 
	{
		super();
		this.groupId = CodecUtils.toHex(groupId != null ? groupId.byteArrayValue() : "".getBytes());
		this.dateTime = dateTime;
		this.location = location;
		this.speed = CodecUtils.toHex(speed != null ? speed.byteArrayValue() : "".getBytes());
		this.heading = heading != null ? heading.intValue() : 0;
		this.steeringAngle = CodecUtils.toHex(steeringAngle != null ? steeringAngle.byteArrayValue() : "".getBytes());
		this.accelSet = CodecUtils.toHex(accelSet != null ? accelSet.byteArrayValue() : "".getBytes());
		this.brakes = CodecUtils.toHex(brakes != null ? brakes.byteArrayValue() : "".getBytes());
		this.size = size;
		this.vsmEventFlag = CodecUtils.toHex(vsmEventFlag != null ? vsmEventFlag.byteArrayValue() : "".getBytes());
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public OdeDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(OdeDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public OdePosition3D getLocation() {
		return location;
	}

	public void setLocation(OdePosition3D location) {
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

	public OdeVehicleSize getSize() {
		return size;
	}

	public void setSize(OdeVehicleSize size) {
		this.size = size;
	}

	public String getVsmEventFlag() {
		return vsmEventFlag;
	}

	public void setVsmEventFlag(String vsmEventFlag) {
		this.vsmEventFlag = vsmEventFlag;
	}


	public static List<OdeVehicleData> fromBase64(String base64) {
		byte[] bytes = DatatypeConverter.parseBase64Binary(base64);
		InputStream ins = new ByteArrayInputStream(bytes);
		ArrayList<OdeVehicleData> odeDataBundle = new ArrayList<OdeVehicleData>();
		
		Coder coder = Oss.getBERCoder();
		try {
			long decodeTime = System.currentTimeMillis();
			
			do {
				try {
					VehSitDataMessage value = new VehSitDataMessage();
					coder.decode(ins, value);
					
					Bundle bundle = value.getBundle();
					
					int bSize = bundle.getSize();
					
					for (int i = 0; i < bSize; i++) {
						VehSitRecord vsr = bundle.get(i);
						DDateTime time = vsr.getTime();
						OdeDateTime dateTime = new OdeDateTime(
								time.getYear().intValue(), 
								time.getMonth().intValue(),
								time.getDay().intValue(),
								time.getHour().intValue(),
								time.getMinute().intValue(),
								time.getSecond().intValue());
						
						Position3D pos = vsr.getPos();
						OdePosition3D location = new OdePosition3D(
								pos.getLat().longValue(),
								pos.get_long().longValue(),
								pos.elevation.byteArrayValue());
						
						FundamentalSituationalStatus fund = vsr.getFundamental();
						
						OdeVehicleSize size = new OdeVehicleSize(
								fund.getVehSize().getWidth().intValue(),
								fund.getVehSize().getLength().intValue());
						
						OdeVehicleData vsd = 
								new OdeVehicleData(
										value.getGroupID(),
										dateTime, 
										location, 
										fund.getSpeed(),
										fund.getHeading(),
										fund.getSteeringAngle(),
										fund.getAccelSet(),
										fund.getBrakes(),
										size,
										fund.getVsmEventFlag());
						odeDataBundle.add(vsd);
					}
				} catch (Exception e) {
					System.out.println("Decode complete.\n" + e.getMessage());
					break;
				}
				break;
			} while (true);
			ins.close();
			
			decodeTime = System.currentTimeMillis() - decodeTime;
			
			logger.info("Decode Time: " + decodeTime + " ms");

		} catch (Exception e) {
			logger.error("", e);
		} finally {
		}
		return odeDataBundle;		
	}
	
}
