package starter.dummyjson.StepDef.Products;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.Comments;
import starter.dummyjson.Utils.Authorization;

public class CommentsStepDef {
    @Steps
    Comments Comments;

    Authorization auth = new Authorization();

    @Given("Get All Comments")
    public void getAllComments() {
        Comments.GetAllComments(auth.getToken());
    }

    @When("Send Request Get All Comments")
    public void sendRequestGetAllComments() {
        SerenityRest.when().get(starter.dummyjson.Comments.GET_ALL_COMMENTS);
    }
}
