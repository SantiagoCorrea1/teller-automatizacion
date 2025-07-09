Feature: Agregar un producto al carrito de compreas
    como cliente de la tienda virtual necesito agregar un producto a mi carrito de compras
    para realizar su compra

  Scenario: Seleccionar un producto de la tienda virtual
    Given que estoy autenticado en la tienda virtual
    When selecciono un producto de la tienda
    Then el producto se agrega a mi carrito de compras