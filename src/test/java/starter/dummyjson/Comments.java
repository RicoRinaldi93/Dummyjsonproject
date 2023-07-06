package starter.dummyjson;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.dummyjson.Utils.Constant;

import java.io.File;

public class Comments {
    public static String GET_ALL_COMMENTS = Constant.BASE_URL+"/comments";

    @Step ("Get All Comments with Authorization")
    public void GetAllComments (String Token) {
     SerenityRest.given().header("Authorization", "Bearer" + Token);
    }


}


