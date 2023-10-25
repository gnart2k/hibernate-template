package fa.training.repository;

import fa.training.entities.MovieTheater.CinemaRoom;

public class RoomRepo extends Repo<CinemaRoom> {
  public RoomRepo() {
    super(CinemaRoom.class);
  }
}
