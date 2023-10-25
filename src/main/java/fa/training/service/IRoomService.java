package fa.training.service;

import fa.training.entities.MovieTheater.CinemaRoom;
import java.util.List;

/** IRoomService */
public interface IRoomService {
  List<CinemaRoom> getAllRooms();

  boolean addRoom(CinemaRoom cinemaRoom);

  boolean removeRoom(CinemaRoom cinemaRoom);

  boolean updateRoom(CinemaRoom cinemaRoom);

  CinemaRoom findOneRoom(long id);
}
