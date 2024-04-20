package app.service;

import app.domain.Trips;
import app.repository.TripRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;


@Service

    @PropertySource("classpath:application.properties")
    public class TripServiceImpl implements TripService {

        private String articlePrefix;
        private TripRepository repository;

        public TripServiceImpl(

                @Value("${article.prefix}") String articlePrefix,
                @Qualifier("tripRepositoryMap") TripRepository repository
        ) {
            this.articlePrefix = articlePrefix;
            this.repository = repository;
        }

    @Override
    public Trips getById(Long id) {
       Trips trips = repository.getById(id);
        assignArticle(trips);
        return trips;
    }

        @Override
        public void assignArticle(Trips trips) {
            // prefix-B-5
            // Art-B-5
            String article = String.format("%s-%C-%d",
                    articlePrefix, trips.getCity().charAt(12), trips.getId());
            trips.setArticle(article);
        }
    }


