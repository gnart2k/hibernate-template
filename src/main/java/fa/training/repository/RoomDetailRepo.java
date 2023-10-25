package fa.training.repository;

import fa.training.entities.MovieTheater.CinemaRoomDetail;

public class RoomDetailRepo extends Repo<CinemaRoomDetail> {
  public RoomDetailRepo() {
    super(CinemaRoomDetail.class);
  }
}
