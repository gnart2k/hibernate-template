package fa.training.service;

import fa.training.service.RoomDetailService;
import fa.training.entities.MovieTheater.CinemaRoomDetail;
import fa.training.repository.RoomDetailRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RoomDetailServiceTest {

    private RoomDetailService roomDetailService;
    private RoomDetailRepo roomDetailRepo;

    @BeforeEach
    public void setUp() {
        roomDetailRepo = new RoomDetailRepo();
        roomDetailService = new RoomDetailService(roomDetailRepo);
    }

    @Test
    public void testAddRoomValid() {
        CinemaRoomDetail validRoomDetail = new CinemaRoomDetail();

        boolean result = roomDetailService.addRoom(validRoomDetail);
        assertTrue(result);
    }

    @Test
    public void testAddRoomInvalid() {
        CinemaRoomDetail invalidRoomDetail = null;

        boolean result = roomDetailService.addRoom(invalidRoomDetail);
        assertFalse(result);
    }

    @Test
    public void testRemoveRoomValid() {
        List<CinemaRoomDetail> rooms = roomDetailService.getAllRooms();
        CinemaRoomDetail validRoomDetail = rooms.get(rooms.size() - 1);

        boolean result = roomDetailService.removeRoom(validRoomDetail);
        assertTrue(result);
    }

    @Test
    public void testRemoveRoomInvalid() {
        CinemaRoomDetail invalidRoomDetail = null;

        boolean result = roomDetailService.removeRoom(invalidRoomDetail);
        assertFalse(result);
    }

    @Test
    public void testUpdateRoomValid() {
        CinemaRoomDetail validRoomDetail = roomDetailService.findOneRoom(2);

        boolean result = roomDetailService.updateRoom(validRoomDetail);
        assertTrue(result);
    }

    @Test
    public void testUpdateRoomInvalid() {
        CinemaRoomDetail invalidRoomDetail = roomDetailService.findOneRoom(-1);

        boolean result = roomDetailService.updateRoom(invalidRoomDetail);
        assertFalse(result);
    }

    @Test
    public void testFindOneRoomValid() {
        long roomDetailId = 2;
        CinemaRoomDetail roomDetail = roomDetailService.findOneRoom(roomDetailId);
        assertNotNull(roomDetail);
    }

    @Test
    public void testFindOneRoomInvalid() {
        long invalidRoomDetailId = -1; // Use an invalid room detail ID
        CinemaRoomDetail roomDetail = roomDetailService.findOneRoom(invalidRoomDetailId);
        assertNull(roomDetail);
    }


}
