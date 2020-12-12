import java.util.*;
public enum DayOfWeek {

  SUNDAY ("Воскресенье"),
  MONDAY ("Понедельник"),
  TUESDAY ("Вторник"),
  WEDNESDAY ("wednesday"),
  THURSDAY ("Четверг"),
  FRIDAY ("Пятница"),
  SATURDAY ("Суббота");

  private String title;

  private DayOfWeek(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
   }

  public void setTitle(String title) {
    this.title=title;
   }

  @Override
  public String toString() {
    return "Day of the week:" + title;
   }
}