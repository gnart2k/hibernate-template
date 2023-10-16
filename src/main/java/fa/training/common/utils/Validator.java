package fa.training.common.utils;

import java.util.ArrayList;

public class Validator {

  // public static boolean isSeatStatus(String status) {
  //   if (status.equals("Available") || status.equals("Not Available") || status.equals("Booked"))
  // {
  //     return true;
  //   }
  //   return false;
  // }
  //
  // public static boolean isSeatType(String type) {
  //   if (type.equals("VIP") || type.equals("normal")) {
  //     return true;
  //   }
  //   return false;
  // }
  public static boolean checkEqualString(ArrayList<String> strArray, String checkString) {
    boolean result = strArray.stream().anyMatch(c -> c.equals(checkString));
    return result;
  }
}
