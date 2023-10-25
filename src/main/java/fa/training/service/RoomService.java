package fa.training.service;

import fa.training.entities.MovieTheater.CinemaRoom;
import fa.training.repository.RoomRepo;
import java.util.Collections;
import java.util.List;

public class RoomService implements IRoomService {
  private RoomRepo roomRepo;

  public RoomService(RoomRepo roomRepo) {
    this.roomRepo = roomRepo;
  }

  @Override
  public List<CinemaRoom> getAllRooms() {
    try {
      return roomRepo.findAll();
    } catch (Exception e) {
      e.printStackTrace();
      return Collections.emptyList();
    }
  }

  @Override
  public boolean addRoom(CinemaRoom cinemaRoom) {
    try {
      return roomRepo.add(cinemaRoom);
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  @Override
  public boolean removeRoom(CinemaRoom cinemaRoom) {
    try {
      boolean roomAvailable = findOneRoom(cinemaRoom.getCinemaRoomId()) != null;
      if(!roomAvailable){
        return false;
      }
      return roomRepo.delete(cinemaRoom);
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  @Override
  public boolean updateRoom(CinemaRoom cinemaRoom) {
    try {
      return roomRepo.update(cinemaRoom);
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  @Override
  public CinemaRoom findOneRoom(long id) {
    try {
      return roomRepo.findOne(id);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
}
