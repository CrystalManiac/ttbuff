## TTBUFF
* `game-service` - микросервис в котором реализована логика создания игр и расчета рейтинга
* `hisory-service` - отвечает за хранение общедоступной истории матчей
* `user-service` - отвечает за работу с пользовательскими данными
* `notification-service` - рассылка уведомлений на почту
* `dicovery-server` - реализация паттерна Service Discovery (Eureka)
* `api-gateway` - единая точка входа и доступа к остальным сервисам (Spring Cloud Gateway) 
* `config-server` - сервер конфигураций