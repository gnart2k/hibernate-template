package fa.training;

import static org.junit.jupiter.api.Assertions.*;

import fa.training.entities.MovieTheater.CinemaRoom;
import fa.training.entities.MovieTheater.Seat;
import fa.training.repository.RoomRepo;
import fa.training.repository.SeatRepo;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LazyEagerTest {
  RoomRepo roomRepo = new RoomRepo();
  SeatRepo seatRepo = new SeatRepo();
  CinemaRoom room = new CinemaRoom();
  List<CinemaRoom> rooms = new ArrayList<CinemaRoom>();
  Seat seat = new Seat();

  @BeforeEach
  public void setUpEach() {}

  // @Test
  // @DisplayName("find all CinemaRoom")
  // public void findAllCinema() {
  //   try {
  //     rooms = roomRepo.findAll();
  //   } catch (Exception e) {
  //     e.printStackTrace();
  //   }
  //   assertTrue(rooms.size() >= 1);
  // }
  //
  // @Test
  // public void testAdd() {
  //   boolean result = false;
  //   try {
  //     result = seatRepo.add(seat);
  //   } catch (Exception e) {
  //     e.printStackTrace();
  //   }
  //   assertTrue(result);
  // }

  @Test
  public void testFindOne() {
    int id = 1;
    try {
      assertTrue(roomRepo.findOne(id) != null);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // @Test
  // public void findOneSeat() {
  //   int id = 1;
  //   try {
  //     seatRepo.findOne(id);
  //   } catch (Exception e) {
  //     e.printStackTrace();
  //   }
  // }
}
