package app.controller;

import app.domain.Trips;
import app.service.TripService;
import org.springframework.stereotype.Component;
    @Component
    public class TripController {
        private TripService service;

        public TripController(TripService service) {
            this.service = service;
        }

        public Trips getById(Long id) {
            return service.getById(id);
        }
    }

