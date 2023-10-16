package fa.training.entities.MovieTheater;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Builder
@Data
@Table(name = "SEAT", schema = "MovieTheater")

public class Seat {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "SEAT_ID")
  private int SeatId;
  @Column(name = "SEAT_COLUMN")
  private String seatCollumn;
  @Column(name = "SEAT_ROW")
  private int seatRow;
  @Column ( name = "SEAT_STATUS")
  private String seatStatus;
  @Column ( name = "SEAT_TYPE")
  private String seatType;

  @ManyToOne
  @JoinColumn(name = "CINEMA_ROOM_ID",
          referencedColumnName = "CINEMA_ROOM_ID")
  private CinemaRoom cinemaRoom;
}
