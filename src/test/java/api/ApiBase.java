package api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class ApiBase {
    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }

    private RequestSpecification requestSpecification = new RequestSpecBuilder()
            .setContentType(ContentType.JSON)
            .setAccept(ContentType.JSON)
            .build();

    public PetsRequestApi petsRequestApi = new PetsRequestApi(requestSpecification);
}
