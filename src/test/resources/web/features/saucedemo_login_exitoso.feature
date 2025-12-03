@Saucedemo @Login @Exitoso
Feature: Login exitoso en SauceDemo
  Como usuario estándar de SauceDemo
  Quiero iniciar sesión correctamente
  Para poder ver el listado de productos

  Background:
    Given que el usuario abre la página de SauceDemo

  Scenario: Login exitoso muestra el título Products
    When el usuario ingresa el usuario "standard_user"
    And el usuario ingresa la contraseña "secret_sauce"
    And el usuario presiona el botón de login
    Then el sistema muestra la página de productos
    And el título de la página es "Products"
