package de.egladil.winkel.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.egladil.winkel.core.RawMeterMeasure;
import de.egladil.winkel.db.RawMeterMeasureDao;

@Path("/rawmetermonthly")
public class RawMeterMeasureResource {

	private RawMeterMeasureDao rawMeterMeasureDao;

	  public RawMeterMeasureResource(RawMeterMeasureDao rawMeterMeasureDao) {
	    this.rawMeterMeasureDao = rawMeterMeasureDao;
	  }

	  @GET
	  @Path("/{metershort}")
	  @Produces({MediaType.APPLICATION_JSON})
	  public List<RawMeterMeasure> getRawMeterMeasureMonthlyList(@PathParam("metershort") String raw_meter_short) {
		  System.out.println("param: "+ raw_meter_short);  
	    return rawMeterMeasureDao.getMeasuresForMeterMonthlyList(raw_meter_short);
	  }
	
}
