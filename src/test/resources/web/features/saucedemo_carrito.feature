@Saucedemo @Carrito
Feature: Manejo del carrito de compras en SauceDemo
  Como usuario autenticado
  Quiero poder agregar y eliminar productos del carrito
  Para gestionar mi compra correctamente

  Background:
    Given que el usuario abre la página de SauceDemo
    And el usuario se autentica con usuario "standard_user" y contraseña "secret_sauce"

  Scenario: Agregar Sauce Labs Backpack incrementa el contador del carrito
    When el usuario agrega el producto "Sauce Labs Backpack" al carrito
    Then el contador del carrito muestra "1"

  Scenario: Eliminar Sauce Labs Backpack deja el carrito vacío
    Given el usuario tiene el producto "Sauce Labs Backpack" en el carrito
    When el usuario elimina el producto "Sauce Labs Backpack" del carrito
    Then el contador del carrito está vacío
