Feature: Order Food from Swiggy

Scenario: A user must be able to place an order on swiggy
  Given a user is on the Swiggy homepage
  When he sets the delivery location as 'Hyderabad'
  And he selects the first option from the auto-complete box
  And he clicks on the first restaurant from 'Top restaurant chains in Hyderabad'
  And he adds the first listed dish to the cart
  And he hovers over the 'Cart' in the top right corner
  And he clicks on 'Check Out' in the sub-menu
  Then he should see the text 'To place your order now, log in to your existing account or sign up.'
