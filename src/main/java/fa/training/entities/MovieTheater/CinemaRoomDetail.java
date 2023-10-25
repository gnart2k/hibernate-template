package fa.training.entities.MovieTheater;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CINEMA_ROOM_DETAIL", schema = "MovieTheater")
public class CinemaRoomDetail {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "CINEMA_ROOM_DETAIL_ID")
  private int cinemaRoomDetailID;

  @Column(name = "ROOM_RATE")
  private int roomRate;

  @Column(name = "ACTIVE_DATE")
  private LocalDateTime activeDate;

  @Column(name = "ROOM_DESCRIPTION")
  private String roomDescription;

  @OneToOne
  @JoinColumn(name = "CINEMA_ROOM_ID", referencedColumnName = "CINEMA_ROOM_ID")
  private CinemaRoom cinemaRoom;
}
