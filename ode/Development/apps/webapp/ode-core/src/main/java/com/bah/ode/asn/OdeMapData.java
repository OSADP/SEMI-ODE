/*******************************************************************************
 * Copyright (c) 2015 US DOT - Joint Program Office
 *
 * The Government has unlimited rights to all documents/material produced under 
 * this task order. All documents and materials, to include the source code of 
 * any software produced under this contract, shall be Government owned and the 
 * property of the Government with all rights and privileges of ownership/copyright 
 * belonging exclusively to the Government. These documents and materials may 
 * not be used or sold by the Contractor without written permission from the CO.
 * All materials supplied to the Government shall be the sole property of the 
 * Government and may not be used for any other purpose. This right does not 
 * abrogate any other Government rights.
 *
 * Contributors:
 *     Booz | Allen | Hamilton - initial API and implementation
 *******************************************************************************/
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
