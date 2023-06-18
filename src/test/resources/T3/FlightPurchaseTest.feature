Feature: Purchase Ticket Functionality

  Scenario Outline: Verify a User is able to purchase a Ticket
    Given User navigates to Purchase Page "https://blazedemo.com/purchase.php"
    When User enters Full Name "<fullName>"
    And User enters Address "<address>"
    And user enters City "<city>"
    And user enters State "<state>"
    And user enters ZipCode "<zipcode>"
    And user selects Card Type "<cardType>"
    And user enters Card Number "<cardNumber>"
    And user enters Card Month "<cardMonth>"
    And user enters Card Year "<cardYear>"
    And user enters Name on the card "<nameOnCard>"
    And user clicks on Remember me checkbox button
    And user clicks on Purchase Flight button
    Then user verifies message confirmation "<message>"

    Examples: 
      | fullName    | address    | city        | state | zip   | carType          | cridrCardNumber     | month | year | nameOnTheCard | message                      |    |
      | Noor Jasim  | 6799 st    | Springfield | Va    | 33876 | Visa             | 2200 0099 4466 8855 | June  | 2025 | Noor Jasim    | Thank you for your purchase! |    |
      | Meer Jasim  | 7855 ave   | Ashburn     | Va    | 22678 | Diner's Club     | 3388 2200 7766 4455 | July  | 2026 | Meroo         | Thank you for your purchase! |    |
      | Yuliya Pero | 3345 court | Alexandria  | MD    | 44567 | American Express | 0077 0055 7755 6644 | Feb   | 2028 | Yoliya        | Thank you for your purchase! |    |
      | Hamza Sdq   | 6655 lane  | Sterling    | TX    | 77654 | Diner's Club     | 2200 0099 4466 8855 | June  | 2025 | Hamzawi       | Thank you for your purchase! |    |
      | Zubaidi Mo  | 9988 str   | Crofton     | MD    | 66554 | American Express | 3388 2200 7766 4455 | July  | 2026 | Zubaidi       | Thank you!                   |    |
