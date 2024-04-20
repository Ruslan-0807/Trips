package app.repository;

import app.domain.Trips;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.FileReader;

@Primary
     @Repository
        public class TripRepositoryFile implements TripRepository {

            @Override
            public Trips getById(Long id) {

                try (BufferedReader reader = new BufferedReader(new FileReader("database.txt"))) {

                    return reader.lines()
                            .filter(x -> x.split("!", 2)[0].equals(id.toString()))
                            .limit(1)
                            .map(x -> {
                                String[] values = x.split("!");
                                Double price = Double.parseDouble(values[4]);
                                return new Trips(id,values[1], values[2],values[3],price);
                            })
                            .findFirst()
                            .orElse(null);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }


