package api.api_manager;

import api.models.google_places.GooglePlacesModel;
import lombok.Getter;
import lombok.Setter;

//Нужен для инициализаций моделей запроса
public class ApiManager {

    //Getter Setter - нужен, чтоб обращаться к googlePlacesModel
    @Getter
    @Setter
    GooglePlacesModel googlePlacesModel = new GooglePlacesModel();
}
