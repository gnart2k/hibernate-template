package fa.training.service;

import fa.training.entities.MovieTheater.CinemaRoomDetail;
import fa.training.repository.RoomDetailRepo;
import java.util.Collections;
import java.util.List;

public class RoomDetailService implements IRoomDetailService {
  private RoomDetailRepo roomRepo;

  @Override
  public List<CinemaRoomDetail> getAllRooms() {
    try {
      return roomRepo.findAll();
    } catch (Exception e) {
      e.printStackTrace();
      return Collections.emptyList();
    }
  }

  @Override
  public boolean addRoom(CinemaRoomDetail cinemaRoomDetail) {
    try {
      return roomRepo.add(cinemaRoomDetail);
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  @Override
  public boolean removeRoom(CinemaRoomDetail cinemaRoomDetail) {
    try {
      return roomRepo.delete(cinemaRoomDetail);
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  @Override
  public boolean updateRoom(CinemaRoomDetail cinemaRoomDetail) {
    try {
      return roomRepo.update(cinemaRoomDetail);
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  @Override
  public CinemaRoomDetail findOneRoom(long id) {
    try {
      return roomRepo.findOne(id);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
}
