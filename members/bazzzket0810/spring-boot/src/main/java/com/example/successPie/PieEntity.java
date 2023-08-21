package com.example.successPie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/** Entity class representing a pie chart data entry. */
@Entity
@Table(name = "pie")
public class PieEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String user;

  private int myPercent;
  private int leftPercent;

  /**
   * Retrieves the user associated with this pie chart data entry.
   *
   * @return The user associated with the pie chart data.
   */
  public String getUser() {
    return user;
  }

  /**
   * Sets the user associated with this pie chart data entry.
   *
   * @param user The user to set for the pie chart data.
   */
  public void setUser(String user) {
    this.user = user;
  }

  /**
   * Retrieves the user's specific success percentage.
   *
   * @return The user's success percentage.
   */
  public int getMyPercent() {
    return myPercent;
  }

  /**
   * Sets the user's specific success percentage.
   *
   * @param myPercent The user's success percentage to set.
   */
  public void setMyPercent(int myPercent) {
    this.myPercent = myPercent;
  }

  /**
   * Retrieves the remaining success percentage.
   *
   * @return The remaining success percentage.
   */
  public int getLeftPercent() {
    return leftPercent;
  }

  /**
   * Sets the remaining success percentage.
   *
   * @param leftPercent The remaining success percentage to set.
   */
  public void setLeftPercent(int leftPercent) {
    this.leftPercent = leftPercent;
  }
}
