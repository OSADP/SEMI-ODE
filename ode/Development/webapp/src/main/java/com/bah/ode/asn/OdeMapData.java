package com.bah.ode.asn;

import java.util.List;

import com.bah.ode.asn.oss.dsrc.MapData;

public class OdeMapData {
	private String name;
	private OdeLayerType layerType;
	private Integer layerId;
	private List<OdeIntersection> intersections;

	public OdeMapData(String name, OdeLayerType layerType, Integer layerId,
         List<OdeIntersection> intersections) {
	   super();
	   this.name = name;
	   this.layerType = layerType;
	   this.layerId = layerId;
	   this.intersections = intersections;
   }

	public OdeMapData(MapData mapData) {
		this.setName(mapData.getName() != null ? mapData.getName().stringValue() : null);
		this.setLayerType(mapData.getLayerType() != null ? OdeLayerType.values[(int) mapData.getLayerType().longValue()] : null);
		this.setLayerId(mapData.getLayerID() != null ? mapData.getLayerID().intValue() : null);
		this.intersections = mapData.getIntersections() != null ? OdeIntersection.create(mapData.getIntersections()) : null;
   }

	public String getName() {
		return name;
	}

	public OdeMapData setName(String name) {
		this.name = name;
		return this;
	}

	public OdeLayerType getLayerType() {
		return layerType;
	}

	public OdeMapData setLayerType(OdeLayerType layerType) {
		this.layerType = layerType;
		return this;
	}

	public Integer getLayerId() {
		return layerId;
	}

	public OdeMapData setLayerId(Integer layerId) {
		this.layerId = layerId;
		return this;
	}

	public List<OdeIntersection> getIntersections() {
		return intersections;
	}

	public OdeMapData setIntersections(List<OdeIntersection> intersections) {
		this.intersections = intersections;
		return this;
	}

	
}
