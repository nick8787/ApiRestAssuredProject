package api.models.google_places;

import api.utils.NetworkCore;
import io.restassured.http.Method;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

import static constants.Constants.Endpoint.GOOGLE_PLACE_ENDPOINT_SEARCH;
import static constants.Constants.PathName.GOOGLE_PLACE_PATH;
import static constants.Constants.ServerName.GOOGLE_PLACE_SERVER;

//тут будем создавать и описывать модели для наших запросов Google Places
public class GooglePlacesModel extends NetworkCore {

    //описываем модель нашего объекта
    @Getter
    @Setter
    @Builder
    public static class RequestModel {
        private String key;
        private String input;
        private String inputtype;
    }

    //метод, который будет вызываться для создания объекта
    public GooglePlacesModel search(RequestModel model, Method methd, int code) {
        HashMap requestParams = new HashMap();
        requestParams.put("key", model.getKey());
        requestParams.put("input", model.getInput());
        requestParams.put("inputtype", model.getInputtype());
        requestSpecBuilder.setBaseUri(GOOGLE_PLACE_SERVER + GOOGLE_PLACE_PATH + GOOGLE_PLACE_ENDPOINT_SEARCH)
                .addQueryParams(requestParams);
        sendRequestAndGetResponse(methd, code);//передаем метод и статус код
        return this;
    }

}
