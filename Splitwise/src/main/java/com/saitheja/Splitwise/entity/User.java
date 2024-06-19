package com.saitheja.Splitwise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder    //Builder design pattern Annotation
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "SPLITWISE_USER")
public class User extends BaseModel {
    private String name;
    private String email;
    private String password;
    @ManyToMany
    private List<User> friends;
    @ManyToMany
    private List<Group> groups;
}
