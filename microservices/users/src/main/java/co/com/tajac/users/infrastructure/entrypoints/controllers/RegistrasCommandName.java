package co.com.tajac.users.infrastructure.entrypoints.controllers;

import co.com.ajac.infrastructure.api.commands.CommandName;
import io.vavr.collection.List;
import io.vavr.control.Option;

enum RegistrasCommandName implements CommandName {
    REGISTER_USER("RegisterUser");


    private final String name;

    RegistrasCommandName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public static Option<RegistrasCommandName> getCommandName(String name) {
        return List.of(RegistrasCommandName.values())
          .find(commandName -> commandName.name.equals(name));
    }
}
