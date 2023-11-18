package co.com.tajac.users.infrastructure.entrypoints.controllers;


import co.com.ajac.infrastructure.api.commands.Command;
import co.com.ajac.infrastructure.api.commands.Request;
import co.com.ajac.infrastructure.api.controllers.ControllerProvider;
import com.fasterxml.jackson.databind.JsonNode;
import io.vavr.Tuple2;
import io.vavr.collection.List;
import io.vavr.control.Option;
import io.vavr.control.Try;
import org.springframework.stereotype.Component;

@Component
public class RegistrarsController extends ControllerProvider {



    @Override
    public Option<Command> provide(String s) {
        return RegistrasCommandName.getCommandName(s)
          .flatMap(commands::get)
          .map(Tuple2::_1);
    }

    @Override
    public Try<Request> deserialize(JsonNode jsonNode, String s) {
        return null;
    }
}
