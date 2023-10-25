package fa.training.service;
import fa.training.service.RoomService;
import fa.training.entities.MovieTheater.CinemaRoom;
import fa.training.repository.RoomRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RoomServiceTest {

    private RoomService roomService;
    private RoomRepo roomRepo;

    @BeforeEach
    public void setUp() {
        roomRepo = new RoomRepo(); // Create an actual RoomRepo (you can use a test implementation)
        roomService = new RoomService(roomRepo);
    }

    @Test
    public void testAddRoomValid() {
        CinemaRoom validRoom = new CinemaRoom();

        boolean result = roomService.addRoom(validRoom);
        assertTrue(result);
    }

    @Test
    public void testAddRoomInvalid() {
        CinemaRoom invalidRoom = null;

        boolean result = roomService.addRoom(invalidRoom);
        assertFalse(result);
    }

    @Test
    public void testRemoveRoomValid() {
        List<CinemaRoom> cm = roomService.getAllRooms();
        CinemaRoom validRoom = cm.get(cm.size() -1);

        boolean result = roomService.removeRoom(validRoom);
        assertTrue(result);
    }

    @Test
    public void testRemoveRoomInvalid() {
        CinemaRoom invalidRoom = createRoomToRemove();

        boolean result = roomService.removeRoom(invalidRoom);
        assertFalse(result);
    }

    @Test
    public void testUpdateRoomValid() {
        CinemaRoom validRoom = createValidRoom();

        boolean result = roomService.updateRoom(validRoom);
        assertTrue(result);
    }

    @Test
    public void testUpdateRoomInvalid() {
        CinemaRoom invalidRoom = createInvalidRoom();

        boolean result = roomService.updateRoom(invalidRoom);
        assertFalse(result);
    }

    @Test
    public void testFindOneRoomValid() {
        long roomId = 2; // Replace with a valid room ID
        CinemaRoom room = roomService.findOneRoom(roomId);
        assertNotNull(room);
    }

    @Test
    public void testFindOneRoomInvalid() {
        long invalidRoomId = -1; // Use an invalid room ID
        CinemaRoom room = roomService.findOneRoom(invalidRoomId);
        assertNull(room);
    }

    // Helper methods to create sample CinemaRoom objects for testing
    private CinemaRoom createValidRoom() {
        CinemaRoom room = roomService.findOneRoom(2);
        room.setSeatQuantity(10);
        return room;
    }

    private CinemaRoom createInvalidRoom() {
        CinemaRoom room = new CinemaRoom();
        room.setCinemaRoomName("Room B");
        return room;
    }

    private CinemaRoom createRoomToRemove() {
        CinemaRoom room = new CinemaRoom();
        // Set properties as needed
        return room;
    }
}
