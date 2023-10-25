package fa.training.service;

import fa.training.entities.MovieTheater.Seat;
import java.util.List;

public interface ISeatService {
  List<Seat> findAllSeat();

  boolean addSeat(Seat seat);

  boolean removeSeat(Seat seat);

  boolean updateSeat(Seat seat);

  Seat findOneSeat(long id);
}
