package main

import (
	"encoding/json"
	"github.com/gorilla/mux"
	"log"
	"net/http"
)

type Person struct {
	ID        string   `json:"id,omitempty"`
	Firstname string   `json:"firstname,omitempty"`
	Lastname  string   `json:"lastname,omitempty"`
}

type LoginDto struct {
	User     string `json:"user,omitempty"`
	Password string `json:"password,omitempty"`
}

func main() {
	router := mux.NewRouter()
	router.HandleFunc("/people", GetPeople).Methods("GET")
	router.HandleFunc("/login", Login).Methods("POST")
	log.Fatal(http.ListenAndServe(":8000", router))
}

func GetPeople(w http.ResponseWriter, r *http.Request) {
	var people []Person
	people = append(people, Person{ID: "1", Firstname: "John", Lastname: "Doe"})
	people = append(people, Person{ID: "2", Firstname: "Koko", Lastname: "Doe"})
	people = append(people, Person{ID: "3", Firstname: "Francis", Lastname: "Sunday"})

	json.NewEncoder(w).Encode(people)
}

func Login(w http.ResponseWriter, r *http.Request) {
	//params := mux.Vars(r)
	var loginDto LoginDto
	_ = json.NewDecoder(r.Body).Decode(&loginDto)

	json.NewEncoder(w).Encode(loginDto)
}