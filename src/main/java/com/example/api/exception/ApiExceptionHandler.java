server:
  port: 8080

spring:
  datasource:
    url: jdbc:h2:mem:testdb
    driverClassName: org.h2.Driver
    username: sa
    password: 
  jpa:
    database-platform: org.hibernate.dialect.H2Dialect
    show-sql: true
    hibernate:
      ddl-auto: update
  security:
    user:
      name: user
      password: password

openApi:
  title: API de Productos
  version: 1.0
  description: API REST para gestión de productos en e-commerce
  contact:
    name: API Support
    url: http://www.example.com/support
    email: support@example.com