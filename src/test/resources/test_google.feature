Feature: Google
Scenario: Checking open page
  Given Google page open
  When Cookie close
  When Input word Java
  Then Java exists