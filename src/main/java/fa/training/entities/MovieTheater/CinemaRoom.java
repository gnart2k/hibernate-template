package fa.training.entities.MovieTheater;

import jakarta.persistence.*;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "CINEMA_ROOM", schema = "MovieTheater")
public class CinemaRoom {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "CINEMA_ROOM_ID")
  private int cinemaRoomId;

  @Column(
      name = "CINEMA_ROOM_NAME",
      unique = true) // Define the custom column name for cinemaRoomName
  private String cinemaRoomName;

  @Column(name = "SEAT_QUANTITY") // Define the custom column name for seatQuantity
  private int seatQuantity;

  // @OneToMany(
  //     cascade = CascadeType.ALL,
  //     mappedBy = "cinemaRoom",
  //     fetch = FetchType.LAZY) // Define the custom column name for
  // private Set<Seat> seats;
  @OneToMany(
      cascade = CascadeType.ALL,
      mappedBy = "cinemaRoom") // Define the custom column name for
  private Set<Seat> seats;

  @OneToOne(mappedBy = "cinemaRoom") // Define the custom column
  private CinemaRoomDetail cinemaRoomDetail;
}
