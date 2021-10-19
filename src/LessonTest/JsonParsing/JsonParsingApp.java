package LessonTest.JsonParsing;

import LessonTest.JsonParsing.dto.ListWeather;
import LessonTest.JsonParsing.dto.Root;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParsingApp {

    public static void main(String[] args) {

        String jsonString = "{" +
  "\"cod\": \"200\"," +
  "\"message\": 0," +
  "\"cnt\": 40," +
  "\"list\": [" +
    "{" +
      "\"dt\": 1633856400," +
      "\"main\": {" +
        "\"temp\": 9.82," +
        "\"feels_like\": 7.38," +
        "\"temp_min\": 9.82," +
        "\"temp_max\": 11.55," +
        "\"pressure\": 1028," +
        "\"sea_level\": 1028," +
        "\"grnd_level\": 1024," +
        "\"humidity\": 74," +
        "\"temp_kf\": -1.73" +
      "}," +
      "\"weather\": [" +
        "{" +
          "\"id\": 803," +
          "\"main\": \"Clouds\"," +
          "\"description\": \"broken clouds\"," +
          "\"icon\": \"04d\"" +
        "}" +
      "]," +
      "\"clouds\": {" +
        "\"all\": 80" +
      "}," +
      "\"wind\": {" +
        "\"speed\": 4.97," +
        "\"deg\": 234," +
        "\"gust\": 8.48" +
      "}," +
      "\"visibility\": 10000," +
      "\"pop\": 0," +
      "\"sys\": {" +
        "\"pod\": \"d\"" +
      "}," +
      "\"dt_txt\": \"2021-10-10 09:00:00\"" +
    "}," +
    "{" +
      "\"dt\": 1633867200," +
      "\"main\": {" +
        "\"temp\": 11.38," +
        "\"feels_like\": 10.4," +
        "\"temp_min\": 11.38," +
        "\"temp_max\": 12.59," +
        "\"pressure\": 1027," +
        "\"sea_level\": 1027," +
        "\"grnd_level\": 1023," +
        "\"humidity\": 70," +
        "\"temp_kf\": -1.21" +
      "}," +
      "\"weather\": [" +
        "{" +
          "\"id\": 804," +
          "\"main\": \"Clouds\"," +
          "\"description\": \"overcast clouds\"," +
          "\"icon\": \"04d\"" +
        "}" +
      "]," +
      "\"clouds\": {" +
        "\"all\": 86" +
      "}," +
      "\"wind\": {" +
        "\"speed\": 4.75," +
        "\"deg\": 237," +
        "\"gust\": 8.44" +
      "}," +
      "\"visibility\": 10000," +
      "\"pop\": 0," +
      "\"sys\": {" +
        "\"pod\": \"d\"" +
      "}," +
      "\"dt_txt\": \"2021-10-10 12:00:00\"" +
    "}," +
    "{" +
      "\"dt\": 1634277600," +
      "\"main\": {" +
        "\"temp\": 4.29," +
        "\"feels_like\": 0.09," +
        "\"temp_min\": 4.29," +
        "\"temp_max\": 4.29," +
        "\"pressure\": 1018," +
        "\"sea_level\": 1018," +
        "\"grnd_level\": 1015," +
        "\"humidity\": 84," +
        "\"temp_kf\": 0" +
      "}," +
      "\"weather\": [" +
        "{" +
          "\"id\": 801," +
          "\"main\": \"Clouds\"," +
          "\"description\": \"few clouds\"," +
          "\"icon\": \"02d\"" +
        "}" +
      "]," +
      "\"clouds\": {" +
        "\"all\": 21" +
      "}," +
      "\"wind\": {" +
        "\"speed\": 5.78," +
        "\"deg\": 218," +
        "\"gust\": 12.13" +
      "}," +
      "\"visibility\": 10000," +
      "\"pop\": 0," +
      "\"sys\": {" +
        "\"pod\": \"d\"" +
      "}," +
      "\"dt_txt\": \"2021-10-15 06:00:00\"" +
    "}" +
  "]," +
  "\"city\": {" +
    "\"id\": 0," +
    "\"name\": \"Санкт-Петербург 97\"," +
    "\"coord\": {" +
      "\"lat\": 59.885," +
      "\"lon\": 29.8958" +
    "}," +
    "\"country\": \"RU\"," +
    "\"population\": 0," +
    "\"timezone\": 10800," +
    "\"sunrise\": 1633840026," +
    "\"sunset\": 1633878444" +
  "}" +
"}";

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Root root = objectMapper.readValue(jsonString, Root.class);
            System.out.println(root.getCity().getCityName());
            for (ListWeather it: root.getListWeather()) {
                System.out.println("Дата:" + it.getDataAndTime() + ", Температура: " + it.getMain().getTemperature());
            }
        } catch (JsonProcessingException e) {
            System.out.println("Ошибка парсинга: " + e.toString());
        }

//        System.out.println(root);

    }
}
