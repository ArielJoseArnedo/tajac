package co.com.tajac.users.domain.models;

import java.util.UUID;

import static org.immutables.value.Value.Immutable;
import static org.immutables.value.Value.Parameter;

@Immutable
public interface User {

    @Parameter
    UUID id();

    @Parameter
    String names();

    @Parameter
    StateUser state();

    @Parameter
    String pais();

    @Parameter
    String phone();

    @Parameter
    UUID idAuthentication();
}
