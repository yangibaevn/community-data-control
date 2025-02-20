package edu.spbu.datacontrol.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Data;
import jakarta.persistence.Id;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Data
@Table(name = "event_log")
public class Event {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  String type;

  @CreatedDate
  Date createdAt;

  String previousValue;

  String newValue;

  String description;

}
