package com.innocv.votium.domain;

@Entity
@Table(name = "TEAM")
public class Team {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

}
