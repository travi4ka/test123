package api;

import api.requests.models.CategoryModelRequest;
import api.requests.models.PetModelRequest;
import api.requests.models.TagRequestModel;
import api.responses.PetModelResponse;
import io.restassured.specification.RequestSpecification;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class PetsRequestApi {
    RequestSpecification requestSpecification;

    public PetModelResponse petModelResponse;

    public PetsRequestApi(RequestSpecification requestSpecification) {
        this.requestSpecification = requestSpecification;
    }

    public PetModelResponse CreatePet() {
        PetModelRequest petModelRequest = new PetModelRequest();
        petModelRequest.setId(123);
        petModelRequest.setName("naruto");

        petModelRequest.setCategory(new CategoryModelRequest());
        petModelRequest.getCategory().setId(312);
        petModelRequest.getCategory().setName("qwewqe");

        petModelRequest.setPhotoUrls(new ArrayList<>());
        petModelRequest.getPhotoUrls().add("qwe222");

        petModelRequest.setTags(new ArrayList<>());
        petModelRequest.getTags().add(new TagRequestModel());
        petModelRequest.getTags().get(0).setId(12);
        petModelRequest.getTags().get(0).setName("12");
        petModelRequest.setStatus("available222");

        return petModelResponse = given().spec(requestSpecification)
                .body(petModelRequest)
                .when()
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .extract().as(PetModelResponse.class);
    }
}
