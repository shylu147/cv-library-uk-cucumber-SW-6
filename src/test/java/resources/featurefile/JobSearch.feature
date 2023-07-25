@Regression
Feature: JobSearch Test
  As a user I want to search job in cv library website

  @smoke
  Scenario Outline: User verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType,
    Given I am on homepage
    When I enter job title "<jobTitle>"
    And I enter location  "<location>"

    And I click on moreSearchOptionsLink
    And I enter salaryMin "<salaryMin>"
    And I enter salaryMax "<salaryMax>"
    And I select salaryType "<salaryType>"
    And I select jobType "<jobType>"
    And I click on find Jobs button

    Examples:
      | jobTitle | location | distance      | salaryMin | salaryMax | salaryType | jobType   | result                                      |
      | Tester   | Harrow   | up to 5 miles | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in Harrow on the Hill |
      | Tester   | Sutton   | up to 6 miles | 40000     | 600000    | Per annum  | Permanent | Permanent Tester jobs in Sutton             |
      | Tester   | London   | up to 5 miles | 25000     | 400000    | Per annum  | Permanent | Permanent Tester jobs in Central London     |
