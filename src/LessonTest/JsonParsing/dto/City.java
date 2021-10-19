package LessonTest.JsonParsing.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown = true) // Игнорируем лишние поля из строки JSON
public class City {

    // Поля класса
    @JsonProperty("name")
    private String cityName;

    // Пустой конструктор (для работы с библиотекой jcson)
    public City() {
    }

    // Конструктор
    public City(String cityName) {
        this.cityName = cityName;
    }

    // Геттеры
    @JsonGetter("name")
    public String getCityName() {
        return cityName;
    }

    // Сеттеры
    @JsonSetter("name")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
