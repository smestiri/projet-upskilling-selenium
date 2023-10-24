#language: en

Feature: Ajout dans le panier
  test de login passant sur saucelab
  @aLancer
  Scenario Outline: Cas passant d'ajout dans le panier
    Given je vais sur la page d'acceuil "https://www.saucedemo.com/"
    And j'entre un username "<username>"
    And j'entre un mot de passe "<mot de passe>"
    And je clique sur le boutton login
    And je clique sur le bouton Add to cart pour ajouter le Backpack dans le panier
    When je clique sur le bouton panier
    Then je vérifie que le titre panier est bien affiché "<titrePanier>"

    Examples:
      | username | mot de passe | titrePanier |
      | standard_user | secret_sauce | Your Cart |
