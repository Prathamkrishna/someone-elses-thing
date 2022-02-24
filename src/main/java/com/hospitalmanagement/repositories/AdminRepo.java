package com.hospitalmanagement.repositories;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class AdminRepo {
    private final JdbcTemplate jdbcTemplate;

 public AdminRepo(JdbcTemplate jdbcTemplate) {
  this.jdbcTemplate = jdbcTemplate;
 }

 public void addUser(String patient){
  String sql = "Insert into hospitalPatient (name) values (" + patient + ")";
  jdbcTemplate.execute(sql);
 }
}
