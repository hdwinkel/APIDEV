package de.egladil.winkel.db;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import de.egladil.winkel.core.RawMeterMeasure;


public interface RawMeterMeasureDao {

	
	@SqlQuery("SELECT country," +
			"    site_name, bu_type, bu_code," + 
			"    reading_time," +
			"    raw_meter_name, raw_meter_short, " + 
			"    raw_meter_value," + 
			"    raw_meter_unit " + 
			"FROM" + 
			"    energy_raw.raw_input_de " + 
			"WHERE" + 
			"    raw_meter_short = :raw_meter_short and TIME(reading_time) = '00:00:00' and (last_day(reading_time)=DATE(reading_time) OR DAY(reading_time)=1) " + 
			"ORDER BY site_name , raw_meter_name , reading_time , raw_meter_value , raw_meter_unit") 
	@Mapper(RawMeterMeasureMapper.class)
	public List<RawMeterMeasure> getMeasuresForMeterMonthlyList(@Bind("raw_meter_short") String raw_meter_short);
	
/*	
show all values for din1_stand for first and last day of month
---------------------------------------------------------------------
SELECT 
    site_name,
    raw_meter_name,
    reading_time,
    raw_meter_value,
    raw_meter_unit
FROM
    energy_raw.raw_input_de
WHERE
    raw_meter_short = 'din1_stand' and TIME(reading_time) = '00:00:00' and (last_day(reading_time)=DATE(reading_time) OR DAY(reading_time)=1)
ORDER BY site_name , raw_meter_name , reading_time , raw_meter_value , raw_meter_unit
	
*/
	
	
	
	
}
