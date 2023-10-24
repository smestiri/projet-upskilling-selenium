#language: en

Feature: Connexion
  test de login passant sur saucelab

  Scenario Outline: Cas passant de connexion
    Given je vais sur la page d'acceuil "https://www.saucedemo.com/"
    And j'entre un username "<username>"
    And j'entre un mot de passe "<mot de passe>"
    When je clique sur le boutton login
    Then la page des articles est affichée "<titre>"

    Examples:
      | username      | mot de passe | titre |
      | standard_user | secret_sauce | Swag Labs|
