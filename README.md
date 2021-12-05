# API автотесты для сайта petstore.swagger.io

Для написания автотестов был выбран блок 'store', тесты покрывают проверки следующих запросов:
- GET запрос инвентаризации домашних животных
- POST запрос о размещении заказа на домашнее животное
- GET запрос о поиске заказа по его ID
- DELETE запрос об удалении заказа по его ID

Для реализации данной задачи выбран следующий стек технологий:
- Java
- Maven 4.0.0
- JUnit 5.8.2
- Rest Assured 4.4.0
- Allure  2.13.1

Среда разработки: IntelliJ IDEA Community Version 

Проект включает в себя: 
- pom.xml файл с набором зависимостей и плагинов
- RestAPI.java файл с описанным классом, где методы являются тестами
- Набор файлов необходимых для составления Allure репорта

Запуск тестов производился мною в IDE, там же я составлял отчет Allure с помощью плагина: allure:install -> allure:report -> allure:serve

Желательно собирать проект в Jenkins и там же составлять Allure репорты


