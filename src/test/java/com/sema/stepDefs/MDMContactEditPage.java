package com.sema.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MDMContactEditPage extends BaseStep{
    public MDMContactEditPage() {
    }

    @When("The user clicks upload button")
    public void the_user_clicks_upload_button() {
        pages.contactEditPage().clickUploadButtonAndUploadFile();
    }
    @Then("The user verifies the photo uploaded")
    public void the_user_verifies_the_photo_uploaded() {
       pages.contactEditPage().verifyUpload();
    }
    @When("The user enters {string} in  comment area")
    public void the_user_enters_in_comment_area1(String comment) {
        pages.contactEditPage().setChangeCommentArea(comment);
    }
    @When("The user enters {string} in comment area")
    public void the_user_enters_in_comment_area(String comment) {
        pages.contactEditPage().uploadCommentArea(comment);
    }
    @When("The user clicks upload photo cancel button")
    public void the_user_clicks_upload_photo_cancel_button() {
        pages.contactEditPage().clickUploadPhotoCancelButton();
    }
    @Then("The user verifies the photo unuploaded")
    public void the_user_verifies_the_photo_unuploaded() {
       pages.contactEditPage().verifyUnUpload();
    }
    @When("The user clicks upload photo save button")
    public void the_user_clicks_upload_photo_save_button() {
        pages.contactEditPage().clickUploadPhotoSaveButton();
    }
    @When("The user clicks upload photo save  button")
    public void the_user_clicks_upload_photo_save1_button() {
        pages.contactEditPage().clickUnSavedButton();
    }
    @Then("the user selects {string}")
    public void the_user_selects(String status) {
        pages.contactEditPage().selectItemStatus(status);
    }
    @Then("the user clicks on unsaved change button")
    public void the_user_clicks_on_unsaved_change_button() {
        pages.contactEditPage().clickUnSavedButton();
    }
    @Then("The user clicks save button")
    public void the_user_clicks_save_button() {
        pages.contactEditPage().clickSaveChangeButton();
    }
    @Given("^the user verifies item status success message$")
    public void theUserVerifiesItemStatusSuccessMessage() {
        pages.contactEditPage().verifyChangeSuccesMessage();

    }
    @Given("^The user clicks cancel button$")
    public void theUserClicksCancelButton() {
        pages.contactEditPage().clickCancelChangeButton();
    }
    @Given("^the user verifies item status not change$")
    public void theUserVerifiesItemStatusNotChange() {
        pages.contactEditPage().verifyCancelChange();

    }

}
