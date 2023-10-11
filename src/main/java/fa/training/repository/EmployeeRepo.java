package fa.training.repository;

import fa.training.entities.Employee;
import fa.training.utils.Connection;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class EmployeeRepo {
    public Session session;
    public boolean addEmployee(Employee employee){
        try(Session session = Connection.getSession()){
            Transaction transaction = null;
            try{
                transaction = session.beginTransaction();
                session.persist(employee);
                transaction.commit();
                return true;
            }catch (Exception e){
                if(transaction != null){
                    transaction.rollback();
                }
                e.printStackTrace();
                return false;
            }

        }
    }

    public List<Employee> getEmployees() {
        try (Session session = Connection.getSession()) {
            Query<Employee> query = session.createQuery("FROM Employee", Employee.class);
            return query.getResultList();

        } catch (Exception e) {
            return new ArrayList<Employee>();
        }
    }
}