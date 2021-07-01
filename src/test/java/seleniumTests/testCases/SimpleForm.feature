
  Feature: Testing all input types forms Selenium Easy website

    Background: Home page of the website should open without any issue

      Scenario: Testing of Simple Forms page (only Single Input Field)
        Given Verify that application can open simple forms web-page
        When System enters the any message
        And click the Show message button
        Then enter message should display as part of Your message: text box

        Scenario: Testing of Simple Forms page (only Two Input Field)
          Given Verify that application can open simple forms web-page
          When System enters any valid numbers in input box a and b
          And click the Get total button
          Then web-page should show message to sum two number in integer format
          And if user enters any values other then numbers
          Then web-page should show message as NaN (Not a Number)

          Scenario: Testing Checkbox Form page
            Given Verify that test web-driver can open Checkbox From page
            When user click on single checkbox in Single Checkbox Demo section
            Then we-site should show success message with text "Success- Check box is checked"
            When user click on multiple checkboxes under Multiple Checkbox Demo section
            And click on Check All button
            Then all four check box option should be checked
            And when user click on unCheckAll
            Then all four check boxes option should be unchecked

