<h1 align="center"> Автоматизация API: REST Assured + Java, проект с Google API </h1>



## Summary:

- 1.Создаем модель GooglePlace и описываем модели для объекта в "GooglePlacesModel"
- 2.Делаем инициализаций моделей запроса в "ApiManager"
- 3.Делаем реализацию HTTP-запроса в "NetworkCore"
- 4.Делаем тесты по поиску картинок GooglePlace в "SearchTestPositive"
- 5.Создаем DataProvider для теста в "SearchTestPositive"
- 6.В resources - userData - добавляем API-key из Google Cloud (Credential)

## I've applied:

- Rest Assured, TestNG, Lombok, JSONObject
- site - https://developers.google.com/maps/documentation/places/web-service/overview, https://console.cloud.google.com/apis/credentials
- making logic in this project

## Process creating:

- 1.Сначала создаем объект в GooglePlacesModel и описываем его методом.
- 2.В NetworkCore - создаем реализацию самого объекта.
- 3.В ApiManager - делаем инициализацию моделей запроса.
- 4.В классе JsonPlaceHolderTest - используем (GET, PUT, POST, DELETE) + queryParams method.
- 5.В SearchTestPositive - делаем тест где вызовем "search" из GooglePlacesModel и туда опрокидываем значения для ключей HashMap

## Additional:

- My profile on GitHub - [тыць](https://github.com/nick8787)
- My tg - [тыць](https://t.me/nick8787)
- My website about testing - [тыць](https://www.testing87.online/)
  ![Иллюстрация к проекту](https://www.testing87.online/img/graphics/about/testing87logohome.jpeg)
