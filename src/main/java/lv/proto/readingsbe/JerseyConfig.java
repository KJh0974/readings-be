package lv.proto.readingsbe;

import lv.proto.readingsbe.controller.ReadingsResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(ReadingsResource.class);
    }
}