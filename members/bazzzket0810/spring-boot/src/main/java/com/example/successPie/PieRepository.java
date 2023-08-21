package com.example.successPie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/** Repository interface for interacting with the pie chart data in the database. */
public interface PieRepository extends JpaRepository<PieEntity, String> {

  /**
   * Retrieves the user's specific success percentage from the database.
   *
   * @param user The user for which to retrieve the success percentage.
   * @return The user's success percentage.
   */
  @Query("SELECT p.myPercent FROM PieEntity p WHERE p.user = :user")
  int getMyPercentValue(@Param("user") String user);

  /**
   * Retrieves the remaining success percentage from the database.
   *
   * @param user The user for which to retrieve the remaining success percentage.
   * @return The remaining success percentage.
   */
  @Query("SELECT p.leftPercent FROM PieEntity p WHERE p.user = :user")
  int getLeftPercentValue(@Param("user") String user);
}
