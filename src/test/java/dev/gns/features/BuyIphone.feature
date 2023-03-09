Feature: Purchase iPhone product online

  Scenario: User adds iPhone product to cart and places an order

    Given the user is on the website's home page
    When the user finds the search web element
    And enters "iPhone" in the search field
    And selects the memory
    And selects the product
    And adds it to the cart
    And selects place order
    And logs in to the website
#    And enters their address
#    Then the user should see a confirmation of their order
  # commented these steps because the application needs exclusively an Indian phone number to login or register.
