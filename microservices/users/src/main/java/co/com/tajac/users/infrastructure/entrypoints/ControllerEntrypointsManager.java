package co.com.tajac.users.infrastructure.entrypoints;

import co.com.ajac.infrastructure.api.controllers.AbstractControllerManager;
import co.com.ajac.infrastructure.api.controllers.ControllerProvider;
import co.com.tajac.users.infrastructure.entrypoints.controllers.RegistrarsController;
import io.vavr.collection.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControllerEntrypointsManager implements AbstractControllerManager{

    private final List<ControllerProvider> controllerProviders;

    @Autowired
    public ControllerEntrypointsManager(RegistrarsController registrarsController) {
        this.controllerProviders = List.of(registrarsController);
    }

    @Override
    public List<ControllerProvider> getControllerProviders() {
        return controllerProviders;
    }
}
