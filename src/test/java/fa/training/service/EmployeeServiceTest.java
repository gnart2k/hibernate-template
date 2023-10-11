package fa.training.service;

import fa.training.entities.Employee;
import fa.training.repository.EmployeeRepo;
import fa.training.utils.Connection;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.Arrays;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class EmployeeServiceTest {


    @InjectMocks
    private EmployeeRepo employeeRepo = new EmployeeRepo();

    @Mock
    private Session session;

    @Mock
    private Transaction transaction;

    @Mock
    private Query<Employee> query;

    @Test
    void testAddEmployee() {
        Employee employee = Employee.builder().employeeName("trang").build();
        when(session.beginTransaction()).thenReturn(transaction);
        doNothing().when(session).persist(employee);

        boolean result = employeeRepo.addEmployee(employee);
        assertTrue(result);
    }

    @Test
    void testGetALlEmployee(){

    }
}