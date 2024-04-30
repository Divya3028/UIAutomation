Feature: Shopping 
@day1
Scenario: Adding Hair Products to cart and validating the Order placement
#Given Launch URL
When i click the shop now button
Then click the Products
And select the Hair products
And add the selected product to the cart
And go to the cart
Then checkout the product
And goto the Shipping Method
Then click the Payment button
Then read the order and print the console

@smoke
Scenario Outline: Adding Hair Products to cart 
#Given Launch URL
When i click the shop now button
Then click the Products
And select the Hair products
And add the selected product to the cart
And go to the cart
Then checkout the product
And goto the Shipping Method
And  enter the card name as <creditcardnumber>
Then click the Payment button
Then read the order and print the console

 Examples:
 |creditcardnumber|
 |4234123491234|
 



