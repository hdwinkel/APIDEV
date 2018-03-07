package de.egladil.winkel;

import org.skife.jdbi.v2.DBI;

import de.egladil.winkel.health.DatabaseHealthCheck;
import io.dropwizard.Application;
import io.dropwizard.db.PooledDataSourceFactory;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class APIDevServerApplication extends Application<APIDevServerConfiguration> {

    public static void main(final String[] args) throws Exception {
        new APIDevServerApplication().run(args);
    }

    @Override
    public String getName() {
        return "APIDevServer";
    }

    
    @Override
    public void initialize(Bootstrap<APIDevServerConfiguration> bootstrap) {
      bootstrap.addBundle(new MigrationsBundle<APIDevServerConfiguration>() {
        @Override
        public PooledDataSourceFactory getDataSourceFactory(final APIDevServerConfiguration configuration) {
          return configuration.getDataSourceFactory();
        }
      });
      // bootstrap.addBundle(new AssetsBundle("/assets/"));
    }
    
    
    
    @Override
    public void run(APIDevServerConfiguration configuration, Environment environment) throws Exception {
      final DBIFactory factory = new DBIFactory();
      final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "mysql");

/*      
      final MyDao dao = jdbi.onDemand(MyDao.class);

      environment.jersey().register(new HtmlPageResource());
      environment.jersey().register(new BrandResource(dao));
      environment.jersey().register(new UserResource(dao));
      environment.jersey().register(new KeywordResource(dao));
      environment.jersey().register(new CampaignResource(dao));
      environment.jersey().register(new CampaignHasKeywordResource(dao));
      environment.jersey().register(new CompetitorResource(dao));
*/

      environment.healthChecks().register("health",
          new DatabaseHealthCheck(jdbi, configuration.getDataSourceFactory().getValidationQuery()));
    }
    
    
}
