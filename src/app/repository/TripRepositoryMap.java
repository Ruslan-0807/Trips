package app.repository;

import app.domain.Trips;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


    @Repository
    public class TripRepositoryMap implements TripRepository {

        private Map<Long, Trips> database = new HashMap<>();

        public TripRepositoryMap() {
            database.put(1L, new Trips(1L, "20.04.2024", "3:00","Leipzig_Berlin",120.00));
            database.put(2L, new Trips(2L, "20.04.2024", "5:25", "Leipzig-Berlin",120.00));
            database.put(3L, new Trips(3L, "21.04.2024", "8:30","Leipzig-Munich",150.30));
            database.put(4L, new Trips(4L, "22.04.2024", "7:00","Leipzig-Amsterdam",68.50));
        }

        @Override
        public Trips getById(Long id) {
            return database.get(id);
        }
    }

