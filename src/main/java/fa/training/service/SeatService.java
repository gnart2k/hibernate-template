package fa.training.service;

import fa.training.common.utils.Validator;
import fa.training.entities.MovieTheater.Seat;
import fa.training.repository.SeatRepo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SeatService implements ISeatService {
  private SeatRepo seatRepo;


  ArrayList<String> status;
  ArrayList<String> type;

  public SeatService(SeatRepo seatRepo, ArrayList<String> status, ArrayList<String> type) {
    this.seatRepo = seatRepo;
    this.status = new ArrayList<String>(Arrays.asList("Available", "Not Available, Booked"));;
    this.type = new ArrayList<String>(Arrays.asList("VIP", "Normal"));;
  }

  @Override
  public List<Seat> findAllSeat() {
    try {
      return seatRepo.findAll();
    } catch (Exception e) {
      e.printStackTrace();
      return Collections.emptyList();
    }
  }

  @Override
  public boolean addSeat(Seat seat) {
    try {

      if (!Validator.checkEqualString(status, seat.getSeatStatus())) throw new Exception("Invalid status");;

      if(!Validator.checkEqualString(type, seat.getSeatType()))  throw new Exception("Invalid seat type");

      return seatRepo.add(seat);
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  @Override
  public boolean removeSeat(Seat seat) {
    try {
      boolean availble = findOneSeat(seat.getSeatId()) != null;
      if (!availble){
        return false;
      }
      return seatRepo.delete(seat);
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  @Override
  public boolean updateSeat(Seat seat) {
    try {

      if (!Validator.checkEqualString(status, seat.getSeatStatus())) throw new Exception("Invalid status");;

      if(!Validator.checkEqualString(type, seat.getSeatType()))  throw new Exception("Invalid seat type");

      return seatRepo.update(seat);
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  @Override
  public Seat findOneSeat(long id) {
    try {
      return seatRepo.findOne(id);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }


}
