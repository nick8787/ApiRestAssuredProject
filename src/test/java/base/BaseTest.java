package base;

import api.api_manager.ApiManager;

//тут мы будем инициализировать наш ApiManager, через который будем обращаться к моделям
//создаем экземпляр класса ApiManager
public class BaseTest {
    protected ApiManager apiManager = new ApiManager();

}
