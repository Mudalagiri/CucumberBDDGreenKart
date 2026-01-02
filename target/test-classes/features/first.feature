

Feature: Search and compare the order for products 
  

  @firstFeature
    Scenario Outline: user verifies whether search page and deals page products are same
    Given user lands on landing page
    #When user searches for products "Tom" and extracts actual name of product
    #Then user seacrhes for same product "Tom" in deals page to check if product exists
    
    When user searches for products <Name> and extracts actual name of product
    Then user seacrhes for same product <Name> in deals page to check if product exists
    And validate if landing page product name is same as deal page product name
    
    Examples: 
    |Name		|
    |Tom		|
    |Beet		|
    
 

