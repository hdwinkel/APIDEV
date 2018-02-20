package de.egladil.winkel;

import io.dropwizard.Application;
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
    public void initialize(final Bootstrap<APIDevServerConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final APIDevServerConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
