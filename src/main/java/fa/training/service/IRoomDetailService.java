package fa.training.service;

import fa.training.entities.MovieTheater.CinemaRoomDetail;
import java.util.List;

public interface IRoomDetailService {
  List<CinemaRoomDetail> getAllRooms();

  boolean addRoom(CinemaRoomDetail cinemaRoomDetail);

  boolean removeRoom(CinemaRoomDetail cinemaRoomDetail);

  boolean updateRoom(CinemaRoomDetail cinemaRoomDetail);

  CinemaRoomDetail findOneRoom(long id);
}
