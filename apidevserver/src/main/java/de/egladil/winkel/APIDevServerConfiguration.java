package de.egladil.winkel;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

public class APIDevServerConfiguration extends Configuration {
/*
	
	// TODO: implement service configuration
	@Valid
    @NotNull
    @JsonProperty("database")
    private DataSourceFactory database = new DataSourceFactory();

	@JsonProperty("database")
    public DataSourceFactory getDataSourceFactory() {
        return database;
    }
	
    @JsonProperty("database")
    public void setDataSourceFactory(DataSourceFactory factory) {
      this.database = factory;
    }
*/
  
	  @Valid
	  @NotNull
	  private DataSourceFactory database = new DataSourceFactory();

	  @JsonProperty("database")
	  public void setDataSourceFactory(DataSourceFactory factory) {
	    this.database = factory;
	  }

	  @JsonProperty("database")
	  public DataSourceFactory getDataSourceFactory() {
	    return database;
	  }
	
    
}
