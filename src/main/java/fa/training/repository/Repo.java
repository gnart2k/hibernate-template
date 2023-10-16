package fa.training.repository;

import fa.training.common.utils.Connection;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class Repo<T> {
  private Class<T> entityType;

  public Repo(Class<T> entityType) {
    this.entityType = entityType;
  }

  public List<T> findAll() throws Exception {
    try (Session session = Connection.getSession()) {
      Query<T> query = session.createQuery("FROM " + entityType.getName(), entityType);
      return query.list();
    }
  }

  public T findOne(long id) throws Exception {
    try (Session session = Connection.getSession()) {
      return session.get(entityType, id);
    }
  }

  public boolean add(T entity) throws Exception {
    try (Session session = Connection.getSession()) {
      session.beginTransaction();
      session.persist(entity);
      session.getTransaction().commit();
      return true;
    }
  }

  public boolean update(T entity) throws Exception {
    try (Session session = Connection.getSession()) {
      session.beginTransaction();
      session.merge(entity);
      session.getTransaction().commit();
      return true;
    }
  }

  public boolean delete(T entity) throws Exception {
    try (Session session = Connection.getSession()) {
      session.beginTransaction();
      session.remove(entity);
      session.getTransaction().commit();
      return true;
    }
  }
}
