package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import uk.co.library.pages.HomePage;

public class JobSearchSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I enter job title {string}")
    public void iEnterJobTitle(String enterJobTitle) {
        new HomePage().enterJobTitle(enterJobTitle);
    }

    @And("I enter location  {string}")
    public void iEnterLocation(String enterJobLocation ) {
        new HomePage().enterTheLocation(enterJobLocation);
    }



    @And("I click on moreSearchOptionsLink")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnTheSearchOptionLink();
    }

    @And("I enter salaryMin {string}")
    public void iEnterSalaryMin(String salaryMinimum) {
        new HomePage().enterTheMinimumSalary(salaryMinimum);
    }

    @And("I enter salaryMax {string}")
    public void iEnterSalaryMax(String salaryMaximum) {
        new HomePage().enterTheMaximumSalary(salaryMaximum);
    }

    @And("I select salaryType {string}")
    public void iSelectSalaryType(String select) {
        new HomePage().salaryTypeSelect(select);
    }

    @And("I select jobType {string}")
    public void iSelectJobType(String selectJobType) {
        new HomePage().jobTypeSelect(selectJobType);
    }

    @And("I click on find Jobs button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnTheFindBtn();
    }

}

