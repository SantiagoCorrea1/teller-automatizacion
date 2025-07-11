Feature: Comprar un producto
  Como cliente de la tienda virtual
  Necesito poder realizar el pago de los productos que selecciono
  Para completar mi compra de forma exitosa

  Scenario: Compro y pago un producto en la tienda virtual
    Given que estoy autenticado en la tienda virtual
    When selecciono un producto de la tienda
    And hago clic en el icono del carrito
    And hago clic en el boton de checkout
    And lleno el formulario de pago con datos validos
    And confirmo la compra
    Then veo el mensaje de confirmaciode compra exitosa


  Scenario: Intento pagar sin ingresar el codigo postal
    Given que estoy autenticado en la tienda virtual
    When selecciono un producto de la tienda
    And hago clic en el icono del carrito
    And hago clic en el boton de checkout
    And lleno el formulario de pago sin el codigo postal
    Then veo un mensaje de error indicando que el codigo postal es requerido