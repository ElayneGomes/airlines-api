package br.com.caelum.clines.api.users;

import br.com.caelum.clines.shared.domain.User;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class UserViewMapperTest {

    private final String NAME = "Fulano";
    private final String EMAIL = "fulano@teste.com";
    private final String PASSWORD = "123456";

    private UserViewMapper mapper;

    @Test
    void shouldConvertUserToUserView() {
        var user = new User(NAME, EMAIL, PASSWORD);
        mapper = new UserViewMapper();

        var userView = mapper.map(user);

        assertEquals(NAME, userView.getName());
        assertEquals(EMAIL, userView.getEmail());
    }

}

