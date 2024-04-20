package app.domain;

import java.util.Objects;

public class Trips {
    private Long id;
    private String data;
    private String time;
    private String city;
    private Double price;
    private String article;

    public Trips(Long id, String data, String time, String city, Double price) {
        this.id = id;
        this.data = data;
        this.time = time;
        this.city = city;
        this.price = price;
    }

        public void setArticle(String article) {
        this.article = article;
    }

    public Long getId() {
        return id;
    }
    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trips trips = (Trips) o;
        return Double.compare(trips.price, price) == 0 && Objects.equals(id, trips.id) && Objects.equals(data, trips.data) && Objects.equals(time, trips.time) && Objects.equals(city, trips.city) && Objects.equals(article, trips.article);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data, time, city, price, article);
    }

    @Override
    public String toString() {
        return "Trips{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", time='" + time + '\'' +
                ", city='" + city + '\'' +
                ", price=" + price +
                ", article='" + article + '\'' +
                '}';
    }
    }

