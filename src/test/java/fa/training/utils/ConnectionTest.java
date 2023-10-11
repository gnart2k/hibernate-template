package fa.training.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ConnectionTest {
    @Test
    public void testIsDatabaseConnected() {
        // Create a mock for the DatabaseService
        Session session = Connection.getSession();
        assertNotNull(session);
    }

}