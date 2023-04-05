package com.lucaslima.todosimple.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name= "TB_USER")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "username", length = 150, unique = true)
    private String username;

    @NotBlank
    @Column(name = "password", length = 60)
    private String password;

    public User(Long id, @NotBlank String username, @NotBlank String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    

    

    //  private List<Task> tasks = new ArrayList<Task>


}
