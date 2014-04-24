package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Message extends Model
{
    public String text;
}
