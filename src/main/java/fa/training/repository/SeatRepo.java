package fa.training.repository;

import fa.training.entities.MovieTheater.Seat;

public class SeatRepo extends Repo<Seat> {
  public SeatRepo() {
    super(Seat.class);
  }
}
