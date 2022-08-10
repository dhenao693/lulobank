Feature: Create Token

  Background:
    * url 'https://sso.muydev.com/v1'
    * header Accept = 'application/Json'

  Scenario: Generate token
    Given path '/services'
    When method GET
    Then status 200
    * def authToken = response.result.access_token