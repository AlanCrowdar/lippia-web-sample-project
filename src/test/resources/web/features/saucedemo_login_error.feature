@Saucedemo @Login @Error
Feature: Login con error en SauceDemo
  Como usuario del sistema
  Quiero visualizar un mensaje claro cuando un usuario está bloqueado
  Para entender por qué no puedo continuar

  Background:
    Given que el usuario abre la página de SauceDemo

  Scenario: Usuario bloqueado ve el mensaje de error correspondiente
    When el usuario ingresa el usuario "locked_out_user"
    And el usuario ingresa la contraseña "secret_sauce"
    And el usuario presiona el botón de login
    Then el sistema muestra el mensaje de error "Epic sadface: Sorry, this user has been locked out."
