package fa.training.service;
import fa.training.service.SeatService;
import fa.training.entities.MovieTheater.Seat;
import fa.training.repository.SeatRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SeatServiceTest {

    private SeatService seatService;
    private SeatRepo seatRepo;

    @BeforeEach
    public void setUp() {
        seatRepo = new SeatRepo();
        seatService = new SeatService(seatRepo, new ArrayList<String>(), new ArrayList<String>());
    }

    @Test
    public void testFindAllSeat() {
        // Implement your test here
        List<Seat> seats = seatService.findAllSeat();
        assertNotNull(seats);
    }

    @Test
    public void testAddSeatValid() {
        Seat validSeat = createValidSeat();

        boolean result = seatService.addSeat(validSeat);
        assertTrue(result);
    }

    @Test
    public void testAddSeatInvalidStatus() {
        Seat invalidSeat = createInvalidSeatWithInvalidStatus();

        boolean result = seatService.addSeat(invalidSeat);
        assertFalse(result);
    }

    @Test
    public void testRemoveSeat() {
        Seat seatToRemove = createSeatToRemove();

        boolean result = seatService.removeSeat(seatToRemove);
        assertTrue(result);
    }

    @Test
    public void testUpdateSeat() {
        Seat validSeat = createValidSeat();

        boolean result = seatService.updateSeat(validSeat);
        assertTrue(result);
    }

    @Test
    public void testFindOneSeat() {
        long seatId = 1; // Replace with a valid seat ID
        Seat seat = seatService.findOneSeat(seatId);
        assertNotNull(seat);
    }

    // Helper methods to create sample Seat objects for testing
    private Seat createValidSeat() {
        Seat seat = new Seat();
        seat.setSeatStatus("Available");
        seat.setSeatType("VIP");
        // Set other properties as needed
        return seat;
    }

    private Seat createInvalidSeatWithInvalidStatus() {
        Seat seat = new Seat();
        seat.setSeatStatus("InvalidStatus");
        seat.setSeatType("VIP");
        // Set other properties as needed
        return seat;
    }

    private Seat createSeatToRemove() {
        Seat seat = new Seat();
        // Set properties as needed
        return seat;
    }
}
