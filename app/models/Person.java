package models;

import com.avaje.ebean.*;

import javax.persistence.*;

@Entity
public class Person extends Model{

  @Id
  public String id;

  public String name;
}
