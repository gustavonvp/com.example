package com.example.comexamplerestfulljava.domain;
<<<<<<< HEAD

=======
>>>>>>> eb2af30 (Adding Domain. Closes #2)
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

<<<<<<< HEAD
@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;

}
=======
@Entity
@Data
public class Customer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String firstname;
        private String lastname;

    }

>>>>>>> eb2af30 (Adding Domain. Closes #2)
