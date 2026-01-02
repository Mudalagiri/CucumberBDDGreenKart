
Feature: Search and place oder for products
@secondFeature
Scenario: user verifies whether search page and checkout page products are same and places the order

#Given user lands on second landing page
 Given user lands on landing page
#When user searches for products <Name> and extracts actual name of product
When user searches for products <Name> and extracts actual name of product
And user increases count of product and adds product to cart
And user clicks on checkout icon and proceedes to checkout page
Then user seacrhes for same product in checkout page to check if product exists
And user verrifies Apply and Placeorder buttons exists

Examples:
|Name		|
|Tom		|
