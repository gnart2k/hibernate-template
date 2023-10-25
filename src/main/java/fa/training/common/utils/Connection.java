package fa.training.common.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Connection {
  private static final SessionFactory sf;

  static {
    try {
      Configuration conf = new Configuration();
      conf.configure("hibernate.cfg.xml");
      conf.addAnnotatedClass(fa.training.entities.MovieTheater.Seat.class);
      conf.addAnnotatedClass(fa.training.entities.MovieTheater.CinemaRoomDetail.class);
      conf.addAnnotatedClass(fa.training.entities.MovieTheater.CinemaRoom.class);

      sf = conf.buildSessionFactory();
    } catch (Throwable e) {
      throw new ExceptionInInitializerError(e.getMessage());
    }
  }

  public static Session getSession() {
    return sf.openSession();
  }
}
