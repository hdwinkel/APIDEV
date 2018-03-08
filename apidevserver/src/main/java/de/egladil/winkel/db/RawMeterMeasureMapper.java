package de.egladil.winkel.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import de.egladil.winkel.core.RawMeterMeasure;


public class RawMeterMeasureMapper implements ResultSetMapper<RawMeterMeasure>{

	public RawMeterMeasure map(int i, ResultSet resultSet, StatementContext statementContext)throws SQLException {
		return new RawMeterMeasure( resultSet.getString("country"), resultSet.getString("site_name"), resultSet.getString("bu_type"),
				resultSet.getString("bu_code"), new Date(resultSet.getTimestamp("reading_time").getTime()), 
				resultSet.getString("raw_meter_name"), resultSet.getString("raw_meter_short"), 
				resultSet.getBigDecimal("raw_meter_value"), resultSet.getString("raw_meter_unit")
				);
	}
	
}
