package fa.training.repository;

import static org.junit.jupiter.api.Assertions.*;

import fa.training.entities.MovieTheater.CinemaRoom;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class RepoTest {
  RoomRepo roomRepo = new RoomRepo();
  CinemaRoom room = null;

  @BeforeEach
  public void setUpEach() {}

  @Test
  public void testAdd() {
    CinemaRoom room = new CinemaRoom();
    boolean result = false;
    try {
      result = roomRepo.add(room);
    } catch (Exception e) {
      e.printStackTrace();
    }
    assertTrue(result);
  }

  @Test
  public void testFindAll() {
    List<CinemaRoom> rooms = new ArrayList<>();
    try {
      rooms = roomRepo.findAll();
    } catch (Exception e) {
      e.printStackTrace();
    }
    assertTrue(rooms.size() >= 1);
  }

  @Test
  public void testFindOne() {}
}
